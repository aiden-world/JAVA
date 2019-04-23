package com.atguigu.inner.member;

/*
 * 解释一下：内部类非重点，但是要讲
 * （1）作为类的一个成员存在
 * （2）后面看源代码时，总能见到它
 * （3）通过内部类，再次回顾一下面向对象的语法
 * 
 * 一、静态内部类
 * 1、语法格式
 * 
 * 【修饰符】 class 外部类   【extends 父类】 【implements 接口们】{
 * 		
 * 		【修饰符】 static class 内部类 【extends 父类】 【implements 接口们】{
 * 		}
 * 
 * }
 * 
 * 2、静态内部类也是一个独立的类
 * 字节码文件：外部类$内部类
 * 
 * 3、静态内部类
 * （1）成员：全部都可以
 * （2）使用
 * ①在外部类的外面使用
 * 		外部类名.静态内部类
 * 如果要调用静态内部类的静态成员：外部类名.静态内部类.静态成员
 * 如果要调用静态内部类的非静态成员：（1）先创建静态内部类的对象（2）对象.非静态成员
 * 
 * ②在外部类的里面使用静态内部类：直接使用
 * 
 * ③在静态内部类中，如果想要使用外部类的成员时，是否有限制
 * 	 在同一个类中，静态的不能使用非静态的
 * 
 */
public class TestStaticInner {
	public static void main(String[] args) {
		//在外部类的外面使用
		//静态的用“类型名.静态成员"
		Outer.Inner.test();
		
		Outer.Inner in = new Outer.Inner();
		//非静态的用“对象.非静态成员"
		in.method();
	}
}
class Outer{
	private static int a;
	private int b;
	
	//静态内部类
	static class Inner{//在Inner中不能使用b这种非静态的成员
		public static void test(){
			System.out.println("内部类的静态方法");
			System.out.println("a = " + a);
//			System.out.println("b = " + b);
		}
		public void method(){
			System.out.println("内部类的非静态方法");
			System.out.println("a = " + a);
//			System.out.println("b = " + b);
		}
	}
	
	public Inner getInner(){
		Inner in = new Inner();
		return in;
	}
}