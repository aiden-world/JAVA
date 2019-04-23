package com.atguigu.io;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 * 示例一：输出纯文本数据到文件中
 * （一）确定new哪些IO流的对象
 * 1、因为是输出，所以选择输出流
 * 2、因为是处理纯文本数据，选择字符流
 * 字符输出流，Writer系列
 * 又因为是输出到文件中，所以我选择FileWriter
 * 3、暂时不需要增加其他功能
 * （二）进行写
 * write()
 * （三）关闭
 * close()
 */
public class TestFileWriter {
	@Test
	public void test1() throws IOException{
		//（一）确定new哪些IO流的对象
//		FileWriter fw = new FileWriter("1.txt");//如果文件不存在，会自动创建，如果存在会覆盖内容
		FileWriter fw = new FileWriter("IO/2.txt");//如果文件夹不存在，会抛异常FileNotFoundException
//		FileWriter fw = new FileWriter("1.txt",true);
		
		//（二）进行写
		String str = "明天就降温了";
		fw.write(str);
		
//		（三）关闭
		fw.close();
	}
}
