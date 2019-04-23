package com.atguigu.jdk8;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/*
 * 一、消费（耗）型接口：
 * 
 * 1、核心接口：Consumer<T>
 * 	它的抽象方法：void accept(T t)   有参无返回值           
 *  因为对于调用者来说，你调用时需要给它“实参”，但是得不到“返回值”
 * 
 * 2、变形接口：
 * BiConsumer<T,U>		void accept(T t, U u) 		接收两个形参用于完成功能
 * 
 * DoubleConsumer		void accept(double value) 	接收一个double值
 * IntConsumer			void accept(int value)  	接收一个int值
 * LongConsumer			void accept(long value)  	接收一个long值
 * 
 * ObjDoubleConsumer<T>	void accept(T t, double value)  接收一个对象和一个double值
 * ObjIntConsumer<T>	void accept(T t, int value) 	接收一个对象和一个int值
 * ObjLongConsumer<T>	void accept(T t, long value) 	接收一个对象和一个long值
 * 
 */
public class TestConsumer {
	
	/*
	 * 示例一：Collection系列集合，在Java8版本：增加了
	 * 	default void forEach(Consumer<? super T> action)
	 */
	@Test
	public void test1(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("world");
		
		/*
		 * forEach方法的形参类型：Consumer<? super T>
		 * 它是消费型接口：void accept(T t)
		 * 
		 * Lambda表达式的形参列表： (String s)
		 * Lambda表达式的Lambda体：{写打印集合的元素}
		 */
		list.forEach(s -> System.out.println(s));
	}
	
	/*
	 * 示例二：Map系列集合，在Java8版本：增加了
	 * 	default void forEach(BiConsumer<? super K,? super V> action)
	 */
	@Test
	public void test2(){
//		HashMap<Integer,String> map = new HashMap<Integer,String>();
		/*
		 * JDK1.7 简化右边的写法
		 */
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "小崔");
		map.put(2, "小高");
		map.put(3, "小强");
		
		/*
		 * BiConsumer接口：
		 * 	BiConsumer<T,U>		void accept(T t, U u) 		接收两个形参用于完成功能
		 * 
		 * Lambda表达式的形参列表：(Integer key,String value)
		 * Lambda表达式的Lambda体：{遍历打印map的key和value}
		 */
//		map.forEach((Integer key,String value) -> {System.out.println("key=" + key +", value = " + value);});
		map.forEach((key,value) -> System.out.println("key=" + key +", value=" + value));
	}
}
