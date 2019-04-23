package com.atguigu.exam;

public class TestFinal {
	
	public static void method(final int a){
		
	}
	
	public static void test(final MyData my){
//		my = new MyData();//错误，因为my中存储的地址值不能修改
		my.a = 10;//属性可以修改，因为这个a没有final修饰
	}

}
/*
 * 这个a常量，而且是非静态的，那么表示每个对象在创建时，必须为a显式初始化，否则这个a就没有值
 */
class MyClass{
	private final int A = 1;
	
	public MyClass(){
	}
	
}
class MyData{
	int a;
}