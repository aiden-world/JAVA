import java.util.Scanner;
public class PrintWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫת��������ֵ");
		int value = input.nextInt();
		if(!(value>=0&&value<=7))
		System.out.println("�Ƿ�����");
		else switch (value){
		case 1: System.out.println("����һ") ; break;
		case 2: System.out.println("���ڶ�") ; break;
		case 3: System.out.println("������") ; break;
		case 4: System.out.println("������") ; break;
		case 5: System.out.println("������") ; break;
		case 6: System.out.println("������") ; break;
		case 7: System.out.println("������") ; break;
		}
	}
}