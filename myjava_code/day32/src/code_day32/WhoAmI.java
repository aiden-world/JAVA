package code_day32;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WhoAmI {
	public static void main(String[] args) throws UnknownHostException {
		if(args.length!=1) {
			System.err.println("Usage:WhoAmI MachineName");
			System.exit(1);
		}
		
		InetAddress a = InetAddress.getByName(args[0]);
		System.out.println(a);
		
		InetAddress b = InetAddress.getLocalHost();
		InetAddress c = InetAddress.getByName(null);
		InetAddress d = InetAddress.getByName("localHost");
		System.out.println(b +"\t" +c+"\t"+d);
		
	}
}
