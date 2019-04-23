package code_day15;

public class TestEmployee {
	public static void main(String[] args) {
	Mydate[] Bri = new Mydate[3];
	Bri[0] = new Mydate(1996,4,13);
	Bri[1] = new Mydate(1994,7,22);
	Bri[2] = new Mydate(1992,5,17);
	Employee[] myEmp = new Employee[3] ;
	myEmp[0] = new Employee("陈诺",70000,Bri[0]);
	myEmp[1] = new SalaryEmployee("王大锤",10000,Bri[1],31,5);
	myEmp[2] = new HourEmployee("张绍刚",Bri[2],120,3000);
	
	for (int i = 0; i < myEmp.length; i++) {
		System.out.println(myEmp[i].earning());
	}
	
	
	}
}
