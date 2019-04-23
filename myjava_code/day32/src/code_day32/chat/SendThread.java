package code_day32.chat;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class SendThread extends Thread{
	private ObjectOutputStream oos;
	private String username;
	
	public SendThread(ObjectOutputStream oos,String username) {
		super();
		this.oos = oos;
		this.username = username;
	}

	public void run(){
		try {
			Scanner scanner = new Scanner(System.in);
			while(true){
				System.out.println("请输入消息内容：");
				String content = scanner.nextLine();
				Message msg;
				if("bye".equals(content)){
					msg = new Message(Code.LOGOUT, username, content);
					oos.writeObject(msg);
					scanner.close();
					break;
				}else{
					msg = new Message(Code.CHAT, username, content);
					oos.writeObject(msg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
