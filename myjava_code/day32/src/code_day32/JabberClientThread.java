package code_day32;
import java.io.*;
import java.net.*;
 class JabberClientThread extends Thread{
	private Socket socket ;
	private BufferedReader in;
	private PrintWriter out;
	private static int counter=0;
	private int id =counter++;
	private static int threadcount =0;
	public static int threadCount() {
		return threadcount;
	}
	public JabberClientThread(InetAddress addr) {
		System.out.println("Making Client "+id);
		threadcount++;
		try {
			socket = new Socket(addr,MultiJabberServer.PORT);
		} catch (IOException e) {
			//如果socket创建失败,什么都不需要被清理
		}
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(
						new BufferedWriter(new OutputStreamWriter(
								socket.getOutputStream())),true);
			start();
		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}
	}
	
	public void run() {
		try {
			for (int i = 0; i < 25; i++) {
				out.println("Client "+id+": "+i);
				String 	str = in.readLine();
				System.out.println(str);	
			}
			out.println("END");
		} catch (IOException e) {			
		}finally {
			//Always close it:
			try {
				socket.close();
			} catch (IOException e) {}
			threadcount--; //ending this thread
		}
		
		
	}
	
	
}





