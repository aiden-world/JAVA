package com.atguigu.io;

import java.io.File;

public class TestNewFile {
	public static void main(String[] args) {
		File file = new File("3.txt");//不是代表在硬盘上创建一个文件叫做3.txt
		
		//表示在内存中有一个file对象，用它来表示 硬盘上有个文件3.txt，表示这个文件的信息
		
		//内存中对象  ≠  硬盘上的文件
		
		/*
		 * 如果这个文件存在，那么这个对象正好表示这个文件的信息
		 * 如果这个文件不存在，那么这个对象仅仅是一个对象而已，很多属性都是默认值
		 */
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}
}
