import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.PiLangXXLexer;
import parser.PiLangXXParser;

public class PrintAST {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		PiLangXXLexer lexer = new PiLangXXLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
        PiLangXXParser parser = new PiLangXXParser(token);
        ParseTree tree = parser.prog();
        ASTGenerator astgen = new ASTGenerator();
        ASTNode ast = astgen.translate(tree);
        System.out.println(ast);
	}
}
