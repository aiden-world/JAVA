package com.atguigu.init.demo5;

/*
 * 第5种情况：
 * 		当第一次使用某个子类时，发现它的父类也没有初始化，会先初始化它的父类
 */
public class TestSuper {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
class Father{
	static{
		System.out.println("父类的初始化");
	}
}
class Son extends Father{
	static{
		System.out.println("子类的初始化");
	}
}