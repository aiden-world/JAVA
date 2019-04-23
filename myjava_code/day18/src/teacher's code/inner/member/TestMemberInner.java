package com.atguigu.inner.member;

/*
 * 二、非静态的成员内部类
 * 1、语法格式
 * 
 * 【修饰符】 class 外部类   【extends 父类】 【implements 接口们】{
 * 		
 * 		【修饰符】 class 内部类 【extends 父类】 【implements 接口们】{
 * 		}
 * 
 * }
 * 
 * 2、非静态成员内部类也是一个独立的类
 * 字节码文件：外部类$内部类
 * 
 * 3、成员
 *   除了静态成员，其他都可以。
 *   
 * 4、如何使用
 * ①在外部类的外面
 * 步骤：
 * 第一步：创建外部类的对象
 * 第二步：创建或获取内部类的对象
 * 第三步：通过"对象."调用方法等
 * 
 * ②在外部类的里面使用内部类 ：直接使用
 * 
 * ③在内部类中使用外部类的成员是否有限制？没有限制
 * 
 * 回忆：创建对象的语法格式
 * 类型名  对象名 = new 构造器(【实参列表】);
 * 
 */
public class TestMemberInner {
	public static void main(String[] args) {
		//(1)创建外部类的对象
		Wai w = new Wai();
		
		//(2)创建内部类的对象
		//Wai.Nei是类型名
		//n是对象名
		//特殊在这里：要用外部类的对象，去调用内部类的构造器
//		Wai.Nei n = w.new Nei();//因为这个写法太恶心
		
		//我们换一种方式
		//目的：获取内部类的对象
		Wai.Nei n = w.getNei();//通过这个方法得到内部类的对象
		
		//(3)调用方法
		n.test();
	}
}
class Wai{
	private static int a;
	private int b;
	
	class Nei{
		public void test(){
			System.out.println("只有非静态的方法");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}
	
	public Nei getNei(){
		return new Nei();
	}
}