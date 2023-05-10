import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        LispLexer lexer = new LispLexer(CharStreams.fromString( "( game \"TicTacToe\"\n" +
                "( players 2)\n" +
                "( equipment\n" +
                "{\n" +
                "( board ( square 3) )\n" +
                "( piece \"Disc\" P1)\n" +
                "( piece \"Cross\" P2)\n" +
                "}\n" +
                ")\n" +
                "( rules\n" +
                "( play move )\n" +
                "(end move )\n" +
                ")\n" +
                ")"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LispParser parser = new LispParser(tokens);
        ParseTree tree = parser.program();


        System.out.println("Parse tree : " + tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        MyLispListener myLispListener = new MyLispListener();
        walker.walk(myLispListener, tree);
    }
}
