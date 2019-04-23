package code_day15;

public class SalaryEmployee extends Employee{
	private int workday;
	private int leaveDay;
	
	public double earning() {
		return salary - salary/workday*leaveDay;
	}
	public SalaryEmployee() {}
	public SalaryEmployee(String name, double salary, Mydate birthday, int workday, int leaveDay) {
		super(name, salary, birthday);
		this.workday = workday;
		this.leaveDay = leaveDay;
	}
	
}
