import java.util.HashMap;

public class IR {
	public HashMap<String,Field> fields;
	public HashMap<String,Method> methods;
	public HashMap<String,Var> localVars;
	
	public void addField(Field field) {
		fields.put(field.getName(), field);
	}
	
	public void addMethod(Method method) {
		methods.put(method.getName(), method);
	}
	
	public void addLocalVar(Var localVar) {
		localVars.put(localVar.getName(), localVar);
	}
}
