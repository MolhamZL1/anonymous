package AST;

import java.util.ArrayList;
import java.util.List;

public class NgOn implements ASTNode {
    private String type; // Either NGONINIT or NGONCHANGES
    private ParameterList parameters; // List of parameters
    private String returnType; // Optional return type
    private Block block; // Block content

    public NgOn(String type,ParameterList parameters, String returnType, Block block) {
        this.type = type;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    public String getType() {
        return type;
    }


    public String getReturnType() {
        return returnType;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "NgOn{" +
                "type='" + type + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + (returnType != null ? returnType : "void") + '\'' +
                ", block=" + block +
                '}';
    }
}
