package com.atguigu.net;

import java.io.IOException;
import java.net.ServerSocket;

/*
 * Java中如何表示端口号？
 * 用一个整数值：0~65535
 * 
 * 0~1023：固定分配给一些服务
 * 		21端口分配给FTP(文件传输协议)服务
 * 		80端口分配给HTTP服务
 * 		分配给HTTPS服务，和支付相关的
 * 端口号从1024到49151：建议不要使用
 * 		Tomcat/JBoss：8080
 * 		mysql：3306
 * 		oracle：1521
 * 		sql server：1433
 * 		qq:1080
 * 端口的范围从49152到65535：
 */
public class TestPort {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);// java.net.BindException: Address already in use: JVM_Bind
		
		server.accept();//让程序等着
	}
}
