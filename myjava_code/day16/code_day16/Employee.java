

public abstract class Employee {
	private     String number;
	protected 	String name;
	//protected	double salary;
	protected	Mydate birthday;
    
	public abstract double earning() ;
	public 	String toString() {
		return "name: "+name+" number "+number+" birthday "+birthday;
	}
	public Employee() {}
	public Employee(String name, String number, Mydate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}
	public Employee(String name, Mydate birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	
}


