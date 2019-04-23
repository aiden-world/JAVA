package com.atguigu.inherite.exer1;

/*
 * 类的成员的顺序，习惯上：
 * （1）先写属性
 * （2）再写构造器
 * （3）方法
 * 
 * 如果一个类没有显式声明它的父类，那么它有一个隐含的父类，默认的父类java.lang.Object
 */
public class Employee {
	private String name;
	private double salary;
	
	public Employee() {
		super();//调用Object的无参构造
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInfo(){
		return "姓名：" + name + "，薪资：" + salary;
	}
	
}
 