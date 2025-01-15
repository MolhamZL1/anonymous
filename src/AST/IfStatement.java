package AST;

import java.util.ArrayList;
import java.util.List;

public class IfStatement implements ASTNode {
    private Expression condition; // The condition for the if statement
    private Block block; // The block to execute if the condition is true
    private List<ElseIfStatement> elseIfStatements; // List of elseif statements
    private ElseStatement elseStatement; // The else block, if any

    public IfStatement(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
        this.elseIfStatements = new ArrayList<>();
    }

    public void addElseIfStatement(ElseIfStatement elseIfStatement) {
        this.elseIfStatements.add(elseIfStatement);
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public Block getBlock() {
        return block;
    }

    public List<ElseIfStatement> getElseIfStatements() {
        return elseIfStatements;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "condition=" + condition +
                ", block=" + block +
                ", elseIfStatements=" + elseIfStatements +
                ", elseStatement=" + elseStatement +
                '}';
    }
}
