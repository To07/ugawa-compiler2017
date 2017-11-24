// Generated from parser/TinyPiSX.g4 by ANTLR 4.6
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
public class TinyPiSXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADDOP=12, SUBOP=13, MULOP=14, ANDOP=15, OROP=16, NOTOP=17, 
		LANDOP=18, LOROP=19, CMP1OP=20, CMP2OP=21, IDENTIFIER=22, VALUE=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ADDOP", "SUBOP", "MULOP", "ANDOP", "OROP", "NOTOP", 
		"LANDOP", "LOROP", "CMP1OP", "CMP2OP", "IDENTIFIER", "VALUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "';'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
		"'while'", "'print'", "'+'", "'-'", null, "'&'", "'|'", null, "'&&'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ADDOP", "SUBOP", "MULOP", "ANDOP", "OROP", "NOTOP", "LANDOP", "LOROP", 
		"CMP1OP", "CMP2OP", "IDENTIFIER", "VALUE", "WS"
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


	public TinyPiSXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyPiSX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25n\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26u\n\26\3\27\3\27\7\27y\n\27\f\27\16\27|\13\27"+
		"\3\30\3\30\7\30\u0080\n\30\f\30\16\30\u0083\13\30\3\30\5\30\u0086\n\30"+
		"\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\3\2\n\4\2,,\61\61\4\2##\u0080\u0080\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac"+
		"|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2"+
		"\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17B\3\2\2\2"+
		"\21D\3\2\2\2\23F\3\2\2\2\25K\3\2\2\2\27Q\3\2\2\2\31W\3\2\2\2\33Y\3\2\2"+
		"\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#a\3\2\2\2%c\3\2\2\2\'f\3\2\2\2)m"+
		"\3\2\2\2+t\3\2\2\2-v\3\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\64\7x"+
		"\2\2\64\65\7c\2\2\65\66\7t\2\2\66\4\3\2\2\2\678\7=\2\28\6\3\2\2\29:\7"+
		"}\2\2:\b\3\2\2\2;<\7\177\2\2<\n\3\2\2\2=>\7?\2\2>\f\3\2\2\2?@\7k\2\2@"+
		"A\7h\2\2A\16\3\2\2\2BC\7*\2\2C\20\3\2\2\2DE\7+\2\2E\22\3\2\2\2FG\7g\2"+
		"\2GH\7n\2\2HI\7u\2\2IJ\7g\2\2J\24\3\2\2\2KL\7y\2\2LM\7j\2\2MN\7k\2\2N"+
		"O\7n\2\2OP\7g\2\2P\26\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU\7p\2\2UV\7"+
		"v\2\2V\30\3\2\2\2WX\7-\2\2X\32\3\2\2\2YZ\7/\2\2Z\34\3\2\2\2[\\\t\2\2\2"+
		"\\\36\3\2\2\2]^\7(\2\2^ \3\2\2\2_`\7~\2\2`\"\3\2\2\2ab\t\3\2\2b$\3\2\2"+
		"\2cd\7(\2\2de\7(\2\2e&\3\2\2\2fg\7~\2\2gh\7~\2\2h(\3\2\2\2ij\7?\2\2jn"+
		"\7?\2\2kl\7#\2\2ln\7?\2\2mi\3\2\2\2mk\3\2\2\2n*\3\2\2\2ou\t\4\2\2pq\7"+
		"@\2\2qu\7?\2\2rs\7>\2\2su\7?\2\2to\3\2\2\2tp\3\2\2\2tr\3\2\2\2u,\3\2\2"+
		"\2vz\t\5\2\2wy\t\6\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{.\3\2\2"+
		"\2|z\3\2\2\2}\u0081\t\7\2\2~\u0080\t\b\2\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0086\7\62\2\2\u0085}\3\2\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\60\3\2\2\2\u0087\u0088\t\t\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\b\31\2\2\u008a\62\3\2\2\2\b\2mtz\u0081\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}