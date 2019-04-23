package com.atguigu.polymorphism;

/*
 * 多态的应用：
 * （1）多态数组
 * （2）多态参数
 * 
 * 一、多态数组
 * 数组的元素类型是父类的类型，数组中存的是各种子类的对象。
 * 
 * （1）有一个父类：图形Graphic类，有一个方法：求面积的方法。
 * （2）有一个子类：圆Circle类，重写该方法
 * （3）有一个子类：矩形Rectangle类，重写该方法
 * （4）声明一个数组，存储3个圆对象，2个矩形对象，遍历他们的面积，或者按照他们的面积大小排序...
 */
public class TestPolymorphismArray {
	public static void main(String[] args) {
//		Circle[] arr;//无法存矩形
//		Rectangle[] arr;//无法存圆
		
		//声明并创建了一个长度为5的数组，数组的元素类型是Graphic
		Graphic[] arr = new Graphic[5];
		
		//为元素赋值
		//左边arr[0]是Graphic类型，父类的类型，右边是Circle的对象，是子类的对象，是多态引用
		arr[0] = new Circle(2.0);
		arr[1] = new Circle(1.0);
		arr[2] = new Circle(3.0);
		
		arr[3] = new Rectangle(2,4);
		arr[4] = new Rectangle(3,1);
		
		System.out.println("所有图形的面积：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getArea());
		}
		
		//从小到大排序
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j].getArea() > arr[j+1].getArea()){
					Graphic temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("排序后，所有图形的面积：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getArea());
		}
		
	}
}