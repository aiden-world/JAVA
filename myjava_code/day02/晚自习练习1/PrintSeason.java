import java.util.Scanner;
public class PrintSeason{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������·�");
		int month = input.nextInt();
		if(month>0&&month<=12){	
	    if(month<=5&&month>=3)
		System.out.println("����");
		else if(month<=8&&month>=6)
		System.out.println("�ļ�");
		else if(month<=11&&month>=9)
		System.out.println("�＾");
		else if(month==12||month<=2)
		System.out.println("����");
		}
		else System.out.println("�������");
	}
}