import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.TinyPiSXParser.AddExprContext;
import parser.TinyPiSXParser.AndExprContext;
import parser.TinyPiSXParser.AssignStmtContext;
import parser.TinyPiSXParser.Cmp1ExprContext;
import parser.TinyPiSXParser.Cmp2ExprContext;
import parser.TinyPiSXParser.CompoundStmtContext;
import parser.TinyPiSXParser.ExprContext;
import parser.TinyPiSXParser.IfStmtContext;
import parser.TinyPiSXParser.LiteralExprContext;
import parser.TinyPiSXParser.MulExprContext;
import parser.TinyPiSXParser.OrExprContext;
import parser.TinyPiSXParser.ParenExprContext;
import parser.TinyPiSXParser.PrintStmtContext;
import parser.TinyPiSXParser.ProgContext;
import parser.TinyPiSXParser.StmtContext;
import parser.TinyPiSXParser.UnaryOpExprContext;
import parser.TinyPiSXParser.VarExprContext;
import parser.TinyPiSXParser.WhileStmtContext;

public class ASTGenerator {	
	ASTNode translate(ParseTree ctxx) {
		/* ExprContext */
		if (ctxx instanceof ExprContext) {
			ExprContext ctx = (ExprContext) ctxx;
			return translate(ctx.orExpr());
		/* OrExprContext */
		} else if (ctxx instanceof OrExprContext) {
			OrExprContext ctx = (OrExprContext) ctxx;
			if (ctx.orExpr() == null)
				return translate(ctx.andExpr());
			ASTNode lhs = translate(ctx.orExpr());
			ASTNode rhs = translate(ctx.andExpr());
			return new ASTBinaryExprNode(ctx.OROP().getText(), lhs, rhs);
		/* AndExprContext */
		} else if (ctxx instanceof AndExprContext) {
			AndExprContext ctx = (AndExprContext) ctxx;
			if (ctx.andExpr() == null)
				return translate(ctx.cmp1Expr());
			ASTNode lhs = translate(ctx.andExpr());
			ASTNode rhs = translate(ctx.cmp1Expr());
			return new ASTBinaryExprNode(ctx.ANDOP().getText(), lhs, rhs);
		/* Cmp1ExprContext */
		} else if (ctxx instanceof Cmp1ExprContext) {
			Cmp1ExprContext ctx = (Cmp1ExprContext) ctxx;
			if (ctx.cmp1Expr() == null)
				return translate(ctx.cmp2Expr());
			ASTNode lhs = translate(ctx.cmp1Expr());
			ASTNode rhs = translate(ctx.cmp2Expr());
			return new ASTBinaryExprNode(ctx.CMP1OP().getText(), lhs, rhs);
		/* Cmp2ExprContext */
		} else if (ctxx instanceof Cmp2ExprContext) {
			Cmp2ExprContext ctx = (Cmp2ExprContext) ctxx;
			if (ctx.cmp2Expr() == null)
				return translate(ctx.addExpr());
			ASTNode lhs = translate(ctx.cmp2Expr());
			ASTNode rhs = translate(ctx.addExpr());
			return new ASTBinaryExprNode(ctx.CMP2OP().getText(), lhs, rhs);
		/* AddExprContext */
		} else if (ctxx instanceof AddExprContext) {
			AddExprContext ctx = (AddExprContext) ctxx;
			if (ctx.addExpr() == null)
				return translate(ctx.mulExpr());
			ASTNode lhs = translate(ctx.addExpr());
			ASTNode rhs = translate(ctx.mulExpr());
			if (ctx.SUBOP() != null) {
				return new ASTBinaryExprNode(ctx.SUBOP().getText(), lhs, rhs);
			}
			return new ASTBinaryExprNode(ctx.ADDOP().getText(), lhs, rhs);
		/* MulExprContext */
		} else if (ctxx instanceof MulExprContext) {
			MulExprContext ctx = (MulExprContext) ctxx;
			if (ctx.mulExpr() == null)
				return translate(ctx.unaryExpr());
			ASTNode lhs = translate(ctx.mulExpr());
			ASTNode rhs = translate(ctx.unaryExpr());
			return new ASTBinaryExprNode(ctx.MULOP().getText(), lhs, rhs);
		/* UnaryOpExprContext */
		} else if (ctxx instanceof UnaryOpExprContext) {
			UnaryOpExprContext ctx = (UnaryOpExprContext) ctxx;
			ASTNode operand = translate(ctx.unaryExpr());
			if (ctx.SUBOP() != null) {
				return new ASTUnaryExprNode(ctx.SUBOP().getText(), operand);
			}
			return new ASTUnaryExprNode(ctx.NOTOP().getText(), operand);
		/* LiteralExprContext */
		} else if (ctxx instanceof LiteralExprContext) {
			LiteralExprContext ctx = (LiteralExprContext) ctxx;
			int value = Integer.parseInt(ctx.VALUE().getText());
			return new ASTNumberNode(value);
		/* VarExprContext */
		} else if (ctxx instanceof VarExprContext) {
			VarExprContext ctx = (VarExprContext) ctxx;
			String varName = ctx.IDENTIFIER().getText();
			return new ASTVarRefNode(varName);
		/* ParenExprContext */
		} else if (ctxx instanceof ParenExprContext) {
			ParenExprContext ctx = (ParenExprContext) ctxx;
			return translate(ctx.expr());
		/* ProgContext */
		} else if (ctxx instanceof ProgContext) {
			ProgContext ctx = (ProgContext) ctxx;
			ArrayList<String> varDecls = new ArrayList<String>();
			for (TerminalNode id: ctx.varDecls().IDENTIFIER())
				varDecls.add(id.getText());
			ASTNode stmt = translate(ctx.stmt());
			return new ASTProgNode(varDecls, stmt);
		/* CompoundStmtContext */
		} else if (ctxx instanceof CompoundStmtContext) {
			CompoundStmtContext ctx = (CompoundStmtContext) ctxx;
			ArrayList<ASTNode> stmts = new ArrayList<ASTNode>();
			for (StmtContext stmt: ctx.stmt())
				stmts.add(translate(stmt));
			return new ASTCompoundStmtNode(stmts);
		/* AssignStmtContext */
		} else if (ctxx instanceof AssignStmtContext) {
			AssignStmtContext ctx = (AssignStmtContext) ctxx;
			String var = ctx.IDENTIFIER().getText();
			ASTNode expr = translate(ctx.expr());
			return new ASTAssignStmtNode(var, expr);
		/* IfStmtContext */
		} else if (ctxx instanceof IfStmtContext) {
			IfStmtContext ctx = (IfStmtContext) ctxx;
			ASTNode cond = translate(ctx.expr());
			ASTNode thenClause = translate(ctx.stmt(0));
			ASTNode elseClause = translate(ctx.stmt(1));
			return new ASTIfStmtNode(cond, thenClause, elseClause);
		/* WhileStmtContext */
		} else if (ctxx instanceof WhileStmtContext) {
			WhileStmtContext ctx = (WhileStmtContext) ctxx;
			ASTNode cond = translate(ctx.expr());
			ASTNode stmt = translate(ctx.stmt());
			return new ASTWhileStmtNode(cond, stmt);
		/* PrintStmtContext */
		} else if (ctxx instanceof PrintStmtContext) {
			PrintStmtContext ctx = (PrintStmtContext) ctxx;
			ASTNode expr = translate(ctx.expr());
			return new ASTPrintStmtNode(expr);
		}
		throw new Error("Unknown parse tree node: "+ctxx.getText());	
	}
}
