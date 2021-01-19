// Generated from F:/CSE375_PROJECT\leeon.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link leeonParser}.
 */
public interface leeonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link leeonParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(leeonParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(leeonParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(leeonParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(leeonParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#declaresection}.
	 * @param ctx the parse tree
	 */
	void enterDeclaresection(leeonParser.DeclaresectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#declaresection}.
	 * @param ctx the parse tree
	 */
	void exitDeclaresection(leeonParser.DeclaresectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#fixed}.
	 * @param ctx the parse tree
	 */
	void enterFixed(leeonParser.FixedContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#fixed}.
	 * @param ctx the parse tree
	 */
	void exitFixed(leeonParser.FixedContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#fixedlist}.
	 * @param ctx the parse tree
	 */
	void enterFixedlist(leeonParser.FixedlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#fixedlist}.
	 * @param ctx the parse tree
	 */
	void exitFixedlist(leeonParser.FixedlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(leeonParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(leeonParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(leeonParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(leeonParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(leeonParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(leeonParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(leeonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(leeonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(leeonParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(leeonParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(leeonParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(leeonParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#returnvalue}.
	 * @param ctx the parse tree
	 */
	void enterReturnvalue(leeonParser.ReturnvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#returnvalue}.
	 * @param ctx the parse tree
	 */
	void exitReturnvalue(leeonParser.ReturnvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(leeonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(leeonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#breakexp}.
	 * @param ctx the parse tree
	 */
	void enterBreakexp(leeonParser.BreakexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#breakexp}.
	 * @param ctx the parse tree
	 */
	void exitBreakexp(leeonParser.BreakexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(leeonParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(leeonParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(leeonParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(leeonParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(leeonParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(leeonParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(leeonParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(leeonParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#and_or}.
	 * @param ctx the parse tree
	 */
	void enterAnd_or(leeonParser.And_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#and_or}.
	 * @param ctx the parse tree
	 */
	void exitAnd_or(leeonParser.And_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(leeonParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(leeonParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(leeonParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(leeonParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(leeonParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(leeonParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(leeonParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(leeonParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(leeonParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(leeonParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(leeonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(leeonParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(leeonParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(leeonParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link leeonParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(leeonParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link leeonParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(leeonParser.SelectContext ctx);
}