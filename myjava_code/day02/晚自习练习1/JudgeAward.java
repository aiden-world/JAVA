import java.util.Scanner;
public class JudgeAward{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("������С������ĩ�ɼ�");
		int score = input.nextInt();
		if(score>=0&&score<=100){
		if (score==100) 
		System.out.println("����һ̨BMW");
		else if(score>80&&score<=99)
		System.out.println("����һ̨iphone7plus");
		else if(score>=60&&score<=80)
		System.out.println("����һ�� iPad");
		else 
		System.out.println("û�н���");
		}
		else 
		System.out.println("�����������");
	}
}
