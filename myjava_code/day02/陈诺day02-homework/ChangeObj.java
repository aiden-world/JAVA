import java.util.Scanner;
public class ChangeObj {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入变量a的值");
	    int a = input.nextInt();
		System.out.println("请输入变量b的值");
		int b = input.nextInt();
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("Let's change it!");
	    System.out.println("---------------");
		//方法一  提供临时变量，占空间
		int i1=a;
		a=b;
		b=i1;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("---------------");
		//方法二 当m和n较大时，有可能出现精度损失
		 a=a-b;
		 b=a+b;//b=b+(a-b)==a;
		 a=b-a;//a=a-(a-b)==b;
         System.out.println("a="+a+" "+"b="+b);
		 //方法三 优点：^异或符号，没有上面两种方法的缺点。 缺点：难！
		 System.out.println("---------------");
		 a=a^b;
		 b=a^b;//(a^b)^b==a;
		 a=a^b;//(a^b)^a==b; 
		 System.out.println("a="+a+" "+"b="+b);
	}
}