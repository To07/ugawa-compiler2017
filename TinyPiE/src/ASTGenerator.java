import org.antlr.v4.runtime.tree.ParseTree;

import parser.TinyPiEParser.AddExprContext;
import parser.TinyPiEParser.AndExprContext;
import parser.TinyPiEParser.ExprContext;
import parser.TinyPiEParser.LiteralExprContext;
import parser.TinyPiEParser.MulExprContext;
import parser.TinyPiEParser.OrExprContext;
import parser.TinyPiEParser.ParenExprContext;
import parser.TinyPiEParser.UnaryOpExprContext;
import parser.TinyPiEParser.VarExprContext;

public class ASTGenerator {	
	ASTNode translateExpr(ParseTree ctxx) {
		/* expr */
		if (ctxx instanceof ExprContext) {
			ExprContext ctx = (ExprContext) ctxx;
			/* expr -> orExpr */
			return translateExpr(ctx.orExpr());
		/* orExpr */
		} else if (ctxx instanceof OrExprContext) {
			OrExprContext ctx = (OrExprContext) ctxx;
			/* orExpr -> andExpr */
			if (ctx.orExpr() == null)
				return translateExpr(ctx.andExpr());
			/* addExpr -> addExpr | mulExpr */
			ASTNode lhs = translateExpr(ctx.orExpr());
			ASTNode rhs = translateExpr(ctx.andExpr());
			return new ASTBinaryExprNode(ctx.OROP().getText(), lhs, rhs);
		/* andExpr */
		} else if (ctxx instanceof AndExprContext) {
			AndExprContext ctx = (AndExprContext) ctxx;
			/* andExpr -> addExpr */
			if (ctx.andExpr() == null)
				return translateExpr(ctx.addExpr());
			/* andExpr -> andExpr & addExpr */
			ASTNode lhs = translateExpr(ctx.andExpr());
			ASTNode rhs = translateExpr(ctx.addExpr());
			return new ASTBinaryExprNode(ctx.ANDOP().getText(), lhs, rhs);
		/* addExpr */
		} else if (ctxx instanceof AddExprContext) {
			AddExprContext ctx = (AddExprContext) ctxx;
			/* addExpr -> mulExpr */
			if (ctx.addExpr() == null)
				return translateExpr(ctx.mulExpr());
			/* addExpr -> addExpr + mulExpr */
			ASTNode lhs = translateExpr(ctx.addExpr());
			ASTNode rhs = translateExpr(ctx.mulExpr());
			if (ctx.SUBOP() != null) {
				return new ASTBinaryExprNode(ctx.SUBOP().getText(), lhs, rhs);
			}
			return new ASTBinaryExprNode(ctx.ADDOP().getText(), lhs, rhs);
		/* mulExpr */
		} else if (ctxx instanceof MulExprContext) {
			MulExprContext ctx = (MulExprContext) ctxx;
			/* mulExpr -> unaryExpr */
			if (ctx.mulExpr() == null)
				return translateExpr(ctx.unaryExpr());
			/* mulExpr -> mulExpr * unaryExpr */
			ASTNode lhs = translateExpr(ctx.mulExpr());
			ASTNode rhs = translateExpr(ctx.unaryExpr());
			return new ASTBinaryExprNode(ctx.MULOP().getText(), lhs, rhs);
		/* unaryOpExpr */
		} else if (ctxx instanceof UnaryOpExprContext) {
			UnaryOpExprContext ctx = (UnaryOpExprContext) ctxx;
			ASTNode operand = translateExpr(ctx.unaryExpr());
			if (ctx.SUBOP() != null) {
				return new ASTUnaryExprNode(ctx.SUBOP().getText(), operand);
			}
			return new ASTUnaryExprNode(ctx.NOTOP().getText(), operand);
		/* literalExpr */
		} else if (ctxx instanceof LiteralExprContext) {
			LiteralExprContext ctx = (LiteralExprContext) ctxx;
			int value = Integer.parseInt(ctx.VALUE().getText());
			return new ASTNumberNode(value);
		/* varExpr */
		} else if (ctxx instanceof VarExprContext) {
			VarExprContext ctx = (VarExprContext) ctxx;
			String varName = ctx.IDENTIFIER().getText();
			return new ASTVarRefNode(varName);
		/* parenExpr */
		} else if (ctxx instanceof ParenExprContext) {
			ParenExprContext ctx = (ParenExprContext) ctxx;
			return translateExpr(ctx.expr());
		}
		
		throw new Error("Unknown parse tree node: "+ctxx.getText());		
	}
	ASTNode translate(ParseTree ctxx) {
		return translateExpr(ctxx);
	}
}
