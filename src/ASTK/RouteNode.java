package ASTK;

public class RouteNode extends DefinitionNode {


    public String path;
    public FunctionDefNode function;

    public RouteNode(String path, FunctionDefNode func, int line) {
        super("RouteDefinition", line);
        this.path = path;
        this.function = func;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + NodeName + " [Path: " + path + "]");
        function.print(indent + "  ");
    }
}
