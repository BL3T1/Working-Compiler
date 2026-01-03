package ASTK;
import java.util.List;


public class FunctionDefNode extends StatementNode{

    public String name;
    public List<String> parameters;
    public BlockNode body;

    public FunctionDefNode(String name, List<String> params, BlockNode body, int line) {
        super("FunctionDefinition", line);
        this.name = name;
        this.parameters = params;
        this.body = body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "FunctionDefinition [" + name + "] Params: " + parameters);
        body.print(indent + "  ");
    }

}
