import AST.Program;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;

import java.io.File;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("Tests");
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            String source = files[i].getPath();
            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            Program program = (Program) new BaseVisitor().visit(tree);
            System.out.println(program);
        }

    }
    }
