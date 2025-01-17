package AST;

import AST.Expressions.Expression;

public class VariableDeclaration implements ASTNode {
    private String modifier;
    private String type;
    private String name; // Variable name (IDENTIFIER)
    private Expression expression; // Optional expression (COLON expression)
    private Expression initialValue; // Optional initial value (EQUAL expression)
    private String alias; // Optional alias for the variable (AS IDENTIFIER)

    public VariableDeclaration(String modifier, String type, String name, Expression expression, Expression initialValue, String alias) {
        this.modifier = modifier;
        this.type = type;
        this.name = name;
        this.expression = expression;
        this.initialValue = initialValue;
        this.alias = alias;
    }

    public String getModifier() {
        return modifier;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    public Expression getInitialValue() {
        return initialValue;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "\nVariableDeclaration{" +
                "modifier='" + modifier + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", expression=" + expression +
                ", initialValue=" + initialValue +
                ", alias='" + alias + '\'' +
                "\n}";
    }
}
