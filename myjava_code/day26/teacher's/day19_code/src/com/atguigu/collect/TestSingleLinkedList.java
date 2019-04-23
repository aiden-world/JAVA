package com.atguigu.collect;

import org.junit.Test;

public class TestSingleLinkedList {
	@Test
	public void test2(){
		MySingleLinkedList my = new MySingleLinkedList();
		
		my.add("张三");
		my.add("李四");
		my.add("小崔");
		my.add("小高");
		my.add("校长");
		my.add("小王");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------");
		my.remove("张三");
		array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------");
		my.remove("小高");
		array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------");
		my.remove("小王");
		array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------");
		my.remove("小柴");
		array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test1(){
		MySingleLinkedList my = new MySingleLinkedList();
		
		my.add("张三");
		my.add("李四");
		my.add("小崔");
		my.add("小高");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
