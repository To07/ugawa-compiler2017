// Generated from parser/PiLangX.g4 by ANTLR 4.6
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
public class PiLangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ADDOP=15, SUBOP=16, MULOP=17, 
		ANDOP=18, OROP=19, NOTOP=20, CMP1OP=21, CMP2OP=22, IDENTIFIER=23, VALUE=24, 
		WS=25;
	public static final int
		RULE_prog = 0, RULE_funcDecl = 1, RULE_params = 2, RULE_varDecls = 3, 
		RULE_stmt = 4, RULE_expr = 5, RULE_orExpr = 6, RULE_andExpr = 7, RULE_cmp1Expr = 8, 
		RULE_cmp2Expr = 9, RULE_addExpr = 10, RULE_mulExpr = 11, RULE_unaryExpr = 12, 
		RULE_args = 13;
	public static final String[] ruleNames = {
		"prog", "funcDecl", "params", "varDecls", "stmt", "expr", "orExpr", "andExpr", 
		"cmp1Expr", "cmp2Expr", "addExpr", "mulExpr", "unaryExpr", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'('", "')'", "'{'", "'}'", "','", "'var'", "';'", 
		"'='", "'if'", "'else'", "'while'", "'return'", "'print'", "'+'", "'-'", 
		null, "'&'", "'|'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ADDOP", "SUBOP", "MULOP", "ANDOP", "OROP", "NOTOP", 
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

	@Override
	public String getGrammarFileName() { return "PiLangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PiLangXParser(TokenStream input) {
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
			setState(28);
			varDecls();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(29);
				funcDecl();
				}
				}
				setState(34);
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
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
			setState(35);
			match(T__0);
			setState(36);
			match(IDENTIFIER);
			setState(37);
			match(T__1);
			setState(38);
			params();
			setState(39);
			match(T__2);
			setState(40);
			match(T__3);
			setState(41);
			varDecls();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(42);
				stmt();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXParser.IDENTIFIER, i);
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
			setState(59);
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
				setState(51);
				match(IDENTIFIER);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(52);
					match(T__5);
					setState(53);
					match(IDENTIFIER);
					}
					}
					setState(58);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PiLangXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PiLangXParser.IDENTIFIER, i);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(61);
				match(T__6);
				setState(62);
				match(IDENTIFIER);
				setState(63);
				match(T__7);
				}
				}
				setState(68);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new CompoundStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__3);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(70);
					stmt();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__4);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(IDENTIFIER);
				setState(78);
				match(T__8);
				setState(79);
				expr();
				setState(80);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__9);
				setState(83);
				match(T__1);
				setState(84);
				expr();
				setState(85);
				match(T__2);
				setState(86);
				stmt();
				setState(87);
				match(T__10);
				setState(88);
				stmt();
				}
				break;
			case T__11:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(T__11);
				setState(91);
				match(T__1);
				setState(92);
				expr();
				setState(93);
				match(T__2);
				setState(94);
				stmt();
				}
				break;
			case T__12:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(T__12);
				setState(97);
				expr();
				setState(98);
				match(T__7);
				}
				break;
			case T__13:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__13);
				setState(101);
				expr();
				setState(102);
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
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
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
			setState(106);
			orExpr(0);
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

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public TerminalNode OROP() { return getToken(PiLangXParser.OROP, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(111);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(112);
					match(OROP);
					setState(113);
					andExpr(0);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode ANDOP() { return getToken(PiLangXParser.ANDOP, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			cmp1Expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(ANDOP);
					setState(124);
					cmp1Expr(0);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TerminalNode CMP1OP() { return getToken(PiLangXParser.CMP1OP, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cmp1Expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			cmp2Expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cmp1ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmp1Expr);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					match(CMP1OP);
					setState(135);
					cmp2Expr(0);
					}
					} 
				}
				setState(140);
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

	public static class Cmp2ExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public Cmp2ExprContext cmp2Expr() {
			return getRuleContext(Cmp2ExprContext.class,0);
		}
		public TerminalNode CMP2OP() { return getToken(PiLangXParser.CMP2OP, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cmp2Expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142);
			addExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cmp2ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmp2Expr);
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					match(CMP2OP);
					setState(146);
					addExpr(0);
					}
					} 
				}
				setState(151);
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

	public static class AddExprContext extends ParserRuleContext {
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(PiLangXParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXParser.SUBOP, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(153);
			mulExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					mulExpr(0);
					}
					} 
				}
				setState(162);
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

	public static class MulExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(PiLangXParser.MULOP, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mulExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mulExpr);
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					match(MULOP);
					setState(168);
					unaryExpr();
					}
					} 
				}
				setState(173);
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
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
		public VarExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryOpExprContext extends UnaryExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NOTOP() { return getToken(PiLangXParser.NOTOP, 0); }
		public TerminalNode SUBOP() { return getToken(PiLangXParser.SUBOP, 0); }
		public UnaryOpExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExprContext extends UnaryExprContext {
		public TerminalNode VALUE() { return getToken(PiLangXParser.VALUE, 0); }
		public LiteralExprContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallExprContext extends UnaryExprContext {
		public TerminalNode IDENTIFIER() { return getToken(PiLangXParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 24, RULE_unaryExpr);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(VALUE);
				}
				break;
			case 2:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__1);
				setState(177);
				expr();
				setState(178);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(T__1);
				setState(182);
				args();
				setState(183);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new UnaryOpExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==SUBOP || _la==NOTOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
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
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			setState(198);
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
				setState(190);
				expr();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(191);
					match(T__5);
					setState(192);
					expr();
					}
					}
					setState(197);
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
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 7:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 8:
			return cmp1Expr_sempred((Cmp1ExprContext)_localctx, predIndex);
		case 9:
			return cmp2Expr_sempred((Cmp2ExprContext)_localctx, predIndex);
		case 10:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 11:
			return mulExpr_sempred((MulExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmp1Expr_sempred(Cmp1ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cmp2Expr_sempred(Cmp2ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulExpr_sempred(MulExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\5\4>\n\4\3\5\3\5\3\5\7\5C\n\5\f"+
		"\5\16\5F\13\5\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f"+
		"\b\16\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\17\3\17\3\17\3\17\7\17"+
		"\u00c4\n\17\f\17\16\17\u00c7\13\17\5\17\u00c9\n\17\3\17\2\b\16\20\22\24"+
		"\26\30\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\21\22\4\2\22\22"+
		"\26\26\u00d3\2\36\3\2\2\2\4%\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nj\3\2\2\2"+
		"\fl\3\2\2\2\16n\3\2\2\2\20y\3\2\2\2\22\u0084\3\2\2\2\24\u008f\3\2\2\2"+
		"\26\u009a\3\2\2\2\30\u00a5\3\2\2\2\32\u00bd\3\2\2\2\34\u00c8\3\2\2\2\36"+
		"\"\5\b\5\2\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3"+
		"\3\2\2\2$\"\3\2\2\2%&\7\3\2\2&\'\7\31\2\2\'(\7\4\2\2()\5\6\4\2)*\7\5\2"+
		"\2*+\7\6\2\2+/\5\b\5\2,.\5\n\6\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\7\2\2\63\5\3\2\2\2\64>\3\2\2"+
		"\2\65:\7\31\2\2\66\67\7\b\2\2\679\7\31\2\28\66\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2>\7\3\2\2\2"+
		"?@\7\t\2\2@A\7\31\2\2AC\7\n\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2E\t\3\2\2\2FD\3\2\2\2GK\7\6\2\2HJ\5\n\6\2IH\3\2\2\2JM\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2Nk\7\7\2\2OP\7\31\2\2PQ\7\13\2\2QR\5"+
		"\f\7\2RS\7\n\2\2Sk\3\2\2\2TU\7\f\2\2UV\7\4\2\2VW\5\f\7\2WX\7\5\2\2XY\5"+
		"\n\6\2YZ\7\r\2\2Z[\5\n\6\2[k\3\2\2\2\\]\7\16\2\2]^\7\4\2\2^_\5\f\7\2_"+
		"`\7\5\2\2`a\5\n\6\2ak\3\2\2\2bc\7\17\2\2cd\5\f\7\2de\7\n\2\2ek\3\2\2\2"+
		"fg\7\20\2\2gh\5\f\7\2hi\7\n\2\2ik\3\2\2\2jG\3\2\2\2jO\3\2\2\2jT\3\2\2"+
		"\2j\\\3\2\2\2jb\3\2\2\2jf\3\2\2\2k\13\3\2\2\2lm\5\16\b\2m\r\3\2\2\2no"+
		"\b\b\1\2op\5\20\t\2pv\3\2\2\2qr\f\4\2\2rs\7\25\2\2su\5\20\t\2tq\3\2\2"+
		"\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\b\t\1\2z{\5\22"+
		"\n\2{\u0081\3\2\2\2|}\f\4\2\2}~\7\24\2\2~\u0080\5\22\n\2\177|\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\b\n\1\2\u0085\u0086\5\24\13\2\u0086"+
		"\u008c\3\2\2\2\u0087\u0088\f\4\2\2\u0088\u0089\7\27\2\2\u0089\u008b\5"+
		"\24\13\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\13\1"+
		"\2\u0090\u0091\5\26\f\2\u0091\u0097\3\2\2\2\u0092\u0093\f\4\2\2\u0093"+
		"\u0094\7\30\2\2\u0094\u0096\5\26\f\2\u0095\u0092\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\b\f\1\2\u009b\u009c\5\30\r\2\u009c\u00a2\3"+
		"\2\2\2\u009d\u009e\f\4\2\2\u009e\u009f\t\2\2\2\u009f\u00a1\5\30\r\2\u00a0"+
		"\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\27\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\r\1\2\u00a6\u00a7"+
		"\5\32\16\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\23\2"+
		"\2\u00aa\u00ac\5\32\16\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00be\7\32\2\2\u00b1\u00be\7\31\2\2\u00b2\u00b3\7\4\2\2\u00b3"+
		"\u00b4\5\f\7\2\u00b4\u00b5\7\5\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\7\31"+
		"\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\5\2\2\u00ba"+
		"\u00be\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00be\5\32\16\2\u00bd\u00b0\3"+
		"\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c5\5\f\7"+
		"\2\u00c1\u00c2\7\b\2\2\u00c2\u00c4\5\f\7\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\35\3\2\2"+
		"\2\22\"/:=DKjv\u0081\u008c\u0097\u00a2\u00ad\u00bd\u00c5\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}