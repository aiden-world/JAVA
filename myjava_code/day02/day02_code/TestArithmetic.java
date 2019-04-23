/*
算术运算符：
1、加：+
2、减：-
3、乘：*
4、除：/
	当两个整数相除时，结果只保留整数部分。
	当两个是整数时，除数为0要报错
	当两个是小数时，除数为0，得到Infinity
5、模（取余）：%
	(1)Java中不只是整数有余数，小数也可以取余数
	(2)只看被除数的符号，余下的一定是被除数的部分
	(3)当两个是整数时，除数为0要报错
	   当两个是小数时，除数为0，得到NaN
6、正号	 +  
   负号 -
7、自增与自减（高频面试题）
自增：++  自增1
自减：--   自减1

概念：自增变量，自增表达式
结论：
（1）自增变量本身来说，不管++在前还是在后，自增变量都要加1
（2）对于自增表达式来说，++在前还是在后是不一样的
   ++在前，先自增后取值
   ++在后，先取值再自增

*/
class TestArithmetic{
	public static void main(String[] args){
		/*
		System.out.println(5/2);//2
		
		System.out.println(5%2);
		System.out.println(5.2%2.1);
		
		System.out.println(5%2);//1
		System.out.println(-5%2);//-1
		System.out.println(-5%-2);//-1
		System.out.println(5%-2);//1
		
		//System.out.println(5/0);//错误的，不能被0除
		System.out.println(5.0/0);//Infinity  无穷大
		
		//System.out.println(5%0);
		System.out.println(5.0%0);//NaN  非数字  not a number
		
		int a = -5;
		System.out.println(+a);
		System.out.println(-a);
		*/
		
		/*
		int i = 1;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		*/
		
		/*
		int i = 1;
		int j = i++;//++在后面，先取i的值作为自增表达式的值进行运算，然后i自增   i++表达式的值是1
		System.out.println(i);//2
		System.out.println(j);//1
		*/
		
		/*
		int i = 1;
		int j = ++i;//++在前面，先i自增，然后再取i的值作为表达式的值   ++i表达式的值是2
		System.out.println(i);//2
		System.out.println(j);//1
		*/
		
		/*
		int i = 1;
		i = i++;//(1)第一步先取i的值1作为i++表达式的值(2)i自增变为2(3)把刚才i++表达式的值1赋值给i
		System.out.println(i);//1
		*/
		
		int i = 1;
		i = ++i;
		System.out.println(i);//2
	}
}