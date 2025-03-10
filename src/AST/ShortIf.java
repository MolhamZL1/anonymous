package AST;

import AST.Expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class ShortIf implements ASTNode {
    private ASTNode expression;
    private Statement statement;
    private List<ShortElseIf> shortElseIfs;
    private ShortElse shortElse;

    public ShortIf(ASTNode expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
        this.shortElseIfs = new ArrayList<>();
    }

    public void addShortElseIf(ShortElseIf shortElseIf) {
        this.shortElseIfs.add(shortElseIf);
    }

    public void setShortElse(ShortElse shortElse) {
        this.shortElse = shortElse;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public Statement getStatement() {
        return statement;
    }

    public List<ShortElseIf> getShortElseIfs() {
        return shortElseIfs;
    }

    public ShortElse getShortElse() {
        return shortElse;
    }

    @Override
    public String toString() {
        return "\nShortIf{" +
                expression +
                statement +
                shortElseIfs +
               shortElse +
                "\n}";
    }
}
