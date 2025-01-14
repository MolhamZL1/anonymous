package AST;

public class NgOn implements ASTNode {
    private String lifecycleHook; // The type of lifecycle hook (e.g., ngOnInit, ngOnChanges)
    private ParameterList parameters; // Parameters for the method
    private String returnType; // Optional return type
    private Block block; // The body of the method

    public NgOn(String lifecycleHook, ParameterList parameters, String returnType, Block block) {
        this.lifecycleHook = lifecycleHook;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    @Override
    public String toString() {
        return "NgOn{" +
                "lifecycleHook='" + lifecycleHook + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + returnType + '\'' +
                ", block=" + block +
                '}';
    }
}
