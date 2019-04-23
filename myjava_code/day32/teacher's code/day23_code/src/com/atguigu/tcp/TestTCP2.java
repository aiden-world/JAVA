package com.atguigu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * TCP协议的编程：
 * 1、ServerSocket：专门用在TCP的服务器端，用来监听客户端的连接/访问
 * 2、Socket：用在服务器和客户端，发送和接收数据用的。
 * 
 * ServerSocket的API：
 * （1）ServerSocket server = new ServerSocket(端口号);
 * （2）Socket client = server.accept();
 * （3）close()
 * 
 * 
 * Socket的API：
 * （1）Socket(String host, int port) 
 * （2）InetAddress getInetAddress() 获取对方的主机信息
 * （3）OutputStream getOutputStream()
 * （4）InputStream getInputStream()
 * （5）close()
 * （6）shutdownOutput()
 * 	  shutdownInput()
 * 
 * TCP：基于字节流
 */
public class TestTCP2 {
	@Test
	public void server() throws IOException{
		//1、启动服务器，指定监听的端口号
		ServerSocket server = new ServerSocket(58888);//0~65535
		System.out.println("服务器已启动....");
		System.out.println("等待你的连接...");
		
		//2、等待并接收连接
		Socket client = server.accept();//accept接受
		System.out.println("一个客户端连接进来");
		
		// Socket类：InetAddress getInetAddress() 获取对方的主机信息
		InetAddress inetAddress = client.getInetAddress();
		String ip = inetAddress.getHostAddress();
		System.out.println("客户端的IP地址：" + ip);
		
		//3、数据发送和接收
		//（1）接收数据：用字节输入流
		InputStream input = client.getInputStream();//通过Socket对象获取字节输入流
		byte[] data = new byte[1024];
		int len;
		while((len = input.read(data)) != -1){
			System.out.println("接收到客户端的数据："+new String(data,0,len));
		}
		//(2)回复消息
		OutputStream output = client.getOutputStream();
		String str = "一起啊";
		output.write(str.getBytes());
		
		//4、断开
		//释放资源
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
		String str= "马上吃饭了";
		output.write(str.getBytes());
//		output.close();//告知服务器我发完了，错误，用这个，后面就不能通信了，//java.net.SocketException: Socket is closed
		socket.shutdownOutput();//只关闭输出，不关闭输入
		
		
		//(2)接收服务器回复的信息
		InputStream input = socket.getInputStream();
		byte[] data = new byte[1024];
		int len;
		while((len = input.read(data)) != -1){
			System.out.println("接收到服务器端的回复数据："+new String(data,0,len));
		}
		
		//3、断开
		output.close();
		input.close();
		socket.close();
	}
}
