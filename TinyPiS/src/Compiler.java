import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.TinyPiSLexer;
import parser.TinyPiSParser;

public class Compiler extends CompilerBase {
	boolean alreadyPrintAnswer = false;
	void compileExpr(ASTNode ndx, Environment env) {
		if (ndx instanceof ASTBinaryExprNode) {
			ASTBinaryExprNode nd = (ASTBinaryExprNode) ndx;
			compileExpr(nd.lhs, env);
			emitPUSH(REG_R1);
			emitRR("mov", REG_R1, REG_DST);
			compileExpr(nd.rhs, env);
			if (nd.op.equals("+"))
				emitRRR("add", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("-"))
				emitRRR("sub", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("*"))
				emitRRR("mul", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("/"))
				emitRRR("udiv", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("&"))
				emitRRR("and", REG_DST, REG_R1, REG_DST);
			else if (nd.op.equals("|"))
				emitRRR("orr", REG_DST, REG_R1, REG_DST);
			else
				throw new Error("Unknwon operator: "+nd.op);
			emitPOP(REG_R1);
		} else if (ndx instanceof ASTUnaryExprNode) {
			ASTUnaryExprNode nd = (ASTUnaryExprNode) ndx;
			compileExpr(nd.operand, env);
			if (nd.op.equals("-")) {
				emitRR("mvn", REG_DST, REG_DST);
				emitRRI("add", REG_DST, REG_DST, 1);
			} else if (nd.op.equals("~"))
				emitRR("mvn", REG_DST, REG_DST);
			else
				throw new Error("Unkown operator: "+nd.op);
		} else if (ndx instanceof ASTNumberNode) {
			ASTNumberNode nd = (ASTNumberNode) ndx;
			emitLDC(REG_DST, nd.value);
		} else if (ndx instanceof ASTVarRefNode) {
			ASTVarRefNode nd = (ASTVarRefNode) ndx;
			Variable var = env.lookup(nd.varName);
			if (var == null)
				throw new Error("Undefined variable: "+nd.varName);
			if (var instanceof GlobalVariable) {
				GlobalVariable globalVar = (GlobalVariable) var;
				emitLDC(REG_DST, globalVar.getLabel());
				emitLDR(REG_DST, REG_DST, 0);
			} else
				throw new Error("Not a global variable: "+nd.varName);
		} else 
			throw new Error("Unknown expression: "+ndx);
	}
	
	void compileStmt(ASTNode ndx, Environment env) {
		if (ndx instanceof ASTCompoundStmtNode) {
			/* 複合文 */
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			for (ASTNode stmt: nd.stmts)
				compileStmt(stmt, env);
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
			Variable var = env.lookup(nd.var);
			if (var == null)
				throw new Error("undefined variable: "+nd.var);
			compileExpr(nd.expr, env);
			if (var instanceof GlobalVariable) {
				GlobalVariable globalVar = (GlobalVariable) var;
				emitLDC(REG_R1, globalVar.getLabel());
				emitSTR(REG_DST, REG_R1, 0);
			} else
				throw new Error("Not a global variable: "+nd.var);
		} else if (ndx instanceof ASTIfStmtNode) {
			ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
			String elseLabel = freshLabel();
			String endLabel = freshLabel();
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", elseLabel);
			compileStmt(nd.thenClause, env);
			emitJMP("b", endLabel);
			emitLabel(elseLabel);
			compileStmt(nd.elseClause, env);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTWhileStmtNode) {
			/* While文 */
			ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			String loopLabel = freshLabel();
			String endLabel = freshLabel();
			emitLabel(loopLabel);
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", endLabel);
			compileStmt(nd.stmt, env);
			emitJMP("b", loopLabel);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTPrintStmtNode) {
			/* Print文 */
			ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			compileExpr(nd.expr, env);
			emitCALL("print_r0");
			
			System.out.println("\t@ EXITシステムコール");
			emitRI("mov", "r7", 1);   // EXIT のシステムコール番号
			emitRI("mov", "r0", 0);
			emitI("swi", 0);
			
			printSubRoutine();
			
			alreadyPrintAnswer = true;
		} else
			throw new Error("Unknown expression: "+ndx);
	}
	
	void compile(ASTNode ast) {
		Environment env = new Environment();
		ASTProgNode prog = (ASTProgNode) ast;
		System.out.println("\t.section .data");
		System.out.println("\t@ 大域変数の定数");
		for (String varName: prog.varDecls) {
			if (env.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			GlobalVariable v = addGlobalVariable(env, varName);
			emitLabel(v.getLabel());
			System.out.println("\t.word 0");
		}
		if (env.lookup("answer") == null) {
			GlobalVariable v = addGlobalVariable(env, "answer");
			emitLabel(v.getLabel());
			System.out.println("\t.word 0");
		}

		System.out.println("\t.section .text");
		System.out.println("\t.global _start");
		System.out.println("_start:");
		System.out.println("\t@ 式をコンパイルした命令列");
		compileStmt(prog.stmt, env);
		
		if (!alreadyPrintAnswer) {
			System.out.println("\t@ EXITシステムコール");
			GlobalVariable v = (GlobalVariable) env.lookup("answer");
			emitLDC(REG_DST, v.getLabel());  // 変数 answer の値を r0（終了コード）に入れる
			emitLDR("r0", REG_DST, 0);
			emitRI("mov", "r7", 1);   // EXIT のシステムコール番号
			emitI("swi", 0);
		}
	}
	
	/* 16進数で値をプリントするためのサブルーチン+αを書き込む */
	void printSubRoutine() {
		emitLabel("print_r0");
		
		/* PUSH */
		emitPUSH(REG_DST);
		emitPUSH(REG_R1);
		emitPUSH("r2");
		emitPUSH("r3");
		emitPUSH("r4");
		emitPUSH("r7");
		
		emitLabel("print");
		
		/* PRINT */
		emitLDC(REG_R1, "buf+8");
		emitRI("mov", "r3", 8);
		emitRRI("add", "r2", "r1", 1);
		emitLabel("loop0");
		System.out.println("\tmov r4, r0, lsr #4");
		System.out.println("\teor r7, r0, r4, lsl #4");
		emitRI("cmp", "r7", 10);
		emitRRI("addcc", "r7", "r7", 48);
		emitRRI("addge", "r7", "r7", 55);
		emitRR("mov", REG_DST, "r4");
		System.out.println("\tstrb r7, [r1, #-1]!");
		emitRRI("subs", "r3", "r3", 1);
		emitJMP("bne", "loop0");
		emitRRR("sub", "r2", "r2", "r1");
		emitLabel("endloop");
		
		/* WRITE */
		emitRI("mov", "r7", 4);   // WRITE のシステムコール番号
		emitRI("mov", "r0", 1);   // 標準出力
		emitI("swi", 0);
		
		/* POP */
		emitPOP("r7");
		emitPOP("r4");
		emitPOP("r3");
		emitPOP("r2");
		emitPOP(REG_R1);
		emitPOP(REG_DST);
		
		emitRET();
		System.out.println("\t.section .data");
		emitLabel("buf");
		System.out.println("\t.space 8");
		System.out.println("\t.byte 10");
	}

	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		TinyPiSLexer lexer = new TinyPiSLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		TinyPiSParser parser = new TinyPiSParser(token);
		ParseTree tree = parser.prog();
		ASTGenerator astgen = new ASTGenerator();
		ASTNode ast = astgen.translate(tree);
		Compiler compiler = new Compiler();
		compiler.compile(ast);
	}
}
