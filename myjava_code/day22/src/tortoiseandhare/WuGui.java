package tortoiseandhare;

/*
 * 案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
要求：要等兔子和乌龟的线程结束，主线程（裁判）才能公布最后的结果。
 */
public class WuGui extends Thread{
	private long time;
	public void run(){
		long start = System.currentTimeMillis();
		//循环1次，代表1米
		for (int i = 0; i < 30; i++) {
			try {
				//乌龟的速度是1米每秒
				Thread.sleep(1000);//模拟耗时1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("乌龟在跑...");
			
			try {
				//乌龟每跑完10米的休眠时间是1秒
				if(i==10 || i==20){
					System.out.println("乌龟跑完" + i + "米，休息中...");
					Thread.sleep(1000);//跑完10米，睡1秒
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		time = end - start;
		System.out.println("乌龟跑完了：耗时：" + time);
	}
	public long getTime() {
		return time;
	}
	
}
