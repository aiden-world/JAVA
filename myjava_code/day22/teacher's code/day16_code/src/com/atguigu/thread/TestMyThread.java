package com.atguigu.thread;

/*
 * 一、如何创建main线程以外的线程
 * 1、方式：
 * （1）继承java.lang.Thread类
 * （2）实现java.lang.Runnable接口
 * 
 * 2、继承Thread类的方式
 * 步骤：
 * （1）编写线程类，继承Thread类
 * （2）重写它的public void run()，在run()中编写这个线程需要完成的任务代码
 * （3）创建线程对象
 * （4）启动线程：通过start()方法启动
 * 特别说明：run()不是程序员手动调用，如果程序员手动调用就变成普通方法了，就不是多线程
 * 
 * 3、实现java.lang.Runnable接口
 * 步骤：
 * （1）编写线程类，实现Runnable接口
 * （2）重写它的public void run()，在run()中编写这个线程需要完成的任务代码
 * （3）创建线程对象
 * （4）启动线程：通过start()方法启动
 */
public class TestMyThread {
	public static void main(String[] args) {
		/*MyThread my = new MyThread();
		my.run();*/
		
		MyThread my = new MyThread();
		my.start();
		
		//先启动另一个线程，然后main再做它的事情，会出现另一个线程与main线程同时运行的效果
/*		for (int i = 1; i <=100; i+=2) {
			System.out.println("main = " + i);
		}*/
		
		MyRunnable mr = new MyRunnable();
//		mr.start();//错误，因为它没有start方法
//		借助Thread的对象帮我们启动线程
		
		Thread t = new Thread(mr);//让t对象帮mr对象启动一下线程，管理一下它的状态等
		t.start();
	}
}
class MyThread extends Thread{
	@Override
	public void run(){
		for (int i = 2; i <=100; i+=2) {
			System.out.println(i);
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=100; i+=2) {
			System.out.println("runnable = " + i);
		}
	}
	
}