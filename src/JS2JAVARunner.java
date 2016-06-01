import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.google.gson.*;

public class JS2JAVARunner {
	public static HashMap<String, String> varTypes = new HashMap<String, String>();

	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Args:\n\t[0] - json file\n\t[1] - var types file");
			return;
		}
		String className = (args[0].substring(0, 1).toUpperCase() + args[0].substring(1)).split(".json")[0];

		// import input file
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
		
		/*int count=tree.getChildCount(); for(int i=0;i<count;i++)
		System.out.println("[" + i + "]: " + tree.getChild(i).getPayload());*/

		System.out.println("Parse tree:");
		System.out.println(tree.toStringTree(parser));
		System.out.println();

		/*System.out.println("AST:");
		AST ast = new AST(tree);
		System.out.println(ast);
		System.out.println();*/

		/*System.out.println("Var types:");
		loadVarTypes(args[1]);
		for (Entry<String, String> entry : varTypes.entrySet()) {
			String varName = entry.getKey();
			String varType = entry.getValue();
			System.out.println(varName + " : " + varType);
		}
		System.out.println();*/
		
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		JS2JAVAListenerExtended listener = new JS2JAVAListenerExtended();
		
		parseTreeWalker.walk(listener,tree);

		/*System.out.println("Code:");
		String code = generateClassCode(className);
		System.out.println(code);
		System.out.println();

		FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(className + ".java");
			outFile.write(code.getBytes());
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	private static JsonObject parseJson(String str) {
		return new JsonParser().parse(str).getAsJsonObject();
	}
	
	public static void loadVarTypes(String fileName) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(fileName));
		String content = new String(encoded, "UTF-8");
		
		JsonObject res = parseJson(content);
		
		String key, value;
		
		for (Map.Entry<String,JsonElement> entry : res.entrySet()){
			key = entry.getKey();
			value = entry.getValue().getAsString();
			
			varTypes.put(key, value);
		}
	}

	// Generates Default Class code
	public static String generateClassCode(String className) {
		String code = "";

		// class
		code += "public class " + className + " {\n\n";

		// members
		// TODO member vars and functions

		// main
		code += "\tpublic static void main(String[] args) {\n" + "\t\t//TODO Auto-generated method stub";

		// endmain
		code += "\n\t}";

		// endclass
		code += "\n\n}";

		return code;
	}
}