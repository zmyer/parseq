// Generated from com/linkedin/restli/client/config/RequestConfigKey.g4 by ANTLR 4.5
package com.linkedin.restli.client.config;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestConfigKeyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Name=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "Name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'*'", "'.'", "'-'", "':'", "'GET'", "'BATCH_GET'", "'CREATE'", 
		"'BATCH_CREATE'", "'PARTIAL_UPDATE'", "'UPDATE'", "'BATCH_UPDATE'", "'DELETE'", 
		"'BATCH_PARTIAL_UPDATE'", "'BATCH_DELETE'", "'GET_ALL'", "'OPTIONS'", 
		"'HEAD'", "'POST'", "'PUT'", "'TRACE'", "'CONNECT'", "'FINDER'", "'ACTION'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Name"
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


	public RequestConfigKeyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RequestConfigKey.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00ec\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\6\32\u00e9\n\32\r\32\16\32\u00ea\2\2\33\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\3\2\3\5\2\62;C\\c|\u00ec\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2"+
		"\2\r?\3\2\2\2\17C\3\2\2\2\21M\3\2\2\2\23T\3\2\2\2\25a\3\2\2\2\27p\3\2"+
		"\2\2\31w\3\2\2\2\33\u0084\3\2\2\2\35\u008b\3\2\2\2\37\u00a0\3\2\2\2!\u00ad"+
		"\3\2\2\2#\u00b5\3\2\2\2%\u00bd\3\2\2\2\'\u00c2\3\2\2\2)\u00c7\3\2\2\2"+
		"+\u00cb\3\2\2\2-\u00d1\3\2\2\2/\u00d9\3\2\2\2\61\u00e0\3\2\2\2\63\u00e8"+
		"\3\2\2\2\65\66\7\61\2\2\66\4\3\2\2\2\678\7,\2\28\6\3\2\2\29:\7\60\2\2"+
		":\b\3\2\2\2;<\7/\2\2<\n\3\2\2\2=>\7<\2\2>\f\3\2\2\2?@\7I\2\2@A\7G\2\2"+
		"AB\7V\2\2B\16\3\2\2\2CD\7D\2\2DE\7C\2\2EF\7V\2\2FG\7E\2\2GH\7J\2\2HI\7"+
		"a\2\2IJ\7I\2\2JK\7G\2\2KL\7V\2\2L\20\3\2\2\2MN\7E\2\2NO\7T\2\2OP\7G\2"+
		"\2PQ\7C\2\2QR\7V\2\2RS\7G\2\2S\22\3\2\2\2TU\7D\2\2UV\7C\2\2VW\7V\2\2W"+
		"X\7E\2\2XY\7J\2\2YZ\7a\2\2Z[\7E\2\2[\\\7T\2\2\\]\7G\2\2]^\7C\2\2^_\7V"+
		"\2\2_`\7G\2\2`\24\3\2\2\2ab\7R\2\2bc\7C\2\2cd\7T\2\2de\7V\2\2ef\7K\2\2"+
		"fg\7C\2\2gh\7N\2\2hi\7a\2\2ij\7W\2\2jk\7R\2\2kl\7F\2\2lm\7C\2\2mn\7V\2"+
		"\2no\7G\2\2o\26\3\2\2\2pq\7W\2\2qr\7R\2\2rs\7F\2\2st\7C\2\2tu\7V\2\2u"+
		"v\7G\2\2v\30\3\2\2\2wx\7D\2\2xy\7C\2\2yz\7V\2\2z{\7E\2\2{|\7J\2\2|}\7"+
		"a\2\2}~\7W\2\2~\177\7R\2\2\177\u0080\7F\2\2\u0080\u0081\7C\2\2\u0081\u0082"+
		"\7V\2\2\u0082\u0083\7G\2\2\u0083\32\3\2\2\2\u0084\u0085\7F\2\2\u0085\u0086"+
		"\7G\2\2\u0086\u0087\7N\2\2\u0087\u0088\7G\2\2\u0088\u0089\7V\2\2\u0089"+
		"\u008a\7G\2\2\u008a\34\3\2\2\2\u008b\u008c\7D\2\2\u008c\u008d\7C\2\2\u008d"+
		"\u008e\7V\2\2\u008e\u008f\7E\2\2\u008f\u0090\7J\2\2\u0090\u0091\7a\2\2"+
		"\u0091\u0092\7R\2\2\u0092\u0093\7C\2\2\u0093\u0094\7T\2\2\u0094\u0095"+
		"\7V\2\2\u0095\u0096\7K\2\2\u0096\u0097\7C\2\2\u0097\u0098\7N\2\2\u0098"+
		"\u0099\7a\2\2\u0099\u009a\7W\2\2\u009a\u009b\7R\2\2\u009b\u009c\7F\2\2"+
		"\u009c\u009d\7C\2\2\u009d\u009e\7V\2\2\u009e\u009f\7G\2\2\u009f\36\3\2"+
		"\2\2\u00a0\u00a1\7D\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4"+
		"\7E\2\2\u00a4\u00a5\7J\2\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7F\2\2\u00a7"+
		"\u00a8\7G\2\2\u00a8\u00a9\7N\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7V\2\2"+
		"\u00ab\u00ac\7G\2\2\u00ac \3\2\2\2\u00ad\u00ae\7I\2\2\u00ae\u00af\7G\2"+
		"\2\u00af\u00b0\7V\2\2\u00b0\u00b1\7a\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3"+
		"\7N\2\2\u00b3\u00b4\7N\2\2\u00b4\"\3\2\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7"+
		"\7R\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7Q\2\2\u00ba"+
		"\u00bb\7P\2\2\u00bb\u00bc\7U\2\2\u00bc$\3\2\2\2\u00bd\u00be\7J\2\2\u00be"+
		"\u00bf\7G\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7F\2\2\u00c1&\3\2\2\2\u00c2"+
		"\u00c3\7R\2\2\u00c3\u00c4\7Q\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7V\2\2"+
		"\u00c6(\3\2\2\2\u00c7\u00c8\7R\2\2\u00c8\u00c9\7W\2\2\u00c9\u00ca\7V\2"+
		"\2\u00ca*\3\2\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7"+
		"C\2\2\u00ce\u00cf\7E\2\2\u00cf\u00d0\7G\2\2\u00d0,\3\2\2\2\u00d1\u00d2"+
		"\7E\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7P\2\2\u00d5"+
		"\u00d6\7G\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7V\2\2\u00d8.\3\2\2\2\u00d9"+
		"\u00da\7H\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7P\2\2\u00dc\u00dd\7F\2\2"+
		"\u00dd\u00de\7G\2\2\u00de\u00df\7T\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7"+
		"C\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5"+
		"\7Q\2\2\u00e5\u00e6\7P\2\2\u00e6\62\3\2\2\2\u00e7\u00e9\t\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\64\3\2\2\2\4\2\u00ea\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}