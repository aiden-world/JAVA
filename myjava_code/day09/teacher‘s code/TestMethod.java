/*
类的第二个成员：方法

方法(method)的概念：
	方法又称为函数(function)。
	方法代表一个独立的功能。该功能可以简单被复用。
	例如：System.out.println()  代表输出xxx后换行的功能
		  System.out.print() 	代表输出xx但不换行
		  input.nextInt()		代表从键盘输入一个int值的功能
		  Math.random()			代表随机生成一个[0,1)范围的小数的功能
		  Math.sqrt()		 	代表求xx的平方根的功能

1、如何声明一个方法
位置：必须在类中方法外，和属性一样
格式：
	【修饰符】 返回值类型  方法名(【形参列表】){
		方法体：完成/实现方法功能的代码
	}

返回值类型：可以是Java的任意类型，
		例如：void  表示该方法不返回结果
		例如：int 	表示该方法执行后会返回一个int的值
		例如：double 表示该方法执行后会返回一个double的值
方法名：见名知意，体现该方法的功能
形参列表：可以有也可以没有
	形参列表的形参是用来接收数据，这个数据是用来辅助该方法完成功能用的，
	如果该方法的功能完成不需要额外的数据，那么就可以不设置【形参列表】，
	如果该方法的功能完成需要额外的数据，那么就需要设置【形参列表】

	例如：System.out.println()  仅仅代表换行的功能
		  System.out.println(xxx)  代表输出xxx后换行的功能	
		  System.out.print(xxx) 	代表输出xxx但不换行
		  input.nextInt()		代表从键盘输入一个int值的功能
		  Math.random()			代表随机生成一个[0,1)范围的小数的功能
		  Math.sqrt(x)		 	代表求x的平方根的功能	

	形参其实本质上就是一个变量。形参的类型可以是Java的任意类型。
	形参声明的格式：(数据类型 形参名)
					(数据类型1 形参名1, 数据类型2 形参名2)
					(数据类型1 形参名1, 数据类型2 形参名2  。。。。。)

2、如何调用一个方法？
格式：
	对象名.方法名(【实参列表】);
	变量 = 对象名.方法名(【实参列表】);		
要求：
（1）【实参列表】要与被调用的方法的【形参列表】对应（类型、个数、顺序）。
（2）方法调用后要不要接收结果，是不是能接收结果要看方法的返回值类型
如果方法的返回值类型是void，那么表示不需要也不能接收。
如果方法的返回值类型不是void，那么表示需要接收返回值，如果非不接收，也可以，只是返回的结果会丢失。
	例如：
		int num = input.nextInt();//返回值类型是int
		String str = input.next();//返回值类型是String

3、方法的要求
（1）先声明后调用		
（2）方法不调用不执行		
	
回忆：	
命名规范：
（1）见名知意
（2）类名、接口名等：XxxYyyZzz
（3）变量名、方法名等：xxxYyyZzz
（4）包名：xxx.yyy.zzz
（5）常量名：XXX_YYY_ZZZ		
*/
class TestMethod{
	public static void main(String[] args){
		Teacher t = new Teacher();
		
		//调用t对象的eat()方法
		//t.eat();
		//调用t对象的chi()方法
		//t.chi("汉堡");
		
		int m = 15;
		int n = 8;
		int maxValue = Math.max(m,n);
		System.out.println("最大值：" + maxValue);
		
		//int suiJi = Math.random();//错误的，因为返回的结果是double
	}
}
class Teacher{
	/*
	功能需求：打印“吃饭”
	*/
	void eat(){
		System.out.println("吃饭");
	}
	/*
	功能需求：打印“吃xx”
	*/
	void chi(String food){
		System.out.println("吃" + food);
	}
	
}