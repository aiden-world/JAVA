package com.atguigu.exam;

class Text{
	public int num;
	public String str;
	
	public Text(int num, String str){
		this.num = num;
		this.str = str;
	}
}
public class Exam5 {
	//int类型，Integer类型，String类型的形参都是无法修改对应的实参的值
	public static void f1(Text tIn, int intIn, Integer integerIn, String strIn){
		tIn.num =200;
		tIn.str = "bcd";
		intIn = 200;
		integerIn = 200;
		strIn = "bcd";
	}
	public static void main(String[] args) {
		Text tIn = new Text(100, "abc");
		int intIn = 100;
		Integer integerIn = 100;
		String strIn = "abc";
		
		f1(tIn,intIn,integerIn,strIn);
		
		System.out.println(tIn.num + tIn.str + intIn + integerIn + strIn);
		//200bcd100100abc
	}
}