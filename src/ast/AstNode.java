package ast;

import visitor.AstVisitor;

public abstract class AstNode {
    protected String nodeName;
    protected int lineNumber;

    public AstNode() {
        this.nodeName = this.getClass().getSimpleName();
        this.lineNumber = -1;
    }

    public AstNode(int lineNumber) {
        this.nodeName = this.getClass().getSimpleName();
        this.lineNumber = lineNumber;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public abstract <T> T accept(AstVisitor<T> visitor);
}
