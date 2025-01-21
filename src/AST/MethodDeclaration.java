package AST;

import java.util.List;

public class MethodDeclaration implements ASTNode {
    private String name;
    private Modifier modifier;
    private ParameterList parameterList;
    private String returnType;
    private Block block;

    public MethodDeclaration(String name, Modifier modifier, ParameterList parameterList, String returnType, Block block) {
        this.name = name;
        this.modifier = modifier;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public Modifier getModifiers() {
        return modifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public String getReturnType() {
        return returnType;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "\nMethodDeclaration{" +
                "\nname='" + name + '\'' +
                ",\nmodifiers=" + modifier +
                ",\nparameterList=" + parameterList +
                ",\nreturnType='" + (returnType != null ? returnType : "void") + '\'' +
                ",\nblock=" + block +
                '}';
    }
}
