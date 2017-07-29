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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, STR=31, ID=32, 
		NUM=33, WS=34;
	public static final int
		RULE_file = 0, RULE_nameSpace = 1, RULE_includeList = 2, RULE_include = 3, 
		RULE_struct = 4, RULE_attributeList = 5, RULE_attribute = 6, RULE_funtionList = 7, 
		RULE_function = 8, RULE_idList = 9, RULE_block = 10, RULE_stat = 11, RULE_ret = 12, 
		RULE_declaration = 13, RULE_assignment = 14, RULE_functionCall = 15, RULE_exprList = 16, 
		RULE_ifStat = 17, RULE_expr = 18, RULE_constructor = 19, RULE_value = 20, 
		RULE_arrayLiteral = 21, RULE_id = 22, RULE_num = 23, RULE_str = 24, RULE_structPath = 25;
	public static final String[] ruleNames = {
		"file", "nameSpace", "includeList", "include", "struct", "attributeList", 
		"attribute", "funtionList", "function", "idList", "block", "stat", "ret", 
		"declaration", "assignment", "functionCall", "exprList", "ifStat", "expr", 
		"constructor", "value", "arrayLiteral", "id", "num", "str", "structPath"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'{'", "'}'", "'include'", "'struct'", "':'", "';'", 
		"','", "'='", "'('", "')'", "'return'", "'var'", "'['", "']'", "'*='", 
		"'/='", "'+='", "'if'", "'else'", "'.'", "'*'", "'/'", "'+'", "'-'", "'||'", 
		"'&&'", "'=='", "'!='", "'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "STR", "ID", "NUM", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			includeList();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(53);
					struct();
					}
					break;
				case T__0:
					{
					setState(54);
					nameSpace();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(59);
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
		public IdContext name;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitNameSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceContext nameSpace() throws RecognitionException {
		NameSpaceContext _localctx = new NameSpaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			((NameSpaceContext)_localctx).name = id();
			setState(62);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(63);
					struct();
					}
					break;
				case T__0:
					{
					setState(64);
					nameSpace();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitIncludeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeListContext includeList() throws RecognitionException {
		IncludeListContext _localctx = new IncludeListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(72);
				include();
				}
				}
				setState(77);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(79);
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
		public IdContext name;
		public StructPathContext parent;
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FuntionListContext funtionList() {
			return getRuleContext(FuntionListContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			((StructContext)_localctx).name = id();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(83);
				match(T__5);
				setState(84);
				((StructContext)_localctx).parent = structPath();
				}
			}

			setState(87);
			match(T__1);
			setState(88);
			attributeList();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(89);
				match(T__6);
				setState(90);
				funtionList();
				}
			}

			setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(95);
				attribute();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(96);
					match(T__7);
					setState(97);
					attribute();
					}
					}
					setState(102);
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
		public IdContext type;
		public IdContext name;
		public ExprContext def;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105);
				((AttributeContext)_localctx).type = id();
				}
				break;
			}
			setState(108);
			((AttributeContext)_localctx).name = id();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(109);
				match(T__8);
				setState(110);
				((AttributeContext)_localctx).def = expr(0);
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

	public static class FuntionListContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FuntionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterFuntionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitFuntionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitFuntionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionListContext funtionList() throws RecognitionException {
		FuntionListContext _localctx = new FuntionListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funtionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(113);
				function();
				}
				}
				setState(118);
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

	public static class FunctionContext extends ParserRuleContext {
		public IdContext type;
		public IdContext name;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(119);
				((FunctionContext)_localctx).type = id();
				}
				break;
			}
			setState(122);
			((FunctionContext)_localctx).name = id();
			setState(123);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(124);
				idList();
				}
			}

			setState(127);
			match(T__10);
			setState(128);
			block();
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

	public static class IdListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			id();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(131);
				match(T__7);
				setState(132);
				id();
				}
				}
				setState(137);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__1);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(139);
				stat();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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

	public static class StatContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stat);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				declaration();
				setState(149);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				assignment();
				setState(152);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				functionCall();
				setState(155);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				ifStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				ret();
				setState(159);
				match(T__6);
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

	public static class RetContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__11);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__13) | (1L << T__29) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(164);
				expr(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public IdContext type;
		public IdContext name;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(167);
				match(T__12);
				}
				break;
			case ID:
				{
				setState(168);
				((DeclarationContext)_localctx).type = id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			((DeclarationContext)_localctx).name = id();
			setState(172);
			match(T__8);
			setState(173);
			expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			id();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(176);
				match(T__13);
				setState(177);
				value();
				setState(178);
				match(T__14);
				}
			}

			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			expr(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext name;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((FunctionCallContext)_localctx).name = id();
			setState(186);
			match(T__9);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__13) | (1L << T__29) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(187);
				exprList();
				}
			}

			setState(190);
			match(T__10);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expr(0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(193);
				match(T__7);
				setState(194);
				expr(0);
				}
				}
				setState(199);
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

	public static class IfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__18);
			setState(201);
			expr(0);
			setState(202);
			stat();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(203);
				match(T__19);
				setState(204);
				stat();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DotExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends ExprContext {
		public ExprContext l;
		public ExprContext r;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NeqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__29:
			case STR:
			case ID:
			case NUM:
				{
				_localctx = new ValExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				value();
				}
				break;
			case T__9:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(T__9);
				setState(210);
				expr(0);
				setState(211);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						((DotExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(216);
						match(T__20);
						setState(217);
						((DotExprContext)_localctx).r = expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						((MulExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(219);
						match(T__21);
						setState(220);
						((MulExprContext)_localctx).r = expr(11);
						}
						break;
					case 3:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						((DivExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(222);
						match(T__22);
						setState(223);
						((DivExprContext)_localctx).r = expr(10);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						((AddExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
						match(T__23);
						setState(226);
						((AddExprContext)_localctx).r = expr(9);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						((SubExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						match(T__24);
						setState(229);
						((SubExprContext)_localctx).r = expr(8);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						match(T__25);
						setState(232);
						((OrExprContext)_localctx).r = expr(7);
						}
						break;
					case 7:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						match(T__26);
						setState(235);
						((AndExprContext)_localctx).r = expr(6);
						}
						break;
					case 8:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						((EqExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						match(T__27);
						setState(238);
						((EqExprContext)_localctx).r = expr(5);
						}
						break;
					case 9:
						{
						_localctx = new NeqExprContext(new ExprContext(_parentctx, _parentState));
						((NeqExprContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						match(T__28);
						setState(241);
						((NeqExprContext)_localctx).r = expr(4);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ConstructorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__29);
			setState(248);
			id();
			setState(249);
			match(T__9);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__13) | (1L << T__29) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(250);
				exprList();
				}
			}

			setState(253);
			match(T__10);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValNumContext extends ValueContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValNumContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValConstructContext extends ValueContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ValConstructContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValConstruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValVarContext extends ValueContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValVarContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValArrayContext extends ValueContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ValArrayContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStrContext extends ValueContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public ValStrContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFunctionContext extends ValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValFunctionContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterValFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitValFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitValFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ValNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				num();
				}
				break;
			case 2:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				id();
				}
				break;
			case 3:
				_localctx = new ValStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				str();
				}
				break;
			case 4:
				_localctx = new ValFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				functionCall();
				}
				break;
			case 5:
				_localctx = new ValArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				arrayLiteral();
				}
				break;
			case 6:
				_localctx = new ValConstructContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				constructor();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__13);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__29) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(264);
				value();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(265);
					match(T__7);
					setState(266);
					value();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(274);
			match(T__14);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GMStructParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GMStructParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(NUM);
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(GMStructParser.STR, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMStructListener ) ((GMStructListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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

	public static class StructPathContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMStructVisitor ) return ((GMStructVisitor<? extends T>)visitor).visitStructPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPathContext structPath() throws RecognitionException {
		StructPathContext _localctx = new StructPathContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			id();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(283);
				match(T__20);
				setState(284);
				id();
				}
				}
				setState(289);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3\3"+
		"\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\5\7j\n\7\3\b\5\bm\n\b\3\b\3\b\3\b\5\b"+
		"r\n\b\3\t\7\tu\n\t\f\t\16\tx\13\t\3\n\5\n{\n\n\3\n\3\n\3\n\5\n\u0080\n"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3"+
		"\f\3\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\5\16\u00a8"+
		"\n\16\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00b7\n\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00bf\n\21\3"+
		"\21\3\21\3\22\3\22\3\22\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00d8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00f5\n\24\f\24\16\24\u00f8\13\24\3\25\3\25\3\25\3\25\5\25"+
		"\u00fe\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0108\n\26\3"+
		"\27\3\27\3\27\3\27\7\27\u010e\n\27\f\27\16\27\u0111\13\27\5\27\u0113\n"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u0120"+
		"\n\33\f\33\16\33\u0123\13\33\3\33\2\3&\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\13\13\22\24\2\u0138\2\66\3\2\2\2\4"+
		">\3\2\2\2\6M\3\2\2\2\bP\3\2\2\2\nS\3\2\2\2\fi\3\2\2\2\16l\3\2\2\2\20v"+
		"\3\2\2\2\22z\3\2\2\2\24\u0084\3\2\2\2\26\u008c\3\2\2\2\30\u00a3\3\2\2"+
		"\2\32\u00a5\3\2\2\2\34\u00ab\3\2\2\2\36\u00b1\3\2\2\2 \u00bb\3\2\2\2\""+
		"\u00c2\3\2\2\2$\u00ca\3\2\2\2&\u00d7\3\2\2\2(\u00f9\3\2\2\2*\u0107\3\2"+
		"\2\2,\u0109\3\2\2\2.\u0116\3\2\2\2\60\u0118\3\2\2\2\62\u011a\3\2\2\2\64"+
		"\u011c\3\2\2\2\66;\5\6\4\2\67:\5\n\6\28:\5\4\3\29\67\3\2\2\298\3\2\2\2"+
		":=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>?\7\3\2\2?@\5.\30"+
		"\2@E\7\4\2\2AD\5\n\6\2BD\5\4\3\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\5\2\2I\5\3\2\2\2JL\5\b\5\2KJ\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2\2PQ\7\6\2\2QR\7"+
		"!\2\2R\t\3\2\2\2ST\7\7\2\2TW\5.\30\2UV\7\b\2\2VX\5\64\33\2WU\3\2\2\2W"+
		"X\3\2\2\2XY\3\2\2\2YZ\7\4\2\2Z]\5\f\7\2[\\\7\t\2\2\\^\5\20\t\2][\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_`\7\5\2\2`\13\3\2\2\2af\5\16\b\2bc\7\n\2\2ce\5"+
		"\16\b\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ia"+
		"\3\2\2\2ij\3\2\2\2j\r\3\2\2\2km\5.\30\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"nq\5.\30\2op\7\13\2\2pr\5&\24\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2su\5\22"+
		"\n\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y{\5"+
		".\30\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5.\30\2}\177\7\f\2\2~\u0080\5\24"+
		"\13\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7"+
		"\r\2\2\u0082\u0083\5\26\f\2\u0083\23\3\2\2\2\u0084\u0089\5.\30\2\u0085"+
		"\u0086\7\n\2\2\u0086\u0088\5.\30\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u0090\7\4\2\2\u008d\u008f\5\30\r\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\5\2\2\u0094\27\3\2\2\2\u0095"+
		"\u00a4\5\26\f\2\u0096\u0097\5\34\17\2\u0097\u0098\7\t\2\2\u0098\u00a4"+
		"\3\2\2\2\u0099\u009a\5\36\20\2\u009a\u009b\7\t\2\2\u009b\u00a4\3\2\2\2"+
		"\u009c\u009d\5 \21\2\u009d\u009e\7\t\2\2\u009e\u00a4\3\2\2\2\u009f\u00a4"+
		"\5$\23\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\t\2\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u0095\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009c"+
		"\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\31\3\2\2\2\u00a5"+
		"\u00a7\7\16\2\2\u00a6\u00a8\5&\24\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\33\3\2\2\2\u00a9\u00ac\7\17\2\2\u00aa\u00ac\5.\30\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5."+
		"\30\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5&\24\2\u00b0\35\3\2\2\2\u00b1"+
		"\u00b6\5.\30\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\5*\26\2\u00b4\u00b5\7"+
		"\21\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00ba\5&\24\2\u00ba\37\3\2\2"+
		"\2\u00bb\u00bc\5.\30\2\u00bc\u00be\7\f\2\2\u00bd\u00bf\5\"\22\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\r"+
		"\2\2\u00c1!\3\2\2\2\u00c2\u00c7\5&\24\2\u00c3\u00c4\7\n\2\2\u00c4\u00c6"+
		"\5&\24\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\25\2\2"+
		"\u00cb\u00cc\5&\24\2\u00cc\u00cf\5\30\r\2\u00cd\u00ce\7\26\2\2\u00ce\u00d0"+
		"\5\30\r\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0%\3\2\2\2\u00d1"+
		"\u00d2\b\24\1\2\u00d2\u00d8\5*\26\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5"+
		"&\24\2\u00d5\u00d6\7\r\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\u00f6\3\2\2\2\u00d9\u00da\f\r\2\2\u00da\u00db\7\27"+
		"\2\2\u00db\u00f5\5&\24\16\u00dc\u00dd\f\f\2\2\u00dd\u00de\7\30\2\2\u00de"+
		"\u00f5\5&\24\r\u00df\u00e0\f\13\2\2\u00e0\u00e1\7\31\2\2\u00e1\u00f5\5"+
		"&\24\f\u00e2\u00e3\f\n\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00f5\5&\24\13\u00e5"+
		"\u00e6\f\t\2\2\u00e6\u00e7\7\33\2\2\u00e7\u00f5\5&\24\n\u00e8\u00e9\f"+
		"\b\2\2\u00e9\u00ea\7\34\2\2\u00ea\u00f5\5&\24\t\u00eb\u00ec\f\7\2\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00f5\5&\24\b\u00ee\u00ef\f\6\2\2\u00ef\u00f0\7"+
		"\36\2\2\u00f0\u00f5\5&\24\7\u00f1\u00f2\f\5\2\2\u00f2\u00f3\7\37\2\2\u00f3"+
		"\u00f5\5&\24\6\u00f4\u00d9\3\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00df\3\2"+
		"\2\2\u00f4\u00e2\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f4"+
		"\u00eb\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\5.\30\2\u00fb\u00fd\7\f\2\2\u00fc"+
		"\u00fe\5\"\22\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\7\r\2\2\u0100)\3\2\2\2\u0101\u0108\5\60\31\2\u0102"+
		"\u0108\5.\30\2\u0103\u0108\5\62\32\2\u0104\u0108\5 \21\2\u0105\u0108\5"+
		",\27\2\u0106\u0108\5(\25\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108+\3\2\2\2\u0109\u0112\7\20\2\2\u010a\u010f\5*\26\2\u010b\u010c"+
		"\7\n\2\2\u010c\u010e\5*\26\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u010a\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7\21\2\2\u0115-\3\2\2\2\u0116\u0117\7\"\2\2\u0117/\3\2\2\2\u0118"+
		"\u0119\7#\2\2\u0119\61\3\2\2\2\u011a\u011b\7!\2\2\u011b\63\3\2\2\2\u011c"+
		"\u0121\5.\30\2\u011d\u011e\7\27\2\2\u011e\u0120\5.\30\2\u011f\u011d\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\65\3\2\2\2\u0123\u0121\3\2\2\2!9;CEMW]filqvz\177\u0089\u0090\u00a3\u00a7"+
		"\u00ab\u00b6\u00be\u00c7\u00cf\u00d7\u00f4\u00f6\u00fd\u0107\u010f\u0112"+
		"\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}