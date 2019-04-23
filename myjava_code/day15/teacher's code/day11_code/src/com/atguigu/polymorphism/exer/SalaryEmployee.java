package com.atguigu.polymorphism.exer;

/*
 * 2、声明一个子类SalaryEmployee正式工，
有属性，工作日天数，请假天数
重写方法，public double earning()返回实发工资， 
实发工资 = 薪资 - 薪资/工作日天数 * 请假天数
 */
public class SalaryEmployee extends Employee {
	private int workDays;// 工作日天数
	private int restDays;// 请假天数

	public SalaryEmployee() {
		super();
	}

	public SalaryEmployee(String name, MyDate birthday, double salary, int workDays, int restDays) {
		super(name, birthday, salary);
		this.workDays = workDays;
		this.restDays = restDays;
	}

	public SalaryEmployee(String name, int year, int month, int day, double salary, int workDays, int restDays) {
		super(name, year, month, day, salary);
		this.workDays = workDays;
		this.restDays = restDays;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public int getRestDays() {
		return restDays;
	}

	public void setRestDays(int restDays) {
		this.restDays = restDays;
	}

	/*
	 * 重写方法，public double earning()返回实发工资， 
		实发工资 = 薪资 - 薪资/工作日天数 * 请假天数
	 */
	public double earning() {
		return getSalary() - getSalary() / workDays * restDays;
	}

}
