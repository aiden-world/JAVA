package code_day32;

import java.io.*;
import java.net.*;
import java.util.Scanner;

import org.junit.Test;



public class TestMyTCP {
	public static void main(String[] args) throws IOException {
		new TestMyTCP().testClient();
	}
	
	@Test
	public void testClient() throws IOException{
		Socket socket = new Socket("192.168.23.73",12228);
		OutputStream out = socket.getOutputStream();
		PrintStream ps = new PrintStream(out);
		
		InputStream input = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("输入发送给服务器的数据");
			String message = scanner.nextLine();
			if(message.equals("stop")) {
				socket.shutdownOutput();
				break;
			}
			
		ps.println(message);
			
		String feedback = br.readLine();
		System.out.println("从服务器得到的反馈是"+ feedback);
		}
		
		scanner.close();
		socket.close();
		
		}


	@Test
	public void testServer() throws IOException {
		 ServerSocket server = new ServerSocket(12228);
		 System.out.println("服务器启动,等待连接");
		 
		 int count  = 0;
		 while(true) {
			 Socket so = server.accept();
			 System.out.println("第"+ (++count)+"个客户端连接成功");
			 ClientHandlerThread ct = new ClientHandlerThread(so);
			 ct.start();
		 }
		
	}
	
	
	class ClientHandlerThread extends Thread{
		private Socket socket;
		
		public ClientHandlerThread(Socket socket){
			super();
			this.socket = socket;	
		}
		
		public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintStream ps =new PrintStream(socket.getOutputStream());
			String str;
			while((str=br.readLine())!=null) {
				StringBuilder word = new StringBuilder(str);
				word.reverse();
				ps.println(word);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
			
		}
		
	}
		
		 
	
}
