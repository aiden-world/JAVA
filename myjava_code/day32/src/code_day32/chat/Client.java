package code_day32.chat;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;



public class Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("192.168.23.73", 9999);
		
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

		//先登录
		Scanner scanner = new Scanner(System.in);
		String username;
		while(true){
			//输入登录信息
			System.out.println("用户名：");
			username = scanner.nextLine();
			System.out.println("密码：");
			String password = scanner.nextLine();
			
			Message msg = new Message(Code.LOGIN, username, password);
			//发送登录数据
			oos.writeObject(msg);
			// 接收登录结果
			msg = (Message) ois.readObject();
			if(msg.getCode() == Code.SUCCESS){
				System.out.println("登录成功！");
				break;
			}else if(msg.getCode() == Code.FAIL){
				System.out.println("用户名或密码错误，登录失败，重新输入");
			}
		}
		
		//启动收消息和发消息线程
		SendThread s = new SendThread(oos,username);
		ReceiveThread r = new ReceiveThread(ois);
		s.start();
		r.start();
		
		s.join();//不发了，就结束
		r.setFlag(false);
		r.join();
		
		scanner.close();
		socket.close();
	}
}
