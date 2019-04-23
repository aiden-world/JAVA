package com.atguigu.jdk8;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

/*
 * Lambda表达式：是用来实现SAM接口的，或者说给SAM接口的变量，形参赋值用的。
 * 语法：
 * (Type1 param1, Type2 param2, ..., TypeN paramN) -> {
  		statment1;
  		statment2;
  		//.............
  		return statmentM;
	}
 *
 * Lambda表达式的形参列表：(Type1 param1, Type2 param2, ..., TypeN paramN)
 * 		说明：这个形参列表就是SAM接口的抽象方法的形参列表
 * 	
 * Lambda表达式的操作符：->
 * 
 * Lambda表达式的Lambda体：{...} 
 * 		说明：{...}中的代码就是实现SAM接口的抽象方法的方法体
 * 
 * 说明：
 * （1）如果形参列表是空参，那么()是不能省略的
 * （2）如果形参列表只有一个，并且类型是可以确定或推断，那么可以省略()和这个形参的类型
 * （3）如果形参列表有多个，但是类型是可以确定或推断，那么可以省略类型，但是不能省略()
 * （4）如果{}中的Lambda体只有唯一的一条语句，我们可以省略{}以及里面的这个语句的;
 * 		如果这个唯一的语句还是return语句，那么连return也可以省略
 */
public class TestLambdaGrammer {
	@Test
	public void test4(){
		/*
		 * TreeSet默认是按照java.lang.Comparable接口的实现方法来排序。String类型的默认实现是区分大小写。
		 * 
		 * 需求：不区分大小写的排序
		 * 这个时候，再建立TreeSet对象时，要传入Comparator接口的对象
		 * TreeSet(Comparator<? super E> comparator) 
		 * 
		 * Comparator接口：int compare(T t1, T t2)
		 * 
		 * Lambda表达式的形参列表：(T t1, T t2)   (String s1, String s2)
		 * Lambda表达式的Lambda体：重新对字符串进行排序，不区分大小写的排序
		 */
		/*TreeSet<String> set = new TreeSet<String>((String s1, String s2) -> {
			return s1.compareToIgnoreCase(s2);
		});*/
		
		TreeSet<String> set = new TreeSet<String>((s1, s2) -> s1.compareToIgnoreCase(s2));
		set.add("hello");
		set.add("world");
		set.add("Hello");
		set.add("Java");
		set.add("Chailinyan");
		
		/*
		 * 遍历集合
		 * forEach(Consumer action)
		 * Consumer接口：void accept(T t)
		 */
//		set.forEach((String s) -> {System.out.println(s);});
		set.forEach(s -> System.out.println(s));
	}
	
	@Test
	public void test3(){
		/*
		 * 示例三：File类  File[] listFiles(FileFilter filter)
		 * 要用Lambda表达式给FileFilter接口赋值
		 */
		File dir = new File("D:/atguigu/javaee/JavaSE20190218/01_尚硅谷_大数据_JavaSE/code/day01_code");
		
		/*
		 * 形参的类型：FileFilter接口
		 * 抽象方法：boolean accept(File pathname);
		 * 
		 * Lambda表达式的形参列表：(File pathname)
		 * Lambda表达式的Lambda体：{筛选/保留出以".java"结尾的文件}
		 */
		File[] subs = dir.listFiles((File pathname) -> {
					if(pathname.getName().endsWith(".java")){
						return true;
					}
					return false;
				});
		
		//省略
		File[] subs2 = dir.listFiles(pathname -> {
				return pathname.getName().endsWith(".java");
		});
		
		//再省略
		File[] subs3 = dir.listFiles(pathname -> pathname.getName().endsWith(".java"));
	}
	
	@Test
	public void test2(){
		/*
		 * 示例二：Collection系列的集合，实现了java.lang.Iterable接口
		 * 这个接口有一个抽象方法：default void forEach(Consumer<? super T> action)
		 * 
		 * 现在演示用Lambda表达式为 Consumer接口类型的形参赋值
		 */
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
		list.forEach((String s) -> {System.out.println(s);});
		
		//省略，简化
		list.forEach(s -> System.out.println(s));
	}
	
	@Test
	public void test1(){
		/*
		 * 示例一：java.lang.Runnable
		 * 		public void run();
		 */
		Runnable r1 = () -> {System.out.println("hello");};
		
		//省略后
		Runnable r2 = () -> System.out.println("hello");
	}
}
