package com.atguigu.block;

/*
 * 实例的初始化：
 * （1）子类的实例初始化时，也会执行父类的实例初始化的相关代码
 * （2）每次创建对象，都会执行一次实例初始化过程
 * （3）实例初始化的过程，要执行代码有三部分
 * ①实例变量的显式初始化
 * ②非静态代码块
 * ③构造器
 * ①和②是按顺序执行，谁在上谁先执行，③一定是它们三个中最后执行。
 * 
 * 本质上，编译把①②③部分代码是组成一个个的实例初始化方法<init>()，
 * 有几个看你类中有几个构造器。
 * 
 * 
 * 代码块的作用：
 * 非静态代码块：为实例变量初始化
 * 静态代码块：为类变量初始化
 * 
 * 构造器的作用：
 * （1）和new一起创建对象
 * （2）为属性初始化
 * 
 */
public class TestInstanceInitialize {
	public static void main(String[] args) {
		Zi z1 = new Zi();
		System.out.println("======================");
		Zi z2 = new Zi("xxx");
	}
}
class Fu{
	public Fu(){
		System.out.println("父类的无参构造");
	}
	{
		System.out.println("父类的实例初始化1");
	}
	{
		System.out.println("父类的实例初始化2");
	}
	private int a = method();
	public static int method(){
		System.out.println("父类的method方法");
		return 0;
	}
}
class Zi extends Fu{
	public Zi(){
		System.out.println("子类的无参构造");
	}
	public Zi(String info){
		System.out.println("子类的有参构造");
	}
	{
		System.out.println("子类的实例初始化1");
	}
	{
		System.out.println("子类的实例初始化2");
	}
	private int b = method();
	public static int method(){
		System.out.println("子类的method方法");
		return 1;
	}
}