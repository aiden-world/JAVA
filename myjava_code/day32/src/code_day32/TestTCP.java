package code_day32;

import java.io.*;
import java.io.InputStream;
import java.net.*;

import org.omg.CORBA.portable.UnknownException;

public class TestTCP {
	public static void main(String[] args) {
		
	}
	
	
	public void server() throws IOException {
//		1 启动服务器,指定监听端口
		ServerSocket server = new ServerSocket(58888);
		System.out.println("服务器已启动");
		System.out.println("等待你的连接");
//		2 等待并接受连接
		Socket client = server.accept();
		System.out.println("一个客户端链接进来");
		//Socket类
		InetAddress inetAddress = client.getInetAddress();
		String ip = inetAddress.getHostAddress();
		System.out.println("客户端的IP地址为 "+ip);
		//		3数据发送和接收
		InputStream input = client.getInputStream();///通过Socket对象获取字节输入流
//		4断开
		
//		5关闭服务器	 
	}
	
	public void client() throws UnknownException{
		//1
	}
}
