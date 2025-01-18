package HtmlAST;

import AST.ASTNode;

public class HtmlMisc implements ASTNode {
    private String content;  // The content of the comment or whitespace
    private boolean isWhitespace;  // Flag to distinguish between comments and whitespace

    // Constructor for whitespace content
    public HtmlMisc(String content, boolean isWhitespace) {
        this.content = content;
        this.isWhitespace = isWhitespace;
    }

    // Constructor for comment content
    public HtmlMisc(String content) {
        this.content = content;
        this.isWhitespace = false;
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
            return "HtmlMisc{whitespace='" + content + "'}";
        } else {
            return "HtmlMisc{comment='" + content + "'}";
        }
    }
}
