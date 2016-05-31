
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JS2JAVARunner 
{
    public static void main( String[] args)
    {
    	if(args.length!=1 || !args[0].matches("[a-zA-Z0-9]+.json")) {
    		System.out.println("Args: [0] - 'file.json'");
    		return;
    	}
    	String className = (args[0].substring(0, 1).toUpperCase() + args[0].substring(1)).split(".json")[0];
    	
    	//import input file
    	ANTLRInputStream input;
        FileInputStream inFile;
		try {
			inFile = new FileInputStream(args[0]);
			input = new ANTLRInputStream(inFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
        JS2JAVALexer lexer = new JS2JAVALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JS2JAVAParser parser = new JS2JAVAParser(tokens);
        ParseTree tree = parser.json();
        System.out.println("Parse tree:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();
        
        System.out.println("AST:");
        AST ast = new AST(tree);
        System.out.println(ast);
        System.out.println();
        
        System.out.println("Code:");
        String code = generateClassCode(className);
        System.out.println(code);
        System.out.println();
        
        FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(className+".java");
	        outFile.write(code.getBytes());
	        outFile.close();
	      } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	// Generates Default Class code
	public static String generateClassCode(String className) 
	{
		String code = "";
		 
		//class
		code += "public class " + className +" {\n\n";

		//members
		//TODO member vars and functions
		
		//main
		code += "\tpublic static void main(String[] args) {\n"
				+ "\t\t//TODO Auto-generated method stub";
		
		//endmain
		code+="\n\t}";
		
		//endclass
		code+="\n\n}";
		
		return code;
	}
}