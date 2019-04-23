package com.atguigu.review;

/*
 * 一、java.io.File
 * 文件和目录路径名的抽象描述。即这个File的对象既可以表示文件，也可以表示文件夹（目录）。
 * 
 * 1、获取文件和目录的属性信息的方法
 * （1）获取文件或目录的名称：getName()
 * （2）获取文件或目录的指定路径：getPath()
 * （3）获取文件或目录的绝对路径：getAbsolutePath()
 * （4）获取文件或目录的规范路径：getCanonicalPath()
 * （5）获取文件的大小：length()
 * 			这里无法直接获取目录的大小
 * （6）获取文件或目录的最后修改时间：lastModified()  返回毫秒值
 * （7）获取文件或目录的父目录：getParent()
 * 					   getParentFile()
 * （8）判断
 * 	是否存在：exists()
 *  是否是文件：isFile()
 *  是否是目录：isDirectory()
 *  ...
 *  
 * 2、操作文件
 * （1）创建文件：createNewFile()
 * （2）删除文件：delete()
 * （3）重命名：renameTo(File dest)
 * 
 * 3、操作目录
 * 	（1）创建目录：mkdir()  或  mkdirs()
 * 	（2）删除目录：delete()  只能删空目录
 *  （3） 重命名：renameTo(File dest)
 *  （4）获取它的下一级
 *  		String[] list();
 *  		File[] listFiles();
 *  		File[] listFiles(FileFilter f)
 * 
 */
public class TestFile {

}
