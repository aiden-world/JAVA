package com.atguigu.meiju;

/*
 * 可变参数：JDK1.5之后
 * 
 * JDK1.5之后才有枚举。
 * 
 * 枚举：
 * 	罗列，列举，穷举
 * 
 * 1、什么时候用枚举？
 * 当某个类的对象，在整个系统中，有且只有有限的几个，不能随意的创建。
 * 
 * 例如：星期(Week)，对象：7个对象
 *     员工的状态（Status），对象：忙、闲、休假、离职
 * 	        支付方式：微信支付WeChat，支付宝Alipay，银行卡Card，现金cash
 * 
 * 2、JDK1.5之前，想要实现枚举的效果怎么办？
 * 思路：
 * (1)阻止外面随意的创建对象--》限制构造器的使用
 * (2)既然外面无法创建，只能在本类中提前创建好，供别人使用
 * 用全局静态常量对象来表示。
 * 
 * 结论：
 * （1）枚举类型还是一个类，只是一种对象的个数是有限几个的类
 * （2）枚举类型的构造器一定要私有化
 * （3）枚举类型中要用全局静态常量对象的方式提供有限的几个对象。
 * 
 * 3、JDK1.5之后，简化了枚举类的声明和实现
 * 
 * 
 */
public class TestMeiJu {
	public static void main(String[] args) {
//		Season s1 = new Season();
//		Season s1 = Season.getInstance();
		
		Season s1 = Season.SPRING;
		Season s2 = Season.AUTUMN;
		Season s3 = Season.SUMMER;
		Season s4 = Season.WINTER;
		
		Season s5 = Season.SPRING;
		System.out.println(s1 == s5);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
//季节：春，夏，秋，冬
class Season{
	public static final Season SPRING = new Season("春暖花开");
	public static final Season SUMMER = new Season();
	public static final Season AUTUMN = new Season();
	public static final Season WINTER = new Season();
	
	private String des;//描述
	
	private Season(){
		
	}
	private Season(String des){
		this.des = des;
	}
	@Override
	public String toString() {
		return "Season [des=" + des + "]";
	}
	
/*	public static Season getInstance(){
		return new Season();
	}*/
	
}
