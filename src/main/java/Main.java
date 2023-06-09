import antlr.com.MyGrammarLexer;
import antlr.com.MyGrammarParser;
import antlr.MyVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        //String fileName = "SUPER_Cumi_04 — TOBE.lud";
        String fileName = args[0];
        String input = readFileToString(fileName);

        MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokenStream);
        MyGrammarParser.ProgramContext programContext = parser.program();
        MyVisitor visitor = new MyVisitor();
        String result = visitor.visit(programContext);

        result = addMetadata(result, input);

        writeStringToFile(result, "new_" + fileName);
    }

    public static String readFileToString(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            byte[] bytes = fis.readAllBytes();
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeStringToFile(String g4String, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(g4String.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String addMetadata(String base, String metadata){
        String keyword = "(metadata";
        int index = metadata.indexOf(keyword);
        String newString = metadata.substring(index);
        return base + "\n" + newString;
    }
}
