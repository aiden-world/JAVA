package com.atguigu.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/*
 * 按行读取
 * 
 * 按行读取一定是纯文本文件
 *
 * （一）选IO流
 * 1、读取
 * 2、操作纯文本文件
 * 3、读文件
 * 
 * FileReader
 * 
 * 4、按行读取
 * 说明除了读文件，还有增加其他的功能，“按行读取”
 * 
 * 因为FileReader中无法做到按行处理
 * 所以我要选择其他的IO流来辅助我，这里选择BufferedReader或Scanner
 * 
 * （二）读取
 * read系列
 * 
 * BufferedReader增加了一个方法：String readLine()
 * 
 * （三）关闭
 */
public class TestReadLine {
	@Test
	public void test2() throws IOException{
		//比喻穿衣服
		FileReader fr = new FileReader("1.txt");//(1)先穿的内衣
		BufferedReader br = new BufferedReader(fr);//给fr增加其他的功能//(2)后穿的外套    ，外套包裹内衣
		
		while(true){
			String line = br.readLine();
			if(line == null){//到达流末尾
				break;
			}
			System.out.println(line);
		}
		
		//脱衣服
		br.close();//(1)先脱外套
		fr.close();//(2)后脱里面的衣服
	}
	
	@Test
	public void test1() throws IOException{
		FileReader fr = new FileReader("1.txt");
		BufferedReader br = new BufferedReader(fr);//给fr增加其他的功能
		
		String line = br.readLine();
		System.out.println(line);
		
		br.close();
		fr.close();
	}
}
