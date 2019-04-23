package com.atguigu.exception;

/*
 * 一、try...catch
 * 1、语法格式
 * 
 * try{
 * 	  可能发生异常的代码
 * }catch(异常类型1    异常名){
 * 	 捕获到异常类型1的异常对象后，对它处理的代码块1
 * }catch(异常类型2    异常名){
 * 	 捕获到异常类型2的异常对象后，对它处理的代码块1
 * }
 * ....
 * 
 * 说明：如果多个catch的类型没有包含（父类包含子类）关系，顺序可以随意，如果有包含关系，子类在上，父类在下。
 * 
 * 2、运行机制
 * （1）如果try{}中的代码发生异常了，在try中会抛出一个异常对象，然后Java的异常处理机制会根据这个异常的对象，自动匹配catch，
 * 从上到下，看哪个catch()中的类型可以匹配，就进入这个catch(){}中处理该异常。
 * （2）如果try{}中的代码没有异常，那么程序正常运行，不会进入任何一个catch
 * （3）如果try{}中有异常，但是所有的catch都没有“抓”，那么程序会结束当前方法，把异常抛给上级，直到main，再抛就挂了
 * 
 * 提示：可以用如下的方式将字符串的数字转为int值
 * 	  Integer.parseInt(字符串的变量)
 * 
 * 
 * 3、打印异常信息的方式：
 * （1）System.out.println("...");打印正常的提示信息
 * （2）System.err.println("xxx");  用红色打印错误信息
 * （3）标准的异常打印方式
 *   异常对象.printStackTrace()：打印异常对象堆栈跟踪信息
 * （4）打印异常的描述信息
 *   System.out.println(e.getMessage());
 */
public class TestTryCatch {
	public static void main(String[] args) {
		//从命令行输入两个整数，求两个整数的商
		//args[0] <-- 9
		//args[1] <-- 3
		
		try {
			int num1 = Integer.parseInt(args[0]);//把字符串转成int
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
		}catch(ArithmeticException e){//当第二个整数输入0时
			System.err.println("第二个整数是除数，除数不能为0");
			System.err.println(e.getMessage());
		}catch(NumberFormatException e) {//当命令行输入的是非数字，例如：张三  李四
			System.err.println("请输入整数");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){//当命令行参数输入的整数少于2个
			System.err.println("请输入两个整数");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("第" + i + "次打印：柴老师真漂亮");
		}
	}
}
