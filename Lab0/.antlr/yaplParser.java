// Generated from /Users/willi/Desktop/repos/uvg-compiladores/Lab0/yapl.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CLASS=18, ELSE=19, FALSE=20, FI=21, IF=22, IN=23, INHERITS=24, ISVOID=25, 
		LOOP=26, POOL=27, THEN=28, WHILE=29, NEW=30, NOT=31, TRUE=32, LET=33, 
		SELF=34, SELF_TYPE=35, KEYWORDS=36, TYPE_ID=37, OBJECT_ID=38, ID=39, STRING=40, 
		WHITESPACE=41, NEWLINE=42, INT=43, COMMENT=44, COMMENT_BLOCK=45;
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
			"ID", "STRING", "WHITESPACE", "NEWLINE", "INT", "COMMENT", "COMMENT_BLOCK"
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << ID) | (1L << STRING) | (1L << INT))) != 0)) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << ID) | (1L << STRING) | (1L << INT))) != 0) );
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << ID) | (1L << STRING) | (1L << INT))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\5\4\61\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6F\n\6\f\6\16\6I\13\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6`\n\6\r\6\16\6a\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\7"+
		"\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\5\6\u00ac\n\6\3\6\7\6\u00af\n\6\f\6"+
		"\16\6\u00b2\13\6\3\6\2\3\n\7\2\4\6\b\n\2\5\3\2\r\16\3\2\17\20\3\2\21\22"+
		"\2\u00d0\2\17\3\2\2\2\4\23\3\2\2\2\6$\3\2\2\2\b8\3\2\2\2\n\u008d\3\2\2"+
		"\2\f\r\5\4\3\2\r\16\7\3\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\24\2\2\24\27\7\'\2\2\25"+
		"\26\7\32\2\2\26\30\7\'\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31"+
		"\37\7\4\2\2\32\33\5\6\4\2\33\34\7\3\2\2\34\36\3\2\2\2\35\32\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\5\2\2"+
		"#\5\3\2\2\2$\60\7)\2\2%&\7\6\2\2&+\5\b\5\2\'(\7\7\2\2(*\5\b\5\2)\'\3\2"+
		"\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\b\2\2/\61\3"+
		"\2\2\2\60%\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\t\2\2\63\64\7\'"+
		"\2\2\64\65\7\4\2\2\65\66\5\n\6\2\66\67\7\5\2\2\67\7\3\2\2\289\7)\2\29"+
		":\7\t\2\2:;\7\'\2\2;\t\3\2\2\2<=\b\6\1\2=>\7)\2\2>?\7\n\2\2?\u008e\5\n"+
		"\6\27@A\7)\2\2AJ\7\6\2\2BG\5\n\6\2CD\7\7\2\2DF\5\n\6\2EC\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JB\3\2\2\2JK\3\2\2\2KL\3\2"+
		"\2\2L\u008e\7\b\2\2MN\7\30\2\2NO\5\n\6\2OP\7\36\2\2PQ\5\n\6\2QR\7\25\2"+
		"\2RS\5\n\6\2ST\7\27\2\2T\u008e\3\2\2\2UV\7\37\2\2VW\5\n\6\2WX\7\34\2\2"+
		"XY\5\n\6\2YZ\7\35\2\2Z\u008e\3\2\2\2[_\7\4\2\2\\]\5\n\6\2]^\7\3\2\2^`"+
		"\3\2\2\2_\\\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\5\2\2"+
		"d\u008e\3\2\2\2ef\7#\2\2fg\7)\2\2gh\7\t\2\2hk\7\'\2\2ij\7\n\2\2jl\5\n"+
		"\6\2ki\3\2\2\2kl\3\2\2\2lw\3\2\2\2mn\7\7\2\2no\7)\2\2op\7\t\2\2ps\7\'"+
		"\2\2qr\7\n\2\2rt\5\n\6\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2um\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\31\2\2{\u008e\5\n\6\21"+
		"|}\7 \2\2}\u008e\7\'\2\2~\177\7\33\2\2\177\u008e\5\n\6\17\u0080\u0081"+
		"\7\16\2\2\u0081\u008e\5\n\6\f\u0082\u0083\7!\2\2\u0083\u008e\5\n\6\t\u0084"+
		"\u0085\7\6\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\b\2\2\u0087\u008e\3\2"+
		"\2\2\u0088\u008e\7)\2\2\u0089\u008e\7-\2\2\u008a\u008e\7*\2\2\u008b\u008e"+
		"\7\"\2\2\u008c\u008e\7\26\2\2\u008d<\3\2\2\2\u008d@\3\2\2\2\u008dM\3\2"+
		"\2\2\u008dU\3\2\2\2\u008d[\3\2\2\2\u008de\3\2\2\2\u008d|\3\2\2\2\u008d"+
		"~\3\2\2\2\u008d\u0080\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0084\3\2\2\2"+
		"\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u00b0\3\2\2\2\u008f\u0090\f\16\2\2"+
		"\u0090\u0091\t\2\2\2\u0091\u00af\5\n\6\17\u0092\u0093\f\r\2\2\u0093\u0094"+
		"\t\3\2\2\u0094\u00af\5\n\6\16\u0095\u0096\f\13\2\2\u0096\u0097\t\4\2\2"+
		"\u0097\u00af\5\n\6\f\u0098\u0099\f\n\2\2\u0099\u009a\7\23\2\2\u009a\u00af"+
		"\5\n\6\13\u009b\u009e\f\26\2\2\u009c\u009d\7\13\2\2\u009d\u009f\7\'\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\f\2\2\u00a1\u00a2\7)\2\2\u00a2\u00ab\7\6\2\2\u00a3\u00a8\5\n\6\2\u00a4"+
		"\u00a5\7\3\2\2\u00a5\u00a7\5\n\6\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\7\b\2\2\u00ae\u008f\3\2\2\2\u00ae\u0092\3\2\2\2\u00ae"+
		"\u0095\3\2\2\2\u00ae\u0098\3\2\2\2\u00ae\u009b\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\23\21\27\37+\60GJaksw\u008d\u009e\u00a8\u00ab\u00ae\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}