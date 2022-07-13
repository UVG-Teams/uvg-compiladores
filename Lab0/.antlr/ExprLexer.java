// Generated from /Users/willi/Desktop/repos/uvg-compiladores/Lab0/Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NEWLINE=13, INT=14, TYPE_ID=15, OBJECT_ID=16, 
		SELF=17, SELF_TYPE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NEWLINE", "INT", "TYPE_ID", "OBJECT_ID", "SELF", 
			"SELF_TYPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'--'", "'\n'", "'(*'", 
			"'*/'", "'*)'", "'\"'", null, null, null, null, "'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEWLINE", "INT", "TYPE_ID", "OBJECT_ID", "SELF", "SELF_TYPE"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\6\16E\n\16"+
		"\r\16\16\16F\3\16\3\16\3\17\6\17L\n\17\r\17\16\17M\3\20\3\20\6\20R\n\20"+
		"\r\20\16\20S\3\21\3\21\6\21X\n\21\r\21\16\21Y\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\7\4\2\f\f\17\17\3\2\62;\3\2C\\\5\2\62;C\\c|\3\2c|\2m\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3"+
		"\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25;\3\2\2\2\27>\3\2\2\2"+
		"\31A\3\2\2\2\33D\3\2\2\2\35K\3\2\2\2\37O\3\2\2\2!U\3\2\2\2#[\3\2\2\2%"+
		"`\3\2\2\2\'(\7,\2\2(\4\3\2\2\2)*\7\61\2\2*\6\3\2\2\2+,\7-\2\2,\b\3\2\2"+
		"\2-.\7/\2\2.\n\3\2\2\2/\60\7*\2\2\60\f\3\2\2\2\61\62\7+\2\2\62\16\3\2"+
		"\2\2\63\64\7/\2\2\64\65\7/\2\2\65\20\3\2\2\2\66\67\7\f\2\2\67\22\3\2\2"+
		"\289\7*\2\29:\7,\2\2:\24\3\2\2\2;<\7,\2\2<=\7\61\2\2=\26\3\2\2\2>?\7,"+
		"\2\2?@\7+\2\2@\30\3\2\2\2AB\7$\2\2B\32\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\16\2\2I\34\3\2\2\2JL\t\3\2\2"+
		"KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\36\3\2\2\2OQ\t\4\2\2PR\t\5\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T \3\2\2\2UW\t\6\2\2VX\t\5\2"+
		"\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\"\3\2\2\2[\\\7u\2\2\\]\7g"+
		"\2\2]^\7n\2\2^_\7h\2\2_$\3\2\2\2`a\7U\2\2ab\7G\2\2bc\7N\2\2cd\7H\2\2d"+
		"e\7a\2\2ef\7V\2\2fg\7[\2\2gh\7R\2\2hi\7G\2\2i&\3\2\2\2\7\2FMSY\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}