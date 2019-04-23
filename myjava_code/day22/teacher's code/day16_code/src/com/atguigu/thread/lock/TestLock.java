package com.atguigu.thread.lock;

/*
 * 哪些操作会释放锁？哪些操作不会释放锁？
 * wait()会释放锁，sleep()不会释放锁
 * 
 * wait()和sleep()都会使得当前线程进入阻塞状态。让别人去抢CPU。
 * wait()是释放了锁，别的线程抢到CPU，也可以抢到锁，就可以执行那个代码。
 * sleep()是不释放锁，别的线程就算抢到CPU，也没有锁，也没有机会执行那个代码。
 * 
 * 
 * 当当前线程同步块或同步方法执行完或发生异常结束，也会自动释放锁。
 * 除了sleep()方法以外，yield()也不会释放锁。
 * 
 * 面试题:wait()和sleep()的区别？
 * （1）wait()会释放锁，sleep()不会释放锁
 * （2）wait()是Object类中，sleep()是Thread类
 * （3）wait()必须有锁对象调用，sleep()是Thread的静态方法
 * （4）wait()由notify()唤醒，sleep()时间到或被interrupt()
 * 
 * 
 */
public class TestLock {

}
