package code_day22;

public class TestThread {
	public static void main(String[] args) {
		myThread my = new myThread();
		my.start();
		
		Runnable myr = new myThread2();	
		Thread my2 = new Thread(myr);
		my2.start();
	}
}


class myThread extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("myThread 1  "+i);
		}
	}
}


class myThread2 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("myThread 2 "+i);
		}
	}
}