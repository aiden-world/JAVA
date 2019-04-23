package com.atguigu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * 在Java程序中如何表示IP地址呢？
 * 1、字符串："192.168.23.66"
 * 2、字节数组：{192,168,23,66}   byte(-128~127)  底层特殊处理，无符号
 * 3、InetAddress的对象
 * 
 * java.net.InetAddress：此类表示互联网协议 (IP) 地址。IP 地址是 IP 使用的 32 位或 128 位无符号数字，它是一种低级协议，UDP 和 TCP 协议都是在它的基础上构建的。
 * 1、对象
 * 它的对象无法直接new，如果程序中需要它的对象，就通过静态方法获取
 * (1) InetAddress.getLocalHost();
 * (2)InetAddress.getByName("www.baidu.com");
 * (3)InetAddress.getByAddress(addr);
 * 2、其他方法
 * (1)getHostName()：获取主机名
 * (2)getHostAddress()：获取主机地址
 * 
 * 回忆：
 * java.lang：
 * java.io：
 * java.util：
 * java.text:
 * java.time：
 * ...
 * 
 * 主机名：
 * （1）域名：www.baidu.com
 * 		   www.atguigu.com
 * （2）IP地址：
 * 		用户不好记：222.222.88.102
 * 域名最终还是会映射到IP上，这个过程有域名解析服务器完成。
 * 域名要注册
 * 
 * 
 */
public class TestInetAddress {
	@Test
	public void test3() throws UnknownHostException{
		byte[] addr = {(byte)192,(byte)168,23,66};
		InetAddress byName = InetAddress.getByAddress(addr);
		System.out.println(byName);
	}
	
	@Test
	public void test2() throws UnknownHostException{
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName);
	}
	
	@Test
	public void test1() throws UnknownHostException{
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost);
		
		String hostName = localHost.getHostName();
		String hostAddress = localHost.getHostAddress();
		System.out.println(hostName);
		System.out.println(hostAddress);
	}
}
