package ast;

import visitor.AstVisitor;

public class JinjaStatementNode extends AstNode {
    private String statement;

    public JinjaStatementNode(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitJinjaStatement(this);
    }
}
