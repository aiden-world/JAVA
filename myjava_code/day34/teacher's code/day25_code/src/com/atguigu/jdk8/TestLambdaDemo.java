package com.atguigu.jdk8;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import org.junit.Test;

/*
 * lambda表达式其实就是实现SAM接口（Single Abstract Method，包含唯一的一个抽象方法的接口）的语法糖。
 * 示例一：java.lang.Runnable
 * 		public void run();
 * 示例二：
 * 	之前遍历集合：foreach循环
 * 	jdk1.8增加了一个方法
 * 		java.lang.Iterable：
 * 			default void forEach(Consumer<? super T> action)  ：作用和foreach循环的作用一样	
 * 		Collection系列的集合都有这个方法
 * 
 * 示例三：
 * 	File：
 * 		目录列出它的下一级
 * 		  File[] listFiles(FileFilter filter)
 * 
 * 如果Lambda表达式写的好，可以简化代码。
 */
public class TestLambdaDemo {
	@Test
	public void test8(){
		File dir = new File("D:/atguigu/javaee/JavaSE20190218/01_尚硅谷_大数据_JavaSE/code/day01_code");
		//列出这个文件夹中的.java文件，其他的不要
		File[] subs = dir.listFiles(f -> f.getName().endsWith(".java"));
		
		for (File file : subs) {
			System.out.println(file);
		}
	}
	
	@Test
	public void test7(){
		File dir = new File("D:/atguigu/javaee/JavaSE20190218/01_尚硅谷_大数据_JavaSE/code/day01_code");
		//列出这个文件夹中的.java文件，其他的不要
		File[] subs = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		});
		for (File file : subs) {
			System.out.println(file);
		}
	}
	
	@Test
	public void test6(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("world");
		
		//现在用forEach()遍历集合
		list.forEach(System.out::println);
	}
	@Test
	public void test5(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("world");
		
		//现在用forEach()遍历集合
		list.forEach(s -> System.out.println(s));
	}
	@Test
	public void test4(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("world");
		
		//原来遍历集合
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	@Test
	public void test3(){
		//用Lambda表达式实现了Runnable接口
		new Thread(()-> System.out.println("helloworld")).start();
	}
	@Test
	public void test2(){
		//用Lambda表达式实现了Runnable接口
		Runnable r = ()-> System.out.println("helloworld");
		new Thread(r).start();
	}
	@Test
	public void test1(){
		//用匿名内部类实现了Runnable接口
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("helloworld");
			}
		};
	}
}
