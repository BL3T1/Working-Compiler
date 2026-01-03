package AST;

public class BinaryOpNode extends ExpressionNode{

    public ExpressionNode left;
    public String operator;
    public ExpressionNode right;

    public BinaryOpNode(ExpressionNode left, String op, ExpressionNode right, int line) {
        super("BinaryOperation", line);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "OP (" + operator + ")");
        left.print(indent + "  ");
        right.print(indent + "  ");
    }
}
