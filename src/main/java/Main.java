import antlr.MyListener;
import antlr.com.MyGrammarLexer;
import antlr.com.MyGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString( "// ------------------------------- Abstract pieces -------------------------------\n" +
                "(@piece @abstract \"Animal\"\n" +
                "\n" +
                "\t(define \"MoveStep\"\n" +
                "\t\t(move Step \n" +
                "\t\t\t#1\n" +
                "\t\t\t(to if:\n" +
                "\t\t\t\t(is Empty \n" +
                "\t\t\t\t\t(to)\n" +
                "\t\t\t\t)\n" +
                "\t\t\t)\n" +
                "\t\t\t#2\n" +
                "\t\t)\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "(@piece @abstract \"Dog\" @is_a: \"Animal\"\n" +
                ")\n" +
                "\n" +
                "(@piece @abstract \"EatenDog\" @is_a: \"Dog\"\n" +
                ")\n" +
                "\n" +
                "(@piece @abstract \"ProcreativeDog\" @is_a: \"Dog\"\n" +
                "\n" +
                "\t(define \"GiveOffspring\"\n" +
                "\t\t(move Select (from) \n" +
                "\t\t\t(then \n" +
                "\t\t\t\t(add \n" +
                "\t\t\t\t\t(piece (id  #1 Mover) )\n" +
                "\t\t\t\t\t(to (sites Random) )\n" +
                "\t\t\t\t)\n" +
                "\t\t\t)\n" +
                "\t\t)\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "// ------------------------------- Final pieces -------------------------------\n" +
                "\n" +
                "(@piece \"Jaguar\" @is_a: \"Animal\"\n" +
                "\n" +
                "\t(define \"Eat\"\n" +
                "\t\t(move Hop \n" +
                "\t\t\t(between if:\n" +
                "\t\t\t\t(\"@isInstanceOf\" \n" +
                "\t\t\t\t\t( what at: (between) ) \n" +
                "\t\t\t\t\t\"EatenDog\"\n" +
                "\t\t\t\t)\n" +
                "\t\t\t\t(apply \n" +
                "\t\t\t\t\t(remove \n" +
                "\t\t\t\t\t\t(between)\n" +
                "\t\t\t\t\t)\n" +
                "\t\t\t\t)\n" +
                "\t\t\t)\n" +
                "\t\t\t\n" +
                "\t\t\t(to if:\n" +
                "\t\t\t\t(is Empty \n" +
                "\t\t\t\t\t(to)\n" +
                "\t\t\t\t)\n" +
                "\t\t\t)\n" +
                "\t\t)\n" +
                "\t)\n" +
                "\t\n" +
                "\t(or\n" +
                "\t\t\"MoveStep\"\n" +
                "\t\t\"Eat\"\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "(@piece \"CommonDog\" @is_a: \"EatenDog\"\n" +
                "\t\"MoveStep\"\n" +
                ")\n" +
                "\n" +
                "(@piece \"AgedDog\" @is_a: \"CommonDog\"\n" +
                "\t(\"MoveStep\" \n" +
                "\t\t~ \n" +
                "\t\t(then\n" +
                "\t\t\t(remove (last To)) \n" +
                "\t\t)\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "(@piece \"AlphaDog\" @is_a: { \"EatenDog\", \"ProcreativeDog\" }\n" +
                "\t(or\n" +
                "\t\t\"MoveStep\"\n" +
                "\t\t(\"GiveOffspring\" \"CommonDog\")\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "(@piece \"DogChief\" @is_a: \"ProcreativeDog\"\n" +
                "\t(or\n" +
                "\t\t\"MoveStep\"\n" +
                "\t\t(\"GiveOffspring\" \"CommonDog\")\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "// --------------------------------------------------------------\n" +
                "\n" +
                "(game \"SuperCumi\"\n" +
                "\t(players 2)\n" +
                "\t\n" +
                "\t(equipment { \t\n" +
                "\t\n" +
                "\t\t(board \n" +
                "\t\t\t(merge \n" +
                "\t\t\t\t(shift 0 2 \n" +
                "\t\t\t\t\t(square 5 diagonals:Alternating)\n" +
                "\t\t\t\t)\t\t\t\t\n" +
                "\t\t\t\t(wedge 3)\n" +
                "\t\t\t)\n" +
                "\t\tuse:Vertex )\n" +
                "\t\t\n" +
                "\t\t// ------------------------------------------------------------\n" +
                "\n" +
                "\t\t(piece \"Jaguar\" P1 )\n" +
                "\t\t\n" +
                "\t\t(piece \"CommonDog\" P2 )\t\t\n" +
                "\t\t\n" +
                "\t\t(piece \"AgedDog\" P2 )\t\n" +
                "\t\t\n" +
                "\t\t(piece \"AlphaDog\" P2 )\n" +
                "\t\t\n" +
                "\t\t(piece \"DogChief\" P2 )\n" +
                "\t\n" +
                "\t\t// ------------------------------------------------------------\n" +
                "\t})\n" +
                "\t\n" +
                "\t(rules \n" +
                "\t\t(start { \n" +
                "\n" +
                "\t\t\t(place \"Jaguar1\" coord:\"C7\")\n" +
                "\n" +
                "\t\t\t(place \"CommonDog2\" (sites Bottom) )\n" +
                "\n" +
                "\t\t\t(place \"AgedDog2\" coord:\"C3\")\n" +
                "\n" +
                "\t\t\t(place \"AlphaDog2\" coord:\"B4\")\n" +
                "\t\t\t\n" +
                "\t\t\t(place \"DogChief2\" coord:\"D4\")\t\t\n" +
                "\t\t})\n" +
                "\t\t\n" +
                "\t\t(play \n" +
                "\t\t\t(forEach Piece)\n" +
                "\t\t)\n" +
                "\t\t\n" +
                "\t\t(end { \n" +
                "\t\t\t(if \n" +
                "\t\t\t\t(no Moves Next)\n" +
                "\t\t\t\t(result Next Loss)\n" +
                "\t\t\t)\n" +
                "\t\t\t\n" +
                "\t\t\t(if \n" +
                "\t\t\t\t(<= (count Pieces P2) 4)\n" +
                "\t\t\t\t(result P2 Loss)\n" +
                "\t\t\t)\n" +
                "        })\n" +
                "\t)\n" +
                ")\n" +
                "\n" +
                "\n" +
                "//------------------------------------------------------------------------------\n" +
                "\n" +
                "(metadata    \n" +
                "    (graphics {\n" +
                "\n" +
                "        (show Edges Diagonal Hidden)\n" +
                "\n" +
                "\t\t(piece Colour P1 \"Jaguar\" fillColour:(colour LightOrange))\n" +
                "\n" +
                "\t\t(piece Colour P2 \"AlphaDog\" fillColour:(colour LightGrey))\n" +
                "\t\t(piece Colour P2 \"DogChief\" fillColour:(colour LightTan))\t\t\n" +
                "\t\t(piece Colour P2 \"AgedDog\" fillColour:(colour White))\n" +
                "    })    \n" +
                ")\n"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.program();


        System.out.println("Parse tree : " + tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener myLispListener = new MyListener();
        walker.walk(myLispListener, tree);

        //int ui =
        myLispListener.mapFormation();
        int k = 0 +22;
    }
}