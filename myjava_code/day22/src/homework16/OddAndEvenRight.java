package homework16;

public class OddAndEvenRight {
	public static void main(String[] args) throws InterruptedException {
		Print p = new Print();
//		Runnable o1 = new Odd();
//		Runnable e1 = new Even();
		
		Runnable o1 = new Odd(p);
     	Runnable e1 = new Even(p);
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(e1);
		
		t2.start();
		t1.start();
//		Thread.sleep(5000);
//		t1.stop();
//		t2.stop();
//		System.out.println("避免死循环");
	}

}


class Odd implements Runnable{
	Print p1 ;
	public void run() {
		p1.PrintOdd();
	}
	Odd(Print p){p1 = p;}
}

class Even implements Runnable{
	Print p2;
	public  void run() {
		p2.PrintEven();
	}
	Even(Print p){p2 = p;}
}

class Print{
	static boolean flag = true;
	
	public  synchronized void PrintEven()  {
		int e = 0,i=1 ;
		for (; e <=100; ) {
//			while(flag) {
//			flag = !flag;
//			e+=2;i++;
			if(!flag)
				try {
					this.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			flag=!flag;
			//System.out.println("打印100以内第"+i+"个偶数为 "+e+"  奇"+!flag+"  偶"+flag);
			System.out.println("打印100以内第"+i+"个偶数为 "+e);
			e+=2;i++;
			this.notify();
		}
		
	}
	public  synchronized void PrintOdd()  {
		int o = 1,i=1 ;
		for (; o <=100; ) {
//			while(!flag) {
//			flag = !flag;
//			o+=2;i++;
			if(flag)
				try {
					this.wait();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			flag=!flag;
			//System.out.println("打印100以内第"+i+"个奇数为 "+o+"  奇"+!flag+"  偶"+flag);
			System.out.println("打印100以内第"+i+"个奇数为 "+o);
			o+=2;i++;
			this.notify();
		}		
	}
	
}

