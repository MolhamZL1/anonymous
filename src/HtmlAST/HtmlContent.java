package HtmlAST;

import java.util.ArrayList;
import java.util.List;
import AST.ASTNode;

public class HtmlContent implements ASTNode {
    private List<HtmlChardata> chardatas = new ArrayList<>(); // List of text/whitespace
    private List<HtmlElement> htmlElements = new ArrayList<>(); // Nested elements
    private List<CDATA> cdataSections = new ArrayList<>(); // CDATA sections
    private List<HtmlComment> htmlComments = new ArrayList<>(); // HTML comments

    // Methods to add content types
    public void addChardata(HtmlChardata chardata) {
        chardatas.add(chardata);
    }

    public void addHtmlElement(HtmlElement htmlElement) {
        htmlElements.add(htmlElement);
    }

    public void addCdata(CDATA cdata) {
        cdataSections.add(cdata);
    }

    public void addHtmlComment(HtmlComment htmlComment) {
        htmlComments.add(htmlComment);
    }

    // Getters for the content
    public List<HtmlChardata> getChardatas() {
        return chardatas;
    }

    public List<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public List<CDATA> getCdataSections() {
        return cdataSections;
    }

    public List<HtmlComment> getHtmlComments() {
        return htmlComments;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "chardatas=" + chardatas +
                ", htmlElements=" + htmlElements +
                ", cdataSections=" + cdataSections +
                ", htmlComments=" + htmlComments +
                '}';
    }
}
