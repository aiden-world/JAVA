import java.util.Scanner;
public class ExchangeFahrenheitToDegree{
	public static void main (String[]  args){
	    Scanner input = new Scanner(System.in);
		System.out.println("�����뻪�϶�");
		double fahrenheit = input.nextDouble();
		double degree = (fahrenheit-32)/1.8;
		System.out.println("ʵ���¶�Ϊ"+fahrenheit+"���϶�, "+degree+"���϶�");
	}
}