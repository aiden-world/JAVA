package com.atguigu.noninit.demo3;
/*
 * 第3种：不会导致某个类初始化
 * 		通过某个类型去声明数组
 */
public class TestArray {
	public static void main(String[] args) {
		Demo[] arr = new Demo[5];
		//因为此时，产生一个新的类型  Demo[]数组类型，创建的也是 Demo[]的对象，不是Demo的对象
		
	}
}
class Demo{
	static{
		System.out.println("初始化");
	}
}
