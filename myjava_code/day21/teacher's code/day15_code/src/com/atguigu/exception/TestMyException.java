package com.atguigu.exception;

import java.util.Scanner;

/*
 * 目前见过的异常类型：
 * 		RuntimeException
 * 		NullPointerException
 * 		ArrayIndexOutOfBoundsException
 * 		ArithmeticException
 * 		NumberFormatException
 * 		ClassCastException
 * 		InputMisMatchException
 * 		...
 * 		都是JRE核心类库中声明好的异常类型。
 * 
 * 我们也可以自定义一下异常，来辅助程序提供更多的错误/异常信息。
 * 一般一个异常对象是通过两个方面来说明它的异常信息：
 * （1）异常的类型
 * （2）异常的message属性值
 * 
 * 自定义异常也要从这两个方面来表示：
 * （1）要取一个见名知意的异常类型名
 * （2）提供一个构造器，可以为message进行赋值
 * 
 * 自定义的语法要求：
 * （1）自定义异常必须继承Throwable或它的子类。
 * （2）尽量保留两个构造器，一个无参，一个(String message)
 * （3）必须用throw抛出	
 */
public class TestMyException {
	public static void main(String[] args) {
	/*	try {
			login();
			System.out.println("登录成功");
		} catch (UsernameAndPasswordWrongException e) {
			e.printStackTrace();
		}*/
		
		try {
			regist();
			System.out.println("注册成功");
		} catch (UsernameExistException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	public static void login() throws UsernameAndPasswordWrongException{
		Scanner input = new Scanner(System.in);
		System.out.print("用户名：");
		String user = input.next();
		
		System.out.print("密码：");
		String pwd = input.next();
		
		//做个假登录：假设库中的用户名：admin，密码是：123
		if(!("admin".equals(user) && "123".equals(pwd))){
			throw new UsernameAndPasswordWrongException("用户名或密码错误");
		}
	}
	
	public static void regist()throws UsernameExistException,RuntimeException{
		Scanner input = new Scanner(System.in);
		System.out.print("用户名：");
		String user = input.next();
		
		System.out.print("密码：");
		String pwd = input.next();
		
		System.out.print("验证码(atguigu)：");
		String check = input.next();
		
		//做个假登录：假设库中的用户名：admin，密码是：123
		if("admin".equals(user)){
			throw new UsernameExistException(user + "用户名已存在");
		}else if(!"atguigu".equals(check)){
			throw new RuntimeException("验证码错误");
		}
	}
}
class UsernameAndPasswordWrongException extends Exception{

	public UsernameAndPasswordWrongException() {
		super();
	}

	public UsernameAndPasswordWrongException(String message) {
		super(message);
	}
	
}
class UsernameExistException extends Exception{

	public UsernameExistException() {
		super();
	}

	public UsernameExistException(String message) {
		super(message);
	}
	
}
