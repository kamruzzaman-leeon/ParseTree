// Generated from F:/CSE375_PROJECT\leeon.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class leeonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, Letter=42, Number=43, WS=44;
	public static final int
		RULE_root = 0, RULE_declare = 1, RULE_declaresection = 2, RULE_fixed = 3, 
		RULE_fixedlist = 4, RULE_library = 5, RULE_end = 6, RULE_func = 7, RULE_block = 8, 
		RULE_statements = 9, RULE_expressions = 10, RULE_returnvalue = 11, RULE_expression = 12, 
		RULE_breakexp = 13, RULE_operation = 14, RULE_relational = 15, RULE_output = 16, 
		RULE_input = 17, RULE_and_or = 18, RULE_increment = 19, RULE_iteration = 20, 
		RULE_forloop = 21, RULE_run = 22, RULE_conditional = 23, RULE_type = 24, 
		RULE_variable = 25, RULE_select = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declare", "declaresection", "fixed", "fixedlist", "library", 
			"end", "func", "block", "statements", "expressions", "returnvalue", "expression", 
			"breakexp", "operation", "relational", "output", "input", "and_or", "increment", 
			"iteration", "forloop", "run", "conditional", "type", "variable", "select"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'ATTACH'", "'FIXED'", "'.'", "'/'", "'?'", "'START'", "'STOP'", 
			"'SEND-IT'", "'LEAVE'", "'SUM'", "'SUB'", "'MUL'", "'DIV'", "'=='", "'<>'", 
			"'>='", "'<'", "'>'", "'<='", "'$'", "'!='", "'LOOK'", "'TAKE'", "'OR'", 
			"'AND'", "'++'", "'--'", "'FORLOOP'", "'^'", "'WHILELOOP'", "'int'", 
			"'bool'", "'char'", "'string'", "'float'", "'double'", "'long long int'", 
			"'WHETHER'", "'UNLESS'", "'MOREOVER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Letter", "Number", "WS"
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
	public String getGrammarFileName() { return "leeon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public leeonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<FixedContext> fixed() {
			return getRuleContexts(FixedContext.class);
		}
		public FixedContext fixed(int i) {
			return getRuleContext(FixedContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				declare();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(59);
				fixed();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				func();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << Letter))) != 0) );
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

	public static class DeclareContext extends ParserRuleContext {
		public DeclaresectionContext declaresection() {
			return getRuleContext(DeclaresectionContext.class,0);
		}
		public LibraryContext library() {
			return getRuleContext(LibraryContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			declaresection();
			setState(71);
			match(T__0);
			setState(72);
			library();
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

	public static class DeclaresectionContext extends ParserRuleContext {
		public DeclaresectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaresection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterDeclaresection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitDeclaresection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitDeclaresection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaresectionContext declaresection() throws RecognitionException {
		DeclaresectionContext _localctx = new DeclaresectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaresection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
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

	public static class FixedContext extends ParserRuleContext {
		public FixedlistContext fixedlist() {
			return getRuleContext(FixedlistContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode Number() { return getToken(leeonParser.Number, 0); }
		public FixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterFixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitFixed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitFixed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedContext fixed() throws RecognitionException {
		FixedContext _localctx = new FixedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fixed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			fixedlist();
			setState(77);
			variable();
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
				{
				setState(78);
				variable();
				}
				break;
			case Number:
				{
				setState(79);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FixedlistContext extends ParserRuleContext {
		public FixedlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterFixedlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitFixedlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitFixedlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedlistContext fixedlist() throws RecognitionException {
		FixedlistContext _localctx = new FixedlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fixedlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class LibraryContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(leeonParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(leeonParser.Letter, i);
		}
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitLibrary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitLibrary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_library);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Letter);
			setState(85);
			match(T__3);
			setState(86);
			match(Letter);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(leeonParser.Letter, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(90);
				type();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(Letter);
			setState(97);
			match(T__5);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				{
				setState(98);
				type();
				setState(99);
				variable();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__5);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(107);
				block();
				}
				}
				setState(112);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(114);
			statements();
			setState(115);
			match(T__7);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<IterationContext> iteration() {
			return getRuleContexts(IterationContext.class);
		}
		public IterationContext iteration(int i) {
			return getRuleContext(IterationContext.class,i);
		}
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<ReturnvalueContext> returnvalue() {
			return getRuleContexts(ReturnvalueContext.class);
		}
		public ReturnvalueContext returnvalue(int i) {
			return getRuleContext(ReturnvalueContext.class,i);
		}
		public List<BreakexpContext> breakexp() {
			return getRuleContexts(BreakexpContext.class);
		}
		public BreakexpContext breakexp(int i) {
			return getRuleContext(BreakexpContext.class,i);
		}
		public List<TerminalNode> Letter() { return getTokens(leeonParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(leeonParser.Letter, i);
		}
		public List<TerminalNode> Number() { return getTokens(leeonParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(leeonParser.Number, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__22) | (1L << T__23) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Letter))) != 0)) {
				{
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
					{
					setState(117);
					expressions();
					}
					break;
				case T__23:
					{
					setState(118);
					input();
					}
					break;
				case T__22:
					{
					setState(119);
					output();
					}
					break;
				case T__28:
				case T__30:
					{
					setState(120);
					iteration();
					}
					break;
				case T__38:
					{
					setState(121);
					select();
					}
					break;
				case T__8:
					{
					setState(122);
					returnvalue();
					}
					break;
				case T__9:
					{
					setState(123);
					breakexp();
					}
					break;
				case Letter:
					{
					setState(124);
					match(Letter);
					setState(125);
					match(T__5);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Letter || _la==Number) {
						{
						setState(128);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Number:
							{
							setState(126);
							match(Number);
							}
							break;
						case Letter:
							{
							setState(127);
							variable();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(133);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(138);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			type();
			setState(140);
			expression(0);
			setState(141);
			end();
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

	public static class ReturnvalueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Number() { return getToken(leeonParser.Number, 0); }
		public ReturnvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterReturnvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitReturnvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitReturnvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnvalueContext returnvalue() throws RecognitionException {
		ReturnvalueContext _localctx = new ReturnvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnvalue);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__8);
				setState(144);
				expression(0);
				setState(145);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__8);
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(148);
					variable();
					}
					break;
				case Number:
					{
					setState(149);
					match(Number);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				end();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Number() { return getToken(leeonParser.Number, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public And_orContext and_or() {
			return getRuleContext(And_orContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(156);
				match(T__5);
				setState(157);
				expression(0);
				setState(158);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(160);
				match(Number);
				}
				break;
			case 4:
				{
				setState(161);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						operation();
						setState(166);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						relational();
						setState(170);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						and_or();
						setState(174);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class BreakexpContext extends ParserRuleContext {
		public BreakexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterBreakexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitBreakexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitBreakexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakexpContext breakexp() throws RecognitionException {
		BreakexpContext _localctx = new BreakexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_breakexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__9);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class RelationalContext extends ParserRuleContext {
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static class OutputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__22);
			setState(188);
			expression(0);
			setState(189);
			end();
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

	public static class InputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__23);
			setState(192);
			expression(0);
			setState(193);
			end();
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

	public static class And_orContext extends ParserRuleContext {
		public And_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterAnd_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitAnd_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitAnd_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_orContext and_or() throws RecognitionException {
		And_orContext _localctx = new And_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
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

	public static class IncrementContext extends ParserRuleContext {
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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

	public static class IterationContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iteration);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				conditional();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				forloop();
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

	public static class ForloopContext extends ParserRuleContext {
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__28);
			setState(204);
			match(T__5);
			setState(205);
			run();
			setState(206);
			match(T__5);
			setState(207);
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

	public static class RunContext extends ParserRuleContext {
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Number() { return getTokens(leeonParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(leeonParser.Number, i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(209);
				expression(0);
				}
				break;
			case 2:
				{
				setState(210);
				type();
				setState(211);
				expression(0);
				}
				break;
			}
			setState(215);
			match(T__29);
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
				{
				setState(216);
				variable();
				}
				break;
			case Number:
				{
				setState(217);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			relational();
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
				{
				setState(221);
				variable();
				}
				break;
			case Number:
				{
				setState(222);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
			match(T__29);
			setState(226);
			variable();
			setState(227);
			increment();
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

	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__30);
			setState(230);
			match(T__5);
			setState(231);
			expression(0);
			setState(232);
			match(T__5);
			setState(233);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitType(this);
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
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(leeonParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(leeonParser.Letter, i);
		}
		public List<TerminalNode> Number() { return getTokens(leeonParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(leeonParser.Number, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			match(Letter);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Number) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class SelectContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof leeonListener ) ((leeonListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof leeonVisitor ) return ((leeonVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_select);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__38);
				setState(245);
				match(T__5);
				setState(246);
				expression(0);
				setState(247);
				match(T__5);
				setState(248);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__38);
				setState(251);
				match(T__5);
				setState(252);
				expression(0);
				setState(253);
				match(T__5);
				setState(254);
				block();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(255);
					match(T__39);
					setState(256);
					match(T__5);
					setState(257);
					expression(0);
					setState(258);
					match(T__5);
					setState(259);
					block();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(266);
					match(T__40);
					setState(267);
					block();
					}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\2\7\2?\n\2\f\2"+
		"\16\2B\13\2\3\2\6\2E\n\2\r\2\16\2F\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5S\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\7\t^\n\t\f\t\16\ta\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\7\to\n\t\f\t\16"+
		"\tr\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0083\n\13\f\13\16\13\u0086\13\13\3\13\7\13\u0089\n\13"+
		"\f\13\16\13\u008c\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0099\n\r\3\r\5\r\u009c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00b3\n\16\f\16\16\16\u00b6\13\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\5\26\u00cc\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00d8\n\30\3\30\3\30\3\30\5\30\u00dd\n\30\3\30\3\30\3\30\5\30\u00e2\n"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\7\33\u00f2\n\33\f\33\16\33\u00f5\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0108"+
		"\n\34\f\34\16\34\u010b\13\34\3\34\3\34\5\34\u010f\n\34\5\34\u0111\n\34"+
		"\3\34\2\3\32\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\66\2\b\3\2\r\20\3\2\21\30\3\2\33\34\3\2\35\36\3\2\"(\3\2,-\2\u0118"+
		"\29\3\2\2\2\4H\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16"+
		"Z\3\2\2\2\20_\3\2\2\2\22s\3\2\2\2\24\u008a\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u009b\3\2\2\2\32\u00a4\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3\2\2\2 \u00bb"+
		"\3\2\2\2\"\u00bd\3\2\2\2$\u00c1\3\2\2\2&\u00c5\3\2\2\2(\u00c7\3\2\2\2"+
		"*\u00cb\3\2\2\2,\u00cd\3\2\2\2.\u00d7\3\2\2\2\60\u00e7\3\2\2\2\62\u00ed"+
		"\3\2\2\2\64\u00ef\3\2\2\2\66\u0110\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\5\20\t\2DC\3\2\2\2EF\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2G\3\3\2\2\2HI\5\6\4\2IJ\7\3\2\2JK\5\f\7\2K\5\3\2\2\2LM\7"+
		"\4\2\2M\7\3\2\2\2NO\5\n\6\2OR\5\64\33\2PS\5\64\33\2QS\7-\2\2RP\3\2\2\2"+
		"RQ\3\2\2\2S\t\3\2\2\2TU\7\5\2\2U\13\3\2\2\2VW\7,\2\2WX\7\6\2\2XY\7,\2"+
		"\2Y\r\3\2\2\2Z[\7\7\2\2[\17\3\2\2\2\\^\5\62\32\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7,\2\2ci\7\b\2\2de\5\62\32"+
		"\2ef\5\64\33\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2"+
		"\2\2ki\3\2\2\2lp\7\b\2\2mo\5\22\n\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2q\21\3\2\2\2rp\3\2\2\2st\7\t\2\2tu\5\24\13\2uv\7\n\2\2v\23\3\2\2"+
		"\2w\u0089\5\26\f\2x\u0089\5$\23\2y\u0089\5\"\22\2z\u0089\5*\26\2{\u0089"+
		"\5\66\34\2|\u0089\5\30\r\2}\u0089\5\34\17\2~\177\7,\2\2\177\u0084\7\b"+
		"\2\2\u0080\u0083\7-\2\2\u0081\u0083\5\64\33\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7\b\2\2\u0088"+
		"w\3\2\2\2\u0088x\3\2\2\2\u0088y\3\2\2\2\u0088z\3\2\2\2\u0088{\3\2\2\2"+
		"\u0088|\3\2\2\2\u0088}\3\2\2\2\u0088~\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u008e\5\62\32\2\u008e\u008f\5\32\16\2\u008f\u0090\5\16\b\2\u0090"+
		"\27\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0093\5\32\16\2\u0093\u0094\5\16"+
		"\b\2\u0094\u009c\3\2\2\2\u0095\u0098\7\13\2\2\u0096\u0099\5\64\33\2\u0097"+
		"\u0099\7-\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\5\16\b\2\u009b\u0091\3\2\2\2\u009b\u0095\3\2\2\2\u009c"+
		"\31\3\2\2\2\u009d\u00a5\b\16\1\2\u009e\u009f\7\b\2\2\u009f\u00a0\5\32"+
		"\16\2\u00a0\u00a1\7\b\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a5\7-\2\2\u00a3"+
		"\u00a5\5\64\33\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00b4\3\2\2\2\u00a6\u00a7\f\b\2\2\u00a7"+
		"\u00a8\5\36\20\2\u00a8\u00a9\5\32\16\t\u00a9\u00b3\3\2\2\2\u00aa\u00ab"+
		"\f\7\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\5\32\16\b\u00ad\u00b3\3\2\2\2"+
		"\u00ae\u00af\f\6\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\5\32\16\7\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\35\3\2\2\2\u00b9\u00ba"+
		"\t\2\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc!\3\2\2\2\u00bd\u00be"+
		"\7\31\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\5\16\b\2\u00c0#\3\2\2\2\u00c1"+
		"\u00c2\7\32\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\5\16\b\2\u00c4%\3\2"+
		"\2\2\u00c5\u00c6\t\4\2\2\u00c6\'\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8)\3"+
		"\2\2\2\u00c9\u00cc\5\60\31\2\u00ca\u00cc\5,\27\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc+\3\2\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00cf\7\b\2\2"+
		"\u00cf\u00d0\5.\30\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\22\n\2\u00d2-\3"+
		"\2\2\2\u00d3\u00d8\5\32\16\2\u00d4\u00d5\5\62\32\2\u00d5\u00d6\5\32\16"+
		"\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00dc\7 \2\2\u00da\u00dd\5\64\33\2\u00db\u00dd\7-\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\5 "+
		"\21\2\u00df\u00e2\5\64\33\2\u00e0\u00e2\7-\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7 \2\2\u00e4\u00e5\5\64"+
		"\33\2\u00e5\u00e6\5(\25\2\u00e6/\3\2\2\2\u00e7\u00e8\7!\2\2\u00e8\u00e9"+
		"\7\b\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec\5\22\n"+
		"\2\u00ec\61\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee\63\3\2\2\2\u00ef\u00f3\7"+
		",\2\2\u00f0\u00f2\t\7\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\65\3\2\2\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\7\b\2\2\u00f8\u00f9\5\32\16\2\u00f9"+
		"\u00fa\7\b\2\2\u00fa\u00fb\5\22\n\2\u00fb\u0111\3\2\2\2\u00fc\u00fd\7"+
		")\2\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\7\b\2\2\u0100"+
		"\u0109\5\22\n\2\u0101\u0102\7*\2\2\u0102\u0103\7\b\2\2\u0103\u0104\5\32"+
		"\16\2\u0104\u0105\7\b\2\2\u0105\u0106\5\22\n\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010e\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7+\2\2\u010d"+
		"\u010f\5\22\n\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3"+
		"\2\2\2\u0110\u00f6\3\2\2\2\u0110\u00fc\3\2\2\2\u0111\67\3\2\2\2\32;@F"+
		"R_ip\u0082\u0084\u0088\u008a\u0098\u009b\u00a4\u00b2\u00b4\u00cb\u00d7"+
		"\u00dc\u00e1\u00f3\u0109\u010e\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}