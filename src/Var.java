public class Var {
	String name;
	String classScope;
	String type;
	
	Var(String name, String classScope, String type) {
		this.name=name;
		this.classScope=classScope;
		this.type=type;
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
}
