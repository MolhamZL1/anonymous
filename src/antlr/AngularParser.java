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
		RULE_program = 0, RULE_importStatement = 1, RULE_importSpecifier = 2, 
		RULE_componentDeclaration = 3, RULE_selector = 4, RULE_standalone = 5, 
		RULE_imports = 6, RULE_url = 7, RULE_tamplate = 8, RULE_html = 9, RULE_functionDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_arrowMethod = 12, RULE_block = 13, RULE_parameterList = 14, 
		RULE_parameter = 15, RULE_modifier = 16, RULE_classDeclaration = 17, RULE_classMember = 18, 
		RULE_ngOn = 19, RULE_constructorDecleration = 20, RULE_inputDeclaration = 21, 
		RULE_outputDeclaration = 22, RULE_variableDeclaration = 23, RULE_type = 24, 
		RULE_propertyDeclaration = 25, RULE_property = 26, RULE_objectDecleration = 27, 
		RULE_objectName = 28, RULE_objectInit = 29, RULE_objectType = 30, RULE_objectLiteral = 31, 
		RULE_literal = 32, RULE_statement = 33, RULE_expression = 34, RULE_ifStatement = 35, 
		RULE_shortIf = 36, RULE_arrowIf = 37, RULE_forStatement = 38, RULE_whileStatement = 39, 
		RULE_expressionStatement = 40, RULE_returnStatement = 41, RULE_callingMethod = 42, 
		RULE_dataStructure = 43, RULE_itemsStructures = 44, RULE_map = 45, RULE_list = 46, 
		RULE_operator = 47, RULE_compersion = 48, RULE_eos = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importSpecifier", "componentDeclaration", 
			"selector", "standalone", "imports", "url", "tamplate", "html", "functionDeclaration", 
			"methodDeclaration", "arrowMethod", "block", "parameterList", "parameter", 
			"modifier", "classDeclaration", "classMember", "ngOn", "constructorDecleration", 
			"inputDeclaration", "outputDeclaration", "variableDeclaration", "type", 
			"propertyDeclaration", "property", "objectDecleration", "objectName", 
			"objectInit", "objectType", "objectLiteral", "literal", "statement", 
			"expression", "ifStatement", "shortIf", "arrowIf", "forStatement", "whileStatement", 
			"expressionStatement", "returnStatement", "callingMethod", "dataStructure", 
			"itemsStructures", "map", "list", "operator", "compersion", "eos"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632318525055026L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
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
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 2147745793L) != 0)) {
				{
				setState(118);
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
					importSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120);
				match(FROM);
				}
			}

			setState(123);
			match(String);
			setState(124);
			eos();
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LCURLY);
			setState(127);
			match(IDENTIFIER);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				match(IDENTIFIER);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
		enterRule(_localctx, 6, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(COMPONENT);
			setState(138);
			match(LPAREN);
			setState(139);
			match(LCURLY);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(140);
				selector();
				}
				break;
			case STANDALONE:
				{
				setState(141);
				standalone();
				}
				break;
			case IMPORTS:
				{
				setState(142);
				imports();
				}
				break;
			case STYLEURL:
			case TEMPLATEURL:
				{
				setState(143);
				url();
				}
				break;
			case TEMPLATE:
				{
				setState(144);
				tamplate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(148);
					selector();
					}
					break;
				case STANDALONE:
					{
					setState(149);
					standalone();
					}
					break;
				case IMPORTS:
					{
					setState(150);
					imports();
					}
					break;
				case STYLEURL:
				case TEMPLATEURL:
					{
					setState(151);
					url();
					}
					break;
				case TEMPLATE:
					{
					setState(152);
					tamplate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RCURLY);
			setState(161);
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
		enterRule(_localctx, 8, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(SELECTOR);
			setState(164);
			match(COLON);
			setState(165);
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
		enterRule(_localctx, 10, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(STANDALONE);
			setState(168);
			match(COLON);
			setState(169);
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
		enterRule(_localctx, 12, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IMPORTS);
			setState(172);
			match(COLON);
			setState(173);
			match(LSBRACKET);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(174);
				match(IDENTIFIER);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175);
					match(COMMA);
					setState(176);
					match(IDENTIFIER);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
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
		enterRule(_localctx, 14, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==STYLEURL || _la==TEMPLATEURL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			match(COLON);
			setState(188);
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
		enterRule(_localctx, 16, RULE_tamplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(TEMPLATE);
			setState(191);
			match(COLON);
			setState(192);
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
		enterRule(_localctx, 18, RULE_html);
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
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
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
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(196);
					match(FUNCTION);
					}
				}

				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(199);
					match(IDENTIFIER);
					}
				}

				setState(202);
				parameterList();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(203);
					match(COLON);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(204);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(209);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
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
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
					{
					setState(214);
					modifier();
					}
				}

				setState(217);
				match(IDENTIFIER);
				setState(218);
				parameterList();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(219);
					match(COLON);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(220);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(225);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
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
		enterRule(_localctx, 24, RULE_arrowMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(230);
				modifier();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(233);
				match(IDENTIFIER);
				}
			}

			setState(236);
			parameterList();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(237);
				match(COLON);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(238);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(243);
			match(ARROW);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(244);
				match(LCURLY);
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					statement();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(253);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(LCURLY);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301332537394L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				{
				setState(257);
				statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(263);
				returnStatement();
				}
			}

			setState(266);
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
		enterRule(_localctx, 28, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(LPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(269);
				parameter();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					parameter();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(279);
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
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(281);
				match(IDENTIFIER);
				setState(282);
				match(COLON);
				setState(283);
				match(IDENTIFIER);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(284);
					match(EQUAL);
					setState(285);
					literal();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(IDENTIFIER);
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
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(AngularParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AngularParser.RCURLY, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
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
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(293);
				modifier();
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(296);
				match(CLASS);
				}
			}

			setState(299);
			match(IDENTIFIER);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				match(IDENTIFIER);
				}
			}

			setState(304);
			match(LCURLY);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121611436261376L) != 0) || _la==LPAREN || _la==IDENTIFIER) {
				{
				{
				setState(305);
				classMember();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
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
		enterRule(_localctx, 36, RULE_classMember);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				inputDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				outputDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				objectDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				constructorDecleration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
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
		enterRule(_localctx, 38, RULE_ngOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==NGONINIT || _la==NGONCHANGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(324);
			parameterList();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(325);
				match(COLON);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(326);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(331);
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
		enterRule(_localctx, 40, RULE_constructorDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CONSTRUCTOR);
			setState(334);
			parameterList();
			setState(335);
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
		enterRule(_localctx, 42, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(INPUT);
			setState(338);
			match(LPAREN);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 70931694156251137L) != 0)) {
				{
				setState(339);
				literal();
				}
			}

			setState(342);
			match(RPAREN);
			setState(343);
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
		enterRule(_localctx, 44, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(OUTPUT);
			setState(346);
			match(LPAREN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 70931694156251137L) != 0)) {
				{
				setState(347);
				literal();
				}
			}

			setState(350);
			match(RPAREN);
			setState(351);
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
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501896769536L) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
					{
					setState(353);
					modifier();
					}
				}

				setState(356);
				type();
				}
			}

			setState(359);
			match(IDENTIFIER);
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(360);
				match(COLON);
				setState(361);
				expression(0);
				}
				break;
			}
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(364);
				match(EQUAL);
				setState(365);
				expression(0);
				}
				break;
			}
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(368);
				match(AS);
				setState(369);
				match(IDENTIFIER);
				}
				break;
			}
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(372);
				eos();
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
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1121501893885952L) != 0)) {
				{
				setState(377);
				modifier();
				}
			}

			setState(380);
			property();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(381);
				match(EQUAL);
				setState(382);
				expression(0);
				}
			}

			setState(385);
			eos();
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
		enterRule(_localctx, 52, RULE_property);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(387);
				match(IDENTIFIER);
				setState(388);
				match(COLON);
				setState(389);
				expression(0);
				}
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
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
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_objectDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(393);
				property();
				}
				break;
			case 2:
				{
				setState(394);
				objectName();
				}
				break;
			}
			setState(397);
			match(EQUAL);
			setState(398);
			objectInit();
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(399);
				eos();
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
		enterRule(_localctx, 56, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IDENTIFIER);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(403);
				objectType();
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
		enterRule(_localctx, 58, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(NEW);
			setState(407);
			match(IDENTIFIER);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(408);
				objectType();
				}
			}

			setState(411);
			match(LPAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301329653760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				setState(412);
				expression(0);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(413);
					match(COMMA);
					setState(414);
					expression(0);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
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
		enterRule(_localctx, 60, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(LESS_THAN);
			setState(425);
			match(IDENTIFIER);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET) {
				{
				setState(426);
				list();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(429);
				match(COMMA);
				setState(430);
				match(IDENTIFIER);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSBRACKET) {
					{
					setState(431);
					list();
					}
				}

				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
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
		enterRule(_localctx, 62, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LCURLY);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS || _la==IDENTIFIER) {
				{
				setState(442);
				property();
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(443);
						match(COMMA);
						setState(444);
						property();
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
			}

			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(452);
				match(COMMA);
				}
			}

			setState(455);
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
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(457);
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

				setState(460);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(461);
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

				setState(464);
				match(Float);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				match(Null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(Undefined);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
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
		enterRule(_localctx, 66, RULE_statement);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				objectDecleration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
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
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public CompersionContext compersion() {
			return getRuleContext(CompersionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(481);
				objectLiteral();
				}
				break;
			case 2:
				{
				setState(482);
				objectDecleration();
				}
				break;
			case 3:
				{
				setState(483);
				objectName();
				}
				break;
			case 4:
				{
				setState(484);
				arrowMethod();
				}
				break;
			case 5:
				{
				setState(485);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(486);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(487);
				match(IDENTIFIER);
				setState(488);
				match(PLUS);
				setState(489);
				match(PLUS);
				}
				break;
			case 8:
				{
				setState(490);
				match(IDENTIFIER);
				setState(491);
				match(MINUS);
				setState(492);
				match(MINUS);
				}
				break;
			case 9:
				{
				setState(493);
				literal();
				}
				break;
			case 10:
				{
				setState(494);
				callingMethod();
				}
				break;
			case 11:
				{
				setState(495);
				match(LESS_THAN);
				setState(496);
				expression(0);
				setState(497);
				match(GREATER_THAN);
				setState(498);
				match(IDENTIFIER);
				}
				break;
			case 12:
				{
				setState(500);
				match(LPAREN);
				setState(501);
				expression(0);
				setState(502);
				match(AS);
				setState(503);
				match(IDENTIFIER);
				setState(504);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(506);
				dataStructure();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(509);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(510);
						match(DOT);
						setState(511);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(512);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(513);
						compersion();
						setState(514);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(517);
						operator();
						setState(518);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(520);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(521);
						list();
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(522);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(523);
						match(EQUAL);
						setState(526);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSBRACKET:
						case LCURLY:
							{
							setState(524);
							dataStructure();
							}
							break;
						case THIS:
						case PLUS:
						case MINUS:
						case Integer:
						case Float:
						case String:
						case Boolean:
						case Undefined:
						case Null:
							{
							setState(525);
							literal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(IF);
				setState(534);
				match(LPAREN);
				setState(535);
				expression(0);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
					{
					setState(536);
					compersion();
					setState(537);
					expression(0);
					}
				}

				setState(541);
				match(RPAREN);
				setState(542);
				block();
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						match(ELSEIF);
						setState(544);
						match(LPAREN);
						setState(545);
						expression(0);
						setState(549);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
							{
							setState(546);
							compersion();
							setState(547);
							expression(0);
							}
						}

						setState(551);
						match(RPAREN);
						setState(552);
						block();
						}
						} 
					}
					setState(558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(559);
					match(ELSE);
					setState(560);
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
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
		enterRule(_localctx, 72, RULE_shortIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(567);
				match(LPAREN);
				}
				break;
			}
			setState(570);
			expression(0);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
				{
				setState(571);
				compersion();
				setState(572);
				expression(0);
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(576);
				match(RPAREN);
				}
			}

			setState(579);
			match(QUESITIONMARK);
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(580);
				match(LPAREN);
				}
				break;
			}
			setState(583);
			statement();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(584);
				match(RPAREN);
				}
			}

			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					match(COLON);
					setState(589);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(588);
						match(LPAREN);
						}
						break;
					}
					setState(591);
					expression(0);
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
						{
						setState(592);
						compersion();
						setState(593);
						expression(0);
						}
					}

					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(597);
						match(RPAREN);
						}
					}

					setState(600);
					match(QUESITIONMARK);
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(601);
						match(LPAREN);
						}
						break;
					}
					setState(604);
					statement();
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RPAREN) {
						{
						setState(605);
						match(RPAREN);
						}
					}

					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(613);
			match(COLON);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(614);
				match(LPAREN);
				}
				break;
			}
			setState(617);
			statement();
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(618);
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
		enterRule(_localctx, 74, RULE_arrowIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(621);
				match(LPAREN);
				}
				break;
			}
			setState(624);
			expression(0);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2043L) != 0)) {
				{
				setState(625);
				compersion();
				setState(626);
				expression(0);
				}
			}

			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(630);
				match(RPAREN);
				}
			}

			setState(633);
			match(ARROW);
			setState(634);
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
		enterRule(_localctx, 76, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(FOR);
			setState(637);
			match(LPAREN);
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(638);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(639);
				expression(0);
				}
				break;
			}
			setState(642);
			match(SEMI);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301329653760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				setState(643);
				expression(0);
				}
			}

			setState(646);
			match(SEMI);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301329653760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				setState(647);
				expression(0);
				}
			}

			setState(650);
			match(RPAREN);
			setState(651);
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
		enterRule(_localctx, 78, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(WHILE);
			setState(654);
			match(LPAREN);
			setState(655);
			expression(0);
			setState(656);
			match(RPAREN);
			setState(657);
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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
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
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			expression(0);
			setState(660);
			eos();
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
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
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
		enterRule(_localctx, 82, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(RETURN);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(663);
				match(LPAREN);
				}
				break;
			}
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301329653760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				setState(666);
				expression(0);
				}
			}

			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(669);
				match(RPAREN);
				}
			}

			setState(672);
			eos();
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
		enterRule(_localctx, 84, RULE_callingMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(674);
			_la = _input.LA(1);
			if ( !(_la==CATCH || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(675);
			match(LPAREN);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14632301329653760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 2080937L) != 0)) {
				{
				setState(676);
				expression(0);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(677);
					match(COMMA);
					setState(678);
					expression(0);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(686);
			match(RPAREN);
			}
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(694);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(688);
						match(DOT);
						setState(691);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(689);
							callingMethod();
							}
							break;
						case 2:
							{
							setState(690);
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
						setState(693);
						dataStructure();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		enterRule(_localctx, 86, RULE_dataStructure);
		try {
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				list();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
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
		enterRule(_localctx, 88, RULE_itemsStructures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(703);
				literal();
				}
				break;
			case 2:
				{
				setState(704);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(705);
				list();
				}
				break;
			case 4:
				{
				setState(706);
				map();
				}
				break;
			case 5:
				{
				setState(707);
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
		enterRule(_localctx, 90, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(LCURLY);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13510799418990592L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 65029L) != 0)) {
				{
				{
				setState(711);
				itemsStructures();
				setState(712);
				match(COLON);
				setState(713);
				itemsStructures();
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(715);
						match(COMMA);
						{
						setState(716);
						itemsStructures();
						setState(717);
						match(COLON);
						setState(718);
						itemsStructures();
						}
						}
						} 
					}
					setState(724);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
			}

			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(727);
				match(COMMA);
				}
			}

			setState(730);
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
		enterRule(_localctx, 92, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(LSBRACKET);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13510799418990592L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 65029L) != 0)) {
				{
				setState(733);
				itemsStructures();
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(734);
						match(COMMA);
						setState(735);
						itemsStructures();
						}
						} 
					}
					setState(740);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
			}

			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(743);
				match(COMMA);
				}
			}

			setState(746);
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
		enterRule(_localctx, 94, RULE_operator);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750);
				match(MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(STAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(752);
				match(DIVIDE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(753);
				match(PLUS);
				setState(754);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(755);
				match(MINUS);
				setState(756);
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
		enterRule(_localctx, 96, RULE_compersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(761);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Y\u02fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001w\b"+
		"\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0083"+
		"\b\u0002\n\u0002\f\u0002\u0086\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0092\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003\u0005\u0003"+
		"\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b2\b\u0006\n\u0006\f\u0006"+
		"\u00b5\t\u0006\u0003\u0006\u00b7\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0003\n\u00c9\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00ce\b\n\u0003\n\u00d0\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00d5\b\n\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00de\b\u000b\u0003"+
		"\u000b\u00e0\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e5"+
		"\b\u000b\u0001\f\u0003\f\u00e8\b\f\u0001\f\u0003\f\u00eb\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00f0\b\f\u0003\f\u00f2\b\f\u0001\f\u0001\f\u0003\f"+
		"\u00f6\b\f\u0001\f\u0005\f\u00f9\b\f\n\f\f\f\u00fc\t\f\u0001\f\u0003\f"+
		"\u00ff\b\f\u0001\r\u0001\r\u0005\r\u0103\b\r\n\r\f\r\u0106\t\r\u0001\r"+
		"\u0003\r\u0109\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0111\b\u000e\n\u000e\f\u000e\u0114\t\u000e\u0003"+
		"\u000e\u0116\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011f\b\u000f\u0001\u000f\u0003"+
		"\u000f\u0122\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u0127"+
		"\b\u0011\u0001\u0011\u0003\u0011\u012a\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u012f\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0133\b\u0011\n\u0011\f\u0011\u0136\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0142\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0148\b\u0013\u0003\u0013\u014a\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0155\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u015d\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017"+
		"\u0163\b\u0017\u0001\u0017\u0003\u0017\u0166\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u016b\b\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u016f\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0173\b\u0017"+
		"\u0001\u0017\u0003\u0017\u0176\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0003\u0019\u017b\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0180\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0188\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u018c\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0191\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0195\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u019a\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01a0\b\u001d\n\u001d\f\u001d\u01a3\t\u001d"+
		"\u0003\u001d\u01a5\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01ac\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01b1\b\u001e\u0005\u001e\u01b3\b\u001e\n\u001e\f\u001e\u01b6"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01be\b\u001f\n\u001f\f\u001f\u01c1\t\u001f\u0003\u001f"+
		"\u01c3\b\u001f\u0001\u001f\u0003\u001f\u01c6\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0003 \u01cb\b \u0001 \u0001 \u0003 \u01cf\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01d7\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u01df\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01fc\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u020f\b\"\u0005\"\u0211"+
		"\b\"\n\"\f\"\u0214\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u021c\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0226\b#\u0001#\u0001#\u0001#\u0005#\u022b\b#\n#\f#\u022e\t#\u0001#"+
		"\u0001#\u0003#\u0232\b#\u0001#\u0001#\u0003#\u0236\b#\u0001$\u0003$\u0239"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u023f\b$\u0001$\u0003$\u0242\b"+
		"$\u0001$\u0001$\u0003$\u0246\b$\u0001$\u0001$\u0003$\u024a\b$\u0001$\u0001"+
		"$\u0003$\u024e\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u0254\b$\u0001$\u0003"+
		"$\u0257\b$\u0001$\u0001$\u0003$\u025b\b$\u0001$\u0001$\u0003$\u025f\b"+
		"$\u0005$\u0261\b$\n$\f$\u0264\t$\u0001$\u0001$\u0003$\u0268\b$\u0001$"+
		"\u0001$\u0003$\u026c\b$\u0001%\u0003%\u026f\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0275\b%\u0001%\u0003%\u0278\b%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0281\b&\u0001&\u0001&\u0003&\u0285\b&\u0001&\u0001"+
		"&\u0003&\u0289\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0003)\u0299\b)\u0001"+
		")\u0003)\u029c\b)\u0001)\u0003)\u029f\b)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u02a8\b*\n*\f*\u02ab\t*\u0003*\u02ad\b*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0003*\u02b4\b*\u0001*\u0005*\u02b7\b*\n"+
		"*\f*\u02ba\t*\u0001+\u0001+\u0003+\u02be\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u02c5\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u02d1\b-\n-\f-\u02d4\t-\u0003-\u02d6\b-"+
		"\u0001-\u0003-\u02d9\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u02e1\b.\n.\f.\u02e4\t.\u0003.\u02e6\b.\u0001.\u0003.\u02e9\b.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u02f6\b/\u00010\u00010\u00011\u00031\u02fb\b1\u00011\u0000\u0001"+
		"D2\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`b\u0000\b\u0001\u0000\'"+
		"(\u0002\u0000\u0019\u0019*1\u0002\u0000\u001e\u001eYY\u0001\u0000#$\u0002"+
		"\u0000\u0012\u0013\u0015\u0015\u0001\u000045\u0002\u0000\r\rUU\u0002\u0000"+
		"9:<C\u036b\u0000k\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000"+
		"\u0004~\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b"+
		"\u00a3\u0001\u0000\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00ab"+
		"\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000\u0000\u0000\u0010\u00be"+
		"\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u00d4"+
		"\u0001\u0000\u0000\u0000\u0016\u00e4\u0001\u0000\u0000\u0000\u0018\u00e7"+
		"\u0001\u0000\u0000\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u010c"+
		"\u0001\u0000\u0000\u0000\u001e\u0121\u0001\u0000\u0000\u0000 \u0123\u0001"+
		"\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000\u0000$\u0141\u0001\u0000"+
		"\u0000\u0000&\u0143\u0001\u0000\u0000\u0000(\u014d\u0001\u0000\u0000\u0000"+
		"*\u0151\u0001\u0000\u0000\u0000,\u0159\u0001\u0000\u0000\u0000.\u0165"+
		"\u0001\u0000\u0000\u00000\u0177\u0001\u0000\u0000\u00002\u017a\u0001\u0000"+
		"\u0000\u00004\u0187\u0001\u0000\u0000\u00006\u018b\u0001\u0000\u0000\u0000"+
		"8\u0192\u0001\u0000\u0000\u0000:\u0196\u0001\u0000\u0000\u0000<\u01a8"+
		"\u0001\u0000\u0000\u0000>\u01b9\u0001\u0000\u0000\u0000@\u01d6\u0001\u0000"+
		"\u0000\u0000B\u01de\u0001\u0000\u0000\u0000D\u01fb\u0001\u0000\u0000\u0000"+
		"F\u0235\u0001\u0000\u0000\u0000H\u0238\u0001\u0000\u0000\u0000J\u026e"+
		"\u0001\u0000\u0000\u0000L\u027c\u0001\u0000\u0000\u0000N\u028d\u0001\u0000"+
		"\u0000\u0000P\u0293\u0001\u0000\u0000\u0000R\u0296\u0001\u0000\u0000\u0000"+
		"T\u02a2\u0001\u0000\u0000\u0000V\u02bd\u0001\u0000\u0000\u0000X\u02c4"+
		"\u0001\u0000\u0000\u0000Z\u02c6\u0001\u0000\u0000\u0000\\\u02dc\u0001"+
		"\u0000\u0000\u0000^\u02f5\u0001\u0000\u0000\u0000`\u02f7\u0001\u0000\u0000"+
		"\u0000b\u02fa\u0001\u0000\u0000\u0000dj\u0003\u0002\u0001\u0000ej\u0003"+
		"\u0006\u0003\u0000fj\u0003\"\u0011\u0000gj\u0003\u0014\n\u0000hj\u0003"+
		"B!\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0000\u0000"+
		"\u0001o\u0001\u0001\u0000\u0000\u0000py\u0005\u0017\u0000\u0000qw\u0005"+
		"U\u0000\u0000rs\u00056\u0000\u0000st\u0005\u001a\u0000\u0000tw\u0005U"+
		"\u0000\u0000uw\u0003\u0004\u0002\u0000vq\u0001\u0000\u0000\u0000vr\u0001"+
		"\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0005\u001b\u0000\u0000yv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0005Q\u0000\u0000|}\u0003b1\u0000"+
		"}\u0003\u0001\u0000\u0000\u0000~\u007f\u0005H\u0000\u0000\u007f\u0084"+
		"\u0005U\u0000\u0000\u0080\u0081\u0005J\u0000\u0000\u0081\u0083\u0005U"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005I\u0000\u0000\u0088\u0005\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005\"\u0000\u0000\u008a\u008b\u0005D\u0000\u0000"+
		"\u008b\u0091\u0005H\u0000\u0000\u008c\u0092\u0003\b\u0004\u0000\u008d"+
		"\u0092\u0003\n\u0005\u0000\u008e\u0092\u0003\f\u0006\u0000\u008f\u0092"+
		"\u0003\u000e\u0007\u0000\u0090\u0092\u0003\u0010\b\u0000\u0091\u008c\u0001"+
		"\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u009d\u0001\u0000\u0000\u0000\u0093\u0099\u0005"+
		"J\u0000\u0000\u0094\u009a\u0003\b\u0004\u0000\u0095\u009a\u0003\n\u0005"+
		"\u0000\u0096\u009a\u0003\f\u0006\u0000\u0097\u009a\u0003\u000e\u0007\u0000"+
		"\u0098\u009a\u0003\u0010\b\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005I\u0000\u0000\u00a1\u00a2"+
		"\u0005E\u0000\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"%\u0000\u0000\u00a4\u00a5\u0005L\u0000\u0000\u00a5\u00a6\u0005Q\u0000"+
		"\u0000\u00a6\t\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005&\u0000\u0000"+
		"\u00a8\u00a9\u0005L\u0000\u0000\u00a9\u00aa\u0005R\u0000\u0000\u00aa\u000b"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac\u00ad"+
		"\u0005L\u0000\u0000\u00ad\u00b6\u0005F\u0000\u0000\u00ae\u00b3\u0005U"+
		"\u0000\u0000\u00af\u00b0\u0005J\u0000\u0000\u00b0\u00b2\u0005U\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005G\u0000\u0000\u00b9"+
		"\r\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005L\u0000\u0000\u00bc\u00bd\u0005Q\u0000\u0000\u00bd\u000f\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c0\u0005L\u0000\u0000"+
		"\u00c0\u00c1\u0003\u0012\t\u0000\u00c1\u0011\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u0005\u0010\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0005U\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cf"+
		"\u0003\u001c\u000e\u0000\u00cb\u00cd\u0005L\u0000\u0000\u00cc\u00ce\u0005"+
		"U\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003\u001a\r\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0003\u0018\f\u0000\u00d4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u0015\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d8\u0003 \u0010\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005U\u0000\u0000\u00da\u00df\u0003\u001c\u000e\u0000\u00db\u00dd"+
		"\u0005L\u0000\u0000\u00dc\u00de\u0005U\u0000\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u001a"+
		"\r\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u0018\f"+
		"\u0000\u00e4\u00d7\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003 \u0010\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005U\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f1\u0003\u001c\u000e\u0000\u00ed"+
		"\u00ef\u0005L\u0000\u0000\u00ee\u00f0\u0005U\u0000\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005"+
		"3\u0000\u0000\u00f4\u00f6\u0005H\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0003B!\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005I\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0019"+
		"\u0001\u0000\u0000\u0000\u0100\u0104\u0005H\u0000\u0000\u0101\u0103\u0003"+
		"B!\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0003R)\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005I\u0000\u0000\u010b\u001b\u0001\u0000\u0000\u0000\u010c\u0115"+
		"\u0005D\u0000\u0000\u010d\u0112\u0003\u001e\u000f\u0000\u010e\u010f\u0005"+
		"J\u0000\u0000\u010f\u0111\u0003\u001e\u000f\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u010d\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005E\u0000\u0000\u0118\u001d\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005U\u0000\u0000\u011a\u011b\u0005L\u0000\u0000\u011b"+
		"\u011e\u0005U\u0000\u0000\u011c\u011d\u00052\u0000\u0000\u011d\u011f\u0003"+
		"@ \u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u0122\u0005U\u0000\u0000"+
		"\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u001f\u0001\u0000\u0000\u0000\u0123\u0124\u0007\u0001\u0000\u0000"+
		"\u0124!\u0001\u0000\u0000\u0000\u0125\u0127\u0003 \u0010\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0005\u0016\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u012e\u0005U\u0000\u0000\u012c\u012d\u0007"+
		"\u0002\u0000\u0000\u012d\u012f\u0005U\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130\u0134\u0005H\u0000\u0000\u0131\u0133\u0003$\u0012\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005I\u0000\u0000\u0138#\u0001\u0000\u0000\u0000\u0139\u0142"+
		"\u0003*\u0015\u0000\u013a\u0142\u0003,\u0016\u0000\u013b\u0142\u0003\u0016"+
		"\u000b\u0000\u013c\u0142\u00032\u0019\u0000\u013d\u0142\u0003.\u0017\u0000"+
		"\u013e\u0142\u00036\u001b\u0000\u013f\u0142\u0003(\u0014\u0000\u0140\u0142"+
		"\u0003&\u0013\u0000\u0141\u0139\u0001\u0000\u0000\u0000\u0141\u013a\u0001"+
		"\u0000\u0000\u0000\u0141\u013b\u0001\u0000\u0000\u0000\u0141\u013c\u0001"+
		"\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141\u013e\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001"+
		"\u0000\u0000\u0000\u0142%\u0001\u0000\u0000\u0000\u0143\u0144\u0007\u0003"+
		"\u0000\u0000\u0144\u0149\u0003\u001c\u000e\u0000\u0145\u0147\u0005L\u0000"+
		"\u0000\u0146\u0148\u0005U\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0003\u001a\r\u0000\u014c"+
		"\'\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0014\u0000\u0000\u014e\u014f"+
		"\u0003\u001c\u000e\u0000\u014f\u0150\u0003\u001a\r\u0000\u0150)\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005\u001f\u0000\u0000\u0152\u0154\u0005"+
		"D\u0000\u0000\u0153\u0155\u0003@ \u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0005E\u0000\u0000\u0157\u0158\u00034\u001a\u0000\u0158"+
		"+\u0001\u0000\u0000\u0000\u0159\u015a\u0005 \u0000\u0000\u015a\u015c\u0005"+
		"D\u0000\u0000\u015b\u015d\u0003@ \u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0005E\u0000\u0000\u015f\u0160\u00036\u001b\u0000\u0160"+
		"-\u0001\u0000\u0000\u0000\u0161\u0163\u0003 \u0010\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0166\u00030\u0018\u0000\u0165\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u016a\u0005U\u0000\u0000\u0168\u0169\u0005L\u0000\u0000"+
		"\u0169\u016b\u0003D\"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u00052\u0000\u0000\u016d\u016f\u0003D\"\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u001a\u0000\u0000\u0171\u0173\u0005"+
		"U\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0176\u0003b1\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176/\u0001\u0000\u0000\u0000\u0177\u0178\u0007\u0004\u0000\u0000\u0178"+
		"1\u0001\u0000\u0000\u0000\u0179\u017b\u0003 \u0010\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u00034\u001a\u0000\u017d\u017e\u00052\u0000"+
		"\u0000\u017e\u0180\u0003D\"\u0000\u017f\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0003b1\u0000\u01823\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0005U\u0000\u0000\u0184\u0185\u0005L\u0000\u0000\u0185\u0188\u0003D"+
		"\"\u0000\u0186\u0188\u0003\f\u0006\u0000\u0187\u0183\u0001\u0000\u0000"+
		"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u01885\u0001\u0000\u0000\u0000"+
		"\u0189\u018c\u00034\u001a\u0000\u018a\u018c\u00038\u001c\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u00052\u0000\u0000\u018e\u0190\u0003"+
		":\u001d\u0000\u018f\u0191\u0003b1\u0000\u0190\u018f\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u01917\u0001\u0000\u0000\u0000"+
		"\u0192\u0194\u0005U\u0000\u0000\u0193\u0195\u0003<\u001e\u0000\u0194\u0193"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u01959\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u001c\u0000\u0000\u0197\u0199\u0005"+
		"U\u0000\u0000\u0198\u019a\u0003<\u001e\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u01a4\u0005D\u0000\u0000\u019c\u01a1\u0003D\"\u0000\u019d"+
		"\u019e\u0005J\u0000\u0000\u019e\u01a0\u0003D\"\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u019c\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005E\u0000\u0000\u01a7;\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005A\u0000\u0000\u01a9\u01ab\u0005U\u0000\u0000\u01aa"+
		"\u01ac\u0003\\.\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01b4\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0005J\u0000\u0000\u01ae\u01b0\u0005U\u0000\u0000\u01af\u01b1\u0003\\"+
		".\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005@\u0000\u0000"+
		"\u01b8=\u0001\u0000\u0000\u0000\u01b9\u01c2\u0005H\u0000\u0000\u01ba\u01bf"+
		"\u00034\u001a\u0000\u01bb\u01bc\u0005J\u0000\u0000\u01bc\u01be\u00034"+
		"\u001a\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c6\u0005J\u0000"+
		"\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005I\u0000\u0000"+
		"\u01c8?\u0001\u0000\u0000\u0000\u01c9\u01cb\u0007\u0005\u0000\u0000\u01ca"+
		"\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cc\u01d7\u0005O\u0000\u0000\u01cd\u01cf"+
		"\u0007\u0005\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d7"+
		"\u0005P\u0000\u0000\u01d1\u01d7\u0005Q\u0000\u0000\u01d2\u01d7\u0005R"+
		"\u0000\u0000\u01d3\u01d7\u0005T\u0000\u0000\u01d4\u01d7\u0005S\u0000\u0000"+
		"\u01d5\u01d7\u0005\u001d\u0000\u0000\u01d6\u01ca\u0001\u0000\u0000\u0000"+
		"\u01d6\u01ce\u0001\u0000\u0000\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d2\u0001\u0000\u0000\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7A\u0001\u0000\u0000\u0000\u01d8\u01df\u0003.\u0017\u0000\u01d9\u01df"+
		"\u00036\u001b\u0000\u01da\u01df\u0003F#\u0000\u01db\u01df\u0003L&\u0000"+
		"\u01dc\u01df\u0003N\'\u0000\u01dd\u01df\u0003P(\u0000\u01de\u01d8\u0001"+
		"\u0000\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01da\u0001"+
		"\u0000\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01dfC\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0006\"\uffff\uffff\u0000\u01e1\u01fc\u0003>"+
		"\u001f\u0000\u01e2\u01fc\u00036\u001b\u0000\u01e3\u01fc\u00038\u001c\u0000"+
		"\u01e4\u01fc\u0003\u0018\f\u0000\u01e5\u01fc\u0005\u001d\u0000\u0000\u01e6"+
		"\u01fc\u0005U\u0000\u0000\u01e7\u01e8\u0005U\u0000\u0000\u01e8\u01e9\u0005"+
		"4\u0000\u0000\u01e9\u01fc\u00054\u0000\u0000\u01ea\u01eb\u0005U\u0000"+
		"\u0000\u01eb\u01ec\u00055\u0000\u0000\u01ec\u01fc\u00055\u0000\u0000\u01ed"+
		"\u01fc\u0003@ \u0000\u01ee\u01fc\u0003T*\u0000\u01ef\u01f0\u0005A\u0000"+
		"\u0000\u01f0\u01f1\u0003D\"\u0000\u01f1\u01f2\u0005@\u0000\u0000\u01f2"+
		"\u01f3\u0005U\u0000\u0000\u01f3\u01fc\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005D\u0000\u0000\u01f5\u01f6\u0003D\"\u0000\u01f6\u01f7\u0005\u001a"+
		"\u0000\u0000\u01f7\u01f8\u0005U\u0000\u0000\u01f8\u01f9\u0005E\u0000\u0000"+
		"\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01fc\u0003V+\u0000\u01fb\u01e0"+
		"\u0001\u0000\u0000\u0000\u01fb\u01e2\u0001\u0000\u0000\u0000\u01fb\u01e3"+
		"\u0001\u0000\u0000\u0000\u01fb\u01e4\u0001\u0000\u0000\u0000\u01fb\u01e5"+
		"\u0001\u0000\u0000\u0000\u01fb\u01e6\u0001\u0000\u0000\u0000\u01fb\u01e7"+
		"\u0001\u0000\u0000\u0000\u01fb\u01ea\u0001\u0000\u0000\u0000\u01fb\u01ed"+
		"\u0001\u0000\u0000\u0000\u01fb\u01ee\u0001\u0000\u0000\u0000\u01fb\u01ef"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f4\u0001\u0000\u0000\u0000\u01fb\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u0212\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\n\u0006\u0000\u0000\u01fe\u01ff\u0005M\u0000\u0000\u01ff\u0211\u0003"+
		"D\"\u0007\u0200\u0201\n\u0005\u0000\u0000\u0201\u0202\u0003`0\u0000\u0202"+
		"\u0203\u0003D\"\u0006\u0203\u0211\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\n\u0004\u0000\u0000\u0205\u0206\u0003^/\u0000\u0206\u0207\u0003D\"\u0005"+
		"\u0207\u0211\u0001\u0000\u0000\u0000\u0208\u0209\n\u0012\u0000\u0000\u0209"+
		"\u0211\u0003\\.\u0000\u020a\u020b\n\r\u0000\u0000\u020b\u020e\u00052\u0000"+
		"\u0000\u020c\u020f\u0003V+\u0000\u020d\u020f\u0003@ \u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0211"+
		"\u0001\u0000\u0000\u0000\u0210\u01fd\u0001\u0000\u0000\u0000\u0210\u0200"+
		"\u0001\u0000\u0000\u0000\u0210\u0204\u0001\u0000\u0000\u0000\u0210\u0208"+
		"\u0001\u0000\u0000\u0000\u0210\u020a\u0001\u0000\u0000\u0000\u0211\u0214"+
		"\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213E\u0001\u0000\u0000\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0005\u0001\u0000\u0000\u0216\u0217\u0005"+
		"D\u0000\u0000\u0217\u021b\u0003D\"\u0000\u0218\u0219\u0003`0\u0000\u0219"+
		"\u021a\u0003D\"\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0218"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0005E\u0000\u0000\u021e\u022c\u0003"+
		"\u001a\r\u0000\u021f\u0220\u0005\u0002\u0000\u0000\u0220\u0221\u0005D"+
		"\u0000\u0000\u0221\u0225\u0003D\"\u0000\u0222\u0223\u0003`0\u0000\u0223"+
		"\u0224\u0003D\"\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0005E\u0000\u0000\u0228\u0229\u0003"+
		"\u001a\r\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u021f\u0001\u0000"+
		"\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0231\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0230\u0005\u0003"+
		"\u0000\u0000\u0230\u0232\u0003\u001a\r\u0000\u0231\u022f\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0236\u0001\u0000\u0000"+
		"\u0000\u0233\u0236\u0003H$\u0000\u0234\u0236\u0003J%\u0000\u0235\u0215"+
		"\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234"+
		"\u0001\u0000\u0000\u0000\u0236G\u0001\u0000\u0000\u0000\u0237\u0239\u0005"+
		"D\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023e\u0003D\""+
		"\u0000\u023b\u023c\u0003`0\u0000\u023c\u023d\u0003D\"\u0000\u023d\u023f"+
		"\u0001\u0000\u0000\u0000\u023e\u023b\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u0242"+
		"\u0005E\u0000\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0005"+
		"N\u0000\u0000\u0244\u0246\u0005D\u0000\u0000\u0245\u0244\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247\u0249\u0003B!\u0000\u0248\u024a\u0005E\u0000\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a"+
		"\u0262\u0001\u0000\u0000\u0000\u024b\u024d\u0005L\u0000\u0000\u024c\u024e"+
		"\u0005D\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0253\u0003"+
		"D\"\u0000\u0250\u0251\u0003`0\u0000\u0251\u0252\u0003D\"\u0000\u0252\u0254"+
		"\u0001\u0000\u0000\u0000\u0253\u0250\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255\u0257"+
		"\u0005E\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0005"+
		"N\u0000\u0000\u0259\u025b\u0005D\u0000\u0000\u025a\u0259\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0003B!\u0000\u025d\u025f\u0005E\u0000\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u024b\u0001\u0000\u0000\u0000\u0261"+
		"\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264"+
		"\u0262\u0001\u0000\u0000\u0000\u0265\u0267\u0005L\u0000\u0000\u0266\u0268"+
		"\u0005D\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026b\u0003"+
		"B!\u0000\u026a\u026c\u0005E\u0000\u0000\u026b\u026a\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026cI\u0001\u0000\u0000\u0000"+
		"\u026d\u026f\u0005D\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e"+
		"\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"+
		"\u0274\u0003D\"\u0000\u0271\u0272\u0003`0\u0000\u0272\u0273\u0003D\"\u0000"+
		"\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0271\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0001\u0000\u0000\u0000"+
		"\u0276\u0278\u0005E\u0000\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u00053\u0000\u0000\u027a\u027b\u0003D\"\u0000\u027bK\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0005\u0004\u0000\u0000\u027d\u0280\u0005D\u0000"+
		"\u0000\u027e\u0281\u0003.\u0017\u0000\u027f\u0281\u0003D\"\u0000\u0280"+
		"\u027e\u0001\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0284\u0005K\u0000\u0000\u0283\u0285\u0003D\"\u0000\u0284\u0283\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0288\u0005K\u0000\u0000\u0287\u0289\u0003D\""+
		"\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0005E\u0000\u0000"+
		"\u028b\u028c\u0003\u001a\r\u0000\u028cM\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0005\u0005\u0000\u0000\u028e\u028f\u0005D\u0000\u0000\u028f\u0290"+
		"\u0003D\"\u0000\u0290\u0291\u0005E\u0000\u0000\u0291\u0292\u0003\u001a"+
		"\r\u0000\u0292O\u0001\u0000\u0000\u0000\u0293\u0294\u0003D\"\u0000\u0294"+
		"\u0295\u0003b1\u0000\u0295Q\u0001\u0000\u0000\u0000\u0296\u0298\u0005"+
		"\u0011\u0000\u0000\u0297\u0299\u0005D\u0000\u0000\u0298\u0297\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000"+
		"\u0000\u0000\u029a\u029c\u0003D\"\u0000\u029b\u029a\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029e\u0001\u0000\u0000"+
		"\u0000\u029d\u029f\u0005E\u0000\u0000\u029e\u029d\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0003b1\u0000\u02a1S\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0007\u0006\u0000\u0000\u02a3\u02ac\u0005D\u0000\u0000\u02a4\u02a9\u0003"+
		"D\"\u0000\u02a5\u02a6\u0005J\u0000\u0000\u02a6\u02a8\u0003D\"\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac"+
		"\u02a4\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0005E\u0000\u0000\u02af\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b3\u0005M\u0000\u0000\u02b1\u02b4\u0003"+
		"T*\u0000\u02b2\u02b4\u0005U\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b7\u0003V+\u0000\u02b6\u02b0\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9"+
		"U\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02be"+
		"\u0003\\.\u0000\u02bc\u02be\u0003Z-\u0000\u02bd\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02beW\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c5\u0003@ \u0000\u02c0\u02c5\u0005U\u0000\u0000\u02c1\u02c5"+
		"\u0003\\.\u0000\u02c2\u02c5\u0003Z-\u0000\u02c3\u02c5\u0003T*\u0000\u02c4"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c4\u02c0\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c5Y\u0001\u0000\u0000\u0000\u02c6\u02d5"+
		"\u0005H\u0000\u0000\u02c7\u02c8\u0003X,\u0000\u02c8\u02c9\u0005L\u0000"+
		"\u0000\u02c9\u02ca\u0003X,\u0000\u02ca\u02d2\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0005J\u0000\u0000\u02cc\u02cd\u0003X,\u0000\u02cd\u02ce\u0005"+
		"L\u0000\u0000\u02ce\u02cf\u0003X,\u0000\u02cf\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cb\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d5\u02c7\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d9\u0005J\u0000\u0000"+
		"\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0005I\u0000\u0000\u02db"+
		"[\u0001\u0000\u0000\u0000\u02dc\u02e5\u0005F\u0000\u0000\u02dd\u02e2\u0003"+
		"X,\u0000\u02de\u02df\u0005J\u0000\u0000\u02df\u02e1\u0003X,\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e7\u02e9\u0005J\u0000\u0000\u02e8\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005G\u0000\u0000\u02eb]\u0001\u0000"+
		"\u0000\u0000\u02ec\u02f6\u00052\u0000\u0000\u02ed\u02f6\u00054\u0000\u0000"+
		"\u02ee\u02f6\u00055\u0000\u0000\u02ef\u02f6\u00056\u0000\u0000\u02f0\u02f6"+
		"\u00057\u0000\u0000\u02f1\u02f2\u00054\u0000\u0000\u02f2\u02f6\u00052"+
		"\u0000\u0000\u02f3\u02f4\u00055\u0000\u0000\u02f4\u02f6\u00052\u0000\u0000"+
		"\u02f5\u02ec\u0001\u0000\u0000\u0000\u02f5\u02ed\u0001\u0000\u0000\u0000"+
		"\u02f5\u02ee\u0001\u0000\u0000\u0000\u02f5\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f0\u0001\u0000\u0000\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f6_\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f8\u0007\u0007\u0000\u0000\u02f8a\u0001\u0000\u0000\u0000\u02f9\u02fb"+
		"\u0005K\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fbc\u0001\u0000\u0000\u0000pikvy\u0084\u0091\u0099"+
		"\u009d\u00b3\u00b6\u00c5\u00c8\u00cd\u00cf\u00d4\u00d7\u00dd\u00df\u00e4"+
		"\u00e7\u00ea\u00ef\u00f1\u00f5\u00fa\u00fe\u0104\u0108\u0112\u0115\u011e"+
		"\u0121\u0126\u0129\u012e\u0134\u0141\u0147\u0149\u0154\u015c\u0162\u0165"+
		"\u016a\u016e\u0172\u0175\u017a\u017f\u0187\u018b\u0190\u0194\u0199\u01a1"+
		"\u01a4\u01ab\u01b0\u01b4\u01bf\u01c2\u01c5\u01ca\u01ce\u01d6\u01de\u01fb"+
		"\u020e\u0210\u0212\u021b\u0225\u022c\u0231\u0235\u0238\u023e\u0241\u0245"+
		"\u0249\u024d\u0253\u0256\u025a\u025e\u0262\u0267\u026b\u026e\u0274\u0277"+
		"\u0280\u0284\u0288\u0298\u029b\u029e\u02a9\u02ac\u02b3\u02b6\u02b8\u02bd"+
		"\u02c4\u02d2\u02d5\u02d8\u02e2\u02e5\u02e8\u02f5\u02fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}