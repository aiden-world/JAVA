import java.util.Scanner;
public class JudgeMarry{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("���������(����)");
		double high = input.nextDouble();
		System.out.println("������Ƹ�(��)");
		double wealth = input.nextDouble();
		System.out.println("˧��(true or false");
		Boolean isHandsome = input.nextBoolean();
		int i=0;
		if (high>=180) i++;
		if (wealth>=1000) i++;
		if (isHandsome==true) i++;
		switch (i){
		case 3 : System.out.println("��һ��Ҫ�޸���!!!"); break;
		case 2 : System.out.println("�ްɣ����ϲ��㣬�������ࡣ"); break;
		case 1 : System.out.println("�ްɣ����ϲ��㣬�������ࡣ"); break;
		case 0 : System.out.println("����!"); break;
		}
	}
}
		
		