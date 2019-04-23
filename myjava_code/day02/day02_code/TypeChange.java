/*
Java的数据类型分为：
1、基本数据类型
2、引用数据类型

一、基本数据类型（8种）
1、整型系列
byte（1个字节）,short（2个字节）,int（4个字节）,long（8个字节）
2、浮点型系列
float（4个字节）,double（8个字节）
3、字符型
char（2个字节）

'a' ->97  'b'->98
'A' ->65   'B'->66
'0' ->48   '1'->49

编码值在0-31之间是控制符
4、布尔型
boolean

二、引用数据类型
1、类   String,System...
2、接口
3、数组

三、基本数据类型的转换
Java 是强类型语言

1、自动类型转换
char
byte-->short-->int -->long -->float-->double
（1）把存储范围小的赋值给存储范围大的，自动类型转换
（2）byte,short,char只要做算术运算，结果都会升级为int
（3）如果各种数据类型混合运算，自动升级它们中最大的类型
（4）boolean类型不参与
补充
（5）String与基本数据类型做“+”运算，结果是字符串，按照拼接处理

2、强制类型转换
(强制的类型)变量
（1）需要进行强制类型转换
double->float->long->int->short->byte
						  char
结果有风险：可能溢出或损失精度
（2）boolean类型不参与	
（3）String不能通过强制类型转换为基本数据类型
（4）有的时候会通过强制类型转换故意提升某个变量的类型
int a = 1;
int b = 2;
System.out.println((double)a / b);				  
*/
class TypeChange{
	public static void main(String[] args){
		/*
		byte b1 = 10;
		int i = b1;//左边是int，右边byte
		System.out.println(i);
		
		char c = '尚';
		int shang = c;
		System.out.println(shang);//尚的Unicode编码值
		System.out.println(c);
		
		int a = 200;
		double d = a;
		System.out.println(d);
		
		byte b2 = 10;
		short s2 = b2;
		System.out.println(s2);
		
		char c3 = '尚';
		short s3 = c3;
		System.out.println(s3);
		*/
		
		/*
		byte b1 = 1;
		byte b2 = 2;
		//byte b3 = b1 + b2; //不兼容的类型: 从int转换到byte可能会有损失
		
		char c1 = 'a';
		char c2 = 'b';
		//char c3 = c1 + c2;//不兼容的类型: 从int转换到char可能会有损失
		System.out.println(c1 + c2);//195
		
		char letter1 = 0;//编码值为0的字符
		char letter2 = '0';//字符0
		System.out.println(letter1);
		System.out.println(letter2);
		*/
		
		/*
		byte b = 10;
		int i = 200;
		long l = 200000;//自动类型转换，200000的int值自动转为long类型
		double d = 25.6;
		System.out.println(b + i + l + d);
		*/
		
		/*
		System.out.println('a' + 'b' + " = ");//'a' + 'b'求和，+" = "拼接，连接
		System.out.println('a' + " = " + 'b');//'a' + " = "拼接，结果还是字符串
		System.out.println(" = " + 'a' + 'b');
		*/
		
		int i = 128;
		byte b = (byte)i;//不兼容的类型: 从int转换到byte可能会有损失
		System.out.println(b);
		
		String s = "0";
		//int sNum = (int)s;//不兼容的类型: String无法转换为int
	}
}