package com.atguigu.exception;

/*
 * 一、Java的异常类型
 * 1、java.lang.Throwable
 * （1）Throwable 类是 Java 语言中所有错误或异常的超类。
 * （2）抛：只有当对象是此类（或其子类之一）的实例时，才能通过 Java 虚拟机或者 Java throw 语句抛出。
 * （3）抓：只有此类或其子类之一才可以是 catch 子句中的参数类型。 
 * 
 * 2、两大派别
 * （1）java.lang.Error：
 * 		用于指示合理的应用程序不应该试图捕获的严重问题。
 * 		例如：VirtualMachineError：StackOverflowError（栈溢出）、OutOfMemoryError（内存溢出）
 * （2）java.lang.Exception：
 * 		它指出了合理的应用程序想要捕获的条件。
 * 		例如：NullPointerException,ArrayIndexOutOfBoundsException,ClassCastException等
 * 
 * 3、Exception又可以细分：
 * （1）运行时异常：RuntimeException或它的子类			<--建议运行时异常是程序员要尽量“避免"的，因为它是代表那些程序员不应该范的问题，当然用try...catch
 * 		只有才运行时才能发现它
 * （2）编译时异常：除了运行时异常以外的都是编译时异常
 * 		如果某个方法抛出了编译时异常，那么要求程序员必须编写异常处理代码，否则编译都不通过
 * 
 * 4、希望大家平时能够关注异常的类型
 * 
 * 面试题：列出你在开发中遇到的常见异常类型（至少写5种，10种）
 * 		
 */
public class TestExceptionType {
	public static void main(String[] args) {
	/*	for (int i = 10; i >=1 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}*/
		
		int[] arr = new int[5];
		System.out.println(arr[5]);
	}
}
