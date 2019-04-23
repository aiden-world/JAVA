package com.atguigu.exam2;

/*
 * 多态：
 * （1）重载与重写
 * （2）对象的多态性
 * 编译时看父类，运行时看子类，执行的是子类重写的方法。
 * 
 * 属性没有多态。
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
		Base b = new Sub();
		System.out.println(b.x);//属性，看谁引用，就是谁的，通过父类的引用找的就是父类的
		System.out.println(b.getX());//看子类是否重写
	}
}
class Base{
	int x = 1;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
class Sub extends Base{
	int x = 2;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}