package code_day32.chat;

import java.io.IOException;
import java.net.*;
public class Server {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(9999);
		while(true) {
			Socket socket = server.accept();
			ClientHandlerThread ct = new ClientHandlerThread(socket);
			ct.start();
		}
	}
}
