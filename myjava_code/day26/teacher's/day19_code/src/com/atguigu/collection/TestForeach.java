package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/*
 * Collection系列集合的遍历：
 * 1、Object[] toArray()
 * 2、Iterator iterator()
 * 3、foreach
 * 
 * 一、foreach是JDK1.5之后引入，称为增强版for循环
 * 可以用来遍历数组或Collection系列的集合等容器。
 * 
 * 语法结构：
 * for(元素的类型   元素名   : 数组/集合等容器对象名){
 * }
 * 
 * 特殊：不能修改元素的地址，即不能把元素换成其他的对象。但是根据元素修改属性可以。
 * 
 * 建议：遍历查看时用foreach比较快，比较简单
 * 
 * 二、foreach与java.lang.Iterable
 * 实现这个Iterable接口允许对象成为 "foreach" 语句的目标，即实现了Iterable接口的对象，就可以使用foreach遍历
 * 
 * 因为Collection系列的集合，Collection接口继承了Iterable接口，所以它可以称为"foreach" 语句的目标。
 * 换句话说，Collection系列的集合都实现了Iterable接口。
 * 
 * Iterable接口的抽象方法：
 * 		Iterator iterator() 
 * 
 * 或者说，foreach最终执行的还是iterator迭代器的方法
 * 
 * JDK1.5引入：
 * （1）可变参数
 * （2）枚举
 * （3）注解
 * （4）泛型
 * （5）foreach
 * （6）...
 */
public class TestForeach {
	@Test
	@SuppressWarnings("all")
	public void test4(){
		Collection coll = new ArrayList();
		coll.add(new Student("张三"));
		coll.add(new Student("李四"));
		coll.add(new Student("王五"));
		
		for (Object object : coll) {
			System.out.println(object);
		}
		
		//object看成形参
		for (Object object : coll) {
			object = new Student("小崔");
//			Student stu = (Student) object;
//			stu.setName("小崔");
		}
		
		for (Object object : coll) {
			System.out.println(object);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test3(){
		String[] arr = {"hello","world","java"};
		//String：元素类型名
		//str：元素名，自己取
		//arr：数组名
		for (String str : arr) {
			str = "string";
		}
		
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
	
	@Test
	@SuppressWarnings("all")
	public void test2(){
		String[] arr = {"hello","world","java"};
		//String：元素类型名
		//str：元素名，自己取
		//arr：数组名
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test1(){
		Collection coll = new ArrayList();
		
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		coll.add("钱七");
		coll.add("张三丰");
		coll.add("柴林燕");
		
		//Object元素类型名
		//obj：元素名，我们自己取的
		//coll：要遍历的集合名
		for (Object obj : coll) {
			System.out.println(obj);
		}
	}
}
class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}