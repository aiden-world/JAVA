package com.atguigu.inherite;

/*
 * 关键字：super
 * 
 * 意思：引用父类的，从父类中去找
 * 用法：
 * （1）super.属性
 * 当父类的属性没有私有化（在子类中是可见的），并且子类声明了一个和它同名的属性时，可以使用super.来引用父类的。
 * 
 * （2）super.方法
 * 当子类重写了父类的方法，但是又想要在子类中调用父类被重写的方法时，需要通过super. 
 * 
 * （3）super()或super(实参列表)
 * super()调用父类的无参构造
 * super(实参列表)调用父类的有参构造
 * 要求：必须在子类构造器的首行
 * 
 * 结论：
 * this：
 *    this.属性，this.方法，先从本类找，本类没有开始往上找
 * 	  this()或this(实参列表)，先从本类找，如果本类没有就报错了
 * super：直接从直接父类开始往上找
 * 	  super.属性，super.方法，直接从直接父类中找，如果没有，再往上
 *    super()或super(实参列表)，直接从直接父类中找，如果没有，就报错了
 * 
 * 建议和this一起记，对比着看。
 */
public class TestSuper {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.test();
	}
}
class Fu{
	protected String info = "atguigu";
}
class Zi extends Fu{
	private String info = "尚硅谷";
	
	public void test(){
		System.out.println(info);//尚硅谷
		System.out.println(super.info);//atguigu
		System.out.println(this.info);//尚硅谷
	}
}