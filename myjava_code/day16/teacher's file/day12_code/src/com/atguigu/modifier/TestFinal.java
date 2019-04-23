package com.atguigu.modifier;

/*
 * final：最终的
 * 1、可以修饰什么？
 * 类、方法、变量
 * 
 * 2、修饰类（包括外部，内部类）
 * 表示这个类不能被继承，它是太监类。
 * 例如：String，System
 * 
 * 3、修饰方法
 * 表示这个方法不能被子类重写。
 * 
 * 4、修饰变量
 * 变量包括局部变量、成员变量（类变量、实例变量）
 * 表示这个变量不再是变量，是常量，它的值不能被修改。
 * 常量必须赋值。
 * 常量名最好大写。
 * 
 * 
 * 学习修饰符的时候，问自己几个问题？
 * （1）修饰符的意思
 * （2）可以修饰什么
 * （3）修饰后有什么不同
 */
public class TestFinal {
	public static void main(String[] args) {
		Son s = new Son();
		s.method();
		
		final int NUM = 10;
//		NUM = 20;
	}
}
class Father{
	private final String INFO = "atguigu";
	
	public final void method(){
		//...
	}
}
class Son extends Father{
/*	public final void method(){
		//...
	}*/
}