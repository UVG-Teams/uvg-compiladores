// Generated from yapl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yaplParser}.
 */
public interface yaplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yaplParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(yaplParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(yaplParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(yaplParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(yaplParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(yaplParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(yaplParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(yaplParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(yaplParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(yaplParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(yaplParser.ProgContext ctx);
}