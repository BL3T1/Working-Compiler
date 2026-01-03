package AST;

public abstract class ASTNode {
    public String NodeName;
    public int LineNumber;


    public ASTNode(String NodeName, int LineNumber) {
        this.NodeName = NodeName;
        this.LineNumber = LineNumber;
    }

    public abstract void print(String indent);
}
