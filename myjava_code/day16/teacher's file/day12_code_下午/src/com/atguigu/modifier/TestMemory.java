package com.atguigu.modifier;

/*
 * 解释：
 * 1、为什么声明构造器时，没有让选择静态变量？
 * 原因：
 * （1）静态变量的生命周期比对象早，而调用构造器是在创建对象，它认为此时静态变量已经有值了。
 * （2）因为静态变量是所有对象共享的，而构造器是创建一个对象，为这一个对象的属性赋值的。
 * 
 * 2、static变量的get/set也是静态的？
 * 因为：希望可以不需要对象，就可以获取或设置类变量的值。只有静态的方法才可以不需要对象调用。
 * 
 * 3、当静态变量与局部变量同名时，我们在静态变量前面加“类名.”进行区分。
 * 
 * 为什么用“类名.”,因为该类变量不专属于某个对象，而且静态方法中不能使用this关键字
 * 
 * 
 * 4、静态的方法中不能直接使用的？
 * （1）this
 * （2）super
 * （3）非静态的属性和方法
 * 
 * 5、方法体的代码存哪里了？
 * 它属于类的信息，存在方法区中。
 * 
 * 6、方法执行时，当需要给局部变量分配内存时，会在栈中分配？
 * 每一个方法，每一次调用，栈空间都是独立的。
 * 
 */
public class TestMemory {
	public static void main(String[] args) {
		Student.setSchool("尚硅谷");//像这种情况，调用静态方法时，是没有Student对象，所以也没有所谓的this等
	
		Student s1 = new Student("张三",89);
		Student s2 = new Student("李四",56);
	}
}
class Student{
	private static String school;
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
	}
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}