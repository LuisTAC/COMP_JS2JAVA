import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JS2JAVARunner 
{
    public static void main( String[] args)
    {
    	ANTLRInputStream input;
        FileInputStream in;
		try {
			in = new FileInputStream(args[0]);
			input = new ANTLRInputStream(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

        JS2JAVALexer lexer = new JS2JAVALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JS2JAVAParser parser = new JS2JAVAParser(tokens);
        ParseTree tree = parser.s();
        System.out.println(tree.toStringTree(parser));
    }
}