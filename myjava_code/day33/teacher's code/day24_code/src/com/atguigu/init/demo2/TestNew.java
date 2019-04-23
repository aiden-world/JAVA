package com.atguigu.init.demo2;

/*
 * 第二种情况：
 * 		第一次使用这个类，就是用它来创建对象了
 */
public class TestNew {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}
}
class Demo2{
	static{
		System.out.println("类初始化");
	}
}
