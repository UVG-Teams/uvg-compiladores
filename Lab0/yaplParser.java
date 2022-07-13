// Generated from yapl.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TYPE_ID=18, OBJECT_ID=19, KEYWORDS=20, ID=21, STRING=22, WHITESPACE=23, 
		NEWLINE=24, INT=25, SELF=26, SELF_TYPE=27, COMMENT=28, COMMENT_BLOCK=29, 
		CLASS_KEY=30, ELSE=31, FALSE=32, FI=33, IF=34, IN=35, INHERITS=36, ISVOID=37, 
		LOOP=38, POOL=39, THEN=40, WHILE=41, NEW=42, NOT=43, TRUE=44, LET=45;
	public static final int
		RULE_prog = 0, RULE_class_def = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "class_def", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'@'", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'='", null, null, 
			null, null, null, null, null, null, "'self'", "'SELF_TYPE'", null, null, 
			"'class'", null, "'false'", null, null, null, null, null, null, null, 
			null, null, null, null, "'true'", "'let'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TYPE_ID", "OBJECT_ID", "KEYWORDS", 
			"ID", "STRING", "WHITESPACE", "NEWLINE", "INT", "SELF", "SELF_TYPE", 
			"COMMENT", "COMMENT_BLOCK", "CLASS_KEY", "ELSE", "FALSE", "FI", "IF", 
			"IN", "INHERITS", "ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", 
			"TRUE", "LET"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_def();
				setState(11);
				match(T__0);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS_KEY );
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
		public TerminalNode CLASS_KEY() { return getToken(yaplParser.CLASS_KEY, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS_KEY);
			setState(18);
			match(TYPE_ID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				match(TYPE_ID);
				}
			}

			setState(23);
			match(T__1);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(24);
				feature();
				setState(25);
				match(T__0);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public TerminalNode ID() { return getToken(yaplParser.ID, 0); }
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
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitFeature(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(35);
				match(T__3);
				setState(36);
				formal();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(37);
					match(T__4);
					setState(38);
					formal();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(T__5);
				}
			}

			setState(48);
			match(T__6);
			setState(49);
			match(TYPE_ID);
			setState(50);
			match(T__1);
			setState(51);
			expr(0);
			setState(52);
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(yaplParser.ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(yaplParser.TYPE_ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(55);
			match(T__6);
			setState(56);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IF() { return getToken(yaplParser.IF, 0); }
		public TerminalNode THEN() { return getToken(yaplParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(yaplParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(yaplParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(yaplParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(yaplParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(yaplParser.POOL, 0); }
		public TerminalNode LET() { return getToken(yaplParser.LET, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public TerminalNode IN() { return getToken(yaplParser.IN, 0); }
		public TerminalNode NEW() { return getToken(yaplParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(yaplParser.ISVOID, 0); }
		public TerminalNode NOT() { return getToken(yaplParser.NOT, 0); }
		public TerminalNode INT() { return getToken(yaplParser.INT, 0); }
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(yaplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(yaplParser.FALSE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(59);
				match(ID);
				setState(60);
				match(T__7);
				setState(61);
				expr(21);
				}
				break;
			case 2:
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__3);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET))) != 0)) {
					{
					setState(64);
					expr(0);
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(65);
						match(T__4);
						setState(66);
						expr(0);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(74);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(75);
				match(IF);
				setState(76);
				expr(0);
				setState(77);
				match(THEN);
				setState(78);
				expr(0);
				setState(79);
				match(ELSE);
				setState(80);
				expr(0);
				setState(81);
				match(FI);
				}
				break;
			case 4:
				{
				setState(83);
				match(WHILE);
				setState(84);
				expr(0);
				setState(85);
				match(LOOP);
				setState(86);
				expr(0);
				setState(87);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(89);
				match(T__1);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					expr(0);
					setState(91);
					match(T__0);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET))) != 0) );
				setState(97);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(99);
				match(LET);
				setState(100);
				match(ID);
				setState(101);
				match(T__6);
				setState(102);
				match(TYPE_ID);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(103);
					match(T__7);
					setState(104);
					expr(0);
					}
				}

				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(107);
					match(T__4);
					setState(108);
					match(ID);
					setState(109);
					match(T__6);
					setState(110);
					match(TYPE_ID);
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(111);
						match(T__7);
						setState(112);
						expr(0);
						}
					}

					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(IN);
				setState(121);
				expr(15);
				}
				break;
			case 7:
				{
				setState(122);
				match(NEW);
				setState(123);
				match(TYPE_ID);
				}
				break;
			case 8:
				{
				setState(124);
				match(ISVOID);
				setState(125);
				expr(13);
				}
				break;
			case 9:
				{
				setState(126);
				match(T__11);
				setState(127);
				expr(10);
				}
				break;
			case 10:
				{
				setState(128);
				match(NOT);
				setState(129);
				expr(7);
				}
				break;
			case 11:
				{
				setState(130);
				match(T__3);
				setState(131);
				expr(0);
				setState(132);
				match(T__5);
				}
				break;
			case 12:
				{
				setState(134);
				match(ID);
				}
				break;
			case 13:
				{
				setState(135);
				match(INT);
				}
				break;
			case 14:
				{
				setState(136);
				match(STRING);
				}
				break;
			case 15:
				{
				setState(137);
				match(TRUE);
				}
				break;
			case 16:
				{
				setState(138);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						match(T__16);
						setState(152);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(154);
							match(T__8);
							setState(155);
							match(TYPE_ID);
							}
						}

						setState(158);
						match(T__9);
						setState(159);
						match(ID);
						setState(160);
						match(T__3);
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET))) != 0)) {
							{
							setState(161);
							expr(0);
							setState(166);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__0) {
								{
								{
								setState(162);
								match(T__0);
								setState(163);
								expr(0);
								}
								}
								setState(168);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(171);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(176);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001c\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b"+
		"\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004D\b\u0004\n\u0004\f\u0004G\t\u0004\u0003"+
		"\u0004I\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004^\b\u0004\u000b\u0004\f\u0004"+
		"_\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004r\b\u0004"+
		"\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008c\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009d\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00a5\b\u0004\n\u0004\f\u0004\u00a8\t\u0004\u0003\u0004\u00aa"+
		"\b\u0004\u0001\u0004\u0005\u0004\u00ad\b\u0004\n\u0004\f\u0004\u00b0\t"+
		"\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0003\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u000f\u0010"+
		"\u00ce\u0000\r\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000"+
		"\u0004\"\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b\u008b"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005"+
		"\u0001\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005\u001e\u0000\u0000\u0012\u0015\u0005\u0012\u0000\u0000"+
		"\u0013\u0014\u0005$\u0000\u0000\u0014\u0016\u0005\u0012\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u001d\u0005\u0002\u0000\u0000\u0018"+
		"\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0003\u0000\u0000!\u0003\u0001\u0000"+
		"\u0000\u0000\".\u0005\u0015\u0000\u0000#$\u0005\u0004\u0000\u0000$)\u0003"+
		"\u0006\u0003\u0000%&\u0005\u0005\u0000\u0000&(\u0003\u0006\u0003\u0000"+
		"\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0006\u0000\u0000-/\u0001\u0000\u0000\u0000.#\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u0007\u0000\u000012\u0005\u0012\u0000\u000023\u0005\u0002\u0000"+
		"\u000034\u0003\b\u0004\u000045\u0005\u0003\u0000\u00005\u0005\u0001\u0000"+
		"\u0000\u000067\u0005\u0015\u0000\u000078\u0005\u0007\u0000\u000089\u0005"+
		"\u0012\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0006\u0004\uffff"+
		"\uffff\u0000;<\u0005\u0015\u0000\u0000<=\u0005\b\u0000\u0000=\u008c\u0003"+
		"\b\u0004\u0015>?\u0005\u0015\u0000\u0000?H\u0005\u0004\u0000\u0000@E\u0003"+
		"\b\u0004\u0000AB\u0005\u0005\u0000\u0000BD\u0003\b\u0004\u0000CA\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000H@\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u008c\u0005\u0006\u0000\u0000KL\u0005\"\u0000\u0000LM\u0003"+
		"\b\u0004\u0000MN\u0005(\u0000\u0000NO\u0003\b\u0004\u0000OP\u0005\u001f"+
		"\u0000\u0000PQ\u0003\b\u0004\u0000QR\u0005!\u0000\u0000R\u008c\u0001\u0000"+
		"\u0000\u0000ST\u0005)\u0000\u0000TU\u0003\b\u0004\u0000UV\u0005&\u0000"+
		"\u0000VW\u0003\b\u0004\u0000WX\u0005\'\u0000\u0000X\u008c\u0001\u0000"+
		"\u0000\u0000Y]\u0005\u0002\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005"+
		"\u0001\u0000\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0003\u0000\u0000b\u008c\u0001"+
		"\u0000\u0000\u0000cd\u0005-\u0000\u0000de\u0005\u0015\u0000\u0000ef\u0005"+
		"\u0007\u0000\u0000fi\u0005\u0012\u0000\u0000gh\u0005\b\u0000\u0000hj\u0003"+
		"\b\u0004\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000ju\u0001"+
		"\u0000\u0000\u0000kl\u0005\u0005\u0000\u0000lm\u0005\u0015\u0000\u0000"+
		"mn\u0005\u0007\u0000\u0000nq\u0005\u0012\u0000\u0000op\u0005\b\u0000\u0000"+
		"pr\u0003\b\u0004\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rt\u0001\u0000\u0000\u0000sk\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005#\u0000\u0000y\u008c\u0003"+
		"\b\u0004\u000fz{\u0005*\u0000\u0000{\u008c\u0005\u0012\u0000\u0000|}\u0005"+
		"%\u0000\u0000}\u008c\u0003\b\u0004\r~\u007f\u0005\f\u0000\u0000\u007f"+
		"\u008c\u0003\b\u0004\n\u0080\u0081\u0005+\u0000\u0000\u0081\u008c\u0003"+
		"\b\u0004\u0007\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0003\b"+
		"\u0004\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u008c\u0001\u0000"+
		"\u0000\u0000\u0086\u008c\u0005\u0015\u0000\u0000\u0087\u008c\u0005\u0019"+
		"\u0000\u0000\u0088\u008c\u0005\u0016\u0000\u0000\u0089\u008c\u0005,\u0000"+
		"\u0000\u008a\u008c\u0005 \u0000\u0000\u008b:\u0001\u0000\u0000\u0000\u008b"+
		">\u0001\u0000\u0000\u0000\u008bK\u0001\u0000\u0000\u0000\u008bS\u0001"+
		"\u0000\u0000\u0000\u008bY\u0001\u0000\u0000\u0000\u008bc\u0001\u0000\u0000"+
		"\u0000\u008bz\u0001\u0000\u0000\u0000\u008b|\u0001\u0000\u0000\u0000\u008b"+
		"~\u0001\u0000\u0000\u0000\u008b\u0080\u0001\u0000\u0000\u0000\u008b\u0082"+
		"\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087"+
		"\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u00ae"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\n\f\u0000\u0000\u008e\u008f\u0007"+
		"\u0000\u0000\u0000\u008f\u00ad\u0003\b\u0004\r\u0090\u0091\n\u000b\u0000"+
		"\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\u00ad\u0003\b\u0004\f"+
		"\u0093\u0094\n\t\u0000\u0000\u0094\u0095\u0007\u0002\u0000\u0000\u0095"+
		"\u00ad\u0003\b\u0004\n\u0096\u0097\n\b\u0000\u0000\u0097\u0098\u0005\u0011"+
		"\u0000\u0000\u0098\u00ad\u0003\b\u0004\t\u0099\u009c\n\u0014\u0000\u0000"+
		"\u009a\u009b\u0005\t\u0000\u0000\u009b\u009d\u0005\u0012\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0"+
		"\u0005\u0015\u0000\u0000\u00a0\u00a9\u0005\u0004\u0000\u0000\u00a1\u00a6"+
		"\u0003\b\u0004\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a5\u0003"+
		"\b\u0004\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0006"+
		"\u0000\u0000\u00ac\u008d\u0001\u0000\u0000\u0000\u00ac\u0090\u0001\u0000"+
		"\u0000\u0000\u00ac\u0093\u0001\u0000\u0000\u0000\u00ac\u0096\u0001\u0000"+
		"\u0000\u0000\u00ac\u0099\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\t\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0015\u001d).EH_iqu\u008b\u009c\u00a6\u00a9\u00ac\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}