// Generated from parser/PiLangXX.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PiLangXXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ADDOP=18, SUBOP=19, MULOP=20, ANDOP=21, OROP=22, NOTOP=23, LANDOP=24, 
		LOROP=25, CMP1OP=26, CMP2OP=27, IDENTIFIER=28, VALUE=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_funcDecl = 1, RULE_params = 2, RULE_varDecls = 3, 
		RULE_stmt = 4, RULE_expr = 5, RULE_logOrExpr = 6, RULE_logAndExpr = 7, 
		RULE_orExpr = 8, RULE_andExpr = 9, RULE_cmp1Expr = 10, RULE_cmp2Expr = 11, 
		RULE_addExpr = 12, RULE_mulExpr = 13, RULE_unaryExpr = 14, RULE_args = 15;
	public static final String[] ruleNames = {
		"prog", "funcDecl", "params", "varDecls", "stmt", "expr", "logOrExpr", 
		"logAndExpr", "orExpr", "andExpr", "cmp1Expr", "cmp2Expr", "addExpr", 
		"mulExpr", "unaryExpr", "args"
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

	@Override
	public String getGrammarFileName() { return "PiLangXX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PiLangXXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public VarDeclsContext varDecls() {
			return getRuleContext(VarDeclsContext.class,0);
		}
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			varDecls();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				funcDecl();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public VarDeclsContext varDecls() {
			return getRuleContext(VarDeclsContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(T__1);
			setState(42);
			params();
			setState(43);
			match(T__2);
			setState(44);
			match(T__3);
			setState(45);
			varDecls();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(46);
				stmt();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXXParser.IDENTIFIER, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(IDENTIFIER);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(56);
					match(T__5);
					setState(57);
					match(IDENTIFIER);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXXParser.IDENTIFIER, i);
		}
		public VarDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecls; }
	}

	public final VarDeclsContext varDecls() throws RecognitionException {
		VarDeclsContext _localctx = new VarDeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(65);
				match(T__6);
				setState(66);
				match(IDENTIFIER);
				setState(67);
				match(T__7);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StmtContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class CompoundStmtContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public CompoundStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStmtContext extends StmtContext {
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStmtContext extends StmtContext {
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new CompoundStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__3);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(74);
					stmt();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(T__4);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(IDENTIFIER);
				setState(82);
				match(T__8);
				setState(83);
				expr();
				setState(84);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__9);
				setState(87);
				match(T__1);
				setState(88);
				expr();
				setState(89);
				match(T__2);
				setState(90);
				stmt();
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(T__10);
						setState(92);
						match(T__1);
						setState(93);
						expr();
						setState(94);
						match(T__2);
						setState(95);
						stmt();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(102);
					match(T__11);
					setState(103);
					stmt();
					}
					break;
				case 2:
					{
					}
					break;
				}
				}
				break;
			case T__12:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(T__12);
				setState(108);
				match(T__1);
				setState(109);
				expr();
				setState(110);
				match(T__2);
				setState(111);
				stmt();
				}
				break;
			case T__13:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(T__13);
				setState(114);
				match(T__7);
				}
				break;
			case T__14:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__14);
				setState(116);
				match(T__7);
				}
				break;
			case T__15:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(T__15);
				setState(118);
				expr();
				setState(119);
				match(T__7);
				}
				break;
			case T__16:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__16);
				setState(122);
				expr();
				setState(123);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LogOrExprContext logOrExpr() {
			return getRuleContext(LogOrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			logOrExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogOrExprContext extends ParserRuleContext {
		public LogAndExprContext logAndExpr() {
			return getRuleContext(LogAndExprContext.class,0);
		}
		public LogOrExprContext logOrExpr() {
			return getRuleContext(LogOrExprContext.class,0);
		}
		public TerminalNode LOROP() { return getToken(PiLangXXParser.LOROP, 0); }
		public LogOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOrExpr; }
	}

	public final LogOrExprContext logOrExpr() throws RecognitionException {
		return logOrExpr(0);
	}

	private LogOrExprContext logOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogOrExprContext _localctx = new LogOrExprContext(_ctx, _parentState);
		LogOrExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_logOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			logAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logOrExpr);
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					match(LOROP);
					setState(134);
					logAndExpr(0);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogAndExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public LogAndExprContext logAndExpr() {
			return getRuleContext(LogAndExprContext.class,0);
		}
		public TerminalNode LANDOP() { return getToken(PiLangXXParser.LANDOP, 0); }
		public LogAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logAndExpr; }
	}

	public final LogAndExprContext logAndExpr() throws RecognitionException {
		return logAndExpr(0);
	}

	private LogAndExprContext logAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogAndExprContext _localctx = new LogAndExprContext(_ctx, _parentState);
		LogAndExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			orExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logAndExpr);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					match(LANDOP);
					setState(145);
					orExpr(0);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode OROP() { return getToken(PiLangXXParser.OROP, 0); }
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		return orExpr(0);
	}

	private OrExprContext orExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExprContext _localctx = new OrExprContext(_ctx, _parentState);
		OrExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					match(OROP);
					setState(156);
					andExpr(0);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public Cmp1ExprContext cmp1Expr() {
			return getRuleContext(Cmp1ExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode ANDOP() { return getToken(PiLangXXParser.ANDOP, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			cmp1Expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					match(ANDOP);
					setState(167);
					cmp1Expr(0);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cmp1ExprContext extends ParserRuleContext {
		public Cmp2ExprContext cmp2Expr() {
			return getRuleContext(Cmp2ExprContext.class,0);
		}
		public Cmp1ExprContext cmp1Expr() {
			return getRuleContext(Cmp1ExprContext.class,0);
		}
		public TerminalNode CMP1OP() { return getToken(PiLangXXParser.CMP1OP, 0); }
		public Cmp1ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp1Expr; }
	}

	public final Cmp1ExprContext cmp1Expr() throws RecognitionException {
		return cmp1Expr(0);
	}

	private Cmp1ExprContext cmp1Expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cmp1ExprContext _localctx = new Cmp1ExprContext(_ctx, _parentState);
		Cmp1ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_cmp1Expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			cmp2Expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cmp1ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmp1Expr);
					setState(176);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(177);
					match(CMP1OP);
					setState(178);
					cmp2Expr(0);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cmp2ExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public Cmp2ExprContext cmp2Expr() {
			return getRuleContext(Cmp2ExprContext.class,0);
		}
		public TerminalNode CMP2OP() { return getToken(PiLangXXParser.CMP2OP, 0); }
		public Cmp2ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp2Expr; }
	}

	public final Cmp2ExprContext cmp2Expr() throws RecognitionException {
		return cmp2Expr(0);
	}

	private Cmp2ExprContext cmp2Expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cmp2ExprContext _localctx = new Cmp2ExprContext(_ctx, _parentState);
		Cmp2ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cmp2Expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cmp2ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmp2Expr);
					setState(187);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(188);
					match(CMP2OP);
					setState(189);
					addExpr(0);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(PiLangXXParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXXParser.SUBOP, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(200);
					mulExpr(0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(PiLangXXParser.MULOP, 0); }
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		return mulExpr(0);
	}

	private MulExprContext mulExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExprContext _localctx = new MulExprContext(_ctx, _parentState);
		MulExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_mulExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(207);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpr);
					setState(209);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(210);
					match(MULOP);
					setState(211);
					unaryExpr();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public VarExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryOpExprContext extends UnaryExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NOTOP() { return getToken(PiLangXXParser.NOTOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXXParser.SUBOP, 0); }
		public UnaryOpExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends UnaryExprContext {
		public TerminalNode VALUE() { return getToken(PiLangXXParser.VALUE, 0); }
		public LiteralExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXXParser.IDENTIFIER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends UnaryExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryExpr);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(VALUE);
				}
				break;
			case 2:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__1);
				setState(220);
				expr();
				setState(221);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(IDENTIFIER);
				setState(224);
				match(T__1);
				setState(225);
				args();
				setState(226);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new UnaryOpExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==SUBOP || _la==NOTOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				unaryExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case SUBOP:
			case NOTOP:
			case IDENTIFIER:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				expr();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(234);
					match(T__5);
					setState(235);
					expr();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return logOrExpr_sempred((LogOrExprContext)_localctx, predIndex);
		case 7:
			return logAndExpr_sempred((LogAndExprContext)_localctx, predIndex);
		case 8:
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 9:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 10:
			return cmp1Expr_sempred((Cmp1ExprContext)_localctx, predIndex);
		case 11:
			return cmp2Expr_sempred((Cmp2ExprContext)_localctx, predIndex);
		case 12:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 13:
			return mulExpr_sempred((MulExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logOrExpr_sempred(LogOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logAndExpr_sempred(LogAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmp1Expr_sempred(Cmp1ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmp2Expr_sempred(Cmp2ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpr_sempred(MulExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3"+
		"\16\3\65\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\5\4B\n\4"+
		"\3\5\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"d\n\6\f\6\16\6g\13\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00a0\n\n\f\n\16\n\u00a3\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ab"+
		"\n\13\f\13\16\13\u00ae\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b6\n\f\f\f"+
		"\16\f\u00b9\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00e9\n\20\3\21\3\21\3\21\3\21\7\21\u00ef\n\21\f\21\16\21\u00f2\13"+
		"\21\5\21\u00f4\n\21\3\21\2\n\16\20\22\24\26\30\32\34\22\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \2\4\3\2\24\25\4\2\25\25\31\31\u0102\2\"\3\2"+
		"\2\2\4)\3\2\2\2\6A\3\2\2\2\bH\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u008e\3\2\2\2\22\u0099\3\2\2\2\24\u00a4\3\2\2\2\26\u00af"+
		"\3\2\2\2\30\u00ba\3\2\2\2\32\u00c5\3\2\2\2\34\u00d0\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u00f3\3\2\2\2\"&\5\b\5\2#%\5\4\3\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2"+
		"\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7\3\2\2*+\7\36\2\2+,\7\4\2\2,-\5"+
		"\6\4\2-.\7\5\2\2./\7\6\2\2/\63\5\b\5\2\60\62\5\n\6\2\61\60\3\2\2\2\62"+
		"\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66"+
		"\67\7\7\2\2\67\5\3\2\2\28B\3\2\2\29>\7\36\2\2:;\7\b\2\2;=\7\36\2\2<:\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A8\3\2\2\2A9\3"+
		"\2\2\2B\7\3\2\2\2CD\7\t\2\2DE\7\36\2\2EG\7\n\2\2FC\3\2\2\2GJ\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KO\7\6\2\2LN\5\n\6\2ML\3\2\2\2"+
		"NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2R\u0080\7\7\2\2ST\7"+
		"\36\2\2TU\7\13\2\2UV\5\f\7\2VW\7\n\2\2W\u0080\3\2\2\2XY\7\f\2\2YZ\7\4"+
		"\2\2Z[\5\f\7\2[\\\7\5\2\2\\e\5\n\6\2]^\7\r\2\2^_\7\4\2\2_`\5\f\7\2`a\7"+
		"\5\2\2ab\5\n\6\2bd\3\2\2\2c]\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3"+
		"\2\2\2ge\3\2\2\2hi\7\16\2\2il\5\n\6\2jl\3\2\2\2kh\3\2\2\2kj\3\2\2\2l\u0080"+
		"\3\2\2\2mn\7\17\2\2no\7\4\2\2op\5\f\7\2pq\7\5\2\2qr\5\n\6\2r\u0080\3\2"+
		"\2\2st\7\20\2\2t\u0080\7\n\2\2uv\7\21\2\2v\u0080\7\n\2\2wx\7\22\2\2xy"+
		"\5\f\7\2yz\7\n\2\2z\u0080\3\2\2\2{|\7\23\2\2|}\5\f\7\2}~\7\n\2\2~\u0080"+
		"\3\2\2\2\177K\3\2\2\2\177S\3\2\2\2\177X\3\2\2\2\177m\3\2\2\2\177s\3\2"+
		"\2\2\177u\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082"+
		"\5\16\b\2\u0082\r\3\2\2\2\u0083\u0084\b\b\1\2\u0084\u0085\5\20\t\2\u0085"+
		"\u008b\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\33\2\2\u0088\u008a\5"+
		"\20\t\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\t\1"+
		"\2\u008f\u0090\5\22\n\2\u0090\u0096\3\2\2\2\u0091\u0092\f\4\2\2\u0092"+
		"\u0093\7\32\2\2\u0093\u0095\5\22\n\2\u0094\u0091\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\21\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\b\n\1\2\u009a\u009b\5\24\13\2\u009b\u00a1\3"+
		"\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7\30\2\2\u009e\u00a0\5\24\13\2"+
		"\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\13\1\2\u00a5"+
		"\u00a6\5\26\f\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\4\2\2\u00a8\u00a9\7"+
		"\27\2\2\u00a9\u00ab\5\26\f\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\b\f\1\2\u00b0\u00b1\5\30\r\2\u00b1\u00b7\3\2\2\2\u00b2"+
		"\u00b3\f\4\2\2\u00b3\u00b4\7\34\2\2\u00b4\u00b6\5\30\r\2\u00b5\u00b2\3"+
		"\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\27\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\r\1\2\u00bb\u00bc\5\32\16"+
		"\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\f\4\2\2\u00be\u00bf\7\35\2\2\u00bf"+
		"\u00c1\5\32\16\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\b\16\1\2\u00c6\u00c7\5\34\17\2\u00c7\u00cd\3\2\2\2\u00c8\u00c9"+
		"\f\4\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cc\5\34\17\2\u00cb\u00c8\3\2\2\2"+
		"\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\17\1\2\u00d1\u00d2\5\36\20"+
		"\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\f\4\2\2\u00d4\u00d5\7\26\2\2\u00d5"+
		"\u00d7\5\36\20\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00e9\7\37\2\2\u00dc\u00e9\7\36\2\2\u00dd\u00de\7\4\2\2\u00de\u00df\5"+
		"\f\7\2\u00df\u00e0\7\5\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00e2\7\36\2\2\u00e2"+
		"\u00e3\7\4\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\7\5\2\2\u00e5\u00e9\3\2"+
		"\2\2\u00e6\u00e7\t\3\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00db\3\2\2\2\u00e8"+
		"\u00dc\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\37\3\2\2\2\u00ea\u00f4\3\2\2\2\u00eb\u00f0\5\f\7\2\u00ec\u00ed"+
		"\7\b\2\2\u00ed\u00ef\5\f\7\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4!\3\2\2\2\26&\63>AH"+
		"Oek\177\u008b\u0096\u00a1\u00ac\u00b7\u00c2\u00cd\u00d8\u00e8\u00f0\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}