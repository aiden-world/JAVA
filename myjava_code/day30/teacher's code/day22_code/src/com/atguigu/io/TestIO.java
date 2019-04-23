package com.atguigu.io;

/*
 * 1、IO：
 * 	Input：数据输入，读数据
 * 	Output：数据输出，写数据
 * 
 * 2、Java中的IO的特点：
 * （1）单向的
 * 		你从输入流中只能读数据，只能把数据写到输出流中
 * （2）阻塞式的
 * 		当你输入流中没有数据，但是又没有到达流末尾，那么就会一直等待
 * 		当你输出数据时，如果没有flush，没有close，有的时候数据会一直在流中没有出去。最明显的就是缓冲流。
 * 
 * 3、Java的IO流的分类：
 * （1）按照方向分：
 * 	输入流和输出流
 * 例如：
 * 	输入流：FileInputStream，FileReader，ObjectInputStream，DataInputStream...
 *  输出流：FileOutputStream，FileWriter，ObjectOutputStream，DataOutputStream...
 * 
 * （2）按照数据的处理单位/方式
 * 字节流和字符流
 * 字节流：一次读取一个字节/多个字节，可以处理所有类型的数据，包括字符，处理字符时，要考虑编码和是否完整
 * 		一次输出一个字节/多个字节，
 * 字符流：一次读取一个字符/多个字符，只能处理纯文本/字符的数据
 * 		一次输出一个字符/多个字符
 * 
 * 例如：
 * 	字节流：FileInputStream、FileOutputStream、ObjectInputStream、ObjectOutputStream、DataInputStream、DataOutputStream
 *	字符流：FileReader,FileWriter,BufferedReader,BufferedWriter、InputStreamReader,OutputStreamWriter
 * 
 * （3）节点流和处理流
 * 节点流：负责连接数据源和目的地
 * 处理流：负责在节点流的基础上增加其他的功能
 * 
 * 处理流不能离了节点流
 * 
 * 例如：FileInputStream/FileOutputStream可以读取、写文件，但是我先想在读取、写文件的同时，进行编码和解码的操作，
 * 		那么就可以在FileInputStream的外面套一层InputStreamReader（解码）,OutputStreamWriter（编码）
 *  或者
 *  	FileReader或FileWriter,也可以读取，写文件，但是我先想在读取、写文件的同时，增加缓冲的功能（提高效率），
 *  	可以在外面套一层BufferedReader,BufferedWriter
 *  
 * 4、IO流的四个抽象的基类，超类，父类
 * （1）InputStream：所有字节输入流的超类
 * （2）OutputStream：所有字节输出流的超类
 * （3）Reader：所有字符输入流的超类
 * （4）Writer ：所有字符输出流的超类
 * 
 * 5、常用的方法：
 * （1）InputStream：一次读取一个字节/多个字节
 * int read()：一次读一个字节，返回它读取到的字节的值
 * int read(byte[] data)：一次读取多个字节，读取的多个字节放到data数组，返回实际读取的字节数，最多读取data.length
 * 		每次调用这个方法，都从data[0]开始存
 * int read(byte[] data,int offset,int len)：一次读取多个字节，读取的多个字节放到data数组，最多读取len个，返回实际读取的字节数，
 * 		每次调用这个方法，都从data[offset]开始存
 * 
 * 如果输入流中没有数据了，表示到达流末尾，统统返回-1。
 * 
 * （2）Reader：一次读取一个字符/多个字符
 * int read()：一次读一个字符，返回它读取到的字符的Unicode值
 * int read(char[] data)：一次读取多个字符，读取的多个字符放到data数组，返回实际读取的字符数，最多读取data.length
 * 		每次调用这个方法，都从data[0]开始存
 * int read(char[] data,int offset,int len)：一次读取多个字符，读取的多个字符放到data数组，最多读取len个，返回实际读取的字符数，
 * 		每次调用这个方法，都从data[offset]开始存
 * 
 * 如果输入流中没有数据了，表示到达流末尾，统统返回-1。
 * 
 * （3）OutputStream：一次写一个字节/多个字节
 * void write(int data)：一次写一个字节
 * void write(byte[] data)：一次写整个字节数组的数据，如果长度为100个字节，就写100个字节
 * void write(byte[] data,int offset,int len)：一次写多个字节，从data[offset]开始，len个。
 * 
 * （4）Writer：一次写一个字符/多个字符
 * void write(int data)：一次写一个字符
 * void write(char[] data)：一次写整个字符数组的数据，如果长度为100个字符，就写100个字符
 * void write(char[] data,int offset,int len)：一次写多个字符，从data[offset]开始，len个。
 * void write(String str)：直接输出整个字符串
 * void write(String str,int offset, int len)：直接输出某个字符串的一部分
 * 
 * 所有IO流都有close()，也要求大家使用完IO流后要记得关闭。
 * 所有的输出流都有flush()，流没用完，但是想要把流中的数据及时的刷出去，可以使用flush。
 * 
 */
public class TestIO {

}
