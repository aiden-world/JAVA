package com.atguigu.reflect;

import java.lang.annotation.ElementType;

import org.junit.Test;

/*
 * 类型的加载的结果，在内存中生成了这个类型的唯一的一个java.lang.Class对象。同一种类型共享同一个Class对象。
 * 
 * 这个Class对象不是程序员new,是在类加载的过程中，由类加载器来new。
 * 
 * 1、如何获取Class对象（要求大家必须掌握）
 * (1)类型名.class
 * 
 * 	Class 类的实例表示正在运行的 Java 应用程序中的类和接口。枚举是一种类，注释(注解)是一种接口。
 * 每个数组属于被映射为 Class 对象的一个类，所有具有相同元素类型和维数的数组都共享该 Class 对象。
 * 基本的 Java 类型（boolean、byte、char、short、int、long、float 和 double）和关键字 void 也表示为 Class 对象。 
 * 
 * (2)对象.getClass()
 * (3)Class.forName("类型的全名称")
 * 
 * 类型的全名称：包.类型名
 * 
 * 但是第（3）中方式无法获取    基本数据类型和void，数组的Class，只适用于类、接口、枚举、注解
 * 
 * (4)类加载器对象.loadClass("类型的全名称")
 * 
 * 类加载器：ClassLoader
 */
public class TestReflect {
	@Test
	public void test5() throws ClassNotFoundException{
		//（1）获取类加载器的对象
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		//（2）用类加载器对象去加载某个类
		Class c4 = loader.loadClass("java.lang.String");
		
		Class c1 = Class.forName("java.lang.String");
		Class c2 = String.class;
		Class c3 = "".getClass();
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c1 == c4);
	}
	
	@Test
	public void test4() throws ClassNotFoundException{
//		Class c1 = Class.forName("int");
//		Class c2 = Class.forName("String[]");
	}
	
	@Test
	public void test3() throws ClassNotFoundException{
			Class c1 = Class.forName("java.lang.String");
			Class c2 = String.class;
			Class c3 = "".getClass();
			
			System.out.println(c1 == c2);
			System.out.println(c1 == c3);
	}
	
	@Test
	public void test2(){
		Object obj = new String();
		
		Class<? extends Object> class1 = obj.getClass();
		System.out.println(class1);
		
		Class class2 = String.class;
		System.out.println(class1 == class2);
	}
	
	@Test
	public void test1(){
		Class oc = Object.class;//oc是Object这个类型的Class对象，这个oc中存储了Object的所有信息
		Class cc = Class.class;//cc表示Class类型自己的信息
		
		Class cb = Comparable.class;//cb是表示Comparable类型的信息
		
		Class ec = ElementType.class;//ec是表示ElementType枚举类型的信息
		
		Class ov = Override.class;//ov是表示Override这个注解的信息
		
		Class ic1 = int[].class;
		Class ic2 = int[][].class;
		System.out.println(ic1.equals(ic2));
		
		Class sc = String[].class;
		System.out.println(ic1.equals(sc));
		
		Class c = int.class;
		Class v = void.class;
	}
	
	@Test
	public void test(){
//		Class c = new Class();//错误的
		//Class 没有公共构造方法。Class 对象是在加载类时由 Java 虚拟机以及通过调用类加载器中的 defineClass 方法自动构造的。
	}
}
