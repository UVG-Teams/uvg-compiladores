import org.antlr.v4.runtime.*;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("\n" + ANSI_RED + "----------------------------- ERROR -----------------------------" + ANSI_RESET);
        System.err.println(ANSI_RED + "Error: position " + line + ":" + charPositionInLine + " " + msg + ANSI_RESET);
        System.err.println(ANSI_RED + "-----------------------------------------------------------------" + ANSI_RESET + "\n");
    }
}
