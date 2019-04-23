package com.atguigu.exam3;

public class Child extends Father{
	public String grade;
	
	public static void main(String[] args){
		Father f = new Child();
//		System.out.println(f.name);//编译错误，因为name是private的
	}
}