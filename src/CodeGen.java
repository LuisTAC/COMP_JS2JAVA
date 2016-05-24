import java.io.FileOutputStream;
import java.io.IOException;

public class CodeGen {
	
	private static String className;
	private static String code = "";
	
	
	public static void main(String[] args)
	{
		className = (args[0].substring(0, 1).toUpperCase() + args[0].substring(1)).split(".json")[0];
		// Tests
		System.out.println(GenerateClassCode());
		
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
	public static String GenerateClassCode() 
	{
		// TODO Add ".java" when creating .java file 
		//class
		code += "public class " + className +" {\n\n";
		//members
		
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
