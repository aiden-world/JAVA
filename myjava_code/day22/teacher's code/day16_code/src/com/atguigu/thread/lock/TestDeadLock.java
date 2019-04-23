package com.atguigu.thread.lock;
/*
 * 死锁（了解）：
 * 	当两个线程互相持有对方想要的锁不放手
 */
public class TestDeadLock {
	public static void main(String[] args) {
		Object girl = new Object();
		Object money = new Object();
		
		Boy boy = new Boy(girl,money);
		Bang bang = new Bang(girl,money);
		
		boy.start();
		bang.start();
	}
}
//男友
class Boy extends Thread{
	private Object girl;
	private Object money;
	
	public Boy(Object girl, Object money) {
		super();
		this.girl = girl;
		this.money = money;
	}

	public void run(){
		synchronized (money) {
			System.out.println("你放了我女朋友，我给你500万");
			synchronized (girl) {
				System.out.println("给对方500万");
			}
		}
	}
}
//绑匪
class Bang extends Thread{
	private Object girl;
	private Object money;
	
	public Bang(Object girl, Object money) {
		super();
		this.girl = girl;
		this.money = money;
	}

	public void run(){
		synchronized (girl) {
			System.out.println("你给我500万，我放人");
			synchronized (money) {
				System.out.println("放人");
			}
		}
	}
}