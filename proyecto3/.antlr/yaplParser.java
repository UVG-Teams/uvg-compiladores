// Generated from /Users/willi/Desktop/repos/uvg-compiladores/proyecto3/yapl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CLASS=13, ELSE=14, FALSE=15, FI=16, IF=17, 
		IN=18, INHERITS=19, ISVOID=20, LOOP=21, POOL=22, THEN=23, WHILE=24, NEW=25, 
		NOT=26, TRUE=27, LET=28, TYPE_ID=29, OBJECT_ID=30, SELF=31, SELF_TYPE=32, 
		STRING=33, WHITESPACE=34, NEWLINE=35, INT=36, COMMENT=37, COMMENT_BLOCK=38, 
		PLUS=39, MINUS=40, MULT=41, DIV=42, LT=43, LE=44;
	public static final int
		RULE_prog = 0, RULE_class_def = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_asgn = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "class_def", "feature", "formal", "asgn", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'~'", 
			"'='", "'@'", "'.'", null, null, "'false'", null, null, null, null, null, 
			null, null, null, null, null, null, "'true'", "'let'", null, null, "'self'", 
			"'SELF_TYPE'", null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", 
			"LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "TRUE", "LET", "TYPE_ID", 
			"OBJECT_ID", "SELF", "SELF_TYPE", "STRING", "WHITESPACE", "NEWLINE", 
			"INT", "COMMENT", "COMMENT_BLOCK", "PLUS", "MINUS", "MULT", "DIV", "LT", 
			"LE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "yapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yaplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				class_def();
				setState(13);
				match(T__0);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(yaplParser.CLASS, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public TerminalNode INHERITS() { return getToken(yaplParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(CLASS);
			setState(20);
			match(TYPE_ID);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(21);
				match(INHERITS);
				setState(22);
				match(TYPE_ID);
				}
			}

			setState(25);
			match(T__1);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECT_ID) {
				{
				{
				setState(26);
				feature();
				setState(27);
				match(T__0);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(T__2);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Feat_asgnContext extends FeatureContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Feat_asgnContext(FeatureContext ctx) { copyFrom(ctx); }
	}
	public static class Feat_defContext extends FeatureContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public Feat_defContext(FeatureContext ctx) { copyFrom(ctx); }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Feat_defContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(OBJECT_ID);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(37);
					match(T__3);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OBJECT_ID) {
						{
						setState(38);
						formal();
						setState(43);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(39);
							match(T__4);
							setState(40);
							formal();
							}
							}
							setState(45);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(48);
					match(T__5);
					}
				}

				setState(51);
				match(T__6);
				setState(52);
				match(TYPE_ID);
				setState(53);
				match(T__1);
				setState(54);
				expr(0);
				setState(55);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Feat_asgnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(OBJECT_ID);
				setState(58);
				match(T__6);
				setState(59);
				match(TYPE_ID);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(60);
					match(T__7);
					setState(61);
					expr(0);
					}
				}

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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OBJECT_ID);
			setState(67);
			match(T__6);
			setState(68);
			match(TYPE_ID);
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

	public static class AsgnContext extends ParserRuleContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgn; }
	}

	public final AsgnContext asgn() throws RecognitionException {
		AsgnContext _localctx = new AsgnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asgn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(OBJECT_ID);
			setState(71);
			match(T__6);
			setState(72);
			match(TYPE_ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(73);
				match(T__7);
				setState(74);
				expr(0);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_parenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_parenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_negadoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_negadoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_falseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(yaplParser.FALSE, 0); }
		public Expr_falseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_multContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(yaplParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(yaplParser.DIV, 0); }
		public Expr_multContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_selfContext extends ExprContext {
		public TerminalNode SELF() { return getToken(yaplParser.SELF, 0); }
		public Expr_selfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_instanceContext extends ExprContext {
		public TerminalNode NEW() { return getToken(yaplParser.NEW, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public Expr_instanceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_declContext extends ExprContext {
		public TerminalNode LET() { return getToken(yaplParser.LET, 0); }
		public List<AsgnContext> asgn() {
			return getRuleContexts(AsgnContext.class);
		}
		public AsgnContext asgn(int i) {
			return getRuleContext(AsgnContext.class,i);
		}
		public TerminalNode IN() { return getToken(yaplParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_declContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_isvoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(yaplParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_isvoidContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_callContext extends ExprContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_callContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_less_thanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(yaplParser.LT, 0); }
		public TerminalNode LE() { return getToken(yaplParser.LE, 0); }
		public Expr_less_thanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_intContext extends ExprContext {
		public TerminalNode INT() { return getToken(yaplParser.INT, 0); }
		public Expr_intContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_class_callContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public Expr_class_callContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_equalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_equalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_strContext extends ExprContext {
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public Expr_strContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_asgnContext extends ExprContext {
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_asgnContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_bracketsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_bracketsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_whileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(yaplParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(yaplParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(yaplParser.POOL, 0); }
		public Expr_whileContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_trueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(yaplParser.TRUE, 0); }
		public Expr_trueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_negativeContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(yaplParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_negativeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_notContext extends ExprContext {
		public TerminalNode NOT() { return getToken(yaplParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_notContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_ifContext extends ExprContext {
		public TerminalNode IF() { return getToken(yaplParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(yaplParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(yaplParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(yaplParser.FI, 0); }
		public Expr_ifContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_idContext extends ExprContext {
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public Expr_idContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_sumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(yaplParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(yaplParser.MINUS, 0); }
		public Expr_sumaContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new Expr_selfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(SELF);
				}
				break;
			case 2:
				{
				_localctx = new Expr_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new Expr_strContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new Expr_trueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new Expr_falseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new Expr_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				_localctx = new Expr_negativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(MINUS);
				setState(85);
				expr(17);
				}
				break;
			case 8:
				{
				_localctx = new Expr_negadoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(T__8);
				setState(87);
				expr(16);
				}
				break;
			case 9:
				{
				_localctx = new Expr_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(NOT);
				setState(89);
				expr(15);
				}
				break;
			case 10:
				{
				_localctx = new Expr_instanceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(NEW);
				setState(91);
				match(TYPE_ID);
				}
				break;
			case 11:
				{
				_localctx = new Expr_isvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ISVOID);
				setState(93);
				expr(13);
				}
				break;
			case 12:
				{
				_localctx = new Expr_parenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(T__3);
				setState(95);
				expr(0);
				setState(96);
				match(T__5);
				}
				break;
			case 13:
				{
				_localctx = new Expr_bracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__1);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					expr(0);
					setState(100);
					match(T__0);
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT) | (1L << MINUS))) != 0) );
				setState(106);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new Expr_asgnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(OBJECT_ID);
				setState(109);
				match(T__7);
				setState(110);
				expr(6);
				}
				break;
			case 15:
				{
				_localctx = new Expr_declContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(LET);
				setState(112);
				asgn();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(113);
					match(T__4);
					setState(114);
					asgn();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(IN);
				setState(121);
				expr(5);
				}
				break;
			case 16:
				{
				_localctx = new Expr_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(OBJECT_ID);
				setState(124);
				match(T__3);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT) | (1L << MINUS))) != 0)) {
					{
					setState(125);
					expr(0);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(126);
						match(T__4);
						setState(127);
						expr(0);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(135);
				match(T__5);
				}
				break;
			case 17:
				{
				_localctx = new Expr_ifContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(IF);
				setState(137);
				expr(0);
				setState(138);
				match(THEN);
				setState(139);
				expr(0);
				setState(140);
				match(ELSE);
				setState(141);
				expr(0);
				setState(142);
				match(FI);
				}
				break;
			case 18:
				{
				_localctx = new Expr_whileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(WHILE);
				setState(145);
				expr(0);
				setState(146);
				match(LOOP);
				setState(147);
				expr(0);
				setState(148);
				match(POOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_multContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Expr_sumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new Expr_less_thanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(159);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==LE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new Expr_equalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162);
						match(T__9);
						setState(163);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new Expr_class_callContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(165);
							match(T__10);
							setState(166);
							match(TYPE_ID);
							}
						}

						setState(169);
						match(T__11);
						setState(170);
						match(OBJECT_ID);
						setState(171);
						match(T__3);
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT) | (1L << MINUS))) != 0)) {
							{
							setState(172);
							expr(0);
							setState(177);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(173);
								match(T__4);
								setState(174);
								expr(0);
								}
								}
								setState(179);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(182);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2"+
		"\23\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\5\4\61\n\4\3\4\5"+
		"\4\64\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\5\4C\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7v\n"+
		"\7\f\7\16\7y\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16"+
		"\7\u0086\13\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0099\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b2"+
		"\n\7\f\7\16\7\u00b5\13\7\5\7\u00b7\n\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd"+
		"\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\6\3\2\37 \3\2+,\3\2)*\3\2-.\2\u00de\2"+
		"\21\3\2\2\2\4\25\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\f\u0098\3\2"+
		"\2\2\16\17\5\4\3\2\17\20\7\3\2\2\20\22\3\2\2\2\21\16\3\2\2\2\22\23\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\17\2\2\26\31\7\37"+
		"\2\2\27\30\7\25\2\2\30\32\7\37\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3"+
		"\2\2\2\33!\7\4\2\2\34\35\5\6\4\2\35\36\7\3\2\2\36 \3\2\2\2\37\34\3\2\2"+
		"\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\5\2\2%\5"+
		"\3\2\2\2&\63\7 \2\2\'\60\7\6\2\2(-\5\b\5\2)*\7\7\2\2*,\5\b\5\2+)\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60(\3\2\2\2\60"+
		"\61\3\2\2\2\61\62\3\2\2\2\62\64\7\b\2\2\63\'\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\t\2\2\66\67\7\37\2\2\678\7\4\2\289\5\f\7\29:\7\5\2"+
		"\2:C\3\2\2\2;<\7 \2\2<=\7\t\2\2=@\7\37\2\2>?\7\n\2\2?A\5\f\7\2@>\3\2\2"+
		"\2@A\3\2\2\2AC\3\2\2\2B&\3\2\2\2B;\3\2\2\2C\7\3\2\2\2DE\7 \2\2EF\7\t\2"+
		"\2FG\7\37\2\2G\t\3\2\2\2HI\7 \2\2IJ\7\t\2\2JM\7\37\2\2KL\7\n\2\2LN\5\f"+
		"\7\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OP\b\7\1\2P\u0099\7!\2\2Q\u0099\7"+
		"&\2\2R\u0099\7#\2\2S\u0099\7\35\2\2T\u0099\7\21\2\2U\u0099\t\2\2\2VW\7"+
		"*\2\2W\u0099\5\f\7\23XY\7\13\2\2Y\u0099\5\f\7\22Z[\7\34\2\2[\u0099\5\f"+
		"\7\21\\]\7\33\2\2]\u0099\7\37\2\2^_\7\26\2\2_\u0099\5\f\7\17`a\7\6\2\2"+
		"ab\5\f\7\2bc\7\b\2\2c\u0099\3\2\2\2dh\7\4\2\2ef\5\f\7\2fg\7\3\2\2gi\3"+
		"\2\2\2he\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\5\2\2m\u0099"+
		"\3\2\2\2no\7 \2\2op\7\n\2\2p\u0099\5\f\7\bqr\7\36\2\2rw\5\n\6\2st\7\7"+
		"\2\2tv\5\n\6\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2"+
		"\2\2z{\7\24\2\2{|\5\f\7\7|\u0099\3\2\2\2}~\7 \2\2~\u0087\7\6\2\2\177\u0084"+
		"\5\f\7\2\u0080\u0081\7\7\2\2\u0081\u0083\5\f\7\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\177\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0099\7\b\2\2\u008a\u008b\7\23\2\2\u008b\u008c\5\f\7\2"+
		"\u008c\u008d\7\31\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\5\f\7\2\u0090\u0091\7\22\2\2\u0091\u0099\3\2\2\2\u0092\u0093\7\32\2\2"+
		"\u0093\u0094\5\f\7\2\u0094\u0095\7\27\2\2\u0095\u0096\5\f\7\2\u0096\u0097"+
		"\7\30\2\2\u0097\u0099\3\2\2\2\u0098O\3\2\2\2\u0098Q\3\2\2\2\u0098R\3\2"+
		"\2\2\u0098S\3\2\2\2\u0098T\3\2\2\2\u0098U\3\2\2\2\u0098V\3\2\2\2\u0098"+
		"X\3\2\2\2\u0098Z\3\2\2\2\u0098\\\3\2\2\2\u0098^\3\2\2\2\u0098`\3\2\2\2"+
		"\u0098d\3\2\2\2\u0098n\3\2\2\2\u0098q\3\2\2\2\u0098}\3\2\2\2\u0098\u008a"+
		"\3\2\2\2\u0098\u0092\3\2\2\2\u0099\u00bb\3\2\2\2\u009a\u009b\f\f\2\2\u009b"+
		"\u009c\t\3\2\2\u009c\u00ba\5\f\7\r\u009d\u009e\f\13\2\2\u009e\u009f\t"+
		"\4\2\2\u009f\u00ba\5\f\7\f\u00a0\u00a1\f\n\2\2\u00a1\u00a2\t\5\2\2\u00a2"+
		"\u00ba\5\f\7\13\u00a3\u00a4\f\t\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00ba\5"+
		"\f\7\n\u00a6\u00a9\f\6\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00aa\7\37\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\16"+
		"\2\2\u00ac\u00ad\7 \2\2\u00ad\u00b6\7\6\2\2\u00ae\u00b3\5\f\7\2\u00af"+
		"\u00b0\7\7\2\2\u00b0\u00b2\5\f\7\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\7\b\2\2\u00b9\u009a\3\2\2\2\u00b9\u009d\3\2\2\2\u00b9"+
		"\u00a0\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00a6\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\25\23\31!-\60\63@BMjw\u0084\u0087\u0098\u00a9\u00b3\u00b6\u00b9"+
		"\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}