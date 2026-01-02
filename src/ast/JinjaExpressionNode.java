package ast;

import visitor.AstVisitor;

public class JinjaExpressionNode extends AstNode {
    private String expression;

    public JinjaExpressionNode(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJinjaExpression(this);
    }
}
