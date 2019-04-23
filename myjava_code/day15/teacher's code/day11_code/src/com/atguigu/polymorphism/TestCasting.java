package com.atguigu.polymorphism;

/*
 * Java的数据类型：
 * 1、基本数据类型（8种）
 * （1）自动类型转换（2）强制类型转换
 * 
 * 2、引用数据类型 
 * （1）向上转型（upcasting）：可以自动完成
 * 	   把子类的对象赋值给父类的变量时，就会自动发生向上转型，这是编译时类型
 * 父类类型  fu = new 子类类型1();
 * （2）向下转型(downcasting)：必须强制完成
 * 子类类型1  zi = (子类类型1)fu;  //前提必须是fu这个变量中存（指向）就是子类类型1的对象
 * 
 * 把一个原来就是指向某子类对象的父类变量，向下转型回该子类类型时才会成功，否则都是失败的，会报ClassCastException。
 * 
 * 如何避免ClassCastException？
 * 可以使用instanceof进行类型判断，结果是true/false
 * if(fu对象  instanceof 子类的类型1){
 * 		子类类型1  zi = (子类类型1)fu;
 * }else if(fu对象  instanceof 子类的类型2){
 * 		子类类型2  zi = (子类类型2)fu;
 * }
 */
public class TestCasting {
	public static void main(String[] args) {
		Person p1 = new Woman();//向上转型
		Person p2 = new Man();//向上转型
		
		Woman w1 = (Woman) p1;//向下转型，把p1向下转型回Woman
		w1.walk();
		w1.shopping();
		
		Man m2 = (Man) p2;//向下转型，把p2向下转型回Man
		m2.walk();
		m2.smoke();
		
//		Woman w2 = (Woman) p2;//错误的，编译没有错，运行时报ClassCastException（类型转换异常），因为p2运行时是Man类型
//		Man m3 = (Man) p1;//错误的，编译没有错，运行时报ClassCastException（类型转换异常），因为p1运行时是Woman类型
		Person p3 = new Person();
//		Woman w3 = (Woman) p3;//错误的，编译没有错，运行时报ClassCastException（类型转换异常），因为，p3的编译时和运行时是Person类型
//		w3.shopping();//如果上一行成功，那么这一行执行时，就不知道执行什么代码，因为new Person()中没有这个方法
		
		if(p2 instanceof Woman){
			Woman w2 = (Woman) p2;
			System.out.println("woman");
		}else if(p2 instanceof Man){
			Man man = (Man) p2;
			System.out.println("man");
		}
	}
}
