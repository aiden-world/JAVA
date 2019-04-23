package com.atguigu.exception;

/*
 * 1、throw：抛，用于主动抛出异常对象
 * 之前的练习时遇到的异常对象是JVM帮我new好后抛出来的。以后，大家还会遇到主动抛出异常。
 * 语法格式：
 * 	throw 异常对象;   这是在方法中的一条语句
 * 
 * 无论是JVM帮我抛出的异常对象，还是由throw主动抛出的异常对象，都应该最后由try...catch来处理它，否则都会导致程序挂了。
 * 但是在当前方法中可以不处理，也可以使用throws抛出上级来处理。
 * 
 * 特别说明一下：throw语句可以代替return语句，结束方法的执行
 */
public class TestThrow {
	public static void main(String[] args) {
		
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("其他代码");
	}
	
	public static void method()throws Exception{
		throw new RuntimeException("这是一个演示的异常对象");
		
//		System.out.println("Xxxx");
	}
}
