package com.atguigu.thread.exer;

/*
 * 案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
要求：要等兔子和乌龟的线程结束，主线程（裁判）才能公布最后的结果。
 */
public class TestPao {

	public static void main(String[] args) {
		WuGui w = new WuGui();
		TuZi t = new TuZi();
		
		w.start();
		t.start();
		
		try {
			w.join();
			t.join();
			//它俩只是阻塞main线程，它俩之间还是竞争关系
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long wt = w.getTime();
		long tt = t.getTime();
		if(tt < wt){
			System.out.println("兔子赢");
		}else if(tt > wt){
			System.out.println("乌龟赢");
		}else{
			System.out.println("平局");
		}
	}

}
