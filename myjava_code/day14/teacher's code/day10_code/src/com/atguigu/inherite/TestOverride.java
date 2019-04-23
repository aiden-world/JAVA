package com.atguigu.inherite;

/*
 * 方法的重写（Override）：
 * 1、什么情况下需要重写？
 * 	当子类继承父类时，子类继承了父类的某个方法，但是该方法的实现不适合与子类，
 * 那么在子类中就需要对该方法的方法进行重写。
 * 
 * 2、方法重写的要求：
 * （1）方法名：相同
 * （2）形参列表：相同
 * （3）返回值类型：<= 
 * 	   如果是基本数据类型和void，必须相同
 *   如果是引用数据类型，可以相同，也可以是它的子类     
 *   	重写方法的返回值类型  <= 被重写方法的返回值类型
 * （4）权限修饰符 ：>=
 * 		public > protected > 缺省 > private
 *    被重写的方法不能是private，因为在子类中不可见。
 * （5）和抛出的异常相关  ：等到了异常的章节再讲   
 * 
 * 区别于：Overload方法的重载
 * 	狭义：在同一个类中
 * 	广义：在同一个对象中可以调用的
 * 重载：
 * （1）方法名：相同
 * （2）形参列表：不同
 * （3）和返回值类型：无关
 * （4）权限修饰符：建议一致，不一致会很奇怪，一般不提
 */
public class TestOverride {
	public static void main(String[] args) {
		Woman w = new Woman();
		w.walk();
	}
}
//人
class Human{
	public void walk(){
		System.out.println("走路");
	}
	
	//返回值类型是Object
	public Object test(){
		return null;
	}
}
//女人
class Woman extends Human{
	//我希望，体现女人的特征，女人走路是“婀娜多姿”
	//需要对父类的walk方法进行重写
	public void walk(){
		System.out.println("婀娜多姿");
	}
	
	//返回值类型是String，它是Object的子类
	public String test(){
		return "";
	}
}