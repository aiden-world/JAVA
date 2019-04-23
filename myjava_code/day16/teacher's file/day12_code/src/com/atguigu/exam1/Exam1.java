package com.atguigu.exam1;

public class Exam1 {
	public static void main(String[] args) {
		A a1 = new A();//本态引用
		A a2 = new B();//多态引用
		B b = new B();//本态引用
		C c = new C();
		D d = new D();
		System.out.println("(1)" + a1.show(b));//从A类中找show方法      A and A
		/*
		 * a1是本态引用，从A类中找
		 * ①public String show(D obj)
		 * ②public String show(A obj)
		 * b对象只能给A形参
		 * 
		 */
		
		
		System.out.println("(2)" + a2.show(d));//A and D
		/*
		 * a2是多态引用，show应该从B类中找
		 * ①public String show(B obj)
		 * ②public String show(A obj)  重写父类的方法
		 * ③public String show(D obj)  继承没被重写
		 * 
		 */
		System.out.println("(3)" + b.show(c));//  B and B
		/*
		 * b本身是本态引用，show应该从B类中找
		 * ①public String show(B obj)
		 * ②public String show(A obj)  重写父类的方法
		 * ③public String show(D obj)  继承没被重写
		 * c可以匹配B和A，但是就近原则，找B
		 */
		System.out.println("(4)" + b.show(d));//A and D
		/*
		 * b本身是本态引用，show应该从B类中找
		 * ①public String show(B obj)
		 * ②public String show(A obj)  重写父类的方法
		 * ③public String show(D obj)  继承没被重写
		 * 直接找d
		 */
	}
}
class A{
	public String show(D obj){//D是B的子类，不能接收B的对象
		return ("A and D");
	}
	public String show(A obj){//A是B的父类，可以接收B的对象   多态参数
		return "A and A";
	}
}
class B extends A{
	public String show(B obj){
		return "B and B";
	}
	public String show(A obj){
		return "B and A";
	}
}
class C extends B{
	
}
class D extends B{
	
}