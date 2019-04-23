package code_day22;


public class OddAndEvenWrong {
	public static void main(String[] args) {
		Print p = new Print();
//		Runnable o1 = new Odd();
//		Runnable e1 = new Even();
		
		Runnable o1 = new Odd(p);
     	Runnable e1 = new Even(p);
		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(e1);
		
		t2.start();
		t1.start();
		Thread.sleep(10000);
		t1.stop();
		t2.stop();
		System.out.println("避免死循环");
	}

}


class Odd implements Runnable{
	Print p1 ;
	//static boolean flag1 = true;
	public void run() {
		p1.PrintOdd();
	}
	Odd(Print p){p1 = p;}
}

class Even implements Runnable{
	Print p2;
	//static boolean flag2 = true;
	public  void run() {
		p2.PrintEven();
	}
	Even(Print p){p2 = p;}
}

class Print{
	static boolean flag1 = true;
	static boolean flag2 = true;
	
	public  synchronized void PrintEven() {
		int e = 0,i=0 ;
		for (; e <=1000; ) {
			while(flag2) {
			flag1 =true;
			flag2=!flag2;
			e+=2;i++;
			System.out.println("打印1000以内第"+i+"个偶数为 "+e+"  奇"+flag1+"  偶"+flag2);
		}
		}
	}
	public  synchronized void PrintOdd() {
		int o = 1,i=0 ;
		for (; o <=1000; ) {
			while(flag1) {
			flag2 =true;
			flag1=!flag1;
			o+=2;i++;
			System.out.println("打印1000以内第"+i+"个奇数为 "+o+"  奇"+flag1+"  偶"+flag2);
		}		
	}
	}
}

