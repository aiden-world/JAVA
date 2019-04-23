package com.atguigu.noninit.demo2;

/*
 * 第2种：不会导致某个类初始化
 * 		当通过子类访问父类的静态变量时，不会导致子类的初始化，只会初始化父类，因为这个类变量是在父类中声明和初始化的。
 */
public class TestStatic {
	public static void main(String[] args) {
		System.out.println(Son.num);
	}
}
class Father{
	public static int num = 10;
	static{
		System.out.println("父类");
	}
}
class Son extends Father{
	static{
		System.out.println("子类");
	}
}