import java.util.Scanner;
public class ExchangeNumFormat{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("�����밢��������");
	int num = input.nextInt();
	switch (num){
	case 1 : System.out.println("Ҽ"); break;
	case 2 : System.out.println("��"); break;
	case 3 : System.out.println("��"); break;
	case 4 : System.out.println("��"); break;
	case 5 : System.out.println("��"); break;
	case 6 : System.out.println("½"); break;
	case 7 : System.out.println("��"); break;
	case 8 : System.out.println("��"); break;
	case 9 : System.out.println("��"); break;
	default: System.out.println("other"); break;	
	}
	}
}