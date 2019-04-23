package com.atguigu.thread;

/*
 * java.lang.Thread类：
 * 1、构造器
 * Thread()
 * Thread(Runnable target)
 * Thread(String name)
 * Thread(Runnable target, String name)
 * 
 * 2、方法
 * 必用的方法：run(),start() 
 * 其他的方法：
 * （1）getName()
 * （2）线程的优先级：[1,10]
 * ①get/setPriority()
 * 
 * MAX_PRIORITY：10
 * MIN_PRIORITY：1
 * NORM_PRIORITY：5
 * 
 * 谁启动的线程，默认和谁的优先级保持一致。
 * 优先级高的线程，被CPU调度的概率会增加。
 * 
 * ②boolean isAlive()：判断某个线程是否还活着
 * ③static Thread currentThread() ：获取当前正在运行的线程
 * ④join()加塞
 * ⑤static void sleep(xx)：线程休眠，让当前线程休眠xx毫秒
 * ⑥static void yield() ：暂停当前线程，让出本次CPU的资源，加入下一次的抢夺
 */
public class TestThreadMethod {
	public static void main(String[] args) {
	/*	PrintNumber p1 = new PrintNumber();
		p1.start();
		
		PrintNumber p2 = new PrintNumber("线程2");
		p2.start();*/
		
/*		PrintNumber p1 = new PrintNumber();
		System.out.println("线程的优先级：" + p1.getPriority());
		
		//获取当前正在执行的主线程对象
		System.out.println(Thread.currentThread().getName());*/
		
		PrintNumber p1 = new PrintNumber();
		p1.start();
		
/*		try {
			p1.join();//这句代码表示的是main线程被p1加塞了，main剩下的代码要等待p1执行完才有机会
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		for (int i = 10; i <=20 ; i++) {
			System.out.println("main=" + i);
		}
	}
}
class PrintNumber extends Thread{
	
	public PrintNumber() {
		super();
	}

	public PrintNumber(String name) {
		super(name);
	}

	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + ":" + i);
		/*	try {
				Thread.sleep(1000);//1000毫秒=1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			Thread.yield();
		}
	}
}

class PrintRunnble implements Runnable{
	public void run(){
//		System.out.println(this.getName());
		System.out.println(Thread.currentThread().getName());
	}
}