package com.atguigu.modifier;
/*
 * static：静态的
 * 1、可以修饰什么？
 * 可以修饰方法、成员变量、内部类、代码块
 * 
 * 2、修饰方法
 * 我们称为这个方法为静态方法。
 * 这些静态方法的调用：
 * （1）如果是本类中，直接用
 * （2）如果是其他类中，通过“类名.”就可以调用
 * 当然通过"对象."也可以调用，但是，建议还是用“类名.”进行调用
 * 
 * 3、修饰成员变量
 * 我们称这样的成员变量为类变量，或静态变量。
 * 
 * 为了区别它们，我们把成员变量分为两种：
 * （1）类变量，用static修饰的
 * （2）实例变量，没有static修饰的
 * 
 * 它们的区别：
 * （1）它们值在内存中存储的位置不同
 * 类变量：方法区
 * 实例变量：堆
 * 
 * （2）它们的生命周期不同
 * 类变量：随着类的初始化而初始化，随着类的卸载而消亡
 * 实例变量：随着对象的创建而初始化，随着对象被垃圾回收而消忘
 * 
 * 类变量比实例变量要早。
 * 
 * （3）它们的共享性不同
 * 类变量：是该类所有对象共享同一个值
 * 实例变量：每一个对象都是独立的
 * 
 * 
 * 4、什么样的成员变量，成员方法需要声明为静态的？
 * 当该成员变量的值不会因为对象的不同而不同，声明为静态的。
 * 当该方法与对象无关，希望可以简单通过“类名.”调用，这样的方法都可以声明为静态的。例如，各种工具类的方法Math，Arrays等
 * 
 * 
 * 例如：Account类，对于利率
 *     Chinese类，对于国家名
 */
public class TestStatic {
	static int a;//类变量
	int b;
	
	public static void main(String[] args) {
		MyClass.test();
		
//		MyClass m = new MyClass();
//		m.test();
		
		method();
		
//		static int a;//错误的，这是局部变量
		
		
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		
		m1.other = "atguigu";
		m2.other = "尚硅谷";
		
		m1.info = "中国";
		m2.info = "中华人民共和国";
		
		System.out.println("m1：" + m1.other + "," + m1.info);
		System.out.println("m2：" + m2.other + "," + m2.info);
		
	}
	
	public static void method(){
		System.out.println("xxx");
	}
	
	public void other(){
		method();
	}
}
class MyClass{
	//这里故意没有私有化，为了上面测试简单点
	static String info;
	String other;
	
	public static void test(){
		System.out.println("静态方法");
	}
}