
public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.age = 22;
		e.name= "Cedric chen";
		e.salary = 7500;
	System.out.println("name="+e.name+"  age="+e.age+"   salary="+e.salary);
	}
}


 class Employee {
	String name;
	int age ;
	double salary;
}


