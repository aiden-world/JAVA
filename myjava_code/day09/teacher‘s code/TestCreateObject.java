/*
对象的创建：
首先第一个问题要搞清楚：
    创建哪个类的对象，实例？

1、声明对象名？
	类名 对象名;
	
2、创建对象
	对象名 = new 类名();
	
3、使用对象
	对象名.属性 = 值;
	System.out.println(对象名.属性);
	
	对象名.方法();
*/
import java.util.Scanner;
import java.util.Random;

class TestCreateObject{
	public static void main(String[] args){
		//问题1：创建Teacher类的对象
		//Teacher是类名，t1就是对象名
		//第一步：声明对象
		//Teacher t1;
		
		//第二步：创建对象
		//t1 = new Teacher();
		
		//可以把第一步和第二步合起来
		Teacher t1 = new Teacher();
		
		//为t1对象的name属性赋值
		t1.name = "张三";
		//为t1对象的age属性赋值
		t1.age = 23;
		
		//访问t1对象的name属性值
		System.out.println("姓名：" + t1.name);
		//访问t1对象的age属性值
		System.out.println("年龄：" + t1.age);
		
		//回忆：
		/*
		Scanner input = new Scanner(System.in);
		//input是对象名，nextInt()是方法
		int num = input.nextInt();
		
		Random rand = new Random();
		//rand是对象名,nextInt(100)也是方法
		int sui = rand.nextInt(100);
		*/
	}
}
class Teacher{
	String name;
	int age;
}