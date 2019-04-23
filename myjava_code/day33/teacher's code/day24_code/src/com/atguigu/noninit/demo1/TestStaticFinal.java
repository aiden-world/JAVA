package com.atguigu.noninit.demo1;

/*
 * 第1种：不会触发初始化
 * 		使用某个类的final的类变量
 */
public class TestStaticFinal {
	public static void main(String[] args) {
		System.out.println(Demo3.num);
	}
}
class Demo3{
	public static final int num = 10;
	static{
		System.out.println("类初始化");
	}
}