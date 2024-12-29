// Generated from C:/Users/USER/Desktop/src/angularNoww/src/antlr/AngularParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSEIF=2, ELSE=3, FOR=4, WHILE=5, SWITCH=6, CASE=7, BREAK=8, CONTINUE=9, 
		DEFAULT=10, DO=11, TRY=12, CATCH=13, FINALLY=14, THROW=15, FUNCTION=16, 
		RETURN=17, CONST=18, LET=19, CONSTRUCTOR=20, VAR=21, CLASS=22, IMPORT=23, 
		IMPORTS=24, EXPORT=25, AS=26, FROM=27, NEW=28, THIS=29, IMPLEMENTS=30, 
		INPUT=31, OUTPUT=32, VIEWCHILD=33, COMPONENT=34, NGONINIT=35, NGONCHANGES=36, 
		SELECTOR=37, STANDALONE=38, STYLEURL=39, TEMPLATEURL=40, TEMPLATE=41, 
		PUBLIC=42, PRIVATE=43, PROTECTED=44, READONLY=45, STATIC=46, ABSTRACT=47, 
		FINAL=48, ASYNC=49, EQUAL=50, ARROW=51, PLUS=52, MINUS=53, STAR=54, DIVIDE=55, 
		MODULO=56, AND=57, OR=58, NOT=59, EQUAL_TO=60, EQUAL_TO3=61, NOT_EQUAL=62, 
		NOT_EQUAL2=63, GREATER_THAN=64, LESS_THAN=65, GREATER_THAN_OR_EQUAL=66, 
		LESS_THAN_OR_EQUAL=67, LPAREN=68, RPAREN=69, LSBRACKET=70, RSBRACKET=71, 
		LCURLY=72, RCURLY=73, COMMA=74, SEMI=75, COLON=76, DOT=77, QUESITIONMARK=78, 
		Integer=79, Float=80, String=81, Boolean=82, Undefined=83, Null=84, IDENTIFIER=85, 
		SINGLE_LINE_COMMENT=86, COMMENT_BLOCK=87, WS=88, EXTENDS=89;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_componentDeclaration = 2, 
		RULE_selector = 3, RULE_standalone = 4, RULE_imports = 5, RULE_url = 6, 
		RULE_tamplate = 7, RULE_html = 8, RULE_functionDeclaration = 9, RULE_methodDeclaration = 10, 
		RULE_arrowMethod = 11, RULE_block = 12, RULE_parameterList = 13, RULE_parameter = 14, 
		RULE_modifier = 15, RULE_classDeclaration = 16, RULE_classMember = 17, 
		RULE_ngOn = 18, RULE_constructorDecleration = 19, RULE_inputDeclaration = 20, 
		RULE_outputDeclaration = 21, RULE_variableDeclaration = 22, RULE_type = 23, 
		RULE_propertyDeclaration = 24, RULE_property = 25, RULE_objectDecleration = 26, 
		RULE_objectName = 27, RULE_objectInit = 28, RULE_objectType = 29, RULE_objectLiteral = 30, 
		RULE_literal = 31, RULE_statement = 32, RULE_expression = 33, RULE_ifStatement = 34, 
		RULE_shortIf = 35, RULE_arrowIf = 36, RULE_forStatement = 37, RULE_whileStatement = 38, 
		RULE_expressionStatement = 39, RULE_returnStatement = 40, RULE_gettingValueLeft = 41, 
		RULE_settingValueRight = 42, RULE_callingMethod = 43, RULE_dataStructure = 44, 
		RULE_itemsStructures = 45, RULE_map = 46, RULE_list = 47, RULE_operator = 48, 
		RULE_compersion = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "componentDeclaration", "selector", "standalone", 
			"imports", "url", "tamplate", "html", "functionDeclaration", "methodDeclaration", 
			"arrowMethod", "block", "parameterList", "parameter", "modifier", "classDeclaration", 
			"classMember", "ngOn", "constructorDecleration", "inputDeclaration", 
			"outputDeclaration", "variableDeclaration", "type", "propertyDeclaration", 
			"property", "objectDecleration", "objectName", "objectInit", "objectType", 
			"objectLiteral", "literal", "statement", "expression", "ifStatement", 
			"shortIf", "arrowIf", "forStatement", "whileStatement", "expressionStatement", 
			"returnStatement", "gettingValueLeft", "settingValueRight", "callingMethod", 
			"dataStructure", "itemsStructures", "map", "list", "operator", "compersion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", null, "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", "'const'", "'let'", "'constructor'", 
			"'var'", "'class'", "'import'", "'imports'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'implements'", "'@Input'", "'@Output'", "'@ViewChild'", 
			"'@Component'", "'ngOnInit'", "'ngOnChanges'", "'selector'", "'standalone'", 
			"'styleUrl'", "'templateUrl'", "'template'", "'public'", "'private'", 
			"'protected'", "'readonly'", "'static'", "'abstract'", "'final'", "'async'", 
			"'='", "'=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", 
			"'=='", "'==='", "'!='", "'!=='", "'>'", "'<'", "'>='", "'<='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "';'", "':'", "'.'", "'?'", 
			null, null, null, null, "'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "FOR", "WHILE", "SWITCH", "CASE", "BREAK", 
			"CONTINUE", "DEFAULT", "DO", "TRY", "CATCH", "FINALLY", "THROW", "FUNCTION", 
			"RETURN", "CONST", "LET", "CONSTRUCTOR", "VAR", "CLASS", "IMPORT", "IMPORTS", 
			"EXPORT", "AS", "FROM", "NEW", "THIS", "IMPLEMENTS", "INPUT", "OUTPUT", 
			"VIEWCHILD", "COMPONENT", "NGONINIT", "NGONCHANGES", "SELECTOR", "STANDALONE", 
			"STYLEURL", "TEMPLATEURL", "TEMPLATE", "PUBLIC", "PRIVATE", "PROTECTED", 
			"READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", "EQUAL", "ARROW", 
			"PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", "OR", "NOT", "EQUAL_TO", 
			"EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "LPAREN", "RPAREN", "LSBRACKET", 
			"RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", "COLON", "DOT", "QUESITIONMARK", 
			"Integer", "Float", "String", "Boolean", "Undefined", "Null", "IDENTIFIER", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "WS", "EXTENDS"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ComponentDeclarationContext> componentDeclaration() {
			return getRuleContexts(ComponentDeclarationContext.class);
		}
		public ComponentDeclarationContext componentDeclaration(int i) {
			return getRuleContext(ComponentDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121519642943538L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(100);
					importStatement();
					}
					break;
				case 2:
					{
					setState(101);
					componentDeclaration();
					}
					break;
				case 3:
					{
					setState(102);
					classDeclaration();
					}
					break;
				case 4:
					{
					setState(103);
					functionDeclaration();
					}
					break;
				case 5:
					{
					setState(104);
					statement();
					}
					break;
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IMPORT);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(113);
				match(IDENTIFIER);
				}
				break;
			case STAR:
				{
				setState(114);
				match(STAR);
				setState(115);
				match(AS);
				setState(116);
				match(IDENTIFIER);
				}
				break;
			case LCURLY:
				{
				setState(117);
				match(LCURLY);
				setState(118);
				match(IDENTIFIER);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					match(IDENTIFIER);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(RCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			match(FROM);
			setState(130);
			match(String);
			setState(131);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<StandaloneContext> standalone() {
			return getRuleContexts(StandaloneContext.class);
		}
		public StandaloneContext standalone(int i) {
			return getRuleContext(StandaloneContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<UrlContext> url() {
			return getRuleContexts(UrlContext.class);
		}
		public UrlContext url(int i) {
			return getRuleContext(UrlContext.class,i);
		}
		public List<TamplateContext> tamplate() {
			return getRuleContexts(TamplateContext.class);
		}
		public TamplateContext tamplate(int i) {
			return getRuleContext(TamplateContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(COMPONENT);
			setState(134);
			match(LPAREN);
			setState(135);
			match(LCURLY);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(136);
				selector();
				}
				break;
			case STANDALONE:
				{
				setState(137);
				standalone();
				}
				break;
			case IMPORTS:
				{
				setState(138);
				imports();
				}
				break;
			case STYLEURL:
			case TEMPLATEURL:
				{
				setState(139);
				url();
				}
				break;
			case TEMPLATE:
				{
				setState(140);
				tamplate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(144);
					selector();
					}
					break;
				case STANDALONE:
					{
					setState(145);
					standalone();
					}
					break;
				case IMPORTS:
					{
					setState(146);
					imports();
					}
					break;
				case STYLEURL:
				case TEMPLATEURL:
					{
					setState(147);
					url();
					}
					break;
				case TEMPLATE:
					{
					setState(148);
					tamplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(RCURLY);
			setState(157);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(SELECTOR);
			setState(160);
			match(COLON);
			setState(161);
			match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STANDALONE);
			setState(164);
			match(COLON);
			setState(165);
			match(Boolean);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IMPORTS);
			setState(168);
			match(COLON);
			setState(169);
			match(LSBRACKET);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(170);
				match(IDENTIFIER);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					match(IDENTIFIER);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
			match(RSBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode STYLEURL() { return getToken(AngularParser.STYLEURL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==STYLEURL || _la==TEMPLATEURL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(COLON);
			setState(184);
			match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TamplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TamplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTamplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTamplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTamplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamplateContext tamplate() throws RecognitionException {
		TamplateContext _localctx = new TamplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tamplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TEMPLATE);
			setState(187);
			match(COLON);
			setState(188);
			html();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FUNCTION);
			setState(193);
			match(IDENTIFIER);
			setState(194);
			parameterList();
			setState(195);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
					{
					setState(197);
					modifier();
					}
				}

				setState(200);
				match(IDENTIFIER);
				setState(201);
				parameterList();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(202);
					match(COLON);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(203);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(208);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				arrowMethod();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ArrowMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowMethodContext arrowMethod() throws RecognitionException {
		ArrowMethodContext _localctx = new ArrowMethodContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrowMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(213);
				modifier();
				}
			}

			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(216);
				match(IDENTIFIER);
				}
			}

			setState(219);
			parameterList();
			setState(220);
			match(ARROW);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(221);
				match(LCURLY);
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					statement();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(230);
				match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LCURLY);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502450425906L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(240);
				returnStatement();
				}
			}

			setState(243);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LPAREN);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(246);
				parameter();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(247);
					match(COMMA);
					setState(248);
					parameter();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(256);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IDENTIFIER);
			setState(259);
			match(COLON);
			setState(260);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public TerminalNode READONLY() { return getToken(AngularParser.READONLY, 0); }
		public TerminalNode STATIC() { return getToken(AngularParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(AngularParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(AngularParser.FINAL, 0); }
		public TerminalNode ASYNC() { return getToken(AngularParser.ASYNC, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(264);
				modifier();
				}
			}

			setState(267);
			match(CLASS);
			setState(268);
			match(IDENTIFIER);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(IDENTIFIER);
				}
			}

			setState(273);
			match(LCURLY);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121611436261376L) != 0) || _la==LPAREN || _la==IDENTIFIER) {
				{
				{
				setState(274);
				classMember();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ConstructorDeclerationContext constructorDecleration() {
			return getRuleContext(ConstructorDeclerationContext.class,0);
		}
		public NgOnContext ngOn() {
			return getRuleContext(NgOnContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classMember);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				inputDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				outputDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				objectDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				constructorDecleration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				ngOn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NGONINIT() { return getToken(AngularParser.NGONINIT, 0); }
		public TerminalNode NGONCHANGES() { return getToken(AngularParser.NGONCHANGES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public NgOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgOn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnContext ngOn() throws RecognitionException {
		NgOnContext _localctx = new NgOnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ngOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==NGONINIT || _la==NGONCHANGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			parameterList();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(294);
				match(COLON);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(295);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(300);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclerationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclerationContext constructorDecleration() throws RecognitionException {
		ConstructorDeclerationContext _localctx = new ConstructorDeclerationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CONSTRUCTOR);
			setState(303);
			parameterList();
			setState(304);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(INPUT);
			setState(307);
			match(LPAREN);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 70931694156251137L) != 0)) {
				{
				setState(308);
				literal();
				}
			}

			setState(311);
			match(RPAREN);
			setState(312);
			property();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclarationContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OutputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDeclarationContext outputDeclaration() throws RecognitionException {
		OutputDeclarationContext _localctx = new OutputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OUTPUT);
			setState(315);
			match(LPAREN);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 70931694156251137L) != 0)) {
				{
				setState(316);
				literal();
				}
			}

			setState(319);
			match(RPAREN);
			setState(320);
			objectDecleration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501896769536L) != 0)) {
				{
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
					{
					setState(322);
					modifier();
					}
				}

				setState(325);
				type();
				}
			}

			setState(328);
			match(IDENTIFIER);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(329);
				match(COLON);
				setState(330);
				expression(0);
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(333);
				match(EQUAL);
				setState(334);
				expression(0);
				}
			}

			setState(337);
			match(AS);
			setState(338);
			match(IDENTIFIER);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(339);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2883584L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(344);
				modifier();
				}
			}

			setState(347);
			property();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(348);
				match(EQUAL);
				setState(349);
				expression(0);
				}
			}

			setState(352);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_property);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(354);
				match(IDENTIFIER);
				setState(355);
				match(COLON);
				setState(356);
				expression(0);
				}
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclerationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ObjectDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclerationContext objectDecleration() throws RecognitionException {
		ObjectDeclerationContext _localctx = new ObjectDeclerationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_objectDecleration);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				property();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				objectName();
				setState(362);
				match(EQUAL);
				setState(363);
				objectInit();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(364);
					match(SEMI);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(IDENTIFIER);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(370);
				objectType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(NEW);
			setState(374);
			match(IDENTIFIER);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(375);
				objectType();
				}
			}

			setState(378);
			match(LPAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502430765056L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(379);
				expression(0);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(380);
					match(COMMA);
					setState(381);
					expression(0);
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(389);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LESS_THAN);
			setState(392);
			match(IDENTIFIER);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET) {
				{
				setState(393);
				list();
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396);
				match(COMMA);
				setState(397);
				match(IDENTIFIER);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSBRACKET) {
					{
					setState(398);
					list();
					}
				}

				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(GREATER_THAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(LCURLY);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS || _la==IDENTIFIER) {
				{
				setState(409);
				property();
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410);
						match(COMMA);
						setState(411);
						property();
						}
						} 
					}
					setState(416);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(419);
				match(COMMA);
				}
			}

			setState(422);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(AngularParser.Integer, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode Float() { return getToken(AngularParser.Float, 0); }
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Boolean() { return getToken(AngularParser.Boolean, 0); }
		public TerminalNode Null() { return getToken(AngularParser.Null, 0); }
		public TerminalNode Undefined() { return getToken(AngularParser.Undefined, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(424);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(427);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(428);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(431);
				match(Float);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(Null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(Undefined);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				match(THIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				objectDecleration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public SettingValueRightContext settingValueRight() {
			return getRuleContext(SettingValueRightContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(448);
				objectLiteral();
				}
				break;
			case 2:
				{
				setState(449);
				arrowMethod();
				}
				break;
			case 3:
				{
				setState(450);
				callingMethod();
				}
				break;
			case 4:
				{
				setState(451);
				settingValueRight();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(455);
						operator();
						setState(456);
						expression(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(458);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(459);
						list();
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<CompersionContext> compersion() {
			return getRuleContexts(CompersionContext.class);
		}
		public CompersionContext compersion(int i) {
			return getRuleContext(CompersionContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(AngularParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(AngularParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public ArrowIfContext arrowIf() {
			return getRuleContext(ArrowIfContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(IF);
				setState(466);
				match(LPAREN);
				setState(467);
				expression(0);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
					{
					setState(468);
					compersion();
					setState(469);
					expression(0);
					}
				}

				setState(473);
				match(RPAREN);
				setState(474);
				block();
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(475);
						match(ELSEIF);
						setState(476);
						match(LPAREN);
						setState(477);
						expression(0);
						setState(481);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
							{
							setState(478);
							compersion();
							setState(479);
							expression(0);
							}
						}

						setState(483);
						match(RPAREN);
						setState(484);
						block();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(491);
					match(ELSE);
					setState(492);
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				arrowIf();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> QUESITIONMARK() { return getTokens(AngularParser.QUESITIONMARK); }
		public TerminalNode QUESITIONMARK(int i) {
			return getToken(AngularParser.QUESITIONMARK, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<CompersionContext> compersion() {
			return getRuleContexts(CompersionContext.class);
		}
		public CompersionContext compersion(int i) {
			return getRuleContext(CompersionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shortIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(499);
				match(LPAREN);
				}
				break;
			}
			setState(502);
			expression(0);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
				{
				setState(503);
				compersion();
				setState(504);
				expression(0);
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(508);
				match(RPAREN);
				}
			}

			setState(511);
			match(QUESITIONMARK);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(512);
				match(LPAREN);
				}
				break;
			}
			setState(515);
			statement();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(516);
				match(RPAREN);
				}
			}

			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					match(COLON);
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						setState(520);
						match(LPAREN);
						}
						break;
					}
					setState(523);
					expression(0);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
						{
						setState(524);
						compersion();
						setState(525);
						expression(0);
						}
					}

					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(529);
						match(RPAREN);
						}
					}

					setState(532);
					match(QUESITIONMARK);
					setState(534);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(533);
						match(LPAREN);
						}
						break;
					}
					setState(536);
					statement();
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(537);
						match(RPAREN);
						}
					}

					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(545);
			match(COLON);
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(546);
				match(LPAREN);
				}
				break;
			}
			setState(549);
			statement();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(550);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public CompersionContext compersion() {
			return getRuleContext(CompersionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ArrowIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowIfContext arrowIf() throws RecognitionException {
		ArrowIfContext _localctx = new ArrowIfContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrowIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(553);
				match(LPAREN);
				}
				break;
			}
			setState(556);
			expression(0);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
				{
				setState(557);
				compersion();
				setState(558);
				expression(0);
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(562);
				match(RPAREN);
				}
			}

			setState(565);
			match(ARROW);
			setState(566);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(FOR);
			setState(569);
			match(LPAREN);
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(570);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(571);
				expression(0);
				}
				break;
			}
			setState(574);
			match(SEMI);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502430765056L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(575);
				expression(0);
				}
			}

			setState(578);
			match(SEMI);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502430765056L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(579);
				expression(0);
				}
			}

			setState(582);
			match(RPAREN);
			setState(583);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(WHILE);
			setState(586);
			match(LPAREN);
			setState(587);
			expression(0);
			setState(588);
			match(RPAREN);
			setState(589);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			expression(0);
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(592);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(RETURN);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502430765056L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(596);
				expression(0);
				}
			}

			setState(599);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GettingValueLeftContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public GettingValueLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gettingValueLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGettingValueLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGettingValueLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGettingValueLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GettingValueLeftContext gettingValueLeft() throws RecognitionException {
		GettingValueLeftContext _localctx = new GettingValueLeftContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_gettingValueLeft);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(THIS);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(602);
					match(DOT);
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(603);
						callingMethod();
						}
						break;
					case 2:
						{
						setState(604);
						match(IDENTIFIER);
						}
						break;
					}
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(IDENTIFIER);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(613);
					match(DOT);
					setState(616);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(614);
						callingMethod();
						}
						break;
					case 2:
						{
						setState(615);
						match(IDENTIFIER);
						}
						break;
					}
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SettingValueRightContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public SettingValueRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingValueRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSettingValueRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSettingValueRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSettingValueRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingValueRightContext settingValueRight() throws RecognitionException {
		SettingValueRightContext _localctx = new SettingValueRightContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_settingValueRight);
		try {
			int _alt;
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(THIS);
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(626);
						match(DOT);
						setState(629);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(627);
							callingMethod();
							}
							break;
						case 2:
							{
							setState(628);
							match(IDENTIFIER);
							}
							break;
						}
						}
						} 
					}
					setState(635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(IDENTIFIER);
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(DOT);
						setState(640);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
						case 1:
							{
							setState(638);
							callingMethod();
							}
							break;
						case 2:
							{
							setState(639);
							match(IDENTIFIER);
							}
							break;
						}
						}
						} 
					}
					setState(646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode CATCH() { return getToken(AngularParser.CATCH, 0); }
		public List<DataStructureContext> dataStructure() {
			return getRuleContexts(DataStructureContext.class);
		}
		public DataStructureContext dataStructure(int i) {
			return getRuleContext(DataStructureContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public CallingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallingMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallingMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallingMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingMethodContext callingMethod() throws RecognitionException {
		CallingMethodContext _localctx = new CallingMethodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callingMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(649);
			_la = _input.LA(1);
			if ( !(_la==CATCH || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(650);
			match(LPAREN);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121502430765056L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131089L) != 0)) {
				{
				setState(651);
				expression(0);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(652);
					match(COMMA);
					setState(653);
					expression(0);
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(661);
			match(RPAREN);
			}
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(669);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(663);
						match(DOT);
						setState(666);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
						case 1:
							{
							setState(664);
							callingMethod();
							}
							break;
						case 2:
							{
							setState(665);
							match(IDENTIFIER);
							}
							break;
						}
						}
						}
						break;
					case LSBRACKET:
					case LCURLY:
						{
						setState(668);
						dataStructure();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureContext dataStructure() throws RecognitionException {
		DataStructureContext _localctx = new DataStructureContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dataStructure);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				list();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsStructuresContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public ItemsStructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsStructures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterItemsStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitItemsStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitItemsStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsStructuresContext itemsStructures() throws RecognitionException {
		ItemsStructuresContext _localctx = new ItemsStructuresContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_itemsStructures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(678);
				literal();
				}
				break;
			case 2:
				{
				setState(679);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(680);
				list();
				}
				break;
			case 4:
				{
				setState(681);
				map();
				}
				break;
			case 5:
				{
				setState(682);
				callingMethod();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LCURLY);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13510799418990592L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 65029L) != 0)) {
				{
				{
				setState(686);
				itemsStructures();
				setState(687);
				match(COLON);
				setState(688);
				itemsStructures();
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						match(COMMA);
						{
						setState(691);
						itemsStructures();
						setState(692);
						match(COLON);
						setState(693);
						itemsStructures();
						}
						}
						} 
					}
					setState(699);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
			}

			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(702);
				match(COMMA);
				}
			}

			setState(705);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(AngularParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(AngularParser.RSBRACKET, 0); }
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(LSBRACKET);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13510799418990592L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 65029L) != 0)) {
				{
				setState(708);
				itemsStructures();
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(709);
						match(COMMA);
						setState(710);
						itemsStructures();
						}
						} 
					}
					setState(715);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
			}

			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(718);
				match(COMMA);
				}
			}

			setState(721);
			match(RSBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_operator);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				match(STAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(727);
				match(DIVIDE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(728);
				match(PLUS);
				setState(729);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(730);
				match(MINUS);
				setState(731);
				match(EQUAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompersionContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(AngularParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(AngularParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_TO() { return getToken(AngularParser.EQUAL_TO, 0); }
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public TerminalNode EQUAL_TO3() { return getToken(AngularParser.EQUAL_TO3, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(AngularParser.NOT_EQUAL2, 0); }
		public CompersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompersionContext compersion() throws RecognitionException {
		CompersionContext _localctx = new CompersionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Y\u02e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000j\b"+
		"\u0000\n\u0000\f\u0000m\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0001"+
		"\u0001\u0003\u0001\u0080\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008e\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0096"+
		"\b\u0002\u0005\u0002\u0098\b\u0002\n\u0002\f\u0002\u009b\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ae"+
		"\b\u0005\n\u0005\f\u0005\u00b1\t\u0005\u0003\u0005\u00b3\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00c7\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00cd\b\n\u0003\n\u00cf\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00d4\b\n\u0001\u000b\u0003\u000b\u00d7\b\u000b\u0001\u000b\u0003"+
		"\u000b\u00da\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00df"+
		"\b\u000b\u0001\u000b\u0005\u000b\u00e2\b\u000b\n\u000b\f\u000b\u00e5\t"+
		"\u000b\u0001\u000b\u0003\u000b\u00e8\b\u000b\u0001\f\u0001\f\u0005\f\u00ec"+
		"\b\f\n\f\f\f\u00ef\t\f\u0001\f\u0003\f\u00f2\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00fa\b\r\n\r\f\r\u00fd\t\r\u0003\r"+
		"\u00ff\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u010a\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0110\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0114\b\u0010\n\u0010\f\u0010\u0117\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0123\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0129\b\u0012\u0003"+
		"\u0012\u012b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0136"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u013e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0003\u0016\u0144\b\u0016\u0001\u0016\u0003\u0016\u0147\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u014c\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0150\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0155\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018"+
		"\u015a\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015f\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0167\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u016e\b\u001a\u0003\u001a\u0170\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0174\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0179\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u017f\b\u001c\n\u001c\f\u001c\u0182\t\u001c\u0003"+
		"\u001c\u0184\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u018b\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0190\b\u001d\u0005\u001d\u0192\b\u001d\n\u001d\f\u001d\u0195\t"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u019d\b\u001e\n\u001e\f\u001e\u01a0\t\u001e\u0003\u001e"+
		"\u01a2\b\u001e\u0001\u001e\u0003\u001e\u01a5\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0003\u001f\u01aa\b\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01ae\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01b6\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01be\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01c5\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01cd\b!\n"+
		"!\f!\u01d0\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u01d8\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01e2\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u01e7\b\"\n\"\f\""+
		"\u01ea\t\"\u0001\"\u0001\"\u0003\"\u01ee\b\"\u0001\"\u0001\"\u0003\"\u01f2"+
		"\b\"\u0001#\u0003#\u01f5\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u01fb\b"+
		"#\u0001#\u0003#\u01fe\b#\u0001#\u0001#\u0003#\u0202\b#\u0001#\u0001#\u0003"+
		"#\u0206\b#\u0001#\u0001#\u0003#\u020a\b#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0210\b#\u0001#\u0003#\u0213\b#\u0001#\u0001#\u0003#\u0217\b#\u0001"+
		"#\u0001#\u0003#\u021b\b#\u0005#\u021d\b#\n#\f#\u0220\t#\u0001#\u0001#"+
		"\u0003#\u0224\b#\u0001#\u0001#\u0003#\u0228\b#\u0001$\u0003$\u022b\b$"+
		"\u0001$\u0001$\u0001$\u0001$\u0003$\u0231\b$\u0001$\u0003$\u0234\b$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003%\u023d\b%\u0001%\u0001"+
		"%\u0003%\u0241\b%\u0001%\u0001%\u0003%\u0245\b%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u0252\b\'"+
		"\u0001(\u0001(\u0003(\u0256\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u025e\b)\u0005)\u0260\b)\n)\f)\u0263\t)\u0001)\u0001)\u0001)"+
		"\u0001)\u0003)\u0269\b)\u0005)\u026b\b)\n)\f)\u026e\t)\u0003)\u0270\b"+
		")\u0001*\u0001*\u0001*\u0001*\u0003*\u0276\b*\u0005*\u0278\b*\n*\f*\u027b"+
		"\t*\u0001*\u0001*\u0001*\u0001*\u0003*\u0281\b*\u0005*\u0283\b*\n*\f*"+
		"\u0286\t*\u0003*\u0288\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u028f"+
		"\b+\n+\f+\u0292\t+\u0003+\u0294\b+\u0001+\u0001+\u0001+\u0001+\u0001+"+
		"\u0003+\u029b\b+\u0001+\u0005+\u029e\b+\n+\f+\u02a1\t+\u0001,\u0001,\u0003"+
		",\u02a5\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02ac\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u02b8"+
		"\b.\n.\f.\u02bb\t.\u0003.\u02bd\b.\u0001.\u0003.\u02c0\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0005/\u02c8\b/\n/\f/\u02cb\t/\u0003/\u02cd"+
		"\b/\u0001/\u0003/\u02d0\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u02dd\b0\u00011\u00011\u00011\u0000"+
		"\u0001B2\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`b\u0000\b\u0001\u0000"+
		"\'(\u0002\u0000\u0019\u0019*1\u0002\u0000\u001e\u001eYY\u0001\u0000#$"+
		"\u0002\u0000\u0012\u0013\u0015\u0015\u0001\u000045\u0002\u0000\r\rUU\u0002"+
		"\u00009:<C\u033e\u0000k\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000"+
		"\u0000\u0004\u0085\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000\u0000"+
		"\u0000\b\u00a3\u0001\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000"+
		"\f\u00b6\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000\u0000\u0000\u0010"+
		"\u00be\u0001\u0000\u0000\u0000\u0012\u00c0\u0001\u0000\u0000\u0000\u0014"+
		"\u00d3\u0001\u0000\u0000\u0000\u0016\u00d6\u0001\u0000\u0000\u0000\u0018"+
		"\u00e9\u0001\u0000\u0000\u0000\u001a\u00f5\u0001\u0000\u0000\u0000\u001c"+
		"\u0102\u0001\u0000\u0000\u0000\u001e\u0106\u0001\u0000\u0000\u0000 \u0109"+
		"\u0001\u0000\u0000\u0000\"\u0122\u0001\u0000\u0000\u0000$\u0124\u0001"+
		"\u0000\u0000\u0000&\u012e\u0001\u0000\u0000\u0000(\u0132\u0001\u0000\u0000"+
		"\u0000*\u013a\u0001\u0000\u0000\u0000,\u0146\u0001\u0000\u0000\u0000."+
		"\u0156\u0001\u0000\u0000\u00000\u0159\u0001\u0000\u0000\u00002\u0166\u0001"+
		"\u0000\u0000\u00004\u016f\u0001\u0000\u0000\u00006\u0171\u0001\u0000\u0000"+
		"\u00008\u0175\u0001\u0000\u0000\u0000:\u0187\u0001\u0000\u0000\u0000<"+
		"\u0198\u0001\u0000\u0000\u0000>\u01b5\u0001\u0000\u0000\u0000@\u01bd\u0001"+
		"\u0000\u0000\u0000B\u01c4\u0001\u0000\u0000\u0000D\u01f1\u0001\u0000\u0000"+
		"\u0000F\u01f4\u0001\u0000\u0000\u0000H\u022a\u0001\u0000\u0000\u0000J"+
		"\u0238\u0001\u0000\u0000\u0000L\u0249\u0001\u0000\u0000\u0000N\u024f\u0001"+
		"\u0000\u0000\u0000P\u0253\u0001\u0000\u0000\u0000R\u026f\u0001\u0000\u0000"+
		"\u0000T\u0287\u0001\u0000\u0000\u0000V\u0289\u0001\u0000\u0000\u0000X"+
		"\u02a4\u0001\u0000\u0000\u0000Z\u02ab\u0001\u0000\u0000\u0000\\\u02ad"+
		"\u0001\u0000\u0000\u0000^\u02c3\u0001\u0000\u0000\u0000`\u02dc\u0001\u0000"+
		"\u0000\u0000b\u02de\u0001\u0000\u0000\u0000dj\u0003\u0002\u0001\u0000"+
		"ej\u0003\u0004\u0002\u0000fj\u0003 \u0010\u0000gj\u0003\u0012\t\u0000"+
		"hj\u0003@ \u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000i"+
		"f\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"\u0000\u0000\u0001o\u0001\u0001\u0000\u0000\u0000p\u007f\u0005\u0017\u0000"+
		"\u0000q\u0080\u0005U\u0000\u0000rs\u00056\u0000\u0000st\u0005\u001a\u0000"+
		"\u0000t\u0080\u0005U\u0000\u0000uv\u0005H\u0000\u0000v{\u0005U\u0000\u0000"+
		"wx\u0005J\u0000\u0000xz\u0005U\u0000\u0000yw\u0001\u0000\u0000\u0000z"+
		"}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0005"+
		"I\u0000\u0000\u007fq\u0001\u0000\u0000\u0000\u007fr\u0001\u0000\u0000"+
		"\u0000\u007fu\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u001b\u0000\u0000\u0082\u0083\u0005Q\u0000\u0000\u0083"+
		"\u0084\u0005K\u0000\u0000\u0084\u0003\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\"\u0000\u0000\u0086\u0087\u0005D\u0000\u0000\u0087\u008d\u0005"+
		"H\u0000\u0000\u0088\u008e\u0003\u0006\u0003\u0000\u0089\u008e\u0003\b"+
		"\u0004\u0000\u008a\u008e\u0003\n\u0005\u0000\u008b\u008e\u0003\f\u0006"+
		"\u0000\u008c\u008e\u0003\u000e\u0007\u0000\u008d\u0088\u0001\u0000\u0000"+
		"\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0099\u0001\u0000\u0000\u0000\u008f\u0095\u0005J\u0000\u0000"+
		"\u0090\u0096\u0003\u0006\u0003\u0000\u0091\u0096\u0003\b\u0004\u0000\u0092"+
		"\u0096\u0003\n\u0005\u0000\u0093\u0096\u0003\f\u0006\u0000\u0094\u0096"+
		"\u0003\u000e\u0007\u0000\u0095\u0090\u0001\u0000\u0000\u0000\u0095\u0091"+
		"\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005I\u0000\u0000\u009d\u009e\u0005"+
		"E\u0000\u0000\u009e\u0005\u0001\u0000\u0000\u0000\u009f\u00a0\u0005%\u0000"+
		"\u0000\u00a0\u00a1\u0005L\u0000\u0000\u00a1\u00a2\u0005Q\u0000\u0000\u00a2"+
		"\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005&\u0000\u0000\u00a4\u00a5"+
		"\u0005L\u0000\u0000\u00a5\u00a6\u0005R\u0000\u0000\u00a6\t\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000\u0000\u00a8\u00a9\u0005L\u0000"+
		"\u0000\u00a9\u00b2\u0005F\u0000\u0000\u00aa\u00af\u0005U\u0000\u0000\u00ab"+
		"\u00ac\u0005J\u0000\u0000\u00ac\u00ae\u0005U\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005G\u0000\u0000\u00b5\u000b\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0007\u0000\u0000\u0000\u00b7\u00b8\u0005L\u0000"+
		"\u0000\u00b8\u00b9\u0005Q\u0000\u0000\u00b9\r\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005)\u0000\u0000\u00bb\u00bc\u0005L\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0010\b\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0010\u0000\u0000\u00c1\u00c2\u0005U\u0000\u0000\u00c2\u00c3\u0003\u001a"+
		"\r\u0000\u00c3\u00c4\u0003\u0018\f\u0000\u00c4\u0013\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0003\u001e\u000f\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005U\u0000\u0000\u00c9\u00ce\u0003\u001a\r\u0000"+
		"\u00ca\u00cc\u0005L\u0000\u0000\u00cb\u00cd\u0005U\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf"+
		"\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0003\u0018\f\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003"+
		"\u0016\u000b\u0000\u00d3\u00c6\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003"+
		"\u001e\u000f\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00da\u0005"+
		"U\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u001a"+
		"\r\u0000\u00dc\u00de\u00053\u0000\u0000\u00dd\u00df\u0005H\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e3\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003@ \u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0005I\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u0017\u0001\u0000\u0000\u0000\u00e9\u00ed\u0005"+
		"H\u0000\u0000\u00ea\u00ec\u0003@ \u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003P(\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005I\u0000\u0000\u00f4\u0019"+
		"\u0001\u0000\u0000\u0000\u00f5\u00fe\u0005D\u0000\u0000\u00f6\u00fb\u0003"+
		"\u001c\u000e\u0000\u00f7\u00f8\u0005J\u0000\u0000\u00f8\u00fa\u0003\u001c"+
		"\u000e\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005E\u0000"+
		"\u0000\u0101\u001b\u0001\u0000\u0000\u0000\u0102\u0103\u0005U\u0000\u0000"+
		"\u0103\u0104\u0005L\u0000\u0000\u0104\u0105\u0005U\u0000\u0000\u0105\u001d"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0007\u0001\u0000\u0000\u0107\u001f"+
		"\u0001\u0000\u0000\u0000\u0108\u010a\u0003\u001e\u000f\u0000\u0109\u0108"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0016\u0000\u0000\u010c\u010f"+
		"\u0005U\u0000\u0000\u010d\u010e\u0007\u0002\u0000\u0000\u010e\u0110\u0005"+
		"U\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0115\u0005H\u0000"+
		"\u0000\u0112\u0114\u0003\"\u0011\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005I\u0000\u0000\u0119"+
		"!\u0001\u0000\u0000\u0000\u011a\u0123\u0003(\u0014\u0000\u011b\u0123\u0003"+
		"*\u0015\u0000\u011c\u0123\u0003\u0014\n\u0000\u011d\u0123\u00030\u0018"+
		"\u0000\u011e\u0123\u0003,\u0016\u0000\u011f\u0123\u00034\u001a\u0000\u0120"+
		"\u0123\u0003&\u0013\u0000\u0121\u0123\u0003$\u0012\u0000\u0122\u011a\u0001"+
		"\u0000\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000\u0122\u011e\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123#\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0007\u0003\u0000\u0000\u0125\u012a\u0003\u001a"+
		"\r\u0000\u0126\u0128\u0005L\u0000\u0000\u0127\u0129\u0005U\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0003\u0018\f\u0000\u012d%\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005\u0014\u0000\u0000\u012f\u0130\u0003\u001a\r\u0000\u0130\u0131"+
		"\u0003\u0018\f\u0000\u0131\'\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"\u001f\u0000\u0000\u0133\u0135\u0005D\u0000\u0000\u0134\u0136\u0003>\u001f"+
		"\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0005E\u0000\u0000"+
		"\u0138\u0139\u00032\u0019\u0000\u0139)\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005 \u0000\u0000\u013b\u013d\u0005D\u0000\u0000\u013c\u013e\u0003>"+
		"\u001f\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005E\u0000"+
		"\u0000\u0140\u0141\u00034\u001a\u0000\u0141+\u0001\u0000\u0000\u0000\u0142"+
		"\u0144\u0003\u001e\u000f\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0003.\u0017\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014b"+
		"\u0005U\u0000\u0000\u0149\u014a\u0005L\u0000\u0000\u014a\u014c\u0003B"+
		"!\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014e\u00052\u0000\u0000"+
		"\u014e\u0150\u0003B!\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005\u001a\u0000\u0000\u0152\u0154\u0005U\u0000\u0000\u0153\u0155\u0005"+
		"K\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155-\u0001\u0000\u0000\u0000\u0156\u0157\u0007\u0004\u0000"+
		"\u0000\u0157/\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u001e\u000f\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015e\u00032\u0019\u0000\u015c"+
		"\u015d\u00052\u0000\u0000\u015d\u015f\u0003B!\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0005K\u0000\u0000\u01611\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005U\u0000\u0000\u0163\u0164\u0005L\u0000\u0000\u0164"+
		"\u0167\u0003B!\u0000\u0165\u0167\u0003\n\u0005\u0000\u0166\u0162\u0001"+
		"\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u01673\u0001\u0000"+
		"\u0000\u0000\u0168\u0170\u00032\u0019\u0000\u0169\u016a\u00036\u001b\u0000"+
		"\u016a\u016b\u00052\u0000\u0000\u016b\u016d\u00038\u001c\u0000\u016c\u016e"+
		"\u0005K\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u0168\u0001"+
		"\u0000\u0000\u0000\u016f\u0169\u0001\u0000\u0000\u0000\u01705\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u0005U\u0000\u0000\u0172\u0174\u0003:\u001d\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u01747\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u001c\u0000\u0000\u0176"+
		"\u0178\u0005U\u0000\u0000\u0177\u0179\u0003:\u001d\u0000\u0178\u0177\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u0183\u0005D\u0000\u0000\u017b\u0180\u0003B!"+
		"\u0000\u017c\u017d\u0005J\u0000\u0000\u017d\u017f\u0003B!\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
		"\u017b\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005E\u0000\u0000\u01869\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005A\u0000\u0000\u0188\u018a\u0005U\u0000"+
		"\u0000\u0189\u018b\u0003^/\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u0193\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0005J\u0000\u0000\u018d\u018f\u0005U\u0000\u0000\u018e\u0190\u0003"+
		"^/\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000"+
		"\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0197\u0005@\u0000\u0000"+
		"\u0197;\u0001\u0000\u0000\u0000\u0198\u01a1\u0005H\u0000\u0000\u0199\u019e"+
		"\u00032\u0019\u0000\u019a\u019b\u0005J\u0000\u0000\u019b\u019d\u00032"+
		"\u0019\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000"+
		"\u0000\u0000\u01a1\u0199\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a5\u0005J\u0000"+
		"\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005I\u0000\u0000"+
		"\u01a7=\u0001\u0000\u0000\u0000\u01a8\u01aa\u0007\u0005\u0000\u0000\u01a9"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01b6\u0005O\u0000\u0000\u01ac\u01ae"+
		"\u0007\u0005\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b6"+
		"\u0005P\u0000\u0000\u01b0\u01b6\u0005Q\u0000\u0000\u01b1\u01b6\u0005R"+
		"\u0000\u0000\u01b2\u01b6\u0005T\u0000\u0000\u01b3\u01b6\u0005S\u0000\u0000"+
		"\u01b4\u01b6\u0005\u001d\u0000\u0000\u01b5\u01a9\u0001\u0000\u0000\u0000"+
		"\u01b5\u01ad\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6?\u0001\u0000\u0000\u0000\u01b7\u01be\u0003,\u0016\u0000\u01b8\u01be"+
		"\u00034\u001a\u0000\u01b9\u01be\u0003D\"\u0000\u01ba\u01be\u0003J%\u0000"+
		"\u01bb\u01be\u0003L&\u0000\u01bc\u01be\u0003N\'\u0000\u01bd\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bd\u01b8\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01beA\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0006!\uffff\uffff\u0000\u01c0\u01c5\u0003<\u001e"+
		"\u0000\u01c1\u01c5\u0003\u0016\u000b\u0000\u01c2\u01c5\u0003V+\u0000\u01c3"+
		"\u01c5\u0003T*\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000\u01c4\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01ce\u0001\u0000\u0000\u0000\u01c6\u01c7\n\u0001"+
		"\u0000\u0000\u01c7\u01c8\u0003`0\u0000\u01c8\u01c9\u0003B!\u0002\u01c9"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ca\u01cb\n\u0006\u0000\u0000\u01cb\u01cd"+
		"\u0003^/\u0000\u01cc\u01c6\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfC\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0001\u0000"+
		"\u0000\u01d2\u01d3\u0005D\u0000\u0000\u01d3\u01d7\u0003B!\u0000\u01d4"+
		"\u01d5\u0003b1\u0000\u01d5\u01d6\u0003B!\u0000\u01d6\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005E\u0000"+
		"\u0000\u01da\u01e8\u0003\u0018\f\u0000\u01db\u01dc\u0005\u0002\u0000\u0000"+
		"\u01dc\u01dd\u0005D\u0000\u0000\u01dd\u01e1\u0003B!\u0000\u01de\u01df"+
		"\u0003b1\u0000\u01df\u01e0\u0003B!\u0000\u01e0\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005E\u0000\u0000"+
		"\u01e4\u01e5\u0003\u0018\f\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6"+
		"\u01db\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0003\u0000\u0000\u01ec\u01ee\u0003\u0018\f\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f2"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0003F#\u0000\u01f0\u01f2\u0003H"+
		"$\u0000\u01f1\u01d1\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2E\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f5\u0005D\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01fa\u0003B!\u0000\u01f7\u01f8\u0003b1\u0000\u01f8\u01f9\u0003B!\u0000"+
		"\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fe\u0005E\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0201\u0005N\u0000\u0000\u0200\u0202\u0005D\u0000\u0000\u0201\u0200\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0003@ \u0000\u0204\u0206\u0005E\u0000"+
		"\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u021e\u0001\u0000\u0000\u0000\u0207\u0209\u0005L\u0000\u0000"+
		"\u0208\u020a\u0005D\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b"+
		"\u020f\u0003B!\u0000\u020c\u020d\u0003b1\u0000\u020d\u020e\u0003B!\u0000"+
		"\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020c\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000"+
		"\u0211\u0213\u0005E\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0216\u0005N\u0000\u0000\u0215\u0217\u0005D\u0000\u0000\u0216\u0215\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0003@ \u0000\u0219\u021b\u0005E\u0000"+
		"\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c\u0207\u0001\u0000\u0000"+
		"\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0223\u0005L\u0000\u0000"+
		"\u0222\u0224\u0005D\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225"+
		"\u0227\u0003@ \u0000\u0226\u0228\u0005E\u0000\u0000\u0227\u0226\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228G\u0001\u0000"+
		"\u0000\u0000\u0229\u022b\u0005D\u0000\u0000\u022a\u0229\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u0230\u0003B!\u0000\u022d\u022e\u0003b1\u0000\u022e\u022f"+
		"\u0003B!\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0233\u0001\u0000"+
		"\u0000\u0000\u0232\u0234\u0005E\u0000\u0000\u0233\u0232\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u00053\u0000\u0000\u0236\u0237\u0003B!\u0000\u0237"+
		"I\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0004\u0000\u0000\u0239\u023c"+
		"\u0005D\u0000\u0000\u023a\u023d\u0003,\u0016\u0000\u023b\u023d\u0003B"+
		"!\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0005K\u0000\u0000\u023f\u0241\u0003B!\u0000\u0240"+
		"\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0005K\u0000\u0000\u0243\u0245"+
		"\u0003B!\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0005E\u0000"+
		"\u0000\u0247\u0248\u0003\u0018\f\u0000\u0248K\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0005\u0005\u0000\u0000\u024a\u024b\u0005D\u0000\u0000\u024b"+
		"\u024c\u0003B!\u0000\u024c\u024d\u0005E\u0000\u0000\u024d\u024e\u0003"+
		"\u0018\f\u0000\u024eM\u0001\u0000\u0000\u0000\u024f\u0251\u0003B!\u0000"+
		"\u0250\u0252\u0005K\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0001\u0000\u0000\u0000\u0252O\u0001\u0000\u0000\u0000\u0253\u0255"+
		"\u0005\u0011\u0000\u0000\u0254\u0256\u0003B!\u0000\u0255\u0254\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0005K\u0000\u0000\u0258Q\u0001\u0000\u0000\u0000"+
		"\u0259\u0261\u0005\u001d\u0000\u0000\u025a\u025d\u0005M\u0000\u0000\u025b"+
		"\u025e\u0003V+\u0000\u025c\u025e\u0005U\u0000\u0000\u025d\u025b\u0001"+
		"\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025e\u0260\u0001"+
		"\u0000\u0000\u0000\u025f\u025a\u0001\u0000\u0000\u0000\u0260\u0263\u0001"+
		"\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001"+
		"\u0000\u0000\u0000\u0262\u0270\u0001\u0000\u0000\u0000\u0263\u0261\u0001"+
		"\u0000\u0000\u0000\u0264\u026c\u0005U\u0000\u0000\u0265\u0268\u0005M\u0000"+
		"\u0000\u0266\u0269\u0003V+\u0000\u0267\u0269\u0005U\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u026b\u0001\u0000\u0000\u0000\u026a\u0265\u0001\u0000\u0000\u0000\u026b"+
		"\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0001\u0000\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e"+
		"\u026c\u0001\u0000\u0000\u0000\u026f\u0259\u0001\u0000\u0000\u0000\u026f"+
		"\u0264\u0001\u0000\u0000\u0000\u0270S\u0001\u0000\u0000\u0000\u0271\u0279"+
		"\u0005\u001d\u0000\u0000\u0272\u0275\u0005M\u0000\u0000\u0273\u0276\u0003"+
		"V+\u0000\u0274\u0276\u0005U\u0000\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276\u0278\u0001\u0000\u0000"+
		"\u0000\u0277\u0272\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000"+
		"\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a\u0288\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000"+
		"\u0000\u027c\u0284\u0005U\u0000\u0000\u027d\u0280\u0005M\u0000\u0000\u027e"+
		"\u0281\u0003V+\u0000\u027f\u0281\u0005U\u0000\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281\u0283\u0001"+
		"\u0000\u0000\u0000\u0282\u027d\u0001\u0000\u0000\u0000\u0283\u0286\u0001"+
		"\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0287\u0271\u0001\u0000\u0000\u0000\u0287\u027c\u0001"+
		"\u0000\u0000\u0000\u0288U\u0001\u0000\u0000\u0000\u0289\u028a\u0007\u0006"+
		"\u0000\u0000\u028a\u0293\u0005D\u0000\u0000\u028b\u0290\u0003B!\u0000"+
		"\u028c\u028d\u0005J\u0000\u0000\u028d\u028f\u0003B!\u0000\u028e\u028c"+
		"\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0294"+
		"\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u028b"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0001\u0000\u0000\u0000\u0295\u0296\u0005E\u0000\u0000\u0296\u029f\u0001"+
		"\u0000\u0000\u0000\u0297\u029a\u0005M\u0000\u0000\u0298\u029b\u0003V+"+
		"\u0000\u0299\u029b\u0005U\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029a\u0299\u0001\u0000\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000"+
		"\u029c\u029e\u0003X,\u0000\u029d\u0297\u0001\u0000\u0000\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0W\u0001"+
		"\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a5\u0003"+
		"^/\u0000\u02a3\u02a5\u0003\\.\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5Y\u0001\u0000\u0000\u0000\u02a6"+
		"\u02ac\u0003>\u001f\u0000\u02a7\u02ac\u0005U\u0000\u0000\u02a8\u02ac\u0003"+
		"^/\u0000\u02a9\u02ac\u0003\\.\u0000\u02aa\u02ac\u0003V+\u0000\u02ab\u02a6"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000\u0000\u0000\u02ab\u02a8"+
		"\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac[\u0001\u0000\u0000\u0000\u02ad\u02bc\u0005"+
		"H\u0000\u0000\u02ae\u02af\u0003Z-\u0000\u02af\u02b0\u0005L\u0000\u0000"+
		"\u02b0\u02b1\u0003Z-\u0000\u02b1\u02b9\u0001\u0000\u0000\u0000\u02b2\u02b3"+
		"\u0005J\u0000\u0000\u02b3\u02b4\u0003Z-\u0000\u02b4\u02b5\u0005L\u0000"+
		"\u0000\u02b5\u02b6\u0003Z-\u0000\u02b6\u02b8\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ae\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bf\u0001\u0000\u0000\u0000\u02be\u02c0\u0005J\u0000\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005I\u0000\u0000\u02c2]\u0001\u0000"+
		"\u0000\u0000\u02c3\u02cc\u0005F\u0000\u0000\u02c4\u02c9\u0003Z-\u0000"+
		"\u02c5\u02c6\u0005J\u0000\u0000\u02c6\u02c8\u0003Z-\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001\u0000\u0000\u0000\u02c9\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cd"+
		"\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cc\u02c4"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02cf"+
		"\u0001\u0000\u0000\u0000\u02ce\u02d0\u0005J\u0000\u0000\u02cf\u02ce\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0005G\u0000\u0000\u02d2_\u0001\u0000\u0000"+
		"\u0000\u02d3\u02dd\u00052\u0000\u0000\u02d4\u02dd\u00054\u0000\u0000\u02d5"+
		"\u02dd\u00055\u0000\u0000\u02d6\u02dd\u00056\u0000\u0000\u02d7\u02dd\u0005"+
		"7\u0000\u0000\u02d8\u02d9\u00054\u0000\u0000\u02d9\u02dd\u00052\u0000"+
		"\u0000\u02da\u02db\u00055\u0000\u0000\u02db\u02dd\u00052\u0000\u0000\u02dc"+
		"\u02d3\u0001\u0000\u0000\u0000\u02dc\u02d4\u0001\u0000\u0000\u0000\u02dc"+
		"\u02d5\u0001\u0000\u0000\u0000\u02dc\u02d6\u0001\u0000\u0000\u0000\u02dc"+
		"\u02d7\u0001\u0000\u0000\u0000\u02dc\u02d8\u0001\u0000\u0000\u0000\u02dc"+
		"\u02da\u0001\u0000\u0000\u0000\u02dda\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0007\u0007\u0000\u0000\u02dfc\u0001\u0000\u0000\u0000kik{\u007f\u008d"+
		"\u0095\u0099\u00af\u00b2\u00c6\u00cc\u00ce\u00d3\u00d6\u00d9\u00de\u00e3"+
		"\u00e7\u00ed\u00f1\u00fb\u00fe\u0109\u010f\u0115\u0122\u0128\u012a\u0135"+
		"\u013d\u0143\u0146\u014b\u014f\u0154\u0159\u015e\u0166\u016d\u016f\u0173"+
		"\u0178\u0180\u0183\u018a\u018f\u0193\u019e\u01a1\u01a4\u01a9\u01ad\u01b5"+
		"\u01bd\u01c4\u01cc\u01ce\u01d7\u01e1\u01e8\u01ed\u01f1\u01f4\u01fa\u01fd"+
		"\u0201\u0205\u0209\u020f\u0212\u0216\u021a\u021e\u0223\u0227\u022a\u0230"+
		"\u0233\u023c\u0240\u0244\u0251\u0255\u025d\u0261\u0268\u026c\u026f\u0275"+
		"\u0279\u0280\u0284\u0287\u0290\u0293\u029a\u029d\u029f\u02a4\u02ab\u02b9"+
		"\u02bc\u02bf\u02c9\u02cc\u02cf\u02dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}