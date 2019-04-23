package com.atguigu.reflect.staticMember;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/*
 * 如何动态的操作某个类的静态的成员
 */
public class TestStaticMember {
	@Test
	public void test1()throws Exception{
		//(1)获取Class对象
		Class clazz = Class.forName("com.atguigu.bean.Employee");
		
		//操作Employee类的静态成员是不需要Emloyee的对象
		//(2)获取Employee的静态变量num的值
		//①获取num的类变量Field对象
		Field numField = clazz.getDeclaredField("num");
		
		//②如果私有可以设置可访问
		numField.setAccessible(true);
		
		//②获取num的类变量的值
		Object value = numField.get(null);//这里不需要传对象，因为是静态的
		System.out.println(value);
		
		
		//(3)调用Employee的静态方法setNum(int num)
		//①先获取setName方法的Method对象
		Method setNum = clazz.getDeclaredMethod("setNum", int.class);
		//②调用setNum方法
		Object value2 = setNum.invoke(null, 20);
		System.out.println(value2);
		
		//(4)调用Employee的静态方法getNum()
		Method getNum = clazz.getDeclaredMethod("getNum");
		Object num = getNum.invoke(null);
		System.out.println(num);
	}
}
