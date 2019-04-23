package com.atguigu.io;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * 用字节流读取一个纯文本的文件
 * 
 * File系列的IO流：
	 * FileReader
	 * FileWriter
	 * FileInputStream
	 * FileOutputStream
 * 
 */
public class TestFileInputStream {
	@Test
	public void test2() throws IOException{
		//用字节流读取一个纯文本的文件
		//(1)选IO
		FileInputStream fis = new FileInputStream("1.txt");
		
		//(2)读取
		//①创建字节数组
		byte[] data = new byte[10];
		int len = fis.read(data);
		System.out.println("本次读取的字节数：" + len);
		//没有读全就开始new  String就有问题
		System.out.println("本次读取的数据：" + new String(data,0,len));
		
		//会出问题的是一边读，一个newString
		//如果读取整个文件，一起处理，就不会有问题了。
		
		//(3)关闭
		fis.close();
	}
	
	@Test
	public void test1() throws IOException{
		//用字节流读取一个纯文本的文件
		//(1)选IO
		FileInputStream fis = new FileInputStream("1.txt");
		
		//(2)读取
		int data = fis.read();
		System.out.println(data);
		
		//(3)关闭
		fis.close();
	}
}
