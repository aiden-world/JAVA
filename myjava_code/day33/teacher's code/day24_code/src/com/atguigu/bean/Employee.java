package com.atguigu.bean;

import java.io.Serializable;

public final class Employee extends Person implements Serializable,Comparable<Employee>{
	private static int num = 10;
	private double salary;

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public Employee( double salary) {
		this.salary = salary;
	}
	public Employee() {
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "，薪资：" + salary;
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(salary, o.salary);
	}
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Employee.num = num;
	}
	
}
