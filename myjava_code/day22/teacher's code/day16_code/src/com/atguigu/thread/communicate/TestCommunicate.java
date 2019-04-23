package com.atguigu.thread.communicate;
/*
 * 线程通信问题：
 *   生产者与消费者问题：
 *   	当一个或一些线程负责“生产”数据，另一个或一些线程负责“消耗、消费”数据，这样的情况，就称为生产者与消费者问题。
 *      生产者与消费者要使用同一个“数据缓冲区”，并且这个数据缓冲区有“固定大小”，当数据缓冲区“空”的时候，消费者线程
 *      应该停下来，当生产者线程生产了数据之后，通知/唤醒消费者线程；当数据缓冲区“满”的时候，生产者线程应该停下来，
 *      当消费者线程消耗了数据之后，通知/唤醒生产者线程继续生产。
 *      
 *   问题：（1）   同一个“数据缓冲区”-->线程安全问题
 *   	   （2）多个线程协作/通信，需要用到wait(),notify()/notifyAll()
 * 
 * 例子：
 * 	 厨师（生产者）和服务员（消费者），之间一个工作台（数据缓冲区），当厨师做完菜，放到台上，服务员可以从台上取走给客户。
 * 
 * 1、wait()和notify()方法由谁来调用？
 *   你的锁对象
 *   
 *   如果你用了非锁对象调用wait和notify，那么会报java.lang.IllegalMonitorStateException
 *   
 * 2、  wait()和notify()方法在哪里声明的呢？
 * java.lang.Object
 * 
 * 因为它必须有锁对象调用，而锁对象的类型是任意的引用数据类型。
 * 
 * 
 */
public class TestCommunicate {
	public static void main(String[] args) {
		Workbench w = new Workbench();//工作台
		
		Cook cook = new Cook(w);
		Waiter waiter = new Waiter(w);
		
		cook.start();
		waiter.start();
	}
}
class Workbench{
	private static final int MAX_VALUE = 10;//最多能放10盘菜
	private int num ;//台上菜的数量
	
	//由厨师调用
	//锁对象：this，因为非静态同步方法的锁对象一定是this
	public synchronized void put() {
		if(num >= MAX_VALUE){//工作台满的时候，厨师线程停下来等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num++;
		System.out.println("厨师做了一份菜，现在工作台上有：" + num);
		//通知服务员线程，可以取菜了
		this.notify();
	}
	
	//由服务员调用
	public synchronized void take(){
		if(num <= 0){//当工作台空的时候，服务员线程停下来
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num--;
		System.out.println("服务员取走了一份菜，现在工作台上有：" + num);
		//通知厨师可以继续做菜了
		this.notify();
	}
}

class Cook extends Thread{
	private Workbench work;
	
	public Cook(Workbench work) {
		super();
		this.work = work;
	}

	public void run(){
		while(true){
			work.put();
		}
	}
}
class Waiter extends Thread{
	private Workbench work;
	
	public Waiter(Workbench work) {
		super();
		this.work = work;
	}

	public void run(){
		while(true){
			work.take();
		}
	}
}