package com.atguigu.thread.exer3;

/*
 * Racer代表乌龟和兔子线程
 */
public class Racer extends Thread{
	private long runtimePerMeter;//每跑1米的时间，单位毫秒
	private long resttime;//休息时间，每跑完10米，单位毫秒
	private long distance;//总距离
	private long totalTime;
	private volatile boolean ended = false;//volatile每次读取ended的值都从主存中读取
	
	public Racer(String name, long runtimePerMeter, long resttime, long distance) {
		super(name);
		this.runtimePerMeter = runtimePerMeter;
		this.resttime = resttime;
		this.distance = distance;
	}
	
	public void run(){
		long start = System.currentTimeMillis();
		//循环1次，代表1米
		for (int i = 0; i < distance && !ended; i++) {
			try {
				Thread.sleep(runtimePerMeter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + "在跑...");
			
			try {
				//兔子每跑完10米的休眠时间是10秒
				if(i%10==0 && i!=0){
					System.out.println(getName() + "跑完" + i + "米，休息中...");
					Thread.sleep(resttime);//跑完10米，睡xx秒
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		totalTime = end - start;
		ended = true;
		System.out.println(getName() + "跑完了：耗时" + totalTime);
	}

	public long getTotalTime() {
		return totalTime;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}
}
