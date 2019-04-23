package code_day32.chat;

import java.io.ObjectInputStream;


public class ReceiveThread extends Thread{
	private ObjectInputStream ois;
	private volatile boolean flag = true;
	
	public ReceiveThread(ObjectInputStream ois) {
		super();
		this.ois = ois;
	}
	public void run(){
		try {
			while(flag){
				Message msg = (Message) ois.readObject();
				System.out.println(msg.getUsername() + ":" + msg.getContent());
			}
		} catch (Exception e) {
			System.out.println("请重新登录");
		} 
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
