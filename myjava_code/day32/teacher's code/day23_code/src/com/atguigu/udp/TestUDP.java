package com.atguigu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.junit.Test;

/*
 * TCP：分为服务器端和客户端。
 * UDP：分为发送端和接收端。
 * 		不可靠，非面向连接的
 * 
 * UDP：需要DatagramSocket和DatagramPacket
 * 
 * DatagramPacket(byte[] buf, int length) ：是接收端用的
 * 		buf：准备一个装数据的字节数组
 * 		length：字节数组的长度
 * DatagramPacket(byte[] buf, int length, InetAddress address, int port)：是发送端用
 * 		buf：装要发送的数据的字节数组
 * 		length：字节数组的长度
 * 		address：接收方的IP地址
 * 		port：接收方的端口号
 */
public class TestUDP {
	//发送端
	@Test
	public void send()throws Exception{
		//1、创建一个Socket
		DatagramSocket ds = new DatagramSocket();
		
		//2、准备发送的消息
		String str = "马上下课了";
		byte[] data = str.getBytes();
		
		//3、把数据包装为数据报
		InetAddress ip = InetAddress.getLocalHost();
		int port = 9090;
		DatagramPacket dp = new DatagramPacket(data,data.length,ip,port);
		
		//4、发送
		ds.send(dp);
		System.out.println("发送完毕");
		
		//5、断开
		ds.close();
	}
	
	//接收端
	@Test
	public void receive()throws Exception{
		//1、创建一个Socket
		DatagramSocket ds = new DatagramSocket(9090);//接收端在9090监听，准备接收数据
		
		//2、准备一个数据报接收数据
		byte[] data = new byte[64*1024];
		DatagramPacket dp = new DatagramPacket(data,data.length);
		
		//3、接收数据
		ds.receive(dp);
		
		//4、取出数据，显示
		byte[] data2 = dp.getData();
		int len = dp.getLength();//实际数据的长度
		System.out.println(new String(data2,0,len));
		
		//5、断开
		ds.close();
	}
}
