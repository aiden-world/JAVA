package com.atguigu.meiju.exer;

/*
 * 1、枚举练习1
（1）声明一个性别的枚举Gender，有两个常量对象：男、女
（2）声明一个员工类型，有属性：姓名，性别（用枚举类型），toString
（3）创建员工对象，打印显示

Java的类型：
基本数据类型（8中）
引用数据类型：类、接口、数组、枚举...

 */
public class TestExer {
	public static void main(String[] args) {
		Employee e1 = new Employee("小崔", Gender.MAN);
		System.out.println(e1);
		
		Employee e2 = new Employee("郭小凤", Gender.WOMAN);
		System.out.println(e2);
	}
}
class Employee{
	private String name;
	private Gender gender;
	public Employee(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + "]";
	}
	
}
/*enum Gender{
	MAN,WOMAN
}*/

enum Gender{
	MAN("男"),WOMAN("女");
	private String des;

	private Gender(String des) {
		this.des = des;
	}
	public String toString(){
		return des;
	}
}