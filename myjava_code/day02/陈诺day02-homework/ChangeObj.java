import java.util.Scanner;
public class ChangeObj {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������a��ֵ");
	    int a = input.nextInt();
		System.out.println("���������b��ֵ");
		int b = input.nextInt();
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("Let's change it!");
	    System.out.println("---------------");
		//����һ  �ṩ��ʱ������ռ�ռ�
		int i1=a;
		a=b;
		b=i1;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("---------------");
		//������ ��m��n�ϴ�ʱ���п��ܳ��־�����ʧ
		 a=a-b;
		 b=a+b;//b=b+(a-b)==a;
		 a=b-a;//a=a-(a-b)==b;
         System.out.println("a="+a+" "+"b="+b);
		 //������ �ŵ㣺^�����ţ�û���������ַ�����ȱ�㡣 ȱ�㣺�ѣ�
		 System.out.println("---------------");
		 a=a^b;
		 b=a^b;//(a^b)^b==a;
		 a=a^b;//(a^b)^a==b; 
		 System.out.println("a="+a+" "+"b="+b);
	}
}