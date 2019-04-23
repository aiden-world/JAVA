package code_day15;

public class HourEmployee extends Employee {
	private int workingHours;
	private  double salaryPerHour;
	
	public double earning() {
		return salaryPerHour*workingHours;
	}
	public HourEmployee() {}
	public HourEmployee(String name,  Mydate birthday, int workingHours, double salaryPerHour) {
		super(name, birthday);
		this.workingHours = workingHours;
		this.salaryPerHour = salaryPerHour;
	}
	
}
