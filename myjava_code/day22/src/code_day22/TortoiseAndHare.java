package code_day22;

public class TortoiseAndHare {
	public static void main(String[] args) {
		long torTime1 = 0;
		long hareTime2 = 0;
		
		Runnable tor1 = new Tortoise();
		Runnable Hare1 = new Hare();
		
		Thread g1  = new Thread(tor1);
		Thread g2  = new Thread(Hare1);
		long time1 = System.currentTimeMillis();
 		g1.start();
		g2.start();
//		int i1=0,i2=0;
//		boolean flag = true;
//		while(flag) {
//		if(!g1.isAlive()) {
//		long time2 = System.currentTimeMillis();
//		 torTime1 = time2 - time1;
//		 System.out.println("比赛结束,兔子赢了");
//		 System.out.println("兔子用时"+hareTime2);
//		break;
//		}
//		if(!g2.isAlive()) {
//			long time2 = System.currentTimeMillis();
//			 hareTime2 = time2 - time1;
//			System.out.println("比赛结束,乌龟赢了");
//			System.out.println("乌龟用时"+torTime1);
//			break;
//			}
//		if(!g1.isAlive()||!g2.isAlive()) 
//			flag = false;
//		}
//		System.out.println("乌龟用时"+torTime1);
//		System.out.println("兔子用时"+hareTime2);

		
	}
}


class Tortoise implements Runnable{
	final int  V1 = 10 ;
	int t1 = 0;
	int length = 0;
	public void run() {
		for (; length <=30 ; ) {
			t1++;
			length+=V1;
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("兔子跑了十米,一共跑了"+length+"米");
			if(length >=30) { System.out.println("兔子跑完30米花费时间"+t1);break;}
			try {
				Thread.sleep(10000);
				System.out.println("兔子休息了十秒");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t1+=10;
		}
	}
}

class Hare implements Runnable{
	public void run() {
		final int  V2 = 1 ;
		int t2 = 0;
		int length =0;
		for (; length <=30 ; ) {
			t2++;
			length+=V2;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("乌龟跑了一米,一共跑了"+length+"米");
			if(length >=30) {System.out.println("乌龟跑完30米花费时间"+t2);break; }
			if(length %10==0&&length>=10) {
			try {
				Thread.sleep(1000);
				System.out.println("乌龟休息了一秒");	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t2+=1;
			}
		}
	}
}