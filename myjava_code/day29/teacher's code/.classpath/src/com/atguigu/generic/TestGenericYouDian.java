package com.atguigu.generic;

import java.util.ArrayList;

import org.junit.Test;

/*
 * 泛型的好处？或者没有泛型会怎么样？
 * 
 * 1、类型安全检查
 * 2、简化代码：避免的强制类型转换
 * 
 * 工厂生产了很多瓶子，形状都一样，生产瓶子的厂家不知道用户将来用它来装什么。
 * 这个泛型就好比标签。
 */
public class TestGenericYouDian {
	@Test
	public void test2(){
		//希望这个集合用来装学生的姓名
		ArrayList<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
//		names.add(1);
		
		//我以为里面都是学生姓名
		//显示学生的姓，姓名的第一个字
		/*
		 * for(元素的类型   元素名:集合/数组名){}
		 */
		for (String name : names) {
			System.out.println("姓：" + name.charAt(0));
		}
		
	}
	@Test
	public void test1(){
		//希望这个集合用来装学生的姓名
		ArrayList names = new ArrayList();
		names.add("张三");
		names.add("李四");
		names.add(1);
		
		//我以为里面都是学生姓名
		//显示学生的姓，姓名的第一个字
		for (Object object : names) {
			String name = (String) object;
			System.out.println("姓：" + name.charAt(0));
		}
		
	}
}
