package com.atguigu.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/*
 * 从一个纯文本文件读取数据
 * （一）确定new哪些IO流的对象
 * Reader系列，选择FileReader
 * （二）操作
 * read()
 * （三）关闭
 * close()
 * 
 * 纯文本文件：
 * 	.txt,.java,.html,.xml等
 * 
 * 不是纯文本文件：
 * 	.doc, .xls, .ppt等
 *  .avi. .mp4等
 */
public class TestFileReader {
	@Test
	public void test3() throws IOException{
		File file = new File("1.txt");
//		（一）确定new哪些IO流的对象
		FileReader fr = new FileReader(file);//如果文件不存在，直接报异常
		
//		（二）读操作
		//(1)先创建字符数组，用来装读取到的多个字符
		//思路2：程序员自己定
		char[] data = new char[10];
		
//		(2)开始读
		//如果文件比较大，一次读不完，可以循环读
/*		while(true){
			int len = fr.read(data);
			if(len == -1){
				break;
			}
			System.out.println("本次读取：" + len + "个字符");
			//String(char[] value) 
//			System.out.println("本次读取的数据：" + new String(data));
			
			//String(char[] value, int offset, int count) 
			System.out.println("本次读取的数据：" + new String(data,0,len));
			
			
		}*/
		
		int len;
		while((len = fr.read(data)) != -1){
			System.out.println("本次读取的数据：" + new String(data,0,len));
		}
		
//		 （三）关闭
		fr.close();
		
	}
	
	@Test
	public void test2() throws IOException{
		File file = new File("1.txt");
//		（一）确定new哪些IO流的对象
		FileReader fr = new FileReader(file);//如果文件不存在，直接报异常
		
//		（二）读操作
		//(1)先创建字符数组，用来装读取到的多个字符
		//这个字符数组的长度，由程序员自己确定
		//思路1：根据文件的长度来创建
//		char[] data = new char[(int)file.length()];//可能溢出
		
		//思路2：程序员自己定
		char[] data = new char[10];
		
//		(2)开始读
		int len = fr.read(data);
		System.out.println("本次读取了：" + len + "个字符");
		
//		 （三）关闭
		fr.close();
		
	}
	
	//IOException是FileNotFoundException的父类
	@Test
	public void test1() throws IOException{
//		（一）确定new哪些IO流的对象
		FileReader fr = new FileReader("1.txt");//如果文件不存在，直接报异常
		
//		（二）读操作
		int data = fr.read();
		System.out.println(data);//读取的一个字符的Unicode编码值21487
		
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		
//		 （三）关闭
		fr.close();
		
	}
}
