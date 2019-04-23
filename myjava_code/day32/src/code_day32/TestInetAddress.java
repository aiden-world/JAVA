package code_day32;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) throws UnknownHostException, InterruptedException {
		InetAddress localHost =  InetAddress.getLocalHost();
		System.out.println(localHost);
		
		Thread.sleep(10000);
	}
}

