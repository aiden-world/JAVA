package code_day32;
import java.io.*;
import java.net.*;
import java.util.Scanner;

import org.junit.Test;
 class ServeOneJabber extends Thread{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public ServeOneJabber(Socket s) throws IOException {
		socket =s ;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//Enable auto-flush
		out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
		start();
	}
	
	
	public void run() {
		try {
			while(true) {
				String str = in.readLine();
				if(str.equals("END")) break;
				System.out.println("Echoing:"+str);
				out.println(str);
				
			}
			System.out.println("closing...");
		}catch(IOException e) {
			
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


public class MultiJabberServer{
	static final int PORT =8080;
	public  static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Server Started");
		while(true) {
			Socket 	socket = s.accept();
			try {
				new ServeOneJabber(socket);
			} catch (IOException e) {
				try {
					socket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}finally {
				s.close();
			}
		}
	}
}









