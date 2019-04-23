package com.atguigu.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.junit.Test;

/*
 * 模拟：客户端给服务器端上传文件
 * 规定：统一上传后的文件放在服务器端“upload”文件夹中
 */
public class TestTCP5 {
	@Test
	public void server() throws IOException{
		//1、启动服务器
		ServerSocket server = new ServerSocket(9999);
		
		//2、等待连接
		while(true){
			Socket accept = server.accept();
			
			//每一个客户端都要单独的线程维护上传文件的代码
			UploadThread thread = new UploadThread(accept);
			thread.start();
		}
	}
	
	@Test
	public void client()throws Exception{
		//1、连接服务器
		Socket socket = new Socket("192.168.23.66",9999);
		
		//2、从键盘输入要上传的文件的路径和名称
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要上传文件的路径名：");
		String file = input.nextLine();
		
		//3、上传文件
		//(1)文件名+扩展名：不上传文件名，上传文件的后缀名或扩展名，扩展名代表文件类型
		//(2)文件内容
		OutputStream output = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(output);
		
		//取出文件的扩展名
		int index = file.lastIndexOf(".");//找最后一个.的下标
		String ext = file.substring(index);//从.的位置截到最后
		//发送扩展名
		dos.writeUTF(ext);//对方有一个readUTF()
		//发送文件内容
		//先从文件读内容，然后发送文件内容，一边读一边发送
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[1024];
		int len;
		while((len = fis.read(data)) !=-1){
			dos.write(data, 0, len);
		}
		//加一个半关闭
		socket.shutdownOutput();
		
		//4、接收服务器反馈的消息，希望服务器如果接收到文件后，返回一句话“文件接收成功"
		InputStream inputStream = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(reader);
		
		String readLine = br.readLine();
		System.out.println(readLine);
		
		//5、关闭
		br.close();
		reader.close();
		inputStream.close();
		fis.close();
		dos.close();
		output.close();
		socket.close();
		input.close();
	}
}
class UploadThread extends Thread{
	private Socket socket;
	
	public UploadThread(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run(){
		try {
			InputStream inputStream = socket.getInputStream();
			DataInputStream dis = new DataInputStream(inputStream);
			//1、先接收文件扩展名
			String ext = dis.readUTF();
			
			//要指定上传后的文件放在哪里，叫什么名字
			//为了避免重名，我使用时间戳
			long millis = System.currentTimeMillis();
			String fileName = "upload/" + millis + ext;
			FileOutputStream fos = new FileOutputStream(fileName);
			
			//2、接收文件的内容
			byte[] data = new byte[1024];
			int len;
			while((len = dis.read(data)) != -1){
				//3、写到服务器端的upload/某个文件中
				fos.write(data, 0, len);
			}
			
			//3、告知客户端我接收完毕
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write("文件接收成功\n".getBytes());
			
			//4、关闭
			outputStream.close();
			fos.close();
			dis.close();
			inputStream.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}