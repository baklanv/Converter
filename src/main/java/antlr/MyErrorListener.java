package antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class MyErrorListener extends BaseErrorListener {
    private List<String> _errors = new ArrayList<>();

    // метод, который добавляет ошибку в список
    public void addError(String error) {
        _errors.add(error);
    }

    public List<String> getErrors(){
        return _errors;
    }

    public String generateSrtErrors(){
        StringBuilder result = new StringBuilder();
        for (String error : _errors){
            result.append(error).append("\n");
        }
        return result.toString();
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        String error = "line " + line + ":" + charPositionInLine + " " + msg;
        addError(error);
       //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        //throw new LexerCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        //System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
        //System.err.println("Stack trace:");
        //e.printStackTrace(System.err);
    }
}
