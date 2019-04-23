package com.atguigu.exception;

import java.util.Scanner;

/*
 * finally：必须和try或try...catch一起使用，
 * 		表示无论try中是否发生了异常，也不管catch是否可以捕获这个异常对象，都要执行的代码块。
 * 		一般这个部分用于编写“释放资源”等代码。
 * 
 * try{
 * }catch(){
 * }...
 * finally{
 * }
 * 
 * try{
 * }finally{
 * }
 * 
 * 
 * System.err和e.printStackTrace这个是属于错误信息的打印，标记红色
 * System.out这个普通信息打印，
 * 
 * 它俩是两个线程维护，所以谁先打印不一定
 */
public class TestTryCatchFinally {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("请输入第一个整数：");
			int a = input.nextInt();
			
			System.out.print("请输入第二个整数：");
			int b = input.nextInt();
			
			int result = a/b;
			System.out.println("商：" + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("除数不能为0");
		}finally{
			input.close();
			
			System.out.println("finally");
		}
		
		System.out.println("继续....");
	}
}
