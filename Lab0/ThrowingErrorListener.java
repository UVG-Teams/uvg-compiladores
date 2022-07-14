import org.antlr.v4.runtime.*;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("--------------------------- ERROR ---------------------------");
        System.err.println("Error: position " + line + ":" + charPositionInLine + " " + msg);
        System.err.println("-------------------------------------------------------------");
    }
}
