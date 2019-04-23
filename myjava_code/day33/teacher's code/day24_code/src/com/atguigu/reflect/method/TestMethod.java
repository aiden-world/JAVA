package com.atguigu.reflect.method;

import java.lang.reflect.Method;

import org.junit.Test;

/*
 * 反射的使用：在运行期间
 * 1、动态的获取某个类型的详细信息
 * 2、动态的创建任意类型的对象
 * 3、动态的调用任意对象的方法
 * 4、动态的访问或设置任意对象的属性
 * ...
 * 
 * 三、动态的调用任意对象的方法
 * 
 * 
 */
public class TestMethod {
	@Test
	public void test1()throws Exception{
		//(1)获取Class对象
		Class clazz = Class.forName("com.atguigu.bean.Employee");
		
		//(2)创建Employee对象
		Object emp = clazz.newInstance();
		
		//(3)获取某个方法对象
		//例如：public void setName(String name)
		//为什么获取某个方法要通过：（1）方法名（2）方法的形参类型列表，因为方法可能重载
		Method setName = clazz.getMethod("setName", String.class);
		
		//(4)调用setName方法设置name属性的值
//		原来：emp.setName("张三");
		Object invoke = setName.invoke(emp, "张三");//invoke调用
		System.out.println(emp);
		System.out.println("setName的返回值：" + invoke);
		
		//获取getName方法对象
		Method getName = clazz.getMethod("getName");
		//调用getName获取name属性值
		Object value = getName.invoke(emp);
		System.out.println(value);
	}
}
