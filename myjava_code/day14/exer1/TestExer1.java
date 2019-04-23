package com.atguigu.inherite.exer1;

/*
 * 1、继承练习
（1）声明一个员工类Employee，有属性，姓名，薪资，get/set，和getInfo()
（2）声明一个子类，经理类Manager，增加奖金属性，get/set，和getInfo()
（3）在测试类中，创建父类的对象，调用getInfo
     创建子类对象，调用getInfo
 */
public class TestExer1 {
	public static void main(String[] args) {
		Employee emp = new Employee("张三",2000);
		System.out.println(emp.getInfo());
		
		Manager mgr = new Manager("李四",3000,1000);
		System.out.println(mgr.getInfo());
		
	}
}
