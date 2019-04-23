package com.atguigu.collect;

import java.util.Iterator;

import org.junit.Test;

public class TestMyArrayList {
	@Test
	public void test9(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
	/*	for (Object  obj : my) {
			System.out.println(obj);
		}*/
		
		Iterator iter = my.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			System.out.println(obj);
		}
		
	}
	
	@Test
	public void test8(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		my.set(1, "小高");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test7(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		my.insert(1, "小崔");
		my.insert(1, "小高");
		my.insert(1, "小张");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test6(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		my.insert(1, "小崔");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test5(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		my.remove("李四");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test4(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		my.remove(0);
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test3(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		Object object = my.get(1);
		System.out.println(object);
		
		System.out.println(my.get(3));
		System.out.println(my.get(10));
	}
	
	@Test
	public void test2(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add(null);
		my.add("李四");
		my.add("王五");
		
		int index = my.indexOf("张三");
		int index2 = my.indexOf("小崔");
		int index3 = my.indexOf(null);
		System.out.println(index);
		System.out.println(index2);
		System.out.println(index3);
	}
	
	@Test
	public void test1(){
		MyArrayList my = new MyArrayList();
		
		//my是一个容器对象，好比一个箱子，教室
		//往my中装对象
		my.add("张三");
		my.add("李四");
		my.add("王五");
		my.add(null);
		my.add("赵六");
		my.add("钱七");
		my.add("王八");
		
		Object[] array = my.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
