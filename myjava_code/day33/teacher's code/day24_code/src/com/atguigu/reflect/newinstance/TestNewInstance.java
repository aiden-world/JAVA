package com.atguigu.reflect.newinstance;

import java.lang.reflect.Constructor;

import org.junit.Test;

/*
 * 反射的使用：在运行期间
 * 1、动态的获取某个类型的详细信息
 * 2、动态的创建任意类型的对象
 * 3、动态的调用任意对象的方法
 * 4、动态的访问或设置任意对象的属性
 * ...
 * 
 * 二、动态的创建任意类型的对象
 * （1）Class类型
 * Class对象.newInstance()
 * 要求：该类型有无参构造
 * 结论：自己写类时，尽量保留无参构造
 * 
 * 实例初始化：
 * com.atguigu.bean.Employee.<init>()：有三部分组成：
 * （1）非静态属性的显式赋值
 * （2）非静态代码块
 * （3）构造器
 * 每一个构造器，最终编译器都会自动生成对应的一个实例初始化方法<init>()和<init>(形参列表)
 * 
 * （2）构造器
 * 适用于无参，有参
 */
public class TestNewInstance {
	@Test
	public void test2()throws Exception{
		//（1）获取某个类型的Class对象
		//至于你用哪种方式获取，都一样
		Class clazz = Class.forName("com.atguigu.bean.Employee");
		//（2）先获取它的构造器对象
		/*
		 * Class类型：
		 * Constructor<?>[] getConstructors() ：获取所有公共的构造器
		 * Constructor<?>[] getDeclaredConstructors() ：获取所有声明的构造器，包括非公共的
		 * Constructor<T> getConstructor(Class<?>... parameterTypes)  ：根据构造器的形参列表的类型获取一个公共的构造器
		 * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)   ：根据构造器的形参列表的类型获取一个声明的构造器
		 */
		//假设我已知了它的形参列表，至于怎么知道了，可以通过配置文件沟通
		Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class,double.class);
		
		//（3）创建Employee的对象
		//T newInstance(Object... initargs)  
		Object obj = constructor.newInstance("张三",23,10000);
		System.out.println(obj);
		
		Object obj2 = constructor.newInstance("李四",24,10000);
		System.out.println(obj2);
	}
	
	@Test
	public void test1()throws Exception{
		//（1）获取某个类型的Class对象
		//至于你用哪种方式获取，都一样
		
		Class clazz = Class.forName("com.atguigu.bean.Employee");
		
		//（2）创建Employee的对象
		Object obj = clazz.newInstance();
		System.out.println(obj);
	}
}
