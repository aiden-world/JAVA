package com.atguigu.meiju.exer;

import java.util.Scanner;

/*
 * 2、枚举练习2
（1）声明一个支付方式Payment枚举类型，有：微信支付，支付宝支付，银行卡支付，现金支付，
有一个属性：number，并且规定微信支付方式为1，支付宝支付为2，依次类推，
提供一个方法，可以根据number获取不同枚举对象的方法
（2）在测试类中
---------------支付方式选择--------------
			1、微信支付
			2、支付宝方式
			3、银行卡
			4、现金支付
			请选择：
根据键盘输入，获取不同对象，打印
 */
public class TestExer2 {
	public static void main(String[] args) {
		System.out.println("---------------支付方式选择--------------");
		System.out.println("\t\t1、微信支付");
		System.out.println("\t\t2、支付宝方式");
		System.out.println("\t\t3、银行卡");
		System.out.println("\t\t4、现金支付");
		System.out.println("\t\t请选择：");
		
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();
		
		Payment p = Payment.getByNumber(select);
		System.out.println(p);
	}
}
enum Payment{
	WECHAR(1),ALIPAY(2),CARD(3),CASH(4);
	private final int number;//编号

	private Payment(int number) {
		this.number = number;
	}
	
	//提供一个方法，可以根据number获取不同枚举对象的方法
	public static Payment getByNumber(int number){
		switch(number){
		case 1:
			return WECHAR;
		case 2:
			return ALIPAY;
		case 3:
			return CARD;
		case 4:
			return CASH;
		default:
			return null;
		}
	}
}