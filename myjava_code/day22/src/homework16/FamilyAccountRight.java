package homework16;

import java.util.Random;
//丈夫妻子存取钱次数都为100
public class FamilyAccountRight {
	public static void main(String[] args) {
		Account c = new Account("3344",10000.0) ;
		Runnable h = new Husband(c);
		Runnable w = new Wife(c);
		Thread t1 = new Thread(h);
		Thread t2 = new Thread(w);
		
		t2.start();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.stop();
		t2.stop();
		System.out.println("运行5秒");
	}

}


class Husband implements Runnable {
	final Account account;
	
	public synchronized void run() {
		int count1 = 0;
		while(count1<=100) {
		int deposit =new Random().nextInt(Integer.MAX_VALUE);
		account.setBalance(account.getBalance()+deposit);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("丈夫存钱成功,存钱 "+deposit+"元,余额为"+account.getBalance()+"元");
		count1++;
	}
	}
	Husband(Account c){
		account = c ;
	}
}

class Wife implements Runnable {
	final Account account;
	
	public synchronized void run() {	
		int count2 =0 ;
		while(count2<100) {
		int withdraw =new Random().nextInt(Integer.MAX_VALUE);
		while(withdraw>account.getBalance()) {
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		account.setBalance(account.getBalance()-withdraw);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("妻子取钱成功,取钱 "+withdraw+"元,余额为"+account.getBalance()+"元");
		count2++;
	}
	}
	Wife(Account c){
		account = c ;
	}
}


class Account {
	private String ID;
	private double  balance ;
	static boolean flag = true ;
	public String getID() {
		return ID;
	}
	public double  getBalance() {
		return balance;
	}
	public Account(String iD, double balance) {
		super();
		ID = iD;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public void setBalance(double  balance) {
		this.balance = balance;
	}
	
}






