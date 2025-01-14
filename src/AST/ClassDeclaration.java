package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements ASTNode {
    private String modifier; // Optional modifier (e.g., public, private, etc.)
    private String name; // Class name
    private String parentOrInterface; // Optional parent or interface
    private List<ASTNode> members; // List of class members

    public ClassDeclaration(String modifier, String name, String parentOrInterface) {
        this.modifier = modifier;
        this.name = name;
        this.parentOrInterface = parentOrInterface;
        this.members = new ArrayList<>();
    }

    public void addMember(ASTNode member) {
        members.add(member);
    }

    @Override
    public String toString() {
        return "ClassDeclaration{" +
                "modifier='" + modifier + '\'' +
                ", name='" + name + '\'' +
                ", parentOrInterface='" + parentOrInterface + '\'' +
                ", members=" + members +
                '}';
    }
}
