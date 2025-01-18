package HtmlAST;

import AST.ASTNode;

public class HtmlAttribute implements ASTNode {
    private String name;  // The name of the attribute
    private String value; // The value of the attribute (may be null if no value)

    // Constructor for attribute with name and value
    public HtmlAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    // Constructor for attribute with name only (e.g., checked without value)
    public HtmlAttribute(String name) {
        this.name = name;
        this.value = null;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null) {
            return "HtmlAttribute{name='" + name + "', value='" + value + "'}";
        } else {
            return "HtmlAttribute{name='" + name + "'}";
        }
    }
}
