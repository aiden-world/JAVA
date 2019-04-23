package com.atguigu.thread.exer2;

public class TestRacer {

	public static void main(String[] args) {
		Racer w = new Racer("乌龟", 1000, 1000, 30);
		Racer t = new Racer("兔子", 100, 10000, 30);
		
		w.start();
		t.start();
		
	/*	if(Racer.isStopped()){
			w.stop();
			t.stop();
		}*/
		
		try {
			w.join();
			t.join();
			//它俩只是阻塞main线程，它俩之间还是竞争关系
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long wt = w.getTotalTime();
		long tt = t.getTotalTime();
		if(tt < wt){
			System.out.println("兔子赢");
		}else if(tt > wt){
			System.out.println("乌龟赢");
		}else{
			System.out.println("平局");
		}
	}

}
