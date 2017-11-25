import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangXLexer;
import parser.PiLangXParser;

public class Compiler extends CompilerBase {
	boolean alreadyPrintAnswer = false;
	Environment globalEnv;
	
	void compileFunction(ASTFunctionNode nd) {
		Environment env = new Environment();
		String epilogueLabel = freshLabel();
		for (int i = 0; i < nd.params.size(); i++) {
			String name = nd.params.get(i);
			int offset = 4 * (i + 1);
			LocalVariable var = new LocalVariable(name, offset);
			env.push(var);
		}
		/* ここにローカル変数の追加のコードを書くこと */
		for (int i = 0; i < nd.varDecls.size(); i++) {
			String name = nd.varDecls.get(i);
			int offset = -4 * (i + 3);
			LocalVariable var = new LocalVariable(name, offset);
			env.push(var);
		}
		
		emitLabel(nd.name);
		System.out.println("\t@ prologue");
		emitPUSH(REG_FP);
		emitRR("mov", REG_FP, REG_SP);
		emitPUSH(REG_LR);
		emitPUSH(REG_R1);
		emitRRI("sub", REG_SP, REG_SP, nd.varDecls.size() * 4);
		for (ASTNode stmt: nd.stmts)
			compileStmt(stmt, epilogueLabel, env);
		emitRI("mov", REG_DST, 0);  // returnがなかったときの戻り値 0
		emitLabel(epilogueLabel);
		/* ここにエピローグを生成するコードを書くこと */
		System.out.println("\t@ epilogue");
		emitRRI("add", REG_SP, REG_SP, nd.varDecls.size() * 4);
		emitPOP(REG_R1);
		emitPOP(REG_LR);
		emitPOP(REG_FP);
		
		emitRET();
	}
	
	void compileStmt(ASTNode ndx, String epilogueLabel, Environment env) {
		/* ここを完成させる */
		if (ndx instanceof ASTCompoundStmtNode) {
			/* 複合文 */
			ASTCompoundStmtNode nd = (ASTCompoundStmtNode) ndx;
			String epLabel = epilogueLabel;
			for (ASTNode stmt: nd.stmts)
				compileStmt(stmt, epLabel, env);
		} else if (ndx instanceof ASTAssignStmtNode) {
			ASTAssignStmtNode nd = (ASTAssignStmtNode) ndx;
			Variable var = env.lookup(nd.var);
			if (var == null)
				var = globalEnv.lookup(nd.var);
			if (var == null)
				throw new Error("undefined variable: "+nd.var);
			compileExpr(nd.expr, env);
			if (var instanceof GlobalVariable) {
				GlobalVariable globalVar = (GlobalVariable) var;
				emitLDC(REG_R1, globalVar.getLabel());
				emitSTR(REG_DST, REG_R1, 0);
			} else if (var instanceof LocalVariable) {
				LocalVariable localVar = (LocalVariable) var;
				System.out.println("\tstr "+REG_DST+", ["+REG_FP+", #"+localVar.offset+"]");
			} else
				throw new Error("Not a global variable: "+nd.var);
		} else if (ndx instanceof ASTIfStmtNode) {
			ASTIfStmtNode nd = (ASTIfStmtNode) ndx;
			String elseLabel = freshLabel();
			String endLabel = freshLabel();
			String epLabel = epilogueLabel;
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", elseLabel);
			compileStmt(nd.thenClause, epLabel, env);
			emitJMP("b", endLabel);
			emitLabel(elseLabel);
			compileStmt(nd.elseClause, epLabel, env);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTWhileStmtNode) {
			/* While文 */
			ASTWhileStmtNode nd = (ASTWhileStmtNode) ndx;
			String loopLabel = freshLabel();
			String endLabel = freshLabel();
			String epLabel = epilogueLabel;
			emitLabel(loopLabel);
			compileExpr(nd.cond, env);
			emitRI("cmp", REG_DST, 0);
			emitJMP("beq", endLabel);
			compileStmt(nd.stmt, epLabel, env);
			emitJMP("b", loopLabel);
			emitLabel(endLabel);
		} else if (ndx instanceof ASTReturnStmtNode) {
			ASTReturnStmtNode nd = (ASTReturnStmtNode) ndx;
			String epLabel = epilogueLabel;
			/* 関数を呼ぶ */
			compileExpr(nd.expr, env);
			emitJMP("b", epLabel);
		} else if (ndx instanceof ASTPrintStmtNode) {
			/* Print文 */
			ASTPrintStmtNode nd = (ASTPrintStmtNode) ndx;
			compileExpr(nd.expr, env);
			emitCALL("print_r0");
			
			alreadyPrintAnswer = true;
		} else
			throw new Error("Unknown expression: "+ndx);
	}

