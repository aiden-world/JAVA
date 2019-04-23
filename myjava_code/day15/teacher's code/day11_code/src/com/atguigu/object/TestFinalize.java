package com.atguigu.object;

/*
 * Object的方法：
 * （5）protected void finalize() （了解）
 * 当该类的对象被“GC”垃圾回收器回收的前一刻，JVM帮我们调用的方法，通常用于释放资源等。
 * 特点：
 * ①不是程序员调用，是JVM调用的
 * ②每一个对象的该方法只有一次机会被调用
 * 	  就算你在finalize()方法中使得当前对象“复活”了，那么下次当前对象变成垃圾被回收时，就不再调用finalize了。
 * ③只有被回收时调用-->留临终遗言
 * 
 * 对象的死亡？没有任何有效的引用指向它
 * 
 * 
 * 面试题：finalize和final、finally的区别？
 * 
 * GC：
 * 
 */
public class TestFinalize {
	//下面的代码不用会写，看现象就可以
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			MyClass my = new MyClass();//每循环一次，上一次的对象就称为垃圾了
		}
		
		System.gc();//通知垃圾回收器，尽快过来回收垃圾
		
		//写一句代码，让程序不要那么快的结束，为了看GC工作
		Thread.sleep(2000);
	}
}
class MyClass{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("我轻轻的走了，不带走一片云彩...");
	}
	
}
