package com.atguigu.thread.safe2;

/*
 * 1、为什么有线程安全问题？或如何判断我的代码是否有线程安全问题？
 * （1）是否有多个线程
 * （2）是否有共享数据
 * （3）是否有多条语句操作共享数据了
 * 
 * 2、如何解决？
 * 同步代码块或同步方法
 * 
 * 3、同步代码块
 * synchronized(锁对象){
 * 	需要加锁的代码
 * }
 * 
 * 锁对象是否合适：（1）是否是对象（2）是否多个线程共用同一个锁对象
 * 锁的范围是否合适：一次任务
 * 
 * 4、同步方法
 * 语法：
 * 【修饰符】 synchronized 返回值类型  方法名(【形参列表】){}
 * synchronized 【修饰符】  返回值类型  方法名(【形参列表】){}
 * 
 * 同步方法的锁对象：
 * （1）静态方法：当前类的Class对象
 * （2）非静态方法：this对象
 */
public class TestWindow {
	public static void main(String[] args) {
		Window w = new Window();

		Thread t1 = new Thread(w, "窗口一");
		t1.start();

		Thread t2 = new Thread(w, "窗口二");
		t2.start();

		Thread t3 = new Thread(w, "窗口三");
		t3.start();
	}
}

/*class Window implements Runnable {
	private int total = 10;

	@Override
	public void run() {
		while(true){
			synchronized (this) {
				if(total>0){
					System.out.println(Thread.currentThread().getName() + "卖了一张票");
					total--;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "剩余票数：" + total+"张");
				}else{
					break;
				}
			}
		}
	}
}*/

class Window implements Runnable {
	private int total = 10;

	@Override
	public void run() {
		while(total>0){
			saleOneTicket();
		}
		System.out.println("卖完了");
	}
	
	//同步方法的锁对象：静态是当前类的Class对象，非静态方法是this
	public synchronized void saleOneTicket(){
		if(total>0){
			System.out.println(Thread.currentThread().getName() + "卖了一张票");
			total--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "剩余票数：" + total+"张");
		}
	}
}