	void compileExpr(ASTNode ndx, Environment env) {
		/* ここを完成させる */
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
			else if (nd.op.equals("==")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("moveq", REG_DST, 1);
				emitRI("movne", REG_DST, 0);
			} else if (nd.op.equals("!=")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("movne", REG_DST, 1);
				emitRI("moveq", REG_DST, 0);
			} else if (nd.op.equals(">")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("movgt", REG_DST, 1);
				emitRI("movls", REG_DST, 0);
			} else if (nd.op.equals("<")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("movlt", REG_DST, 1);
				emitRI("movge", REG_DST, 0);
			} else if (nd.op.equals(">=")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("movge", REG_DST, 1);
				emitRI("movlt", REG_DST, 0);
			} else if (nd.op.equals("<=")) {
				emitRR("cmp", REG_R1, REG_DST);
				emitRI("movls", REG_DST, 1);
				emitRI("movgt", REG_DST, 0);
			}
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
				var = globalEnv.lookup(nd.varName);
			if (var == null)
				throw new Error("Undefined variable: "+nd.varName);
			if (var instanceof GlobalVariable) {
				GlobalVariable globalVar = (GlobalVariable) var;
				emitLDC(REG_DST, globalVar.getLabel());
				emitLDR(REG_DST, REG_DST, 0);
			} else if (var instanceof LocalVariable) {
				LocalVariable localVar = (LocalVariable) var;
				System.out.println("\tldr "+REG_DST+", ["+REG_FP+", #"+localVar.offset+"]");
			} else
				throw new Error("Not a global variable: "+nd.varName);
		} else if (ndx instanceof ASTCallNode) {
			ASTCallNode nd = (ASTCallNode) ndx;
			ArrayList<ASTNode> args = nd.args;
			Collections.reverse(args);
			for (ASTNode arg: args) {
				compileExpr(arg, env);
				emitPUSH(REG_DST);
			}
			emitCALL(nd.name);
			emitRRI("add", REG_SP, REG_SP, nd.args.size() * 4);
		} else 
			throw new Error("Unknown expression: "+ndx);
	}
	
	void compile(ASTNode ast) {
		globalEnv = new Environment();
		ASTProgNode program = (ASTProgNode) ast;

		System.out.println("\t.section .data");
		System.out.println("\t@ 大域変数の定義");		
		for (String varName: program.varDecls) {
			if (globalEnv.lookup(varName) != null)
				throw new Error("Variable redefined: "+varName);
			GlobalVariable v = addGlobalVariable(globalEnv, varName);
			emitLabel(v.getLabel());
			System.out.println("\t.word 0");
		}

		System.out.println("\t.section .text");
		System.out.println("\t.global _start");
		System.out.println("_start:");
		System.out.println("\t@ main関数を呼出す．戻り値は r0 に入る");
		emitJMP("bl", "main");
		
		System.out.println("\t@ EXITシステムコール");
		emitRI("mov", "r7", 1);      // EXIT のシステムコール番号
		emitI("swi", 0);
		
		/* 関数定義 */
		for (ASTFunctionNode func: program.funcDecls)
			compileFunction(func);
		
		if (alreadyPrintAnswer)
			printSubRoutine();
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
		PiLangXLexer lexer = new PiLangXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		PiLangXParser parser = new PiLangXParser(token);
		ParseTree tree = parser.prog();
		ASTGenerator astgen = new ASTGenerator();
		ASTNode ast = astgen.translate(tree);
		Compiler compiler = new Compiler();
		compiler.compile(ast);
	}
}
