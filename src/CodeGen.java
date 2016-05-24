
public class CodeGen {
	
	private static String className;
	
	public static void main(String[] args)
	{
		className = args[0];
		className = className.substring(0, 1).toUpperCase() + className.substring(1);
		
		// Tests
		System.out.println(GenerateClassCode());
		
	}
	
	// Generates Default Class code
	public static String GenerateClassCode() 
	{
		String defCode = "";	
		
		String[] strArr = className.split(".json");
		
		// TODO Add ".java" when creating .java file 
		defCode = "public class " + strArr[0] +" {\n    \n    "
				+ "public static void main(String[] args) {\n"
				+ "        //TODO Auto-generated method stub \n\n    }\n\n}";
		
		return defCode;
	}

}
