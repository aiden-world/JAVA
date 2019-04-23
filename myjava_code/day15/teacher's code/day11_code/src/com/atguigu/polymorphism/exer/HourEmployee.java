package com.atguigu.polymorphism.exer;

/*
 * 3、声明一个子类HourEmployee小时工，
有属性，工作小时数，每小时多少钱
重写方法，public double earning()返回实发工资， 
实发工资 = 每小时多少钱 * 小时数
 */
public class HourEmployee extends Employee {
	private int hours;
	private double moneyPerHour;
	public HourEmployee() {
		super();
	}
	public HourEmployee(String name, MyDate birthday, double salary, int hours, double moneyPerHour) {
		super(name, birthday, salary);
		this.hours = hours;
		this.moneyPerHour = moneyPerHour;
	}
	public HourEmployee(String name, int year, int month, int day, double salary, int hours, double moneyPerHour) {
		super(name, year, month, day, salary);
		this.hours = hours;
		this.moneyPerHour = moneyPerHour;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getMoneyPerHour() {
		return moneyPerHour;
	}
	public void setMoneyPerHour(double moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	
	/*
	 * 重写方法，public double earning()返回实发工资， 
		实发工资 = 每小时多少钱 * 小时数
	 */
	public double earning() {
		return moneyPerHour * hours;
	}
	
}
