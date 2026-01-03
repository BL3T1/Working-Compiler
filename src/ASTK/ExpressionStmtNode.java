package AST;

public class ExpressionStmtNode extends StatementNode {
    public ExpressionNode expression;

    public ExpressionStmtNode(ExpressionNode expression, int line) {
        super("ExprStmt", line);
        this.expression = expression;
    }

    @Override
    public void print(String indent) {

        if (expression != null) {
            expression.print(indent);
        }
    }
}