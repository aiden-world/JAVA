package com.atguigu.exam;

import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int count = 0;
		while(true){
			try {
				count++;
				if(count>3){
					break;
				}
				System.out.print("请输入一个整数：");
				num = input.nextInt();
				System.out.println("num = " + num);
				
			} catch (Exception e) {
				e.printStackTrace();
				
				//处理异常
				//把输入流通道中的错误的数据给处理掉
				String error = input.nextLine();//读取一行，不接收
				System.out.println("error=" + error);
			}
		}
		
		System.out.println("外面num = " + num);
		input.close();
	}
}
