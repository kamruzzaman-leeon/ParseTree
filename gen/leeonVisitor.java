// Generated from F:/CSE375_PROJECT\leeon.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link leeonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface leeonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link leeonParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(leeonParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(leeonParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#declaresection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaresection(leeonParser.DeclaresectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#fixed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed(leeonParser.FixedContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#fixedlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedlist(leeonParser.FixedlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary(leeonParser.LibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(leeonParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(leeonParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(leeonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(leeonParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(leeonParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#returnvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnvalue(leeonParser.ReturnvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(leeonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#breakexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakexp(leeonParser.BreakexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(leeonParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(leeonParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(leeonParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(leeonParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#and_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_or(leeonParser.And_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(leeonParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(leeonParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(leeonParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(leeonParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(leeonParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(leeonParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(leeonParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link leeonParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(leeonParser.SelectContext ctx);
}