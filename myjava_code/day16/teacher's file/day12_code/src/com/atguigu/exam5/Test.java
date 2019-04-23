package com.atguigu.exam5;

public class Test {

	public static void main(String[] args) {
		Base b1 = new Base();//本态引用
		/*
		 * 本态引用，只看父类的
		 *   base : 100
		 */
		
		Base b2 = new Sub();
		/*
		 * 多态引用，先看子类的
		 * （1）在子类的构造器，一定会调用父类的构造器，默认调用的是父类的无参构造  super()
		 * （2）Base(){
		 * 		method(100)
		 * }
		 * 	构造器中的当前对象，表示正在创建的对象，此时正在创建Sub的对象，这个method是子类重写的method
		 * 		sub : 100
		 *  (3) super.method(70);
		 *  明确执行的是父类被重写的method
		 *  	base : 70
		 */
	}
}
class Base{
	Base(){
		method(100);// 当前对象的method(100);   
	}
	public void method(int i){
		System.out.println("base : " + i);
	}
}
class Sub extends Base{
	Sub(){
//		super();//它省略了，也在
		super.method(70);
	}
	public void method(int j){
		System.out.println("sub : " + j);
	}
}