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
		T__17=18, CLASS=19, ELSE=20, FALSE=21, FI=22, IF=23, IN=24, INHERITS=25, 
		ISVOID=26, LOOP=27, POOL=28, THEN=29, WHILE=30, NEW=31, NOT=32, TRUE=33, 
		LET=34, TYPE_ID=35, OBJECT_ID=36, SELF=37, SELF_TYPE=38, STRING=39, WHITESPACE=40, 
		NEWLINE=41, INT=42, COMMENT=43, COMMENT_BLOCK=44;
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
			"'.'", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", null, 
			null, "'false'", null, null, null, null, null, null, null, null, null, 
			null, null, "'true'", "'let'", null, null, "'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CLASS", "ELSE", "FALSE", "FI", 
			"IF", "IN", "INHERITS", "ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", 
			"NOT", "TRUE", "LET", "TYPE_ID", "OBJECT_ID", "SELF", "SELF_TYPE", "STRING", 
			"WHITESPACE", "NEWLINE", "INT", "COMMENT", "COMMENT_BLOCK"
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
			match(CLASS);
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
			while (_la==TYPE_ID || _la==OBJECT_ID) {
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(35);
					match(T__3);
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TYPE_ID || _la==OBJECT_ID) {
						{
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
						}
					}

					setState(46);
					match(T__5);
					}
				}

				setState(49);
				match(T__6);
				setState(50);
				match(TYPE_ID);
				setState(51);
				match(T__1);
				setState(52);
				expr(0);
				setState(53);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				match(T__6);
				setState(57);
				match(TYPE_ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(58);
					match(T__7);
					setState(59);
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
		enterRule(_localctx, 6, RULE_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(T__6);
			setState(66);
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
		public TerminalNode SELF() { return getToken(yaplParser.SELF, 0); }
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				match(T__7);
				setState(71);
				expr(23);
				}
				break;
			case 2:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				match(T__3);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0)) {
					{
					setState(74);
					expr(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(75);
						match(T__4);
						setState(76);
						expr(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(85);
				match(IF);
				setState(86);
				expr(0);
				setState(87);
				match(THEN);
				setState(88);
				expr(0);
				setState(89);
				match(ELSE);
				setState(90);
				expr(0);
				setState(91);
				match(FI);
				}
				break;
			case 4:
				{
				setState(93);
				match(WHILE);
				setState(94);
				expr(0);
				setState(95);
				match(LOOP);
				setState(96);
				expr(0);
				setState(97);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(99);
				match(T__1);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					expr(0);
					setState(101);
					match(T__0);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0) );
				setState(107);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(109);
				match(LET);
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(T__6);
				setState(112);
				match(TYPE_ID);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(113);
					match(T__7);
					setState(114);
					expr(0);
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(117);
					match(T__4);
					setState(118);
					_la = _input.LA(1);
					if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					match(T__6);
					setState(120);
					match(TYPE_ID);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(121);
						match(T__7);
						setState(122);
						expr(0);
						}
					}

					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(IN);
				setState(131);
				expr(17);
				}
				break;
			case 7:
				{
				setState(132);
				match(NEW);
				setState(133);
				match(TYPE_ID);
				}
				break;
			case 8:
				{
				setState(134);
				match(ISVOID);
				setState(135);
				expr(15);
				}
				break;
			case 9:
				{
				setState(136);
				match(T__11);
				setState(137);
				expr(12);
				}
				break;
			case 10:
				{
				setState(138);
				match(T__14);
				setState(139);
				expr(11);
				}
				break;
			case 11:
				{
				setState(140);
				match(NOT);
				setState(141);
				expr(8);
				}
				break;
			case 12:
				{
				setState(142);
				match(T__3);
				setState(143);
				expr(0);
				setState(144);
				match(T__5);
				}
				break;
			case 13:
				{
				setState(146);
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
			case 14:
				{
				setState(147);
				match(INT);
				}
				break;
			case 15:
				{
				setState(148);
				match(STRING);
				}
				break;
			case 16:
				{
				setState(149);
				match(TRUE);
				}
				break;
			case 17:
				{
				setState(150);
				match(FALSE);
				}
				break;
			case 18:
				{
				setState(151);
				match(SELF);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(155);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(161);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(164);
						match(T__17);
						setState(165);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(167);
							match(T__8);
							setState(168);
							match(TYPE_ID);
							}
						}

						setState(171);
						match(T__9);
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						match(T__3);
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0)) {
							{
							setState(174);
							expr(0);
							setState(179);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(175);
								match(T__4);
								setState(176);
								expr(0);
								}
								}
								setState(181);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(184);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001c\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b"+
		"\u0002\n\u0002\f\u0002+\t\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0003"+
		"\u00020\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002=\b\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004h\b\u0004\u000b\u0004\f\u0004i\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"t\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004|\b\u0004\u0005\u0004~\b\u0004\n\u0004\f\u0004"+
		"\u0081\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0099\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00aa\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00b2\b\u0004\n\u0004\f\u0004\u00b5\t\u0004\u0003\u0004\u00b7"+
		"\b\u0004\u0001\u0004\u0005\u0004\u00ba\b\u0004\n\u0004\f\u0004\u00bd\t"+
		"\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0004\u0001\u0000#$\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000"+
		"\u0010\u0011\u00e0\u0000\r\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000"+
		"\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000"+
		"\b\u0098\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\f\u0005\u0001\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005\u0013\u0000\u0000\u0012\u0015\u0005#\u0000\u0000"+
		"\u0013\u0014\u0005\u0019\u0000\u0000\u0014\u0016\u0005#\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u001d\u0005\u0002\u0000\u0000\u0018"+
		"\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0003\u0000\u0000!\u0003\u0001\u0000"+
		"\u0000\u0000\"/\u0007\u0000\u0000\u0000#,\u0005\u0004\u0000\u0000$)\u0003"+
		"\u0006\u0003\u0000%&\u0005\u0005\u0000\u0000&(\u0003\u0006\u0003\u0000"+
		"\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,$\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.0\u0005\u0006\u0000\u0000/#\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0007\u0000"+
		"\u000023\u0005#\u0000\u000034\u0005\u0002\u0000\u000045\u0003\b\u0004"+
		"\u000056\u0005\u0003\u0000\u00006?\u0001\u0000\u0000\u000078\u0007\u0000"+
		"\u0000\u000089\u0005\u0007\u0000\u00009<\u0005#\u0000\u0000:;\u0005\b"+
		"\u0000\u0000;=\u0003\b\u0004\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000>\"\u0001\u0000\u0000\u0000>7\u0001"+
		"\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000"+
		"\u0000AB\u0005\u0007\u0000\u0000BC\u0005#\u0000\u0000C\u0007\u0001\u0000"+
		"\u0000\u0000DE\u0006\u0004\uffff\uffff\u0000EF\u0007\u0000\u0000\u0000"+
		"FG\u0005\b\u0000\u0000G\u0099\u0003\b\u0004\u0017HI\u0007\u0000\u0000"+
		"\u0000IR\u0005\u0004\u0000\u0000JO\u0003\b\u0004\u0000KL\u0005\u0005\u0000"+
		"\u0000LN\u0003\b\u0004\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RJ\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0099\u0005\u0006\u0000"+
		"\u0000UV\u0005\u0017\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u001d\u0000"+
		"\u0000XY\u0003\b\u0004\u0000YZ\u0005\u0014\u0000\u0000Z[\u0003\b\u0004"+
		"\u0000[\\\u0005\u0016\u0000\u0000\\\u0099\u0001\u0000\u0000\u0000]^\u0005"+
		"\u001e\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\u001b\u0000\u0000`a\u0003"+
		"\b\u0004\u0000ab\u0005\u001c\u0000\u0000b\u0099\u0001\u0000\u0000\u0000"+
		"cg\u0005\u0002\u0000\u0000de\u0003\b\u0004\u0000ef\u0005\u0001\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0003\u0000\u0000l\u0099\u0001\u0000\u0000\u0000"+
		"mn\u0005\"\u0000\u0000no\u0007\u0000\u0000\u0000op\u0005\u0007\u0000\u0000"+
		"ps\u0005#\u0000\u0000qr\u0005\b\u0000\u0000rt\u0003\b\u0004\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u007f\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0005\u0000\u0000vw\u0007\u0000\u0000\u0000wx\u0005\u0007"+
		"\u0000\u0000x{\u0005#\u0000\u0000yz\u0005\b\u0000\u0000z|\u0003\b\u0004"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}u\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0018\u0000\u0000\u0083\u0099\u0003\b\u0004\u0011\u0084\u0085"+
		"\u0005\u001f\u0000\u0000\u0085\u0099\u0005#\u0000\u0000\u0086\u0087\u0005"+
		"\u001a\u0000\u0000\u0087\u0099\u0003\b\u0004\u000f\u0088\u0089\u0005\f"+
		"\u0000\u0000\u0089\u0099\u0003\b\u0004\f\u008a\u008b\u0005\u000f\u0000"+
		"\u0000\u008b\u0099\u0003\b\u0004\u000b\u008c\u008d\u0005 \u0000\u0000"+
		"\u008d\u0099\u0003\b\u0004\b\u008e\u008f\u0005\u0004\u0000\u0000\u008f"+
		"\u0090\u0003\b\u0004\u0000\u0090\u0091\u0005\u0006\u0000\u0000\u0091\u0099"+
		"\u0001\u0000\u0000\u0000\u0092\u0099\u0007\u0000\u0000\u0000\u0093\u0099"+
		"\u0005*\u0000\u0000\u0094\u0099\u0005\'\u0000\u0000\u0095\u0099\u0005"+
		"!\u0000\u0000\u0096\u0099\u0005\u0015\u0000\u0000\u0097\u0099\u0005%\u0000"+
		"\u0000\u0098D\u0001\u0000\u0000\u0000\u0098H\u0001\u0000\u0000\u0000\u0098"+
		"U\u0001\u0000\u0000\u0000\u0098]\u0001\u0000\u0000\u0000\u0098c\u0001"+
		"\u0000\u0000\u0000\u0098m\u0001\u0000\u0000\u0000\u0098\u0084\u0001\u0000"+
		"\u0000\u0000\u0098\u0086\u0001\u0000\u0000\u0000\u0098\u0088\u0001\u0000"+
		"\u0000\u0000\u0098\u008a\u0001\u0000\u0000\u0000\u0098\u008c\u0001\u0000"+
		"\u0000\u0000\u0098\u008e\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000"+
		"\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000"+
		"\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u00bb\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\n\u000e\u0000\u0000\u009b\u009c\u0007\u0001\u0000"+
		"\u0000\u009c\u00ba\u0003\b\u0004\u000f\u009d\u009e\n\r\u0000\u0000\u009e"+
		"\u009f\u0007\u0002\u0000\u0000\u009f\u00ba\u0003\b\u0004\u000e\u00a0\u00a1"+
		"\n\n\u0000\u0000\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2\u00ba\u0003"+
		"\b\u0004\u000b\u00a3\u00a4\n\t\u0000\u0000\u00a4\u00a5\u0005\u0012\u0000"+
		"\u0000\u00a5\u00ba\u0003\b\u0004\n\u00a6\u00a9\n\u0016\u0000\u0000\u00a7"+
		"\u00a8\u0005\t\u0000\u0000\u00a8\u00aa\u0005#\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0007"+
		"\u0000\u0000\u0000\u00ad\u00b6\u0005\u0004\u0000\u0000\u00ae\u00b3\u0003"+
		"\b\u0004\u0000\u00af\u00b0\u0005\u0005\u0000\u0000\u00b0\u00b2\u0003\b"+
		"\u0004\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005\u0006"+
		"\u0000\u0000\u00b9\u009a\u0001\u0000\u0000\u0000\u00b9\u009d\u0001\u0000"+
		"\u0000\u0000\u00b9\u00a0\u0001\u0000\u0000\u0000\u00b9\u00a3\u0001\u0000"+
		"\u0000\u0000\u00b9\u00a6\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\t\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u0014\u000f\u0015\u001d),/<>ORis{\u007f\u0098\u00a9\u00b3\u00b6"+
		"\u00b9\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}