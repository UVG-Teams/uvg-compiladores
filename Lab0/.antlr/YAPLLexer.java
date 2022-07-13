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
		TYPE_ID=18, OBJECT_ID=19, KEYWORDS=20, ID=21, STRING=22, WHITESPACE=23, 
		NEWLINE=24, INT=25, SELF=26, SELF_TYPE=27, COMMENT=28, COMMENT_BLOCK=29, 
		CLASS_KEY=30, ELSE=31, FALSE=32, FI=33, IF=34, IN=35, INHERITS=36, ISVOID=37, 
		LOOP=38, POOL=39, THEN=40, WHILE=41, NEW=42, NOT=43, TRUE=44, LET=45;
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
			"TYPE_ID", "OBJECT_ID", "KEYWORDS", "ID", "STRING", "WHITESPACE", "NEWLINE", 
			"INT", "SELF", "SELF_TYPE", "COMMENT", "COMMENT_BLOCK", "CLASS_KEY", 
			"ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LOOP", "POOL", 
			"THEN", "WHILE", "NEW", "NOT", "TRUE", "LET"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0084\n\23\r\23\16\23"+
		"\u0085\3\24\3\24\6\24\u008a\n\24\r\24\16\24\u008b\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009d\n\25"+
		"\3\26\3\26\5\26\u00a1\n\26\3\27\3\27\3\27\7\27\u00a6\n\27\f\27\16\27\u00a9"+
		"\13\27\7\27\u00ab\n\27\f\27\16\27\u00ae\13\27\3\27\3\27\3\30\3\30\3\31"+
		"\6\31\u00b5\n\31\r\31\16\31\u00b6\3\31\3\31\3\32\6\32\u00bc\n\32\r\32"+
		"\16\32\u00bd\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00d3\n\35\f\35\16\35\u00d6"+
		"\13\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00e0\n\36\f\36\16"+
		"\36\u00e3\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u00f8\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\5\"\u0104\n\"\3#\3#\3#\3#\5#\u010a\n#\3$\3$\3$\3$\5$\u0110\n$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0122\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u0130\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u013a"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0144\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u014e"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u015a\n*\3+\3+\3+\3+\3+\3+\5+\u0162"+
		"\n+\3,\3,\3,\3,\3,\3,\5,\u016a\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\4\u00d4\u00e1"+
		"\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\n\3\2C\\\5\2\62;C\\c|\3\2c"+
		"|\3\2$$\3\2\f\f\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\2\u0196\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2"+
		"\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23n\3\2\2\2"+
		"\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2"+
		"\2!|\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0087\3\2\2\2)\u009c\3\2\2"+
		"\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00b1\3\2\2\2\61\u00b4\3\2\2\2\63\u00bb"+
		"\3\2\2\2\65\u00bf\3\2\2\2\67\u00c4\3\2\2\29\u00ce\3\2\2\2;\u00db\3\2\2"+
		"\2=\u00e9\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u0103\3\2\2\2E\u0109"+
		"\3\2\2\2G\u010f\3\2\2\2I\u0121\3\2\2\2K\u012f\3\2\2\2M\u0139\3\2\2\2O"+
		"\u0143\3\2\2\2Q\u014d\3\2\2\2S\u0159\3\2\2\2U\u0161\3\2\2\2W\u0169\3\2"+
		"\2\2Y\u016b\3\2\2\2[\u0170\3\2\2\2]^\7=\2\2^\4\3\2\2\2_`\7}\2\2`\6\3\2"+
		"\2\2ab\7\177\2\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7.\2\2f\f\3\2\2\2gh"+
		"\7+\2\2h\16\3\2\2\2ij\7<\2\2j\20\3\2\2\2kl\7>\2\2lm\7/\2\2m\22\3\2\2\2"+
		"no\7B\2\2o\24\3\2\2\2pq\7\60\2\2q\26\3\2\2\2rs\7-\2\2s\30\3\2\2\2tu\7"+
		"/\2\2u\32\3\2\2\2vw\7,\2\2w\34\3\2\2\2xy\7\61\2\2y\36\3\2\2\2z{\7>\2\2"+
		"{ \3\2\2\2|}\7>\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7?\2\2\u0080$\3\2\2"+
		"\2\u0081\u0083\t\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086&\3\2\2\2\u0087"+
		"\u0089\t\4\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c(\3\2\2\2\u008d\u009d"+
		"\5=\37\2\u008e\u009d\5? \2\u008f\u009d\5A!\2\u0090\u009d\5C\"\2\u0091"+
		"\u009d\5E#\2\u0092\u009d\5G$\2\u0093\u009d\5I%\2\u0094\u009d\5K&\2\u0095"+
		"\u009d\5M\'\2\u0096\u009d\5O(\2\u0097\u009d\5Q)\2\u0098\u009d\5S*\2\u0099"+
		"\u009d\5U+\2\u009a\u009d\5W,\2\u009b\u009d\5Y-\2\u009c\u008d\3\2\2\2\u009c"+
		"\u008e\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0091\3\2"+
		"\2\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0094\3\2\2\2\u009c"+
		"\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"*\3\2\2\2\u009e\u00a1\5%\23\2\u009f\u00a1\5\'\24\2\u00a0\u009e\3\2\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1,\3\2\2\2\u00a2\u00ac\7$\2\2\u00a3\u00a7\n\5"+
		"\2\2\u00a4\u00a6\n\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00a3\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$"+
		"\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\7\2\2\u00b2\60\3\2\2\2\u00b3\u00b5\t"+
		"\b\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\31\2\2\u00b9\62\3\2\2"+
		"\2\u00ba\u00bc\t\t\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7h\2\2\u00c3\66\3\2\2\2\u00c4"+
		"\u00c5\7U\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7H\2\2"+
		"\u00c8\u00c9\7a\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7[\2\2\u00cb\u00cc"+
		"\7R\2\2\u00cc\u00cd\7G\2\2\u00cd8\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0"+
		"\7/\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\61\31\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b\35\2\2\u00da:\3\2\2\2\u00db\u00dc\7*\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00e1\3\2\2\2\u00de\u00e0\13\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\7+\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00e8\b\36\2\2\u00e8<\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		">\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f8\7g\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f6\7U\2\2"+
		"\u00f6\u00f8\7G\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8@\3\2"+
		"\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd\u00fe\7g\2\2\u00feB\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0104"+
		"\7k\2\2\u0101\u0102\7H\2\2\u0102\u0104\7K\2\2\u0103\u00ff\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104D\3\2\2\2\u0105\u0106\7k\2\2\u0106\u010a\7h\2\2\u0107"+
		"\u0108\7K\2\2\u0108\u010a\7H\2\2\u0109\u0105\3\2\2\2\u0109\u0107\3\2\2"+
		"\2\u010aF\3\2\2\2\u010b\u010c\7k\2\2\u010c\u0110\7p\2\2\u010d\u010e\7"+
		"K\2\2\u010e\u0110\7P\2\2\u010f\u010b\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"H\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7j\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7t\2\2\u0116\u0117\7k\2\2\u0117\u0118\7v\2\2"+
		"\u0118\u0122\7u\2\2\u0119\u011a\7K\2\2\u011a\u011b\7P\2\2\u011b\u011c"+
		"\7J\2\2\u011c\u011d\7G\2\2\u011d\u011e\7T\2\2\u011e\u011f\7K\2\2\u011f"+
		"\u0120\7V\2\2\u0120\u0122\7U\2\2\u0121\u0111\3\2\2\2\u0121\u0119\3\2\2"+
		"\2\u0122J\3\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7u\2\2\u0125\u0126\7"+
		"x\2\2\u0126\u0127\7q\2\2\u0127\u0128\7k\2\2\u0128\u0130\7f\2\2\u0129\u012a"+
		"\7K\2\2\u012a\u012b\7U\2\2\u012b\u012c\7X\2\2\u012c\u012d\7Q\2\2\u012d"+
		"\u012e\7K\2\2\u012e\u0130\7F\2\2\u012f\u0123\3\2\2\2\u012f\u0129\3\2\2"+
		"\2\u0130L\3\2\2\2\u0131\u0132\7n\2\2\u0132\u0133\7q\2\2\u0133\u0134\7"+
		"q\2\2\u0134\u013a\7r\2\2\u0135\u0136\7N\2\2\u0136\u0137\7Q\2\2\u0137\u0138"+
		"\7Q\2\2\u0138\u013a\7R\2\2\u0139\u0131\3\2\2\2\u0139\u0135\3\2\2\2\u013a"+
		"N\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7q\2\2\u013d\u013e\7q\2\2\u013e"+
		"\u0144\7n\2\2\u013f\u0140\7R\2\2\u0140\u0141\7Q\2\2\u0141\u0142\7Q\2\2"+
		"\u0142\u0144\7N\2\2\u0143\u013b\3\2\2\2\u0143\u013f\3\2\2\2\u0144P\3\2"+
		"\2\2\u0145\u0146\7v\2\2\u0146\u0147\7j\2\2\u0147\u0148\7g\2\2\u0148\u014e"+
		"\7p\2\2\u0149\u014a\7V\2\2\u014a\u014b\7J\2\2\u014b\u014c\7G\2\2\u014c"+
		"\u014e\7P\2\2\u014d\u0145\3\2\2\2\u014d\u0149\3\2\2\2\u014eR\3\2\2\2\u014f"+
		"\u0150\7y\2\2\u0150\u0151\7j\2\2\u0151\u0152\7k\2\2\u0152\u0153\7n\2\2"+
		"\u0153\u015a\7g\2\2\u0154\u0155\7Y\2\2\u0155\u0156\7J\2\2\u0156\u0157"+
		"\7K\2\2\u0157\u0158\7N\2\2\u0158\u015a\7G\2\2\u0159\u014f\3\2\2\2\u0159"+
		"\u0154\3\2\2\2\u015aT\3\2\2\2\u015b\u015c\7p\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u0162\7y\2\2\u015e\u015f\7P\2\2\u015f\u0160\7G\2\2\u0160\u0162\7Y\2\2"+
		"\u0161\u015b\3\2\2\2\u0161\u015e\3\2\2\2\u0162V\3\2\2\2\u0163\u0164\7"+
		"p\2\2\u0164\u0165\7q\2\2\u0165\u016a\7v\2\2\u0166\u0167\7P\2\2\u0167\u0168"+
		"\7Q\2\2\u0168\u016a\7V\2\2\u0169\u0163\3\2\2\2\u0169\u0166\3\2\2\2\u016a"+
		"X\3\2\2\2\u016b\u016c\7v\2\2\u016c\u016d\7t\2\2\u016d\u016e\7w\2\2\u016e"+
		"\u016f\7g\2\2\u016fZ\3\2\2\2\u0170\u0171\7n\2\2\u0171\u0172\7g\2\2\u0172"+
		"\u0173\7v\2\2\u0173\\\3\2\2\2\31\2\u0085\u008b\u009c\u00a0\u00a7\u00ac"+
		"\u00b6\u00bd\u00d4\u00e1\u00f7\u0103\u0109\u010f\u0121\u012f\u0139\u0143"+
		"\u014d\u0159\u0161\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}