package com.atguigu.reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

/*
 *	补充：类加载器的首要任务是加载类，但是也可以用它来加载“类路径下”的其他资源文件。 
 *
 *	类路径下：
 *		JavaSE：
 *		从程序员的角度：src下
 *		从运行的角度：bin下
 *		Web:
 *			WEB-INF\classes
 *     
 *     	或classpath下指定
 *     
 * 结论：src下用类加载器，src外用FileInputStream
 *     
 */
public class TestClassLoder2 {
	@Test
	public void test4() throws IOException{
//		示例一：在src外面  outSrc.properties 
		Properties pro = new Properties();
		InputStream stream = new FileInputStream("bin/srcPath.properties");
		pro.load(stream);
		String value = pro.getProperty("user");
		System.out.println(value);
	}
	
	@Test
	public void test3() throws IOException{
//		示例一：在src外面  outSrc.properties 
		Properties pro = new Properties();
		InputStream stream = new FileInputStream("outSrc.properties");
		pro.load(stream);
		String value = pro.getProperty("out");
		System.out.println(value);
	}
	
	@Test
	public void test2() throws IOException{
//		示例一：在src根目录下  com.atguigu.file.pkgPath.properties  
		Properties pro = new Properties();
		InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("com/atguigu/file/pkgPath.properties");
		pro.load(stream);
		String value = pro.getProperty("pwd");
		System.out.println(value);
	}
	
	@Test
	public void test1() throws IOException{
//		示例一：在src根目录下   srcPath.properties    
		//(1)先创建一个java.util.Properties的map对象，用来装加载后的内容
		//Properties它的key和value都是String
		Properties pro = new Properties();
		
		//(2)用类加载器对象去加载srcPath.properties，得到一个字节输入流
		InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("srcPath.properties");
	
		//(3)用Properties的对象的load方法从字节输入流中把数据读取map中，并且存储为(key,value)
		pro.load(stream);
		
		//(4)取数据
	/*	Set<Entry<Object, Object>> entrySet = pro.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
		}*/
		
		//根据key获取value
		String value = pro.getProperty("user");
		System.out.println(value);
	}
}
