// Generated from parser/PiLangXX.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiLangXXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ADDOP=18, SUBOP=19, MULOP=20, ANDOP=21, OROP=22, NOTOP=23, LANDOP=24, 
		LOROP=25, CMP1OP=26, CMP2OP=27, IDENTIFIER=28, VALUE=29, WS=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ADDOP", "SUBOP", "MULOP", "ANDOP", "OROP", "NOTOP", "LANDOP", "LOROP", 
		"CMP1OP", "CMP2OP", "IDENTIFIER", "VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "';'", 
		"'='", "'if'", "'else if'", "'else'", "'while'", "'break'", "'continue'", 
		"'return'", "'print'", "'+'", "'-'", null, "'&'", "'|'", null, "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ADDOP", "SUBOP", "MULOP", "ANDOP", 
		"OROP", "NOTOP", "LANDOP", "LOROP", "CMP1OP", "CMP2OP", "IDENTIFIER", 
		"VALUE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PiLangXXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PiLangXX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u00a3\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00aa\n\34\3\35\3\35\7\35\u00ae\n\35\f\35\16\35\u00b1\13\35\3\36\3\36"+
		"\7\36\u00b5\n\36\f\36\16\36\u00b8\13\36\3\36\5\36\u00bb\n\36\3\37\3\37"+
		"\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= \3\2\n\5\2\'\',,\61\61\4\2##\u0080\u0080\4\2>>@@\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u00c5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2"+
		"\rP\3\2\2\2\17R\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27]\3\2\2"+
		"\2\31e\3\2\2\2\33j\3\2\2\2\35p\3\2\2\2\37v\3\2\2\2!\177\3\2\2\2#\u0086"+
		"\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2"+
		"-\u0094\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009b\3\2\2\2\65\u00a2"+
		"\3\2\2\2\67\u00a9\3\2\2\29\u00ab\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2"+
		"?@\7h\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2CD\7v\2\2DE\7k\2\2EF\7q\2\2FG\7p\2"+
		"\2G\4\3\2\2\2HI\7*\2\2I\6\3\2\2\2JK\7+\2\2K\b\3\2\2\2LM\7}\2\2M\n\3\2"+
		"\2\2NO\7\177\2\2O\f\3\2\2\2PQ\7.\2\2Q\16\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7"+
		"t\2\2U\20\3\2\2\2VW\7=\2\2W\22\3\2\2\2XY\7?\2\2Y\24\3\2\2\2Z[\7k\2\2["+
		"\\\7h\2\2\\\26\3\2\2\2]^\7g\2\2^_\7n\2\2_`\7u\2\2`a\7g\2\2ab\7\"\2\2b"+
		"c\7k\2\2cd\7h\2\2d\30\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\32"+
		"\3\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2\2o\34\3\2\2\2pq\7"+
		"d\2\2qr\7t\2\2rs\7g\2\2st\7c\2\2tu\7m\2\2u\36\3\2\2\2vw\7e\2\2wx\7q\2"+
		"\2xy\7p\2\2yz\7v\2\2z{\7k\2\2{|\7p\2\2|}\7w\2\2}~\7g\2\2~ \3\2\2\2\177"+
		"\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7w\2\2"+
		"\u0083\u0084\7t\2\2\u0084\u0085\7p\2\2\u0085\"\3\2\2\2\u0086\u0087\7r"+
		"\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b"+
		"\7v\2\2\u008b$\3\2\2\2\u008c\u008d\7-\2\2\u008d&\3\2\2\2\u008e\u008f\7"+
		"/\2\2\u008f(\3\2\2\2\u0090\u0091\t\2\2\2\u0091*\3\2\2\2\u0092\u0093\7"+
		"(\2\2\u0093,\3\2\2\2\u0094\u0095\7~\2\2\u0095.\3\2\2\2\u0096\u0097\t\3"+
		"\2\2\u0097\60\3\2\2\2\u0098\u0099\7(\2\2\u0099\u009a\7(\2\2\u009a\62\3"+
		"\2\2\2\u009b\u009c\7~\2\2\u009c\u009d\7~\2\2\u009d\64\3\2\2\2\u009e\u009f"+
		"\7?\2\2\u009f\u00a3\7?\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a3\7?\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\66\3\2\2\2\u00a4\u00aa\t\4\2"+
		"\2\u00a5\u00a6\7@\2\2\u00a6\u00aa\7?\2\2\u00a7\u00a8\7>\2\2\u00a8\u00aa"+
		"\7?\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"8\3\2\2\2\u00ab\u00af\t\5\2\2\u00ac\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0:\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\t\7\2\2\u00b3\u00b5\t\b\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\62\2\2\u00ba"+
		"\u00b2\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb<\3\2\2\2\u00bc\u00bd\t\t\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\b\37\2\2\u00bf>\3\2\2\2\b\2\u00a2\u00a9"+
		"\u00af\u00b6\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}