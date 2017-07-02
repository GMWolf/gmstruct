// Generated from D:/Projects/Java/GMStruct/generator/src/net/fbridault/gmwolf/gmstruct/generator\GMStruct.g4 by ANTLR 4.7
package net.fbridault.gmwolf.gmstruct.generator.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GMStructLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STR=10, ID=11, NUM=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"STR", "ID", "NUM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'{'", "'}'", "'include'", "'struct'", "':'", "','", 
		"'='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "STR", "ID", 
		"NUM", "WS"
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


	public GMStructLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GMStruct.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\6\13E\n\13\r\13\16\13"+
		"F\3\13\3\13\3\f\3\f\7\fM\n\f\f\f\16\fP\13\f\3\r\6\rS\n\r\r\r\16\rT\3\r"+
		"\3\r\6\rY\n\r\r\r\16\rZ\5\r]\n\r\3\16\3\16\3\16\3\16\3F\2\17\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\7\5\2C\\aac"+
		"|\6\2\62;C\\aac|\4\2\60\60\62;\5\2\62;CHch\5\2\13\f\17\17\"\"\2f\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13"+
		"\63\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2"+
		"\27J\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35\36\7p\2\2\36\37\7c\2\2\37 \7"+
		"o\2\2 !\7g\2\2!\"\7u\2\2\"#\7r\2\2#$\7c\2\2$%\7e\2\2%&\7g\2\2&\4\3\2\2"+
		"\2\'(\7}\2\2(\6\3\2\2\2)*\7\177\2\2*\b\3\2\2\2+,\7k\2\2,-\7p\2\2-.\7e"+
		"\2\2./\7n\2\2/\60\7w\2\2\60\61\7f\2\2\61\62\7g\2\2\62\n\3\2\2\2\63\64"+
		"\7u\2\2\64\65\7v\2\2\65\66\7t\2\2\66\67\7w\2\2\678\7e\2\289\7v\2\29\f"+
		"\3\2\2\2:;\7<\2\2;\16\3\2\2\2<=\7.\2\2=\20\3\2\2\2>?\7?\2\2?\22\3\2\2"+
		"\2@A\7\60\2\2A\24\3\2\2\2BD\7$\2\2CE\13\2\2\2DC\3\2\2\2EF\3\2\2\2FG\3"+
		"\2\2\2FD\3\2\2\2GH\3\2\2\2HI\7$\2\2I\26\3\2\2\2JN\t\2\2\2KM\t\3\2\2LK"+
		"\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\30\3\2\2\2PN\3\2\2\2QS\t\4\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U]\3\2\2\2VX\7&\2\2WY\t\5\2\2"+
		"XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\R\3\2\2\2\\V\3\2\2"+
		"\2]\32\3\2\2\2^_\t\6\2\2_`\3\2\2\2`a\b\16\2\2a\34\3\2\2\2\b\2FNTZ\\\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}