package code_day22;

public class TestWindows {
	public static void main(String[] args) {
		Window w = new Window();

		Thread t1 = new Thread(w, "窗口一");
		t1.start();

		Thread t2 = new Thread(w, "窗口二");
		t2.start();

		Thread t3 = new Thread(w, "窗口三");
		t3.start();
	}

}




class Window implements Runnable{
	private int total = 10;
	@Override
	public void run() {
		while(total>0){
			saleOneTicket();
		}
	}
	//同步方法的锁对象：静态是当前类的Class对象，非静态方法是this
	public synchronized void saleOneTicket(){
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