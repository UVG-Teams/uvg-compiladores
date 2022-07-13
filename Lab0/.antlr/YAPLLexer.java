// Generated from /Users/willi/Desktop/repos/uvg-compiladores/Lab0/yapl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaplLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"CLASS", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LOOP", 
			"POOL", "THEN", "WHILE", "NEW", "NOT", "TRUE", "LET", "SELF", "SELF_TYPE", 
			"KEYWORDS", "TYPE_ID", "OBJECT_ID", "ID", "STRING", "WHITESPACE", "NEWLINE", 
			"INT", "COMMENT", "COMMENT_BLOCK"
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


	public yaplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u008c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0096\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00a2\n\26\3\27\3\27\3\27\3\27\5\27\u00a8\n\27\3\30\3\30\3\30\3\30\5"+
		"\30\u00ae\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00c0\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ce\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00d8\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00e2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ec\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f8\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0100\n\37\3 \3 \3 \3 \3 \3 \5 \u0108"+
		"\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0131\n%\3"+
		"&\3&\6&\u0135\n&\r&\16&\u0136\3\'\3\'\6\'\u013b\n\'\r\'\16\'\u013c\3("+
		"\3(\5(\u0141\n(\3)\3)\3)\7)\u0146\n)\f)\16)\u0149\13)\7)\u014b\n)\f)\16"+
		")\u014e\13)\3)\3)\3*\3*\3*\3*\3+\6+\u0157\n+\r+\16+\u0158\3+\3+\3,\6,"+
		"\u015e\n,\r,\16,\u015f\3-\3-\3-\3-\7-\u0166\n-\f-\16-\u0169\13-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\7.\u0173\n.\f.\16.\u0176\13.\3.\3.\3.\3.\3.\4\u0167"+
		"\u0174\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\n\3\2C\\\5\2\62;C\\"+
		"c|\3\2c|\3\2$$\3\2\f\f\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\2\u019f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3"+
		"\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23n\3"+
		"\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37"+
		"z\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u008b\3\2\2\2\'\u0095\3\2\2\2)\u0097"+
		"\3\2\2\2+\u00a1\3\2\2\2-\u00a7\3\2\2\2/\u00ad\3\2\2\2\61\u00bf\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00d7\3\2\2\2\67\u00e1\3\2\2\29\u00eb\3\2\2\2;\u00f7"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0112\3\2\2\2G\u0117\3\2\2\2I\u0130\3\2\2\2K\u0132\3\2\2\2M\u0138\3\2"+
		"\2\2O\u0140\3\2\2\2Q\u0142\3\2\2\2S\u0151\3\2\2\2U\u0156\3\2\2\2W\u015d"+
		"\3\2\2\2Y\u0161\3\2\2\2[\u016e\3\2\2\2]^\7=\2\2^\4\3\2\2\2_`\7}\2\2`\6"+
		"\3\2\2\2ab\7\177\2\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7.\2\2f\f\3\2\2"+
		"\2gh\7+\2\2h\16\3\2\2\2ij\7<\2\2j\20\3\2\2\2kl\7>\2\2lm\7/\2\2m\22\3\2"+
		"\2\2no\7B\2\2o\24\3\2\2\2pq\7\60\2\2q\26\3\2\2\2rs\7-\2\2s\30\3\2\2\2"+
		"tu\7/\2\2u\32\3\2\2\2vw\7,\2\2w\34\3\2\2\2xy\7\61\2\2y\36\3\2\2\2z{\7"+
		">\2\2{ \3\2\2\2|}\7>\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7?\2\2\u0080$\3"+
		"\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u008c\7u\2\2\u0086\u0087\7E\2\2\u0087\u0088\7N\2\2"+
		"\u0088\u0089\7C\2\2\u0089\u008a\7U\2\2\u008a\u008c\7U\2\2\u008b\u0081"+
		"\3\2\2\2\u008b\u0086\3\2\2\2\u008c&\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f"+
		"\7n\2\2\u008f\u0090\7u\2\2\u0090\u0096\7g\2\2\u0091\u0092\7G\2\2\u0092"+
		"\u0093\7N\2\2\u0093\u0094\7U\2\2\u0094\u0096\7G\2\2\u0095\u008d\3\2\2"+
		"\2\u0095\u0091\3\2\2\2\u0096(\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c*"+
		"\3\2\2\2\u009d\u009e\7h\2\2\u009e\u00a2\7k\2\2\u009f\u00a0\7H\2\2\u00a0"+
		"\u00a2\7K\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2,\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a8\7h\2\2\u00a5\u00a6\7K\2\2\u00a6\u00a8\7H\2\2"+
		"\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7"+
		"k\2\2\u00aa\u00ae\7p\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ae\7P\2\2\u00ad\u00a9"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b6\7v\2\2\u00b6\u00c0\7u\2\2\u00b7\u00b8"+
		"\7K\2\2\u00b8\u00b9\7P\2\2\u00b9\u00ba\7J\2\2\u00ba\u00bb\7G\2\2\u00bb"+
		"\u00bc\7T\2\2\u00bc\u00bd\7K\2\2\u00bd\u00be\7V\2\2\u00be\u00c0\7U\2\2"+
		"\u00bf\u00af\3\2\2\2\u00bf\u00b7\3\2\2\2\u00c0\62\3\2\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00ce\7f\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7U\2\2"+
		"\u00c9\u00ca\7X\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7K\2\2\u00cc\u00ce"+
		"\7F\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c7\3\2\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d8\7r\2\2"+
		"\u00d3\u00d4\7N\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d8"+
		"\7R\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\66\3\2\2\2\u00d9"+
		"\u00da\7r\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc\u00e2\7n\2\2"+
		"\u00dd\u00de\7R\2\2\u00de\u00df\7Q\2\2\u00df\u00e0\7Q\2\2\u00e0\u00e2"+
		"\7N\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e28\3\2\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7g\2\2\u00e6\u00ec\7p\2\2\u00e7"+
		"\u00e8\7V\2\2\u00e8\u00e9\7J\2\2\u00e9\u00ea\7G\2\2\u00ea\u00ec\7P\2\2"+
		"\u00eb\u00e3\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7"+
		"y\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f8"+
		"\7g\2\2\u00f2\u00f3\7Y\2\2\u00f3\u00f4\7J\2\2\u00f4\u00f5\7K\2\2\u00f5"+
		"\u00f6\7N\2\2\u00f6\u00f8\7G\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f2\3\2\2"+
		"\2\u00f8<\3\2\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7g\2\2\u00fb\u0100\7"+
		"y\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7G\2\2\u00fe\u0100\7Y\2\2\u00ff\u00f9"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100>\3\2\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u0108\7v\2\2\u0104\u0105\7P\2\2\u0105\u0106\7Q\2\2\u0106"+
		"\u0108\7V\2\2\u0107\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0108@\3\2\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7w\2\2\u010c\u010d\7g\2\2"+
		"\u010dB\3\2\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110\u0111\7v\2"+
		"\2\u0111D\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114\u0115\7"+
		"n\2\2\u0115\u0116\7h\2\2\u0116F\3\2\2\2\u0117\u0118\7U\2\2\u0118\u0119"+
		"\7G\2\2\u0119\u011a\7N\2\2\u011a\u011b\7H\2\2\u011b\u011c\7a\2\2\u011c"+
		"\u011d\7V\2\2\u011d\u011e\7[\2\2\u011e\u011f\7R\2\2\u011f\u0120\7G\2\2"+
		"\u0120H\3\2\2\2\u0121\u0131\5%\23\2\u0122\u0131\5\'\24\2\u0123\u0131\5"+
		")\25\2\u0124\u0131\5+\26\2\u0125\u0131\5-\27\2\u0126\u0131\5/\30\2\u0127"+
		"\u0131\5\61\31\2\u0128\u0131\5\63\32\2\u0129\u0131\5\65\33\2\u012a\u0131"+
		"\5\67\34\2\u012b\u0131\59\35\2\u012c\u0131\5;\36\2\u012d\u0131\5=\37\2"+
		"\u012e\u0131\5? \2\u012f\u0131\5A!\2\u0130\u0121\3\2\2\2\u0130\u0122\3"+
		"\2\2\2\u0130\u0123\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u0125\3\2\2\2\u0130"+
		"\u0126\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2"+
		"\2\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131J\3\2\2\2"+
		"\u0132\u0134\t\2\2\2\u0133\u0135\t\3\2\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137L\3\2\2\2\u0138"+
		"\u013a\t\4\2\2\u0139\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dN\3\2\2\2\u013e\u0141"+
		"\5K&\2\u013f\u0141\5M\'\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"P\3\2\2\2\u0142\u014c\7$\2\2\u0143\u0147\n\5\2\2\u0144\u0146\n\6\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0143\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7$\2\2\u0150R\3\2\2\2\u0151\u0152"+
		"\t\7\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b*\2\2\u0154T\3\2\2\2\u0155\u0157"+
		"\t\b\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b+\2\2\u015bV\3\2\2\2\u015c"+
		"\u015e\t\t\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160X\3\2\2\2\u0161\u0162\7/\2\2\u0162\u0163"+
		"\7/\2\2\u0163\u0167\3\2\2\2\u0164\u0166\13\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5U+\2\u016b\u016c\3\2\2\2\u016c\u016d"+
		"\b-\2\2\u016dZ\3\2\2\2\u016e\u016f\7*\2\2\u016f\u0170\7,\2\2\u0170\u0174"+
		"\3\2\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\7,\2\2\u0178\u0179\7+\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\b.\2\2\u017b\\\3\2\2\2\32\2\u008b\u0095\u00a1\u00a7\u00ad\u00bf"+
		"\u00cd\u00d7\u00e1\u00eb\u00f7\u00ff\u0107\u0130\u0136\u013c\u0140\u0147"+
		"\u014c\u0158\u015f\u0167\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}