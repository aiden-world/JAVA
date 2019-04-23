package com.atguigu.block;

/*
 * 类的初始化过程：
 * （1）子类初始化时会先初始化父类
 * （2）每一个类的初始化只发生一次
 * （3）类初始化的时，要完成
 * ①类变量初始化
 * ②静态代码块初始化
 * 它俩按顺序执行
 * 
 * 本质上编译器把：类变量的初始化代码和静态代码块中的代码按顺序都集成到一个类初始化方法<Clinit>()中了。
 * 
 * 静态方法不会被重写，它是类方法。
 * 
 * 总结：哪些方法不能被重写？
 * （1）final
 * （2）static
 * （3）private
 * 
 */
public class TestClassInitialize {
	public static void main(String[] args) {
/*		Son s = new Son();
		Son.test();
		Son.test();*/
		Son.test();
	}
}
class Father{
	private static int a = method();
	
	static{
		System.out.println("父类的初始化1");
	}
	static{
		System.out.println("父类的初始化2");
	}
	public static int method(){
		System.out.println("Father的method方法");
		return 1;
	}
}
class Son extends Father{
	private static int b = method();
	
	static{
		System.out.println("子类的初始化1");
	}
	static{
		System.out.println("子类的初始化2");
	}
	public static int method(){
		System.out.println("Son的method方法");
		return 2;
	}
	
	public static void test(){
		System.out.println("子类的静态方法");
	}
	
}