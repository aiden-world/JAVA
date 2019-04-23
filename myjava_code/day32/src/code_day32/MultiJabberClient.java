package code_day32;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MultiJabberClient {
	static final int MAX_THREADS = 40;
	public static void main(String[] args) throws InterruptedException, UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		while(true) {
			if(JabberClientThread.threadCount()
					<MAX_THREADS)
				new JabberClientThread(addr);
			Thread.currentThread().sleep(100);
		}
	}
}
