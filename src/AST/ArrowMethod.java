package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrowMethod implements ASTNode {
    private String modifier;         // Optional modifier (e.g., PUBLIC, PRIVATE)
    private String name;             // Optional method name (IDENTIFIER)
    private ParameterList parameters; // List of parameters
    private String returnType;       // Optional return type (IDENTIFIER)
    private List<Statement> statements; // List of statements inside the method block

    public ArrowMethod(String modifier, String name, ParameterList parameters, String returnType) {
        this.modifier = modifier;
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public String getModifier() {
        return modifier;
    }

    public String getName() {
        return name;
    }

    public ParameterList getParameters() {
        return parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "ArrowMethod{" +
                "modifier='" + modifier + '\'' +
                ", name='" + name + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + returnType + '\'' +
                ", statements=" + statements +
                '}';
    }
}
