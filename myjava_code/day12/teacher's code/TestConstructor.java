/*
构造器：也称为构造方法

1、作用：
（1）和new一起使用创建对象
（2）在创建对象的同时为属性赋值

2、构造器的语法
语法结构：
【修饰符】 构造器名(【形参列表】){
	//...
}

3、构造器的特点
（1）构造器不写返回值类型
（2）构造器名称和所在的类名完全一样
（3）所有类都有构造器
（4）如果一个类没有手动声明构造器，那么编译器将自动为你添加一个“无参构造”
（5）如果你为一个类手动编写了构造器，那么编译器就不再为你提供“无参构造”
（6）构造器可以重载

4、构造器的形式
（1）无参构造：空参构造
【修饰符】 构造器名(){
	
}
（2）有参构造
【修饰符】 构造器名(形参列表){
	
}

*/
class TestConstructor{
	public static void main(String[] args){
		//原来：类名 对象名 = new 类名();
		//现在：类名 对象名 = new 构造器名(); 
		//或者：类名 对象名 = new 构造器名(实参列表); 
		Circle c1 = new Circle();
		
		Circle c2 = new Circle(1.2);
		
		System.out.println(c1.getInfo());
		System.out.println(c2.getInfo());
	}
}

class Circle{
	private double radius;
	
	//创建对象的同时，为半径赋值
	public Circle(double r){
		//半径赋值为r的值
		radius = r;
	}
	public Circle(){
		//赋默认值
	}
	
	//创建对象之后，为半径赋值用的
	public void setRadius(double r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	
	public String getInfo(){
		return "半径：" + radius;
	}
}