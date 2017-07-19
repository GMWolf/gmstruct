// Generated from D:/Projects/Java/GMStruct/generator/src/net/fbridault/gmwolf/gmstruct/generator\GMStruct.g4 by ANTLR 4.7
package net.fbridault.gmwolf.gmstruct.generator.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GMStructParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STR=10, ID=11, NUM=12, WS=13;
	public static final int
		RULE_file = 0, RULE_nameSpace = 1, RULE_includeList = 2, RULE_include = 3, 
		RULE_struct = 4, RULE_attributeList = 5, RULE_attribute = 6, RULE_value = 7, 
		RULE_structPath = 8;
	public static final String[] ruleNames = {
		"file", "nameSpace", "includeList", "include", "struct", "attributeList", 
		"attribute", "value", "structPath"
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

	@Override
	public String getGrammarFileName() { return "GMStruct.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GMStructParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public IncludeListContext includeList() {
			return getRuleContext(IncludeListContext.class,0);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<NameSpaceContext> nameSpace() {
			return getRuleContexts(NameSpaceContext.class);
		}
		public NameSpaceContext nameSpace(int i) {
			return getRuleContext(NameSpaceContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			includeList();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				setState(21);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(19);
					struct();
					}
					break;
				case T__0:
					{
					setState(20);
					nameSpace();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class NameSpaceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(GMStructParser.ID, 0); }
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<NameSpaceContext> nameSpace() {
			return getRuleContexts(NameSpaceContext.class);
		}
		public NameSpaceContext nameSpace(int i) {
			return getRuleContext(NameSpaceContext.class,i);
		}
		public NameSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterNameSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitNameSpace(this);
		}
	}

	public final NameSpaceContext nameSpace() throws RecognitionException {
		NameSpaceContext _localctx = new NameSpaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			((NameSpaceContext)_localctx).name = match(ID);
			setState(28);
			match(T__1);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(29);
					struct();
					}
					break;
				case T__0:
					{
					setState(30);
					nameSpace();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class IncludeListContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public IncludeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterIncludeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitIncludeList(this);
		}
	}

	public final IncludeListContext includeList() throws RecognitionException {
		IncludeListContext _localctx = new IncludeListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(38);
				include();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(GMStructParser.STR, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__3);
			setState(45);
			match(STR);
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

	public static class StructContext extends ParserRuleContext {
		public Token name;
		public StructPathContext parent;
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode ID() { return getToken(GMStructParser.ID, 0); }
		public StructPathContext structPath() {
			return getRuleContext(StructPathContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			((StructContext)_localctx).name = match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(49);
				match(T__5);
				setState(50);
				((StructContext)_localctx).parent = structPath();
				}
			}

			setState(53);
			match(T__1);
			setState(54);
			attributeList();
			setState(55);
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(57);
				attribute();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(58);
					match(T__6);
					setState(59);
					attribute();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class AttributeContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public ValueContext def;
		public List<TerminalNode> ID() { return getTokens(GMStructParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GMStructParser.ID, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(67);
				((AttributeContext)_localctx).type = match(ID);
				}
				break;
			}
			setState(70);
			((AttributeContext)_localctx).name = match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(71);
				match(T__7);
				setState(72);
				((AttributeContext)_localctx).def = value();
				}
			}

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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GMStructParser.NUM, 0); }
		public TerminalNode ID() { return getToken(GMStructParser.ID, 0); }
		public TerminalNode STR() { return getToken(GMStructParser.STR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << ID) | (1L << NUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StructPathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GMStructParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GMStructParser.ID, i);
		}
		public StructPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterStructPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitStructPath(this);
		}
	}

	public final StructPathContext structPath() throws RecognitionException {
		StructPathContext _localctx = new StructPathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(78);
				match(T__8);
				setState(79);
				match(ID);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13"+
		"\3\3\3\3\3\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6"+
		"\66\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\5\7D\n\7\3"+
		"\b\5\bG\n\b\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\3\n\7\nS\n\n\f\n\16\n"+
		"V\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\f\16\2Y\2\24\3\2\2\2\4"+
		"\34\3\2\2\2\6+\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\fC\3\2\2\2\16F\3\2\2\2"+
		"\20M\3\2\2\2\22O\3\2\2\2\24\31\5\6\4\2\25\30\5\n\6\2\26\30\5\4\3\2\27"+
		"\25\3\2\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\3\3\2\2\2\33\31\3\2\2\2\34\35\7\3\2\2\35\36\7\r\2\2\36#\7\4\2\2\37\""+
		"\5\n\6\2 \"\5\4\3\2!\37\3\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$&\3\2\2\2%#\3\2\2\2&\'\7\5\2\2\'\5\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2./\7\6\2\2/\60\7\f\2\2"+
		"\60\t\3\2\2\2\61\62\7\7\2\2\62\65\7\r\2\2\63\64\7\b\2\2\64\66\5\22\n\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\4\2\289\5\f\7\29:\7\5"+
		"\2\2:\13\3\2\2\2;@\5\16\b\2<=\7\t\2\2=?\5\16\b\2><\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C;\3\2\2\2CD\3\2\2\2D\r\3\2\2\2"+
		"EG\7\r\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HK\7\r\2\2IJ\7\n\2\2JL\5\20\t"+
		"\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MN\t\2\2\2N\21\3\2\2\2OT\7\r\2\2PQ\7"+
		"\13\2\2QS\7\r\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\23\3\2\2\2"+
		"VT\3\2\2\2\r\27\31!#+\65@CFKT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}