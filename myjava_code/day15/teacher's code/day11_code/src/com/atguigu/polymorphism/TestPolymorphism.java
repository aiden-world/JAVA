package com.atguigu.polymorphism;

/*
 * 面向对象的基本特征：
 * 1、封装
 * 狭义：属性的私有化，提供公共的get/set
 * 广义：方法封装了功能，类封装了事物的特征，...
 * 好处：安全、简便、对使用者隐藏实现细节...
 * 
 * 2、继承
 * 如何实现？extends
 * 好处：（1）代码的复用（2）代码的扩展（3）表示is-a的关系
 * 
 * 3、多态（多种形态）
 * 好处/目的：使得代码更灵活，功能更丰富
 * 如何实现？
 * （1）方法的重载和重写             <---这体现了一个方法（功能）的多种实现形式
 * （2）对象的多态性性                <---一个对象表现出了多种形式（类型）
 * 
 * 一、对象的多态性
 * 对象的多态性：编译时类型和运行时类型不一致。
 * 前提：
 * （1）继承（2）方法重写（3）多态引用（父类的对象名/变量  指向了子类的对象）
 * 现象：编译时按照父类编译，执行的时候按照子类执行，运行的是子类重写的方法。
 * 
 * 
 * 本态引用：
 * Woman w = new Woman();
 * Person p = new Person();
 * 多态引用：
 * Person p = new Woman();
 * Person p = w;
 * 
 * 
 * 
 */
public class TestPolymorphism {
	public static void main(String[] args) {
		Person p = new Woman();//多态引用
		p.walk();//运行结果：婀娜多姿  -->   p是子类的类型
//		p.shopping();//编译错误：   --> p不是子类类型
		
		
		Person p2 = new Man();//多态引用
		
//		Woman w = new Person();//错误，不是多态引用		
	}
}
class Person{
	public void walk(){
		System.out.println("走路");
	}
}
class Woman extends Person{
	//重写父类的方法
	public void walk(){
		System.out.println("婀娜多姿");
	}

	public void shopping(){
		System.out.println("买买买");
	}
}
class Man extends Person{
	//重写父类的方法
	public void walk(){
		System.out.println("大步流星");
	}
	public void smoke(){
		System.out.println("吞云吐雾");
	}
}
