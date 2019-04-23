package com.atguigu.thread.safe;

/*
 * 卖票：
 * 三个窗口同时卖票
 * 
 * 1、问题：
 * （1）总票数的共享问题
 * 这里可以选择用static来解决
 * （2）线程安全问题
 * 
 * 当多个线程多条语句使用“共享数据时”就会出现线程安全问题。
 * 
 * 2、如何解决线程安全问题？
 * 		加锁
 * 给操作共享数据的代码加锁，一个线程在操作这段加锁的代码时，其他线程等着，等我释放了锁，之后，你们谁获得锁谁做。
 * 
 * 如何加锁？
 * 前期的时候，就是用同步代码块或同步方法
 * 
 * 3、同步代码块
 *   synchronized(锁对象){
 *   	需要加锁的代码
 *   }
 *   
 * 4、如何选择锁对象
 * （1）锁对象，必须是一个对象，不能是基本数据类型的值
 * （2）必须保证这多个线程用的是同一个锁对象
 * 
 * 5、如何选择锁的代码的范围
 *   一般锁一次任务
 *   
 * 6、同步方法  
 * 语法：
 * 【修饰符】 synchronized 返回值类型  方法名(【形参列表】){}
 * synchronized 【修饰符】  返回值类型  方法名(【形参列表】){}
 * 
 * 同步方法的锁对象：
 * （1）静态方法：当前类的Class对象
 * （2）非静态方法：this对象
 */
public class TestTicket {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("窗口一");
		Ticket t2 = new Ticket("窗口二");
		Ticket t3 = new Ticket("窗口三");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
/*class Ticket extends Thread{
	private static int total = 10;//一共10张票
	private static Object lock = new Object();
	
	public Ticket(String name) {
		super(name);
	}

	public void run(){
		while(true){
			synchronized (lock) {
				if(total>0){
					System.out.println(getName() + "卖了一张票");
					total--;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "剩余票数：" + total+"张");
				}else{
					break;
				}
			}
		}
		
	}
}*/
class Ticket extends Thread{
	private static int total = 10;//一共10张票
	
	public Ticket(String name) {
		super(name);
	}

	public void run(){
		while(true){
			if(total>0){
				saleOneTicket();
			}else{
				break;
			}
		}
	}
	public static synchronized void saleOneTicket(){
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