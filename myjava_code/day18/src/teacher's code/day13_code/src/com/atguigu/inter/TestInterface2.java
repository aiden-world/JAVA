package com.atguigu.inter;

/*
 * 接口的特点：
 * 1、接口本身是不能实例化
 * 2、实现类与接口之间是has-a的关系
 * 这个实现类中有你这个接口的一个行为特征，
 * 例如：小鸟具有Flyable接口的fly()行为能力
 * 
 * 换句话说，只要你想要实现这个接口，具备这种行为能力，想要符合这种标准都可以实现这个接口。
 * 
 * 3、类的继承有单继承的限制，类实现接口可以多实现
 * 4、类与类之间可以单继承，接口与接口可以多继承
 * 
 * 类与类之间单继承
 * 类与接口之间多实现
 * 接口与接口之间多继承
 * 
 * 5、如果一个类既要继承父类又要实现接口，必须先继承后实现。
 * 6、接口中没有所谓的构造器，代码块...
 * 
 */
public class TestInterface2 {
	public static void main(String[] args) {
//		MyInter my = new MyInter();//接口不能直接创建对象
	}
}
interface MyInter{
	void method();
}
interface A{
	void a();
}
interface B{
	void b();
}
interface C extends A,B{
	void c();
}

class MyImpl implements C{

	@Override
	public void a() {
		
	}

	@Override
	public void b() {
		
	}

	@Override
	public void c() {
		
	}
	
}