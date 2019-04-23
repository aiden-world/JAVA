package com.atguigu.polymorphism;

/*
 * 二、多态参数
 * 形参的类型是父类的类型，实参是子类的对象
 * 
 * 
 * 需求：设计一个方法，可以打印所有图形的面积
 */
public class TestPolymorphismParams {
	public static void main(String[] args) {
		Circle c = new Circle(2.0);
		Rectangle r = new Rectangle(3,4);
		
		printArea(c);//打印圆的面积
		/*
		 * 形参的类型：Graphic g
		 * 实参的对象：c是子类对象     
		 * 隐含：Graphic g = c;  //多态引用
		 */
		
		printArea(r);//打印矩形的面积
		/*
		 * 形参的类型：Graphic g
		 * 实参的对象：r是子类对象     
		 * 隐含：Graphic g = r;  //多态引用
		 */
	}
	
	//功能：可以打印各种图形的面积
	public static void printArea(Graphic g){
		System.out.println("面积：" + g.getArea());
	}
/*	public void printArea(Circle circle){
		
	}
	public void printArea(Rectangle r){
		
	}*/
}
