package com.atguigu.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 一、throws：表示某个方法可能抛出xxx异常，或者说，在这个方法中，这些异常没有处理，要调用者来进行处理
 * 1、语法格式：只在声明一个方法时用
 * 【修饰符】   返回值类型    方法名(【形参列表】)throws 异常列表{
 * 		方法体
 * }
 * 或
 * 【修饰符】   abstract  返回值类型    方法名(【形参列表】)throws 异常列表;
 * 
 * 说明：
 * （1）一般用于抛出编译时异常（当然如果你非要抛出运行时异常也是可以的），
 * 因为如果该方法中有代码抛出编译时异常，那么如果该方法中不加try...catch，会导致编译不通过，
 * 这个时候，就显式抛出，抛给调用者来处理，保证编译通过。
 * （2）throws 异常列表：表示可以抛出多种类型，多种类型的顺序无所谓，只要用,分割即可。
 * 
 * 
 * 2、重写时对throws的要求
 * 重写的要求：
 * （1）方法名：相同
 * （2）形参列表：相同
 * （3）返回值类型：
 * 	基本数据类型和void：必须相同
 *  引用数据类型：<=
 *  （4）权限修饰符：>=
 *  （5）抛出的异常类型：<=
 * （6）这些方法不能重写：private,static,final
 * 
 * 不管是重写抽象类的抽象方法，还是接口的抽象方法，默认方法，还是普通父类的方法，重写的要求都一样。
 * 只不过子类必须重写抽象类的抽象方法，和接口的抽象方法，其他的可选。
 * 
 */
public class TestThrows {

	public static void main(String[] args) {
		try {
			copyFile("d:/1.txt","d:/atguigu/1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("文件找不到");
		}
		
		try {
			method();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Fu fu = new Zi();
	
			try {
				fu.method();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static void copyFile(String src, String dest) throws FileNotFoundException{
		//不看代码的功能，只看异常的处理问题
		File srcFile = new File(src);//源文件
		File destFile = new File(dest);//目标文件
		
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
	}
	
	public static void method()throws InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int a = input.nextInt();
		
		System.out.print("请输入第二个整数：");
		int b = input.nextInt();
		
		int result = a/b;
		System.out.println("商：" + result);
	}

}

class Fu{
	public void method()throws Exception{
		
	}
}
class Zi extends Fu{
	public void method()throws RuntimeException{
		
	}
}