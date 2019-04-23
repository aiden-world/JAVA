package com.atguigu.buffer;

/*
 * Runtime.getRuntime()；获取当前JVM的运行时环境对象
 * totalMemory()：总内存
 * freeMemory()：空闲的内存
 * Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()：使用的内存
 */
public class TestTime {
	public static void main(String[] args) {
//		testString();
		testStringBuffer();
//		testStringBuilder();
	}
	public static void testStringBuilder(){
		long start = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("0");
		for(int i=1;i<=10000;i++){
			s.append(i);
		}
		System.out.println(s);
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder拼接+用时："+(end-start));
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuilder拼接+memory: " + memory);
	}
	
	
	public static void testStringBuffer(){
		long start = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("0");
		//追加了10000次
		for(int i=1;i<=10000;i++){
			s.append(i);
		}
		System.out.println(s);
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer拼接+用时："+(end-start));//7
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("StringBuffer拼接+memory: " + memory);//1950392
	}
	
	public static void testString(){
		long start = System.currentTimeMillis();
		String s = "0";
		//对字符串进行拼接10000次
		for(int i=1;i<=10000;i++){
			s += i;
		}
		System.out.println(s);
		long end = System.currentTimeMillis();
		
		System.out.println("String拼接+用时："+(end-start));//466毫秒
		
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("String拼接+memory: " + memory);//53166728字节

	}
}
