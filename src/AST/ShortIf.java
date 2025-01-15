package AST;

import java.util.ArrayList;
import java.util.List;

public class ShortIf implements ASTNode {
    private Expression expression;            // The condition for the if statement
    private Statement statement;              // The statement executed if the condition is true
    private List<ShortElseIf> shortElseIfs;   // A list of else-if blocks
    private ShortElse shortElse;              // The else block at the end

    public ShortIf(Expression expression, Statement statement) {
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

    public Expression getExpression() {
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
        return "ShortIf{" +
                "expression=" + expression +
                ", statement=" + statement +
                ", shortElseIfs=" + shortElseIfs +
                ", shortElse=" + shortElse +
                '}';
    }
}
