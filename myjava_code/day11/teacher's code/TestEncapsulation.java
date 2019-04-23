/*
面向对象的基本特征：
1、封装
2、继承
3、多态

一、封装(Encapsulation)
1、什么是封装？
封装：隐藏一些内容，对外不可见，为了安全，不随意被修改
	  该隐藏的隐藏，该暴露的暴露
例如：生活中的快递包裹

狭义：属性的私有化
广义：
 （1）   方法对方法体的封装，使得调用者不需要知道内部的实现，暴露方法签名
			例如：Math.sqrt(xx)，System.out.println(xx)

【修饰符】 返回值类型  方法名(【形参列表】){
	方法体
}
方法头，方法签名：【修饰符】 返回值类型  方法名(【形参列表】)
方法体：{}

（2）类对属性、方法等的封装
（3）组件的封装
（4）系统的封装

2、属性的封装
（1）属性的私有化
private 数据类型 属性名;

一旦私有化，只能本类中使用。

（2）给属性提供公共的get/set方法
get系列：供外界获取值用的
set系列：供外界设置值用的

get/set方法的命名有要求：get/set+属性名，属性名首字母大写（因为方法名第二个单词首字母大写）			

为什么属性要私有化？
因为希望可以通过get/set控制属性的访问。
如果不私有化，设计者就失去了对属性的控制。			
*/
class TestEncapsulation{
	public static void main(String[] args){
		//类的使用者
		Circle c = new Circle();
		//c.radius = -1;
		//System.out.println("c的半径：" + c.radius);//错误的，因为radius私有了
		System.out.println("c的半径：" + c.getRadius());
		
		c.setRadius(2.0);
		System.out.println("c的半径：" + c.getRadius());
	}
}

//类的声明，定义，设计
class Circle{
	private double radius;
	
	//供外界获取radius的值
	public double getRadius(){
		return radius;
	}
	
	//供外界修改radius的值
	public void setRadius(double r){
		if(r>=0){
			radius = r;
		}
	}
}