import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.TinyPiSParser.AddExprContext;
import parser.TinyPiSParser.AndExprContext;
import parser.TinyPiSParser.AssignStmtContext;
import parser.TinyPiSParser.CompoundStmtContext;
import parser.TinyPiSParser.ExprContext;
import parser.TinyPiSParser.IfStmtContext;
import parser.TinyPiSParser.LiteralExprContext;
import parser.TinyPiSParser.MulExprContext;
import parser.TinyPiSParser.OrExprContext;
import parser.TinyPiSParser.ParenExprContext;
import parser.TinyPiSParser.PrintStmtContext;
import parser.TinyPiSParser.ProgContext;
import parser.TinyPiSParser.StmtContext;
import parser.TinyPiSParser.UnaryOpExprContext;
import parser.TinyPiSParser.VarExprContext;
import parser.TinyPiSParser.WhileStmtContext;

public class ASTGenerator {	
	ASTNode translate(ParseTree ctxx) {
		/* ExprContext */
		if (ctxx instanceof ExprContext) {
			ExprContext ctx = (ExprContext) ctxx;
			return translate(ctx.orExpr());
		/* OrExprContext */
		} else if (ctxx instanceof OrExprContext) {
			OrExprContext ctx = (OrExprContext) ctxx;
			/* orExpr -> andExpr */
			if (ctx.orExpr() == null)
				return translate(ctx.andExpr());
			/* addExpr -> addExpr | mulExpr */
			ASTNode lhs = translate(ctx.orExpr());
			ASTNode rhs = translate(ctx.andExpr());
			return new ASTBinaryExprNode(ctx.OROP().getText(), lhs, rhs);
		/* AndExprContext */
		} else if (ctxx instanceof AndExprContext) {
			AndExprContext ctx = (AndExprContext) ctxx;
			/* andExpr -> addExpr */
			if (ctx.andExpr() == null)
				return translate(ctx.addExpr());
			/* andExpr -> andExpr & addExpr */
			ASTNode lhs = translate(ctx.andExpr());
			ASTNode rhs = translate(ctx.addExpr());
			return new ASTBinaryExprNode(ctx.ANDOP().getText(), lhs, rhs);
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
