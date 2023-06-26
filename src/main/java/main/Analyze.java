package main;

import antlr.MyErrorListener;
import antlr.MyVisitor;
import antlr.com.MyGrammarLexer;
import antlr.com.MyGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Analyze {
    public static void main(String[] args) {
        if (args.length != 0) {
            String path = args[0];
            File file = new File(path);
            String inputFileName = file.getName();
            String filenameErrors = checkFilename(inputFileName);
            String errorFilename = file.getPath().replaceFirst("\\.\\w+$", ".err");
            if (filenameErrors.isEmpty()) {
                String input = readFileToString(path);
                if (input.isEmpty())
                    input = "Error:\nfile is empty!";

                if (!input.contains("Error:")) {
                    String outputFilename = file.getPath().substring(0, file.getPath().length() - 1);

                    MyErrorListener myErrorListener = new MyErrorListener();
                    MyGrammarLexer lexer = new MyGrammarLexer(CharStreams.fromString(input));
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(myErrorListener);

                    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                    MyGrammarParser parser = new MyGrammarParser(tokenStream);
                    parser.removeErrorListeners();
                    parser.addErrorListener(myErrorListener);

                    MyGrammarParser.ProgramContext programContext = parser.program();
                    List<String> parsingError = myErrorListener.getErrors();
                    if (parsingError.isEmpty()) {
                        MyVisitor visitor = new MyVisitor();
                        String result = visitor.visit(programContext);

                        if (!result.contains("Error:") && !result.isEmpty()) {
                            result = addMetadata(result, input);
                            writeStringToFile(result, outputFilename);
                        } else {
                            if (result.isEmpty())
                                writeStringToFile("Conversion failed", errorFilename);
                            else
                                writeStringToFile(result, errorFilename);
                        }
                    } else {
                        writeStringToFile(myErrorListener.generateSrtErrors(), errorFilename);
                    }
                } else {
                    writeStringToFile(input, errorFilename);
                }
            } else {
                writeStringToFile(filenameErrors, errorFilename);
            }
        } else {
            System.out.println("Error: file not specified");
        }
    }

    public static String readFileToString(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            byte[] bytes = fis.readAllBytes();
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                return "Error:\n" + filename + " is not found";
            } else {
                return "Error:\n" + e.getMessage();
            }
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

    public static String addMetadata(String base, String metadata) {
        String keyword = "(metadata";
        int index = metadata.indexOf(keyword);
        String newString = metadata.substring(index);
        return base + "\n" + newString;
    }

    public static String checkFilename(String filename) {
        String result = "";
        int dotIndex = filename.lastIndexOf(".");
        String name = filename.substring(0, dotIndex);
        String extension = filename.substring(dotIndex);
        String pattern = "[a-zA-Z0-9_]+";
        if (name.isEmpty() || !name.matches(pattern)) {
            result += "Error:\nThe file name contains characters other than the Latin alphabet, numbers and the symbol '_'\n";
        }
        if (!extension.equals(".ludx")) {
            if (result.isEmpty()) {
                result += "Error:\n";
            }
            result += "The original file has the wrong extension\n";
        }
        return result;
    }
}
