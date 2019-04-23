import java.util.Scanner;
public class PayrollSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Mydate[] Bri = new Mydate[3];
		Bri[0] = new Mydate(1996,4,13);
		Bri[1] = new Mydate(1994,7,22);
		Bri[2] = new Mydate(1992,5,17);
		Employee[] myEmp = new Employee[2] ;
		//抽象类不能new 
		//myEmp[0] = new Employee("陈诺","360321199604132014",Bri[0]);
		myEmp[0] = new SalariedEmployee("王大锤","12309218391830921",Bri[1],20000,28,31);
		myEmp[1] = new HourlyEmployee("张绍刚","123092138391830921",Bri[2],200,100);
		
		for (int i = 0; i < myEmp.length; i++) {
			System.out.println(myEmp[i].toString());
			//if(input.nextInt()==myEmp[i].birthday.month)

		} 
		
		
		}
}
