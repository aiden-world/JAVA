package com.atguigu.inherite;

/*
 * 面向对象的基本特征：
 * （1）封装
 * 狭义的封装：
 * 	 属性的私有化，并为它们提供公共的get/set方法
 * 好处：安全、简便、隐藏实现细节
 * 
 * （2）继承
 * （3）多态
 * 
 * 一、继承的概念和好处
 * 1、继承的意义（好处）：
 * 	   延续，代码的复用
 *   扩展，代码的扩展
 *   is-a的关系：父类中是所有子类都具有的共同的特征，子类是父类的一个子类别。
 * 
 * 2、如何实现？
 * 【修饰符】 class 子类名  extends 父类名{
 * }
 * 子类继承父类
 * 子类：SubClass，又称为派生类
 * 父类：SuperClass，又称为超类、基类
 * 
 * 3、继承的特点
 * （1）子类会继承父类的所有的属性和方法，包括私有的。但是父类中私有的属性和方法，在子类中不能直接使用。
 * （2）子类绝对不会继承父类的构造器
 * （3）子类的构造器中一定会调用父类的构造器
 * 	  为什么在子类的构造器中要调用父类的构造器？
 *   为从父类继承的属性赋值。
 *   原则：
 *   如果你没有手动去通过super()或super(实参列表)去调用父类的构造器，那么默认它会自动调用父类的无参构造。
 *   如果父类没有无参构造器，那么在子类的构造器中必须用super(实参列表)手动调用父类的有参构造，否则编译不通过。
 *   要求：
 *   super()或super(实参列表)必须在子类构造器的首行。
 * （4）  Java中只支持单继承，一个类只有一个直接父类   -->只有一个亲生父亲
 * （5） Java支持多层继承，父类还可以有父类  -->爸爸还可以有爸爸，我们称为爷爷等
 *    Java中不管是直接父类还是间接父类，都称为父类。
 *    父类的父类的属性、方法，在你这里也有，支持代代相传。
 * （6）一个父类可以同时有很多个子类。子类还可以有子类。-->子孙满堂   
 *    
 */
public class TestInherited {
	public static void main(String[] args) {
/*		Student stu = new Student();
		stu.setName("崔达伟");
		stu.setAge(30);
		stu.setScore(89);
		
		Teacher t = new Teacher();*/
		
		Student stu = new Student("张三",23,90);
		System.out.println(stu.getInfo());
		
		stu.test();//Student从Person继承，Person从Animal继承的
		
	}
}
class Animal{
	public void test(){
		
	}
}

//已有的
class Person  extends Animal{
	private String name;
	private int age;
	
	//强烈建议，保留父类的无参构造
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//新声明两个类：Student和Teacher类
class Student extends Person{
	private int score;
	
	public Student(){
	}
	public Student(String name,int age,int score){
		super(name,age);//通过调用父类的有参构造，为从父类继承的name和age赋值，此时没有创建父类的对象
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getInfo(){
		//return "姓名：" + name + "，年龄：" + age + "，成绩：" + score;//错误的
		return "姓名：" + getName() + "，年龄：" + getAge() + "，成绩：" + score;//正确的
	}
}
class Teacher extends Person{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
