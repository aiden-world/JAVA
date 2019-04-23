package tortoiseandhare;

public class TuZi extends Thread{
	private long time;
	public void run(){
		long start = System.currentTimeMillis();
		//循环1次，代表1米
		for (int i = 0; i < 30; i++) {
			try {
				//兔子的速度是10米每秒，1米需要100毫秒
				Thread.sleep(100);//模拟耗时100毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("兔子在跑...");
			
			try {
				//兔子每跑完10米的休眠时间是10秒
				if(i==10 || i==20){
					System.out.println("兔子跑完" + i + "米，休息中...");
					Thread.sleep(10000);//跑完10米，睡10秒
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		time = end - start;
		System.out.println("兔子跑完了：耗时" + time);
	}
	public long getTime() {
		return time;
	}
	
}
