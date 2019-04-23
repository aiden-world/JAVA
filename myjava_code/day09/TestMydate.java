public class TestMydate{
	public static void main(String[] args) {
		Employee1  e1 =new Employee1();
		e1.birthday = new Mydate();
		e1.birthday.day=26;
		e1.birthday.month=2;
		e1.birthday.year=1996;
		e1.age = 22;
		e1.name= "Cedric chen";
		e1.salary = 7500;
		System.out.println("name="+e1.name+"  age="+e1.age+"   salary="+e1.salary
				+"    e1.birthday="+e1.birthday.day+"  "+e1.birthday.month+"  "+e1.birthday.year);
		

	}
}



class Mydate {
	int year;
	int month;
	int day;
}


class Employee1 {
	String name;
	int age ;
	double salary;
	Mydate birthday;
}


