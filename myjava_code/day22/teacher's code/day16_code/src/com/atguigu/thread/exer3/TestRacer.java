package com.atguigu.thread.exer3;

public class TestRacer {

	public static void main(String[] args) {
		Racer w = new Racer("乌龟", 1000, 1000, 30);
		Racer t = new Racer("兔子", 100, 10000, 30);
		
		w.start();
		t.start();
		
		while(!w.isEnded() && !t.isEnded()){
			
		}
		
		//出了循环，就说明有一个到达终点了
		if(w.isEnded() && t.isEnded()){
			System.out.println("平局");
		}else if(w.isEnded()){
			System.out.println("乌龟赢");
			//让兔子停下来
//			t.stop();
			t.interrupt();//打断
			t.setEnded(true);
		}else{
			System.out.println("兔子赢");
			//让乌龟停下来
//			w.stop();
			w.interrupt();//打断
			w.setEnded(true);
		}
	}

}
