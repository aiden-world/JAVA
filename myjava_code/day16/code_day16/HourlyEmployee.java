

public class HourlyEmployee extends Employee {
	private int   hour;
	private  double wage;
	
	public double earning() {
		return hour*wage;
	}
	
	public HourlyEmployee() {}
	public HourlyEmployee(String name, String number, Mydate birthday,int hour, double wage) {
		super(name, number,  birthday);
		this.hour = hour;
		this.wage = wage;
	}	
	
	public 	String toString() {
		return this.getClass()+"\t"+super.toString();
		//return this.getClass().getName()+"name: "+name+" number "+number+" birthday "+birthday;
	}
	
	
}
