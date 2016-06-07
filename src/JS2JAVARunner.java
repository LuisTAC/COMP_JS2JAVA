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
	static Listener listener;
	
	private static HashMap<String, Var> varTypes = new HashMap<String, Var>();
	
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
				
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		listener = new Listener();
		
		parseTreeWalker.walk(listener,tree);
		String content="";
		while(!listener.codeStack.isEmpty()) {
			content+=listener.codeStack.pop();
		}

		loadVarTypes(args[1]);
		
		String code = generateClassCode(className,content);

		FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(className + ".java");
			outFile.write(code.getBytes());
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static JsonObject parseJson(String str) {
		return new JsonParser().parse(str).getAsJsonObject();
	}
	
	public static void loadVarTypes(String fileName) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(fileName));
		String content = new String(encoded, "UTF-8");
		
		JsonObject res = parseJson(content);
						
		for (Map.Entry<String,JsonElement> entry : res.entrySet()){
			String key = entry.getKey();
			Var value = new Var(entry.getKey(),"0",entry.getValue().getAsString());
			
			varTypes.put(key, value);
		}
	}

	// Generates Default Class code
	public static String generateClassCode(String className, String content) {
		String code = "";

		// class
		code += "public class " + className + " {\n\n";

		// members
		for (Entry<String, Var> entry : varTypes.entrySet()) {
			code+="\tpublic " + entry.getValue().getType() + " " + entry.getKey()+";\n";
		}
		code+="\n";
		
		// main
		code += "\tpublic static void main(String[] args) {\n" + "\t\t//TODO Auto-generated method stub";

		// endmain
		code += "\n\t}\n";
		
		code += content;

		// endclass
		code += "\n\n}";

		return code;
	}
}