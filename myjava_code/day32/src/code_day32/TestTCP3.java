package code_day32;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.junit.Test;

/*
	示例：
		客户端从键盘输入单词给服务器发送，服务器收到后，把单词“反转”并返回
		直到输入"bye"
 */
public class TestTCP3 {
	@Test
	public void server() throws IOException{
		//1、启动服务器，指定监听的端口号
		ServerSocket server = new ServerSocket(58888);//0~65535
		System.out.println("服务器已启动....");
		
		//2、等待并接收连接
		Socket client = server.accept();//accept接受
		System.out.println("一个客户端连接进来");
		
		//3、数据发送和接收
		//（1）接收数据：用字节输入流
		InputStream input = client.getInputStream();//通过Socket对象获取字节输入流
		//(2)回复消息
		OutputStream output = client.getOutputStream();
		
		Scanner s = new Scanner(input);//包装输入流
		while(s.hasNextLine()){
			String str = s.nextLine();
			//反转
			StringBuilder sb = new StringBuilder(str);
			str = sb.reverse().toString();
			//回复
			output.write((str+"\n").getBytes());
		}
		
		//4、断开
		//释放资源
		s.close();
		input.close();
		output.close();
		client.close();
		
		
		//5、关闭服务器（基本上不做）
		server.close();
	}
	
	@Test
	public void client() throws UnknownHostException, IOException{
		//1、连接服务器，要知道服务器的IP地址和监听的端口号
		//Socket(String host, int port) 
		Socket socket = new Socket("192.168.23.66",58888);
		//2、数据发送和接收
		//(1)发送数据：用字节输出流
		OutputStream output = socket.getOutputStream();
		//(2)接收服务器回复的信息
		InputStream input = socket.getInputStream();
		
		Scanner scanner = new Scanner(System.in);//从键盘输入
		Scanner s = new Scanner(input);//从网络输入
		
		while(true){
			//从键盘输入一个单词，发送一个单词
			System.out.print("请输入单词：");
			String str = scanner.next();
			if("bye".equals(str)){
				break;
			}
			//发送，一个单词一行
			output.write((str+"\n").getBytes());
			
			//接收服务器反转后的单词
			if(s.hasNextLine()){
				String line = s.nextLine();
				System.out.println("回复：" + line);
			}
		}
		
		//3、断开
		scanner.close();
		s.close();
		output.close();
		input.close();
		socket.close();
	}
}
