package AST;

import java.util.ArrayList;
import java.util.List;

public class ConstructorDeclaration implements ASTNode {
    private ParameterList parameters; // List of parameters
    private Block block; // Block content

    public ConstructorDeclaration(ParameterList parameters,Block block) {
        this.parameters =parameters;
        this.block = block;
    }



    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "ConstructorDeclaration{" +
                "parameters=" + parameters +
                ", block=" + block +
                '}';
    }
}
