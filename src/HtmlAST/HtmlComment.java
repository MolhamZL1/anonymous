package HtmlAST;

import AST.ASTNode;

public class HtmlComment implements ASTNode {
    private String commentContent;  // The content of the comment
    private boolean isConditional;  // Flag to distinguish between regular and conditional comments

    // Constructor for regular HTML comment
    public HtmlComment(String commentContent) {
        this.commentContent = commentContent;
        this.isConditional = false;
    }

    // Constructor for conditional HTML comment
    public HtmlComment(String commentContent, boolean isConditional) {
        this.commentContent = commentContent;
        this.isConditional = isConditional;
    }

    // Getter and setter methods
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public boolean isConditional() {
        return isConditional;
    }

    public void setConditional(boolean conditional) {
        isConditional = conditional;
    }

    @Override
    public String toString() {
        return "HtmlComment{" +
                "commentContent='" + commentContent + '\'' +
                ", isConditional=" + isConditional +
                '}';
    }
}
