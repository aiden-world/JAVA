import java.util.Scanner;
public class ExchangeNumFormat{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("ÇëÊäÈë°¢À­²®Êı×Ö");
	int num = input.nextInt();
	switch (num){
	case 1 : System.out.println("Ò¼"); break;
	case 2 : System.out.println("·¡"); break;
	case 3 : System.out.println("…£"); break;
	case 4 : System.out.println("ËÁ"); break;
	case 5 : System.out.println("Îé"); break;
	case 6 : System.out.println("Â½"); break;
	case 7 : System.out.println("Æâ"); break;
	case 8 : System.out.println("°Æ"); break;
	case 9 : System.out.println("¾Á"); break;
	default: System.out.println("other"); break;	
	}
	}
}