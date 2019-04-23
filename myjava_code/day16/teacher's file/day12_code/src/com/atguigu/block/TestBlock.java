package com.atguigu.block;

/*
 * 代码块：一块代码
 * 分为：
 * 1、普通代码块：一般我们不讨论它
 * 2、初始化代码块：重点讨论         开发中写这么复杂的不多，但是面试爱出
 * （1）静态代码块：为静态变量初始化
 * 		是随着类的初始化而初始化，一个类的初始化只会发生一次。
 * （2）非静态代码块：为实例变量初始化
 * 		是随着对象的初始化而初始化，每创建一个对象都会执行一次。
 */
public class TestBlock {
	{
		System.out.println("非静态代码块");
	}
	
	static{
		System.out.println("TestBlock静态代码块");
	}
	public static void main(String[] args) {
		
		/*{
			System.out.println("普通代码块");
		}*/
		
		TestBlock t1 = new TestBlock();
		TestBlock t2 = new TestBlock();
	}
}
class MyClass{
	static{
		System.out.println("MyClass静态代码块");
	}
}