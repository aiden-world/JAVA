import java.util.Scanner;
public class ExchangeFahrenheitToDegree{
	public static void main (String[]  args){
	    Scanner input = new Scanner(System.in);
		System.out.println("请输入华氏度");
		double fahrenheit = input.nextDouble();
		double degree = (fahrenheit-32)/1.8;
		System.out.println("实际温度为"+fahrenheit+"华氏度, "+degree+"摄氏度");
	}
}