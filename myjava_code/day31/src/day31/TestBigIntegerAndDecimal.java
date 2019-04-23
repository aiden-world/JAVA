package day31;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigIntegerAndDecimal {
public static void main(String[] args) {
	BigInteger b1 = new BigInteger("213921984719287498217329872198321213");
	BigInteger b2 = new BigInteger("9832748732987498239498217329872198321213");
	BigDecimal d1 = new BigDecimal("2523423423.132132132151987985729834793279");
	BigDecimal d2 = new BigDecimal("24213428883.1321032897913219821929834793279");
	
	System.out.println(b1.add(b2));
	System.out.println(d1.subtract(d2));
	
	
	
}
}
