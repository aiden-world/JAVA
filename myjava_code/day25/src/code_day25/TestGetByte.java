package code_day25;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Calendar;

public class TestGetByte {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "白帝极光剑";
		byte[] b1 = s.getBytes();
		byte[] b2 =s.getBytes("GBK") ;
		byte[] b3 = s.getBytes("ISO8859-1") ;
		BigInteger big1 = new BigInteger("123214917498728127398217837182");
		BigInteger big2 = new BigInteger("213214129847582562938479821749");
		System.out.println(big2.add(big1));
		System.out.println(big2.subtract(big1));
		Calendar  c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println((int)'是' );
		float a= 3.5f;
		double v  = 3.6d;
		System.out.println(v-a);
		Integer i = 100;
		System.out.println(i.doubleValue()); 
	}
	
	//static void printByteArray
}
