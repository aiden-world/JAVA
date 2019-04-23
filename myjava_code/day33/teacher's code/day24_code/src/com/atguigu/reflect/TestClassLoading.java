package com.atguigu.reflect;

/*
 * 1、什么时候去加载类？
 * （1）当程序主动使用某个类
 * （2）也可以使用预加载机制，提前加载
 * 
 * 2、加载后的结果
 * 在内存中生成了一个对象，这个对象是java.lang.Class类型
 * 
 * 3、类加载分为三步：
 * （1）加载loading：读取一个类二进制数据，尝试生成Class对象
 * （2）连接link
 * 		①验证：这个字节码数据是否是合法的字节码数据
 * 			例如：魔数cafe开头
 * 				版本号
 * 				各种格式规范
 * 		②准备：正式为非final类变量（静态变量）分配空间，但是此时是赋值为它们的默认值
 * 				byte,short,int,long：0
 * 				float,double:0.0
 * 				char:\u0000
 * 				boolean :false
 * 				引用数据类型：null
 * 			如果是final的类变量，这个时候就已经直接赋值了。
 * 		③解析：虚拟机常量池内的符号引用（常量名）替换为直接引用（地址）的过程
 * 			例如：代码中有String类型，需要把String这个符号引用替换为它在内存中的String加载后的Class对象的地址。
 * （3）初始化Initialize
 * 		类初始化本质上是执行<clinit>()方法，这个方法不是程序员写的，而是有编译器生成的。它的代码由两部分组成：
 * 		①静态变量的显式赋值      例如：num = 10;
 * 		②静态代码块		例如：num=20;
 * 
 * 		<clinit>()方法{
 * 			num = 10;
 * 			num=20;
 * 		}
 */
public class TestClassLoading {

}

class MyClass{
	private static int num = 10;
	private String str;
	static{
		num = 20;
	}
}
