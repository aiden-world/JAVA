/*
数据的存储：
（1）临时存储：内存
（2）永久存储：硬盘，光盘...

变量：代表一块内存区域
变量的作用：存储数据
三个要素：数据类型（房间的类型：情侣套房、总统套房、单人间）
          变量名（房间号）
		  变量值（客人）

1、先声明/定义	
	数据类型  变量名;
2、赋值
第一次赋值称为初始化

3、使用，访问它的值

System.out.println("xxx"); //在""中的内容是原样显示

很多时候，声明和初始化一起做

注意点：
（1）变量必须先声明后使用
（2）在使用之前还得初始化
（3）在同一个范围内（作用域）是不能重复声明的
（4）变量有作用域
	
*/
class TestVariable{
	public static void main(String[] args){
		//1、先声明/定义一个变量，例如：用来存储年龄
		//int age;
		
		//2、初始化
		//age = 18;
		
		int age = 18;
		
		//3、打印年龄
		//System.out.println("age");//显示age这个单词
		System.out.println(age);//显示age变量里面的值
		
		//4、修改age的值
		age = 19;
		System.out.println(age);		
	}

}