package com.atguigu.buffer;

import org.junit.Test;

/*
 * 因为String类型对象是不可变。
 * 优点：因为这个对象不可变，所以有字符串常量对象一说，这些字符串常量对象就可以共享。
 * 缺点：因为这个对象不可变，所以一旦修改，就需要产生新对象，所以，如果涉及到大量频繁的字符串拼接之类的，就会产生很多中间结果的垃圾对象。
 * 
 * 为了解决这个缺陷，那么JDK提供了字符串缓冲区类型，或者说可变字符串类型：java.lang.StringBuffer
 * 
 * StringBuffer：
 * （1）线程安全的可变字符序列。
 * （2）虽然在任意时间点上它都包含某种特定的字符序列，但通过某些方法调用可以改变该序列的长度和内容。 
 * 
 * API：
 * （1）append(xx)：在当前字符序列后面追加xx，追加后重新返回当前字符序列的对象
 * （2）delete(xx)：删除
 * （3）insert(xx)：插入
 * （4）reverse()：反转
 * ...
 * 
 * 注意：StringBuffer必须new对象
 * 
 * StringBuffer的内部的存储：
 * 	字符数组
 * 这个字符数组的内容和长度都可以修改。
 * （1）StringBuffer的字符数组的初始长度：
 * StringBuffer()：默认是16
 * StringBuffer(String str）：初始长度为str.length()+16
 * StringBuffer(int capacity)：初始长度为你指定的capacity
 * （2）如果当前字符缓冲区中的字符越来越多，不够存了怎么办？
 *  value = Arrays.copyOf(value, value.length*2 + 2)
 */
public class TestStringBuffer {
	@Test
	public void test6(){
		StringBuffer s = new StringBuffer();//初始16
		s.append("hello");//5
		s.append("world");//5
		s.append("chailinyan");//10个
		System.out.println(s);
	}
	
	@Test
	public void test5(){
//		StringBuffer s = "hello";//错误的
	}
	
	@Test
	public void test4(){
		StringBuffer s = new StringBuffer("helloworld");
		s.reverse();//内容反转，长度不变
		System.out.println(s);
	}
	
	@Test
	public void test3(){
		StringBuffer s = new StringBuffer("helloworld");
		s.insert(2,"chai");//插入，内容和长度都变
		System.out.println(s);
	}
	
	@Test
	public void test2(){
		StringBuffer s = new StringBuffer("helloworld");
		s.deleteCharAt(0).delete(2, 5);//删除，内容和长度都变
		System.out.println(s);
	}
	@Test
	public void test1(){
		StringBuffer s = new StringBuffer();
		s.append("hello").append(12).append(true).append(25.8);//在后面追加，内容和长度都变
		System.out.println(s);
	}
	
}
