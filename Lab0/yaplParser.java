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
		CLASS=18, ELSE=19, FALSE=20, FI=21, IF=22, IN=23, INHERITS=24, ISVOID=25, 
		LOOP=26, POOL=27, THEN=28, WHILE=29, NEW=30, NOT=31, TRUE=32, LET=33, 
		SELF=34, SELF_TYPE=35, KEYWORDS=36, TYPE_ID=37, OBJECT_ID=38, STRING=39, 
		WHITESPACE=40, NEWLINE=41, INT=42, COMMENT=43, COMMENT_BLOCK=44;
	public static final int
		RULE_expr = 0, RULE_formal = 1, RULE_feature = 2, RULE_class_def = 3, 
		RULE_prog = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "formal", "feature", "class_def", "prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<-'", "'@'", "'.'", "'('", "';'", "')'", "','", "'{'", "'}'", 
			"':'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'='", null, null, 
			"'false'", null, null, null, null, null, null, null, null, null, null, 
			null, "'true'", "'let'", "'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CLASS", "ELSE", "FALSE", "FI", "IF", 
			"IN", "INHERITS", "ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", 
			"TRUE", "LET", "SELF", "SELF_TYPE", "KEYWORDS", "TYPE_ID", "OBJECT_ID", 
			"STRING", "WHITESPACE", "NEWLINE", "INT", "COMMENT", "COMMENT_BLOCK"
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public List<TerminalNode> OBJECT_ID() { return getTokens(yaplParser.OBJECT_ID); }
		public TerminalNode OBJECT_ID(int i) {
			return getToken(yaplParser.OBJECT_ID, i);
		}
		public TerminalNode IF() { return getToken(yaplParser.IF, 0); }
		public TerminalNode THEN() { return getToken(yaplParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(yaplParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(yaplParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(yaplParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(yaplParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(yaplParser.POOL, 0); }
		public TerminalNode LET() { return getToken(yaplParser.LET, 0); }
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(11);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(12);
				match(T__0);
				setState(13);
				expr(21);
				}
				break;
			case 2:
				{
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(15);
				match(T__3);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << STRING) | (1L << INT))) != 0)) {
					{
					setState(16);
					expr(0);
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(17);
						match(T__6);
						setState(18);
						expr(0);
						}
						}
						setState(23);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(26);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(27);
				match(IF);
				setState(28);
				expr(0);
				setState(29);
				match(THEN);
				setState(30);
				expr(0);
				setState(31);
				match(ELSE);
				setState(32);
				expr(0);
				setState(33);
				match(FI);
				}
				break;
			case 4:
				{
				setState(35);
				match(WHILE);
				setState(36);
				expr(0);
				setState(37);
				match(LOOP);
				setState(38);
				expr(0);
				setState(39);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(41);
				match(T__7);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					expr(0);
					setState(43);
					match(T__4);
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << STRING) | (1L << INT))) != 0) );
				setState(49);
				match(T__8);
				}
				break;
			case 6:
				{
				setState(51);
				match(LET);
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				match(T__9);
				setState(54);
				match(TYPE_ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(55);
					match(T__0);
					setState(56);
					expr(0);
					}
				}

				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(59);
					match(T__6);
					setState(60);
					_la = _input.LA(1);
					if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(61);
					match(T__9);
					setState(62);
					match(TYPE_ID);
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(63);
						match(T__0);
						setState(64);
						expr(0);
						}
					}

					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(IN);
				setState(73);
				expr(15);
				}
				break;
			case 7:
				{
				setState(74);
				match(NEW);
				setState(75);
				match(TYPE_ID);
				}
				break;
			case 8:
				{
				setState(76);
				match(ISVOID);
				setState(77);
				expr(13);
				}
				break;
			case 9:
				{
				setState(78);
				match(T__11);
				setState(79);
				expr(10);
				}
				break;
			case 10:
				{
				setState(80);
				match(NOT);
				setState(81);
				expr(7);
				}
				break;
			case 11:
				{
				setState(82);
				match(T__3);
				setState(83);
				expr(0);
				setState(84);
				match(T__5);
				}
				break;
			case 12:
				{
				setState(86);
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
			case 13:
				{
				setState(87);
				match(INT);
				}
				break;
			case 14:
				{
				setState(88);
				match(STRING);
				}
				break;
			case 15:
				{
				setState(89);
				match(TRUE);
				}
				break;
			case 16:
				{
				setState(90);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(103);
						match(T__16);
						setState(104);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__1) {
							{
							setState(106);
							match(T__1);
							setState(107);
							match(TYPE_ID);
							}
						}

						setState(110);
						match(T__2);
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						match(T__3);
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << STRING) | (1L << INT))) != 0)) {
							{
							setState(113);
							expr(0);
							setState(118);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(114);
								match(T__4);
								setState(115);
								expr(0);
								}
								}
								setState(120);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(123);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(128);
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

	public static class FormalContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
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
		enterRule(_localctx, 2, RULE_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			match(T__9);
			setState(131);
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

	public static class FeatureContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(134);
					match(T__3);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TYPE_ID || _la==OBJECT_ID) {
						{
						setState(135);
						formal();
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__6) {
							{
							{
							setState(136);
							match(T__6);
							setState(137);
							formal();
							}
							}
							setState(142);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(145);
					match(T__5);
					}
				}

				setState(148);
				match(T__9);
				setState(149);
				match(TYPE_ID);
				setState(150);
				match(T__7);
				setState(151);
				expr(0);
				setState(152);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				match(T__9);
				setState(156);
				match(TYPE_ID);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(157);
					match(T__0);
					setState(158);
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
		enterRule(_localctx, 6, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CLASS);
			setState(164);
			match(TYPE_ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(165);
				match(INHERITS);
				setState(166);
				match(TYPE_ID);
				}
			}

			setState(169);
			match(T__7);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_ID || _la==OBJECT_ID) {
				{
				{
				setState(170);
				feature();
				setState(171);
				match(T__4);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__8);
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
		enterRule(_localctx, 8, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				class_def();
				setState(181);
				match(T__4);
				}
				}
				setState(185); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
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
		"\u0004\u0001,\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000.\b"+
		"\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000:\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000B\b\u0000\u0005\u0000D\b\u0000\n\u0000\f\u0000G\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\\\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000m\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000u\b\u0000\n\u0000\f\u0000x\t\u0000"+
		"\u0003\u0000z\b\u0000\u0001\u0000\u0005\u0000}\b\u0000\n\u0000\f\u0000"+
		"\u0080\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u008b\b\u0002"+
		"\n\u0002\f\u0002\u008e\t\u0002\u0003\u0002\u0090\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0093\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00a0\b\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ae\b\u0003\n\u0003"+
		"\f\u0003\u00b1\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u00b8\b\u0004\u000b\u0004\f\u0004\u00b9\u0001"+
		"\u0004\u0000\u0001\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0004\u0001"+
		"\u0000%&\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u000f\u0010"+
		"\u00db\u0000[\u0001\u0000\u0000\u0000\u0002\u0081\u0001\u0000\u0000\u0000"+
		"\u0004\u00a1\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000\u0000"+
		"\b\u00b7\u0001\u0000\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000"+
		"\u000b\f\u0007\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\\\u0003"+
		"\u0000\u0000\u0015\u000e\u000f\u0007\u0000\u0000\u0000\u000f\u0018\u0005"+
		"\u0004\u0000\u0000\u0010\u0015\u0003\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0007\u0000\u0000\u0012\u0014\u0003\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0010\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\\\u0005\u0006\u0000\u0000\u001b\u001c\u0005\u0016"+
		"\u0000\u0000\u001c\u001d\u0003\u0000\u0000\u0000\u001d\u001e\u0005\u001c"+
		"\u0000\u0000\u001e\u001f\u0003\u0000\u0000\u0000\u001f \u0005\u0013\u0000"+
		"\u0000 !\u0003\u0000\u0000\u0000!\"\u0005\u0015\u0000\u0000\"\\\u0001"+
		"\u0000\u0000\u0000#$\u0005\u001d\u0000\u0000$%\u0003\u0000\u0000\u0000"+
		"%&\u0005\u001a\u0000\u0000&\'\u0003\u0000\u0000\u0000\'(\u0005\u001b\u0000"+
		"\u0000(\\\u0001\u0000\u0000\u0000)-\u0005\b\u0000\u0000*+\u0003\u0000"+
		"\u0000\u0000+,\u0005\u0005\u0000\u0000,.\u0001\u0000\u0000\u0000-*\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\t\u0000\u0000"+
		"2\\\u0001\u0000\u0000\u000034\u0005!\u0000\u000045\u0007\u0000\u0000\u0000"+
		"56\u0005\n\u0000\u000069\u0005%\u0000\u000078\u0005\u0001\u0000\u0000"+
		"8:\u0003\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:E\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000<=\u0007\u0000"+
		"\u0000\u0000=>\u0005\n\u0000\u0000>A\u0005%\u0000\u0000?@\u0005\u0001"+
		"\u0000\u0000@B\u0003\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000C;\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0017"+
		"\u0000\u0000I\\\u0003\u0000\u0000\u000fJK\u0005\u001e\u0000\u0000K\\\u0005"+
		"%\u0000\u0000LM\u0005\u0019\u0000\u0000M\\\u0003\u0000\u0000\rNO\u0005"+
		"\f\u0000\u0000O\\\u0003\u0000\u0000\nPQ\u0005\u001f\u0000\u0000Q\\\u0003"+
		"\u0000\u0000\u0007RS\u0005\u0004\u0000\u0000ST\u0003\u0000\u0000\u0000"+
		"TU\u0005\u0006\u0000\u0000U\\\u0001\u0000\u0000\u0000V\\\u0007\u0000\u0000"+
		"\u0000W\\\u0005*\u0000\u0000X\\\u0005\'\u0000\u0000Y\\\u0005 \u0000\u0000"+
		"Z\\\u0005\u0014\u0000\u0000[\n\u0001\u0000\u0000\u0000[\u000e\u0001\u0000"+
		"\u0000\u0000[\u001b\u0001\u0000\u0000\u0000[#\u0001\u0000\u0000\u0000"+
		"[)\u0001\u0000\u0000\u0000[3\u0001\u0000\u0000\u0000[J\u0001\u0000\u0000"+
		"\u0000[L\u0001\u0000\u0000\u0000[N\u0001\u0000\u0000\u0000[P\u0001\u0000"+
		"\u0000\u0000[R\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[W\u0001"+
		"\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\~\u0001\u0000\u0000\u0000]^\n\f\u0000\u0000"+
		"^_\u0007\u0001\u0000\u0000_}\u0003\u0000\u0000\r`a\n\u000b\u0000\u0000"+
		"ab\u0007\u0002\u0000\u0000b}\u0003\u0000\u0000\fcd\n\t\u0000\u0000de\u0007"+
		"\u0003\u0000\u0000e}\u0003\u0000\u0000\nfg\n\b\u0000\u0000gh\u0005\u0011"+
		"\u0000\u0000h}\u0003\u0000\u0000\til\n\u0014\u0000\u0000jk\u0005\u0002"+
		"\u0000\u0000km\u0005%\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0003\u0000\u0000op\u0007"+
		"\u0000\u0000\u0000py\u0005\u0004\u0000\u0000qv\u0003\u0000\u0000\u0000"+
		"rs\u0005\u0005\u0000\u0000su\u0003\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yq\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0005\u0006\u0000\u0000|]\u0001\u0000\u0000\u0000|`\u0001\u0000\u0000"+
		"\u0000|c\u0001\u0000\u0000\u0000|f\u0001\u0000\u0000\u0000|i\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0001\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\n\u0000\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0003\u0001"+
		"\u0000\u0000\u0000\u0085\u0092\u0007\u0000\u0000\u0000\u0086\u008f\u0005"+
		"\u0004\u0000\u0000\u0087\u008c\u0003\u0002\u0001\u0000\u0088\u0089\u0005"+
		"\u0007\u0000\u0000\u0089\u008b\u0003\u0002\u0001\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0087\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0005\u0006\u0000\u0000\u0092\u0086\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0096\u0005%"+
		"\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097\u0098\u0003\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u00a2\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0007\u0000\u0000\u0000\u009b\u009c\u0005\n\u0000\u0000\u009c"+
		"\u009f\u0005%\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u00a0"+
		"\u0003\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0085"+
		"\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000\u0000\u00a2\u0005"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a7"+
		"\u0005%\u0000\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a8\u0005"+
		"%\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00af\u0005\b\u0000"+
		"\u0000\u00aa\u00ab\u0003\u0004\u0002\u0000\u00ab\u00ac\u0005\u0005\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\t\u0000\u0000"+
		"\u00b3\u0007\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u0006\u0003\u0000"+
		"\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\t\u0001\u0000\u0000\u0000\u0014\u0015\u0018/9AE[lvy|~\u008c\u008f"+
		"\u0092\u009f\u00a1\u00a7\u00af\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}