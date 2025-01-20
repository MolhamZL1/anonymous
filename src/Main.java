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

    static void printAST(File file)throws IOException{
        String source = file.getPath();
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor().visit(tree);
        System.out.println("The Parser Output for "+file.getName() +" :");
        System.out.println(program);
    }
    static void getTests(String path)throws IOException {
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                if (files[i].getName().contains("ts"))
                printAST(files[i]);
                else if(files[i].getName().contains("html"))continue;
               //     printAST(files[i]);
                else continue;
            }
            else {
                getTests(files[i].getPath());
            }}
    }
    public static void main(String[] args) throws IOException {
        getTests("src/Tests");
    }
    }
