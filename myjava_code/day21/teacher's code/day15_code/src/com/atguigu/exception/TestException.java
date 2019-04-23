package com.atguigu.exception;

/*
 * 1、什么叫异常？
 * 异常：不正常
 * 
 * 程序在正常情况下是可以顺利的正确的运行的。只是因为一些其他的因素，导致某些时候不能正常运行。
 * 例如：用户的非法输入、出现了断网、出现了磁盘已满....
 * 
 * 不是异常：
 * （1）语法错误
 * （2）逻辑错误
 * 
 * 如果没有Java的异常处理机制，一旦出现异常，程序就会挂了。
 * 
 * 2、Java的异常处理机制
 * Java程序运行时，当某一句代码发生异常时，会在这句代码处先暂时停下来(stop)，这个时候Java会
 * 根据这个异常的情况创建一个对应类型的异常对象，然后JVM会抛出这个异常对象，Java有专门的机制检查
 * 在这句代码的外围，是否有try...catch这个结构可以“捕获/抓”住这个异常对象，如果可以捕获，
 * 那么会有对应的处理可以解决它（例如，提示用户，让用户先退出等等），然后程序从这个try...catch后面继续运行。
 * 
 * 在该句代码的周围没有找到try...catch，那么结束当前方法，并且把该异常对象“抛”给调用它的位置。
 * 如果调用它的位置可以解决，那么从调用它的位置后面继续运行，如果也没有解决，继续往上抛，一直到main中，
 * 如果main中也没有解决，那么程序就挂了。
 * 
 * 
 * void main(..){
 * 	  a();
 * }
 * void a(){
 * 		b();
 * 
 * 		....
 * }
 * void b(){
 * 	  ....
 * }
 * 
 * 
 * 
 */
public class TestException {
	public static void main(String[] args) {
//		System.out.println("a =" + a);
		
		System.out.println(getSum(1,1));
	}
	
	public static int getSum(int a, int b){
		return a - b;
	}
}
