import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;


public class yaplMain {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        
        // Create the input stream.
        if (args.length > 0) inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);

        // Create the character stream from the input stream.
        CharStream cs = CharStreams.fromStream(is);

        // Create a lexer which scans the character stream to create a token stream.
        yaplLexer lexer = new yaplLexer(cs);
        lexer.addErrorListener(new ThrowingErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Print the token stream.
        System.out.println("Tokens:");
        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
        }

        // Create a parser which parses the token stream
        // to create a parse tree.
        yaplParser parser = new yaplParser(tokens);
        parser.addErrorListener(new ThrowingErrorListener());

        ParseTree tree = parser.prog();

        // Print the parse tree in Lisp format.
        System.out.println("\nParse tree (Lisp format):");
        System.out.println(tree.toStringTree(parser));
    }
}