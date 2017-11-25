import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangXLexer;
import parser.PiLangXParser;

public class PrintAST {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PiLangXLexer lexer = new PiLangXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
        PiLangXParser parser = new PiLangXParser(token);
        ParseTree tree = parser.prog();
        ASTGenerator astgen = new ASTGenerator();
        ASTNode ast = astgen.translate(tree);
        System.out.println(ast);
	}
}
