package com.atguigu.inter;

/*
 * 接口：
 * 
 * 1、什么是接口？
 * 接口就是标准
 * 
 * 举例：
 * （1）USB接口，电源接口
 * （2）支付宝、网银接口
 * （3）JDBC接口     Java Database Connectivity
 * 			Java连接数据库
 *   数据库的产品：mysql,oracle,sql server,access,....
 *   SUN公司就设计了一组标准，操作数据库的标准，然后Java程序员就可以使用这种
 *   统一的方式来操作各种数据库。
 *   
 *   这些标准由各数据库厂商来遵守，如果它不遵守，Java就不去连接它。
 *   各个数据库厂商会提供驱动，这些驱动类就是对该标准的实现。
 * 
 * 2、如何声明接口？
 * 语法结构：
 * 【权限修饰符】  interface 接口名{
 * 		成员列表
 * }
 * 
 * 如果一个接口没有成员，那么这样接口成为标识型接口。
 * 绝大多数接口都是有成员。
 * 
 * 3、接口的成员？
 * JDK1.8之前：
 * （1）全局静态的常量：public static final
 * （2）公共的抽象的方法：public abstract
 * 
 * 4、如何使用/实现接口？
 * 制定标准的目的就是让人去遵守的，那么设计接口的目的，就是用来被实现的。
 * 
 * 语法结构：
 * 【修饰符】 class 实现类   implements 接口们{
 * }
 * 
 * 实现类实现接口，如同继承父类。
 * 一个类可以同时实现多个接口，所以，我们把接口成为干爹，把父类成为亲爹。
 * 要求：实现类在实现接口时，必须实现接口的所有的抽象方法，否则这个实现类也得是抽象类。
 */
public class TestInterface {
	public static void main(String[] args) {
		System.out.println("最高飞行速度：" + Flyable.MAX_SPEED);
	}
}
interface Flyable{
	int MAX_SPEED = 7900000;
	int MIN_SPEED = 0;
	
	void fly();
//	void start();
//	void stop();
}

interface MyRunnable{
	void run();
}

class Animal{
	
}

class Bird extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println("靠翅膀飞翔");
	}
	
}
//一个类可以同时实现多个接口
class Plane implements Flyable,MyRunnable{

	@Override
	public void fly() {
		System.out.println("靠发动机，燃油飞翔");
	}

	@Override
	public void run() {
		System.out.println("靠轮子滑行");
	}
	
}

class Kite implements Flyable{

	@Override
	public void fly() {
		System.out.println("靠人拉的飞翔");
	}
	
}