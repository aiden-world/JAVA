

public class SalariedEmployee extends Employee{
	private double monthlySalary ;
	private int workingday;
	private int totalDays;
	
	public double earning() {
		return  monthlySalary*workingday/totalDays;
	}
	public SalariedEmployee() {}
	public SalariedEmployee(String name, String number, Mydate birthday,double monthlySalary, int workingday, int totalDays) {
		super(name, number,  birthday);
		this.monthlySalary = monthlySalary;
		this.workingday = workingday;
		this.totalDays = totalDays;
	}
	public 	String toString() {
		return this.getClass().getName()+"\t"+super.toString();
		//return this.getClass().getName()+"name: "+name+" number "+number+" birthday "+birthday;
	}
	
	
	
	
}
