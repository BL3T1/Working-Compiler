package AST;

import antlr.FlaskParser;
import antlr.FlaskParserBaseVisitor;
import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends FlaskParserBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(FlaskParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode(ctx.start.getLine());
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ASTNode child = visit(ctx.getChild(i));
            if (child != null) {
                program.elements.add(child);
            }
        }
        return program;
    }

    @Override
    public ASTNode visitRoute_definition(FlaskParser.Route_definitionContext ctx) {
        String url = ctx.STRING_LITERAL().getText();
        FunctionDefNode func = (FunctionDefNode) visit(ctx.function_definition());
        return new RouteNode(url, func, ctx.start.getLine());
    }

    @Override
    public ASTNode visitClass_definition(FlaskParser.Class_definitionContext ctx) {
        String className = ctx.ID(0).getText();
        String parentName = (ctx.ID().size() > 1) ? ctx.ID(1).getText() : null;
        BlockNode body = (BlockNode) visit(ctx.block());

        return new ClassNode(className, parentName, body, ctx.start.getLine());
    }

    @Override
    public ASTNode visitFunction_definition(FlaskParser.Function_definitionContext ctx) {
        String funcName = ctx.ID().getText();
        List<String> params = new java.util.ArrayList<>();

        if (ctx.parameter_list() != null) {
            for (var idNode : ctx.parameter_list().ID()) {
                params.add(idNode.getText());
            }
        }

        BlockNode body = (BlockNode) visit(ctx.block());
        return new FunctionDefNode(funcName, params, body, ctx.start.getLine());
    }

    @Override
    public ASTNode visitParameter_list(FlaskParser.Parameter_listContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBlock(FlaskParser.BlockContext ctx) {
        BlockNode block = new BlockNode(ctx.start.getLine());
        for (var stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node != null) {
                block.statements.add((StatementNode) node);
            }
        }
        return block;
    }

    @Override
    public ASTNode visitIfSStmt(FlaskParser.IfSStmtContext ctx) {
        return visit(ctx.if_statement());
    }

    @Override
    public ASTNode visitForStmt(FlaskParser.ForStmtContext ctx) {
        return visit(ctx.for_statement());
    }

    @Override
    public ASTNode visitWhileStmt(FlaskParser.WhileStmtContext ctx) {
        return visit(ctx.while_statement());
    }

    @Override
    public ASTNode visitPrintStmt(FlaskParser.PrintStmtContext ctx) {
        return visit(ctx.print_statement());
    }

    @Override
    public ASTNode visitReturnStmt(FlaskParser.ReturnStmtContext ctx) {
        return visit(ctx.return_statement());
    }

    @Override
    public ASTNode visitFunctionStmt(FlaskParser.FunctionStmtContext ctx) {
        return visit(ctx.function_definition());
    }

    @Override
    public ASTNode visitAssignStmt(FlaskParser.AssignStmtContext ctx) {
        return visit(ctx.assignment_statement());
    }

    @Override
    public ASTNode visitExprStmt(FlaskParser.ExprStmtContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new ExpressionStmtNode(expr, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitBreakStmt(FlaskParser.BreakStmtContext ctx) {
        return new JumpNode("BREAK", null, ctx.start.getLine());
    }

    @Override
    public ASTNode visitContinueStmt(FlaskParser.ContinueStmtContext ctx) {
        return new JumpNode("CONTINUE", null, ctx.start.getLine());
    }

    @Override
    public ASTNode visitIf_statement(FlaskParser.If_statementContext ctx) {
        ExpressionNode cond = (ExpressionNode) visit(ctx.expression());
        BlockNode thenPart = (BlockNode) visit(ctx.block(0));
        BlockNode elsePart = (ctx.block().size() > 1) ? (BlockNode) visit(ctx.block(1)) : null;

        ControlFlowNode node = new ControlFlowNode("IfStmt", cond, thenPart, ctx.start.getLine());
        node.elseBody = elsePart;
        return node;

    }

    @Override
    public ASTNode visitFor_statement(FlaskParser.For_statementContext ctx) {
        String varName = ctx.var.getText();
        ExpressionNode iterable = (ExpressionNode) visit(ctx.iter);
        BlockNode body = (BlockNode) visit(ctx.block());

        ControlFlowNode node = new ControlFlowNode("ForLoop", iterable, body, ctx.start.getLine());
        node.iteratorVar = varName;
        return node;
    }

    @Override
    public ASTNode visitRange_loop(FlaskParser.Range_loopContext ctx) {
        int line = ctx.getStart().getLine();

        LiteralNode rangeId = new LiteralNode("ID", "range", line);
        AccessNode rangeCall = new AccessNode(rangeId, "CALL", line);

        for (var exprCtx : ctx.expression()) {
            rangeCall.args.add((ExpressionNode) visit(exprCtx));
        }
        return rangeCall;
    }

    @Override
    public ASTNode visitWhile_statement(FlaskParser.While_statementContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        BlockNode body = (BlockNode) visit(ctx.block());
        return new ControlFlowNode("WhileLoop", condition, body, ctx.start.getLine());
    }

    @Override
    public ASTNode visitPrint_statement(FlaskParser.Print_statementContext ctx) {
        ExpressionNode expr = (ctx.expression() != null) ? (ExpressionNode) visit(ctx.expression()) : null;
        return new JumpNode("PRINT", expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitReturn_statement(FlaskParser.Return_statementContext ctx) {
        ExpressionNode expr = null;
        if (ctx.expression() != null) {
            expr = (ExpressionNode) visit(ctx.expression());
        }
        // If it's a RENDER_TEMPLATE, you could wrap it in a special Literal or AccessNode
        return new JumpNode("RETURN", expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitTemplate_call_arguments(FlaskParser.Template_call_argumentsContext ctx) {
        return super.visitTemplate_call_arguments(ctx);
    }

    @Override
    public ASTNode visitTemplate_argument(FlaskParser.Template_argumentContext ctx) {
        return super.visitTemplate_argument(ctx);
    }

    @Override
    public ASTNode visitAssignment_statement(FlaskParser.Assignment_statementContext ctx) {
        String target = ctx.variable_access().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        return new AssignmentNode(target, value, ctx.start.getLine());
    }

    @Override
    public ASTNode visitValue_list(FlaskParser.Value_listContext ctx) {
        return super.visitValue_list(ctx);
    }

    @Override
    public ASTNode visitIndexAccess(FlaskParser.IndexAccessContext ctx) {

        ExpressionNode base = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode index = (ExpressionNode) visit(ctx.expression(1));
        AccessNode node = new AccessNode(base, "INDEX", ctx.getStart().getLine());
        node.args.add(index);
        return node;
    }

    @Override
    public ASTNode visitMemberAccess(FlaskParser.MemberAccessContext ctx) {
        ExpressionNode base = (ExpressionNode) visit(ctx.expression());
        String memberName = ctx.ID().getText();
        AccessNode node = new AccessNode(base, "MEMBER", ctx.start.getLine());
        node.identifier = memberName;
        return node;
    }

    @Override
    public ASTNode visitNotExpr(FlaskParser.NotExprContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new BinaryOpNode(null, "NOT", expr, ctx.start.getLine());
    }

    @Override
    public ASTNode visitPrimaryExpr(FlaskParser.PrimaryExprContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public ASTNode visitAddMinusExpr(FlaskParser.AddMinusExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
        return new BinaryOpNode(left, op, right, ctx.start.getLine());
    }

    @Override
    public ASTNode visitLogicalExpr(FlaskParser.LogicalExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new BinaryOpNode(left, ctx.getChild(1).getText(), right, ctx.start.getLine());
    }

    @Override
    public ASTNode visitFunctionCall(FlaskParser.FunctionCallContext ctx) {
        ExpressionNode base = (ExpressionNode) visit(ctx.expression());
        AccessNode node = new AccessNode(base, "FunctionCall", ctx.start.getLine());


        if (ctx.value_list() != null) {
            for (var exprCtx : ctx.value_list().expression()) {
                node.args.add((ExpressionNode) visit(exprCtx));
            }
        }
        return node;
    }

    @Override
    public ASTNode visitComparsionExpr(FlaskParser.ComparsionExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
        return new BinaryOpNode(left, op, right, ctx.start.getLine());
    }

    @Override
    public ASTNode visitMulDivExpr(FlaskParser.MulDivExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new BinaryOpNode(left, ctx.getChild(1).getText(), right, ctx.start.getLine());
    }

    @Override
    public ASTNode visitEqualityExpr(FlaskParser.EqualityExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new BinaryOpNode(left, ctx.getChild(1).getText(), right, ctx.start.getLine());
    }

    @Override
    public ASTNode visitIdExpr(FlaskParser.IdExprContext ctx) {
        return new LiteralNode("ID", ctx.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitIntExpr(FlaskParser.IntExprContext ctx) {
        return new LiteralNode("INT", Integer.parseInt(ctx.getText()), ctx.start.getLine());
    }

    @Override
    public ASTNode visitFloatExpr(FlaskParser.FloatExprContext ctx) {
        return new LiteralNode("FLOAT", Double.parseDouble(ctx.getText()), ctx.start.getLine());
    }

    @Override
    public ASTNode visitStringExpr(FlaskParser.StringExprContext ctx) {
        String val = ctx.getText().substring(1, ctx.getText().length() - 1);
        return new LiteralNode("STRING", val, ctx.start.getLine());
    }

    @Override
    public ASTNode visitTrueExpr(FlaskParser.TrueExprContext ctx) {
        return new LiteralNode("BOOLEAN", true, ctx.start.getLine());
    }

    @Override
    public ASTNode visitFalseExpr(FlaskParser.FalseExprContext ctx) {
        return new LiteralNode("BOOLEAN", false, ctx.start.getLine());
    }

    @Override
    public ASTNode visitNoneExpr(FlaskParser.NoneExprContext ctx) {
        return new LiteralNode("NONE", null, ctx.start.getLine());
    }

    @Override
    public ASTNode visitRangeExpr(FlaskParser.RangeExprContext ctx) {
        return visit(ctx.range_loop());
    }

    @Override
    public ASTNode visitListExpr(FlaskParser.ListExprContext ctx) {
        return visit(ctx.list_literal());
    }

    @Override
    public ASTNode visitParentExpr(FlaskParser.ParentExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitList_literal(FlaskParser.List_literalContext ctx) {
        List<ExpressionNode> elements = new ArrayList<>();
        if (ctx.expression() != null) {
            for (FlaskParser.ExpressionContext exprCtx : ctx.expression()) {
                elements.add((ExpressionNode) visit(exprCtx));
            }
        }

        return new LiteralNode("LIST", elements, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitVariable_access(FlaskParser.Variable_accessContext ctx) {
        String idText = ctx.ID(0).getText();
        int line = ctx.getStart().getLine();

        ASTNode current = new LiteralNode("ID", idText, line);
        return current;
    }
}
