package code_day15;

public class Employee {
	protected	String name;
	protected	double salary;
	protected	Mydate birthday;
    
	public double earning() {
		return salary;
	}
	public Employee() {}
	public Employee(String name, double salary, Mydate birthday) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
	}
	public Employee(String name, Mydate birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	
	
}


