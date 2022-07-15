// Generated from /Users/luca/Documents/UVG/2022/Segundo semestre/Compiladores/uvg-compiladores/Lab0/yapl.g4 by ANTLR 4.9.2
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
		SELF=34, SELF_TYPE=35, TYPE_ID=36, OBJECT_ID=37, STRING=38, WHITESPACE=39, 
		NEWLINE=40, INT=41, COMMENT=42, COMMENT_BLOCK=43;
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
			"TYPE_ID", "OBJECT_ID", "STRING", "ESC", "UNICODE", "HEX", "WHITESPACE", 
			"NEWLINE", "INT", "COMMENT", "COMMENT_BLOCK"
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
			"TRUE", "LET", "SELF", "SELF_TYPE", "TYPE_ID", "OBJECT_ID", "STRING", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u008e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0098\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\5\26\u00a4\n\26\3\27\3\27\3\27\3\27\5\27\u00aa\n\27\3\30\3\30\3\30\3"+
		"\30\5\30\u00b0\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00d0\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00da\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u00e4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ee"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00fa\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0102\n\37\3 \3 \3 \3 \3 \3 \5 \u010a"+
		"\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\7%\u0126\n%\f%\16%\u0129\13%\3%\5%\u012c\n%\3&\3&\7&"+
		"\u0130\n&\f&\16&\u0133\13&\3\'\3\'\3\'\7\'\u0138\n\'\f\'\16\'\u013b\13"+
		"\'\3\'\3\'\3(\3(\3(\5(\u0142\n(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3"+
		",\6,\u0151\n,\r,\16,\u0152\3,\3,\3-\6-\u0158\n-\r-\16-\u0159\3.\3.\3."+
		"\3.\7.\u0160\n.\f.\16.\u0163\13.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u016d\n/\f"+
		"/\16/\u0170\13/\3/\3/\3/\3/\3/\4\u0161\u016e\2\60\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		"\2Q\2S\2U)W*Y+[,]-\3\2\13\3\2C\\\6\2\62;C\\aac|\3\2c|\4\2$$^^\n\2$$\61"+
		"\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\2"+
		"\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2"+
		"\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25r\3\2"+
		"\2\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2"+
		"\2\2#\u0081\3\2\2\2%\u008d\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u00a3"+
		"\3\2\2\2-\u00a9\3\2\2\2/\u00af\3\2\2\2\61\u00c1\3\2\2\2\63\u00cf\3\2\2"+
		"\2\65\u00d9\3\2\2\2\67\u00e3\3\2\2\29\u00ed\3\2\2\2;\u00f9\3\2\2\2=\u0101"+
		"\3\2\2\2?\u0109\3\2\2\2A\u010b\3\2\2\2C\u0110\3\2\2\2E\u0114\3\2\2\2G"+
		"\u0119\3\2\2\2I\u012b\3\2\2\2K\u012d\3\2\2\2M\u0134\3\2\2\2O\u013e\3\2"+
		"\2\2Q\u0143\3\2\2\2S\u0149\3\2\2\2U\u014b\3\2\2\2W\u0150\3\2\2\2Y\u0157"+
		"\3\2\2\2[\u015b\3\2\2\2]\u0168\3\2\2\2_`\7=\2\2`\4\3\2\2\2ab\7}\2\2b\6"+
		"\3\2\2\2cd\7\177\2\2d\b\3\2\2\2ef\7*\2\2f\n\3\2\2\2gh\7.\2\2h\f\3\2\2"+
		"\2ij\7+\2\2j\16\3\2\2\2kl\7<\2\2l\20\3\2\2\2mn\7>\2\2no\7/\2\2o\22\3\2"+
		"\2\2pq\7B\2\2q\24\3\2\2\2rs\7\60\2\2s\26\3\2\2\2tu\7-\2\2u\30\3\2\2\2"+
		"vw\7/\2\2w\32\3\2\2\2xy\7,\2\2y\34\3\2\2\2z{\7\61\2\2{\36\3\2\2\2|}\7"+
		">\2\2} \3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080\"\3\2\2\2\u0081\u0082"+
		"\7?\2\2\u0082$\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7n\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7u\2\2\u0087\u008e\7u\2\2\u0088\u0089\7E\2\2\u0089"+
		"\u008a\7N\2\2\u008a\u008b\7C\2\2\u008b\u008c\7U\2\2\u008c\u008e\7U\2\2"+
		"\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2\u008e&\3\2\2\2\u008f\u0090\7"+
		"g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0098\7g\2\2\u0093\u0094"+
		"\7G\2\2\u0094\u0095\7N\2\2\u0095\u0096\7U\2\2\u0096\u0098\7G\2\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098(\3\2\2\2\u0099\u009a\7h\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2"+
		"\u009e*\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a4\7k\2\2\u00a1\u00a2\7H\2"+
		"\2\u00a2\u00a4\7K\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4,\3"+
		"\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00aa\7h\2\2\u00a7\u00a8\7K\2\2\u00a8"+
		"\u00aa\7H\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa.\3\2\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00b0\7p\2\2\u00ad\u00ae\7K\2\2\u00ae\u00b0\7P\2\2"+
		"\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\60\3\2\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7v\2\2\u00b8\u00c2\7u\2\2"+
		"\u00b9\u00ba\7K\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7J\2\2\u00bc\u00bd"+
		"\7G\2\2\u00bd\u00be\7T\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7V\2\2\u00c0"+
		"\u00c2\7U\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c2\62\3\2\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7k\2\2\u00c8\u00d0\7f\2\2\u00c9\u00ca\7K\2\2\u00ca"+
		"\u00cb\7U\2\2\u00cb\u00cc\7X\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7K\2\2"+
		"\u00ce\u00d0\7F\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c9\3\2\2\2\u00d0\64\3"+
		"\2\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00da\7r\2\2\u00d5\u00d6\7N\2\2\u00d6\u00d7\7Q\2\2\u00d7\u00d8\7Q\2\2"+
		"\u00d8\u00da\7R\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\66\3"+
		"\2\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00e4\7n\2\2\u00df\u00e0\7R\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7Q\2\2"+
		"\u00e2\u00e4\7N\2\2\u00e3\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e48\3\2"+
		"\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7g\2\2\u00e8\u00ee"+
		"\7p\2\2\u00e9\u00ea\7V\2\2\u00ea\u00eb\7J\2\2\u00eb\u00ec\7G\2\2\u00ec"+
		"\u00ee\7P\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee:\3\2\2\2\u00ef"+
		"\u00f0\7y\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7n\2\2"+
		"\u00f3\u00fa\7g\2\2\u00f4\u00f5\7Y\2\2\u00f5\u00f6\7J\2\2\u00f6\u00f7"+
		"\7K\2\2\u00f7\u00f8\7N\2\2\u00f8\u00fa\7G\2\2\u00f9\u00ef\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u0102\7y\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7G\2\2\u0100\u0102\7Y\2\2"+
		"\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2\2\2\u0102>\3\2\2\2\u0103\u0104\7"+
		"p\2\2\u0104\u0105\7q\2\2\u0105\u010a\7v\2\2\u0106\u0107\7P\2\2\u0107\u0108"+
		"\7Q\2\2\u0108\u010a\7V\2\2\u0109\u0103\3\2\2\2\u0109\u0106\3\2\2\2\u010a"+
		"@\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u010f\7g\2\2\u010fB\3\2\2\2\u0110\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7v\2\2\u0113D\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7n\2\2\u0117\u0118\7h\2\2\u0118F\3\2\2\2\u0119\u011a\7U\2\2\u011a"+
		"\u011b\7G\2\2\u011b\u011c\7N\2\2\u011c\u011d\7H\2\2\u011d\u011e\7a\2\2"+
		"\u011e\u011f\7V\2\2\u011f\u0120\7[\2\2\u0120\u0121\7R\2\2\u0121\u0122"+
		"\7G\2\2\u0122H\3\2\2\2\u0123\u0127\t\2\2\2\u0124\u0126\t\3\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012c\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5G$\2\u012b\u0123\3\2\2"+
		"\2\u012b\u012a\3\2\2\2\u012cJ\3\2\2\2\u012d\u0131\t\4\2\2\u012e\u0130"+
		"\t\3\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132L\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0139\7$\2\2\u0135"+
		"\u0138\5O(\2\u0136\u0138\n\5\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$\2\2\u013dN\3\2\2\2\u013e\u0141"+
		"\7^\2\2\u013f\u0142\t\6\2\2\u0140\u0142\5Q)\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142P\3\2\2\2\u0143\u0144\7w\2\2\u0144\u0145\5S*\2\u0145"+
		"\u0146\5S*\2\u0146\u0147\5S*\2\u0147\u0148\5S*\2\u0148R\3\2\2\2\u0149"+
		"\u014a\t\7\2\2\u014aT\3\2\2\2\u014b\u014c\t\b\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u014e\b+\2\2\u014eV\3\2\2\2\u014f\u0151\t\t\2\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\b,\2\2\u0155X\3\2\2\2\u0156\u0158\t\n\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015aZ\3\2\2\2\u015b\u015c\7/\2\2\u015c\u015d\7/\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\5W,\2\u0165\u0166\3\2\2\2\u0166\u0167\b.\2\2\u0167"+
		"\\\3\2\2\2\u0168\u0169\7*\2\2\u0169\u016a\7,\2\2\u016a\u016e\3\2\2\2\u016b"+
		"\u016d\13\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0172\7,\2\2\u0172\u0173\7+\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b/\2"+
		"\2\u0175^\3\2\2\2\32\2\u008d\u0097\u00a3\u00a9\u00af\u00c1\u00cf\u00d9"+
		"\u00e3\u00ed\u00f9\u0101\u0109\u0127\u012b\u0131\u0137\u0139\u0141\u0152"+
		"\u0159\u0161\u016e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}