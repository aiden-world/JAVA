package com.atguigu.exception;

import java.util.Random;
import java.util.Scanner;

/*
 * (1)finally和return
 * ①无论try中是否有异常，也无论是否可以捕获异常，无论try和catch中是否有return,finally一定会执行
 * ②如果finally中一旦写了return，那么try和catch中的return都失去意义的。
 *   建议不要在finally中写return，如果面试题中写了，要知道它的执行特点。
 * (2)如果没有try...catch等，如果方法中发生异常了，那么return语句就没机会了，直接由异常抛出回到上一级  
 */
public class TestFinallyReturn {
	public static void main(String[] args) {
//		System.out.println("返回的值：" + getNum());
		
		System.out.println("返回值：" + getNum2());
	}
	
	public static int getNum(){
		try {
			Random rand = new Random();
			int num = rand.nextInt(100);//产生[0,100)的整数
//			System.out.println(num/0);//报异常
			System.out.println("num = " + num);
			return num;
		} catch (Exception e) {
			System.out.println("有异常");
			return 1;
		}finally{
			System.out.println("finally");
			return 2;
		}
	}
	
	public static int getNum2(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		return num;
	}
}
