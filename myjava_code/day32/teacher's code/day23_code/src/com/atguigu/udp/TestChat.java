package com.atguigu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class TestChat {
	public static void main(String[] args)throws Exception {
		//1、创建Socket
		int port = 9999;
		MulticastSocket socket = new MulticastSocket(port);
		
		//2、指定广播ip和端口号
		//224.0.0.4~239.255.255.255
		InetAddress ip = InetAddress.getByName("230.0.0.1");
		
		
		//3、加入广播组
		socket.joinGroup(ip);
		
		//4、设置是否给自己回传，false表示不禁用回传
		socket.setLoopbackMode(false);
		
		//5、输入用户名
		
		//6、启动两个线程
		//(1)一个管发送
		Send send = new Send(socket, ip ,port);
		send.start();
		
		//(2)一个管接收
		Receive receive = new Receive(socket);
		receive.start();
		
		send.join();//我们接收send线程后，再关闭socket
		
		//7、关闭
		socket.close();
	}
}
class Send extends Thread{
	private MulticastSocket socket;
	private InetAddress ip;
	private int port;
	
	public Send(MulticastSocket socket, InetAddress ip,int port) {
		super();
		this.socket = socket;
		this.ip = ip;
		this.port = port;
	}

	public void run(){
		try {
			Scanner input = new Scanner(System.in);
			while(true){
				System.out.print("请输入消息：");
				String str = input.nextLine();
				if("bye".equals(str)){
					break;
				}
				//因为是UDP编程，所以数据要用DatagramPacket包装
				byte[] data = str.getBytes();
				DatagramPacket dp = new DatagramPacket(data,data.length,ip,port);
				
				socket.send(dp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class Receive extends Thread{
	private MulticastSocket socket;
	
	public Receive(MulticastSocket socket) {
		super();
		this.socket = socket;
	}

	public void run(){
		try {
			while(true){
				//(1)准备字节数组接收数据
				byte[] data = new byte[64*1024];
				DatagramPacket dp = new DatagramPacket(data,data.length);
				
				//(2)接收数据
				socket.receive(dp);
				
				//(3)显示数据
				System.out.println(new String(dp.getData(),0,dp.getLength()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}