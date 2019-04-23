package com.atguigu.homework;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

/*
 * 递归：自己调用自己
 */
public class FileUtils{
	@Test
	public void test1(){
		File file = new File("D:/成绩与作业");
		ArrayList<String> all = listAllSubOfDir(file);
		for (String string : all) {
			System.out.println(string);
			
			
		}
	}
	
	//形参：要列出哪个目录的下一级
	//这个dir有可能是目录，也有可能是文件
	public ArrayList<String> listAllSubOfDir(File dir){
		
		ArrayList<String> list = new ArrayList<String>();
		if(dir.isFile()){//如果是文件，直接添加当前的文件到集合中
			list.add(dir.getPath());
		}else if(dir.isDirectory()){
			File[] listFiles = dir.listFiles();//如果是目录，列出dir的下一级，这是它的直接下一级
			//考虑到它的下一级sub还可能有下一级
			for (File sub : listFiles) {
				//所以对sub要重新列出它的下一级
				ArrayList<String> subsOfSub = listAllSubOfDir(sub);//这里用到递归
				list.addAll(subsOfSub);
			}
		}
		
		return list;
	}
	
	@Test
	public void test2(){
		File file = new File("D:/尚硅谷_1205班_柴林燕_MySQL_JDBC");
		long size = calDirLength(file);
		System.out.println("总大小：" + size);
	}
	
	public long calDirLength(File dir){
		if(dir.isFile()){//如果是文件，直接返回文件的长度
			return dir.length();
		}else if(dir.isDirectory()){//如果是目录，把dir的所有下一级的大小累加起来
			//(1)列出dir的下一级，这是它的直接下一级
			File[] listFiles = dir.listFiles();
			
			//(2)累加dir的每一个下一级的大小
			long sum = 0;
			for (File sub : listFiles) {
//				sum += sub的大小;
				//问题在于sub可能是文件，也可能是目录，那么它的大小用calDirLength(sub)来算
				sum += calDirLength(sub);
			}
			return sum;
		}
		return 0;
	}
	
	@Test
	public void test3(){
		File file = new File("D:/成绩与作业 - 副本");
		deleteDir(file);
	}
	
	public void deleteDir(File dir){
/*		if(dir.isFile()){//如果是文件，直接删除
			dir.delete();
		}else if(dir.isDirectory()){
			//先删除它的下一级--》使得当前dir为空目录
			//然后删除自己
			dir.delete();
		}*/
		
		if(dir.isDirectory()){
			//如果是文件夹，先删除它的下一级
			//(1)先列出它的下一级
			File[] listFiles = dir.listFiles();
			//(2)删除它的每一个下一级sub
			for (File sub : listFiles) {
				//调用deleteDir(sub)删除sub，因为这个方法既可以删除文件，可以可以删除空目录，也可以删除非空目录
				deleteDir(sub);
			}
		}
		
		dir.delete();
	}
}
