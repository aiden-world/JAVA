package com.atguigu.reflect.info;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Properties;

import org.junit.Test;

/*
 * 反射的使用：在运行期间
 * 1、动态的获取某个类型的详细信息
 * 2、动态的创建任意类型的对象
 * 3、动态的调用任意对象的方法
 * 4、动态的访问或设置任意对象的属性
 * ...
 * 
 * 一、动态的获取某个类型的详细信息
 * 	约定：类型的全名称，src/classname.properties
 * 
 * 需求：编写代码获取classname.properties文件中配置的类的详细信息
 * 
 * 
 * 回忆：
 * 	类的定义：一类具有相同特性的事物的抽象描述
 * 
 * 例如：所有的包有相同点，可以抽象为Package类型
 *    所有的构造器有相同点，可以抽象为Constructor类型
 *    所有的方法有相同点，可以抽象为Method类型
 *    所有的属性有相同点，可以抽象为Field类型
 *    所有的类型有相同点，可以抽象为Class类型
 *    所有的修饰符有相同点，可以抽象为Modifier类型
 *    。。。
 *    
 *    java.lang.reflect反射包
 * 
 */
public class TestClassInfo {
	@Test
	public void test1()throws Exception{
		//(1)获取类型名
		//①创建Properties
		Properties pro = new Properties();
		//②用类加载器加载src/classname.properties
		InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("classname.properties");
		//③用Properties的load方法加载信息
		pro.load(in);
		//④获取类名
		String value = pro.getProperty("name");
		
		System.out.println(value);
		
		//(2)获取这个类型的Class对象，如果内存中没有它，系统类加载器会尝试去加载这个类
		//四种方式：（1）类型名.class（2）对象.getClass()（3）Class.forName("类型名")（4）类加载器对象.loadClass("类型名")
		Class<?> clazz = Class.forName(value);
		System.out.println(clazz);//如果运行期间，这个类型还不存在，会报ClassNotFoundException
	
		//(3)获取这个类型的详细信息
		String name = clazz.getName();
		System.out.println("类型名：" + name);
		
		Package pk = clazz.getPackage();
		System.out.println("包名：" + pk.getName());
		
		int mod = clazz.getModifiers();
		System.out.println(mod);
		System.out.println("修饰符：" + Modifier.toString(mod));
		
		Class<?> superclass = clazz.getSuperclass();
		System.out.println("直接父类名：" + superclass.getName());
		
		Class<?>[] interfaces = clazz.getInterfaces();
		System.out.println("接口们：");
		for (Class<?> inter : interfaces) {
			System.out.println(inter.getName());
		}
		
		Field[] fields = clazz.getDeclaredFields();
		System.out.println("属性们：");
		for (Field field : fields) {
			System.out.println(field);
		}
		
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		System.out.println("构造器们：");
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println("方法们：");
		for (Method method : methods) {
			System.out.println(method);
		}
	}
	
	@Test
	public void test2(){
		System.out.println(0x10);
	}
	
}
