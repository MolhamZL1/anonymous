package HtmlAST;

import AST.ASTNode;

public class HtmlChardata implements ASTNode {
    private String content;  // The content of the HTML text or whitespace
    private boolean isWhitespace;  // Flag to distinguish between text and whitespace

    // Constructor for HTML text content
    public HtmlChardata(String content) {
        this.content = content;
        this.isWhitespace = false;
    }

    // Constructor for whitespace content
    public HtmlChardata(String content, boolean isWhitespace) {
        this.content = content;
        this.isWhitespace = isWhitespace;
    }

    // Getter and setter methods
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isWhitespace() {
        return isWhitespace;
    }

    public void setWhitespace(boolean whitespace) {
        isWhitespace = whitespace;
    }

    @Override
    public String toString() {
        if (isWhitespace) {
            return "HtmlChardata{whitespace='" + content + "'}";
        } else {
            return "HtmlChardata{text='" + content + "'}";
        }
    }
}
