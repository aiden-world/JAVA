package com.atguigu.reflect.field;

import java.lang.reflect.Field;

import org.junit.Test;

/*
 * 反射的使用：在运行期间
 * 1、动态的获取某个类型的详细信息
 * 2、动态的创建任意类型的对象
 * 3、动态的调用任意对象的方法
 * 4、动态的访问或设置任意对象的属性
 * ...
 * 
 * 四、动态的访问或设置任意对象的属性
 * 
 */
public class TestGetSetField {
	@Test
	public void test1() throws Exception{
		//(1)获取Class
		Class clazz = Class.forName("com.atguigu.bean.Employee");
		//(2)创建员工对象
		Object emp = clazz.newInstance();
		System.out.println(emp);
		
		//(3)获取该对象的某个属性
		//这个属性的名称，可以通过配置文件等方式获取
		//JDBC时编写通用的查询对象的方法，属性名称可以通过SQL语句的查询结果获取
		//有了属性名称，就可以通过Class的对象，得到Field属性对象
		//假设我这里知道Employee类中有一个属性salary
		Field fieldSalary = clazz.getDeclaredField("salary");
		System.out.println(fieldSalary);
		
		//(4)因为salary属性是私有的，直接操作会有问题，无法访问
		//我们可以设置fieldSalary它允许被访问
		fieldSalary.setAccessible(true);//Access访问，Accessible可访问吗？
		
		//(5)设置员工对象emp的salary属性的值
//		emp.setSalary(2000);//现在不能这么做，因为emp编译阶段是Object类型
		
		//设置哪个属性的值：设置fieldSalary属性的值
		//fieldSalary属性设置值
		fieldSalary.set(emp, 2000);
		
		System.out.println(emp);
		
		//(6)获取员工对象emp的salary属性的值
//		double salary = emp.getSalary();
		Object salary = fieldSalary.get(emp);
		System.out.println(salary);
	}
}
