import java.util.ArrayList;

public class Method {
	String name;
	String classScope;
	String type;
	ArrayList<String> parameters = new ArrayList<String>();
	
	Method(String name, String classScope, String type, ArrayList<String> parameters) {
		this.name = name;
		this.classScope = classScope;
		this.type=type;
		this.parameters = parameters;
	}
	
	public String getName() {
		return name;
	}
	public String getClassScope() {
		return classScope;
	}
	public String getType() {
		return this.type;
	}
	public ArrayList<String> getParameters() {
		return this.parameters;
	}
	public String getParameter(int i) {
		return this.parameters.get(i);
	}
}
