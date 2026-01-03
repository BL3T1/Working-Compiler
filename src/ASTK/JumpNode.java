package AST;

public class JumpNode extends StatementNode{


    public String type;
    public ExpressionNode value;

    public JumpNode(String type, ExpressionNode value, int line) {
        super("JumpStmt", line);
        this.type = type;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName + " type: " + type);
        if (value != null) value.print(indent + "  ");
    }
}
