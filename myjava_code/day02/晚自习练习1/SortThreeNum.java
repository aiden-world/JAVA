import java.util.Scanner;
public class SortThreeNum{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入整数num1");
		int num1 = input.nextInt();
		System.out.println("请输入整数num2");
		int num2 = input.nextInt();
		System.out.println("请输入整数num3");
		int num3 = input.nextInt();
		if (num1<=num2&&num1<=num3){
			if(num2<=num3)
				System.out.println(num1+" "+num2+" "+num3);
			else 
				System.out.println(num1+" "+num3+" "+num2);
			}
			
		else if (num2<=num1&&num2<=num3){
			if(num1<=num3)
				System.out.println(num2+" "+num1+" "+num3);
			else 
				System.out.println(num2+" "+num3+" "+num1);
			}
		else {
			if(num2<=num1)
				System.out.println(num3+" "+num2+" "+num3);
			else 
				System.out.println(num3+" "+num1+" "+num2);
			}
		
	}
}