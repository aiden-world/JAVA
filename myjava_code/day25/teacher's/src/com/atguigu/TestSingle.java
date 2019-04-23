package com.atguigu.pattern;

/*
 * 一、单例：这个类型只有唯一的一个对象
 * 1、在设计这个类的时候，要让使用者能够获得它的一个对象，但是只能获取它的唯一的对象。
 * 
 * 2、形式：
 * （1）饿汉式：无论使用者是否需要这个对象，我上来就创建好，在类初始化时就创建。
 * （2）懒汉式：只有当使用者明确来获取这个对象时，才会去创建这个对象。
 * 
 * 3、饿汉式
 * （1）最简单的代码形式：枚举
 * （2）类似于JDK1.5之前实现枚举的形式
 * （3）通过静态方法返回唯一的对象
 * 
 * 4、懒汉式
 * 考虑线程安全问题，并考虑性能
 * （1）不用内部类
 * （2）用内部类形式
 */
public class TestSingle {
	public static void main(String[] args) {
		Single1 s1 = Single1.INSTANCE;
		Single2 s2 = Single2.INSTANCE;
		Single3 s3 = Single3.getInstance();
		
		Lazy1 l1 = Lazy1.getInstance();
		
//		Lazy2.method();
		
		Lazy2 l2 = Lazy2.getInstance();
		Lazy2 l3 = Lazy2.getInstance();
	}
}
//饿汉式（1）
enum Single1{
	INSTANCE
}
//饿汉式（2）
class Single2{
	public static final Single2 INSTANCE = new Single2();
	private Single2(){}
}
//饿汉式（3）
class Single3{
	private static final Single3 INSTANCE = new Single3();
	private Single3(){}
	public static Single3 getInstance(){
		return INSTANCE;
	}
}
//懒汉（1）
class Lazy1{
	private static Lazy1 instance;//这里没有直接new，不是在类初始化时创建的对象
	private Lazy1(){}//构造器私有化的目的，外界不能new第二个对象
	
	//方法不调用不执行
	//这么写有线程安全问题
	/*public static Lazy1 getInstance(){
		if(instance == null){
			instance = new Lazy1();
		}
		return instance;
	}*/
	
	//修正线程安全问题，但是性能不好
/*	public synchronized static Lazy1 getInstance(){
		if(instance == null){
			instance = new Lazy1();
		}
		return instance;
	}*/
	
	//优化性能
	public static Lazy1 getInstance(){
		if(instance == null){
			synchronized (Lazy1.class) {
				if(instance == null){
					instance = new Lazy1();
				}
			}
		}
		return instance;
	}
}
//懒汉式（2）
class Lazy2{
	private Lazy2(){}
	
/*	static{
		System.out.println("外部类的初始化");
	}*/
	
	//要点：把创建外部类的对象的时机放到初始化内部类时
	static class Inner{
		public static final Lazy2 INSTANCE = new Lazy2();
/*		static{
			System.out.println("内部类的初始化");
		}*/
	}
	
	public static Lazy2 getInstance(){
		return Inner.INSTANCE;
	}
	
/*	public static void method(){
		System.out.println("外部类的静态方法");
	}*/
}