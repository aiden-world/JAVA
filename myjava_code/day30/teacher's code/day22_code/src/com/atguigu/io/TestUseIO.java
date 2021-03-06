package com.atguigu.io;

/*
 * 使用IO流的步骤：
 * （一）确定new哪些IO流的对象
 * 1、先确定你要进行什么操作？
 * 你要读还是要写
 * 
 * 可以确定是使用输入流还是使用输出流
 * 
 * 2、确定是使用字节流处理还是字符流处理
 * 
 * 可以确定是使用哪个基类的子类
 * （1）InputStream：所有字节输入流的超类
 * （2）OutputStream：所有字节输出流的超类
 * （3）Reader：所有字符输入流的超类
 * （4）Writer ：所有字符输出流的超类
 * 
 * 3、是否还在基本IO流的基础上增加其他的辅助的功能
 * 例如：缓冲、编码与解码...
 * 
 * 如果有的话，就需要在刚才选择的IO流的基础上再套其他的IO流
 * 
 * （二）进行操作
 * 读：read系列的方法
 * 写：write系列的方法
 * 
 * （三）关闭
 * close()
 */
public class TestUseIO {

}
