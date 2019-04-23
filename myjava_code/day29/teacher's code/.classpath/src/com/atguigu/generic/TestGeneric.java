package com.atguigu.generic;

import java.util.ArrayList;

import org.junit.Test;

/*
 * 长什么样？
 * <类型>就是泛型
 * <T>也是泛型
 * <K,V>也是泛型
 * <String>是泛型
 */
public class TestGeneric {
	@Test
	public void test1(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
//		list.add(1);
		
		for (String string : list) {
			
		}
	}
}
class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
}