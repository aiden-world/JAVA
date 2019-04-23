package com.atguigu.init.demo3;

/*
 * 第三种：
 * 		第一次使用某个类时，直接调用它的静态方法或访问它的非final的静态变量时
 */
public class TestStatic {
	public static void main(String[] args) {
//		Demo3.test();
		System.out.println(Demo3.num);
	}
}
class Demo3{
	public static int num = 10;
	static{
		System.out.println("类初始化");
	}
	public static void test(){
		System.out.println("静态方法");
	}
}