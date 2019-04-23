package com.atguigu.io;

import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * 用字节流写字符串到纯文本文件
 */
public class TestFileOutputStream {
	@Test
	public void test2() throws IOException{
		//选择IO流
		FileOutputStream fos = new FileOutputStream("1.txt");
		
		//写数据
		String str = "马上要吃饭了";
		fos.write(str.getBytes("GBK"));
		
		//关闭
		fos.close();
	}
	
	@Test
	public void test1() throws IOException{
		//选择IO流
		FileOutputStream fos = new FileOutputStream("1.txt");
		
		//写数据
		String str = "马上要吃饭了";
		fos.write(str.getBytes());//平台默认的字符编码
		
		//关闭
		fos.close();
	}
}
