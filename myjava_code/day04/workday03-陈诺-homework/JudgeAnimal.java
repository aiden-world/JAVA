import java.util.Scanner;
public class JudgeAnimal{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = input.nextInt();
		
		switch(year%12){
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("ţ��");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("����");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("����");
				break;
			case 0:
				System.out.println("����");
				break;
		}
	}
}
