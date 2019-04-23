package com.atguigu.init.demo4;

/*
 * 第四种：通过反射java.lang.reflect等API进行操作
 */
public class TestReflect {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//反射操作
		Class my = MyClass.class;
		my.newInstance();
	}
}
class MyClass{
	static{
		System.out.println("类初始化");
	}
}