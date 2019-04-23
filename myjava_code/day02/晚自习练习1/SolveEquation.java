import java.util.Scanner;
public class SolveEquation{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("解方程ax^2+bx+c=0");
		System.out.println("请输入方程参数a");
		double a = input.nextDouble();
		System.out.println("请输入方程参数b");
		double b = input.nextDouble();
		System.out.println("请输入方程参数c");
	    double c = input.nextDouble();
		if(!(a==0)){
		    double  p = b*b-4*a*c;
		    if(p>0)
			System.out.println("方程有两个解"+((-b+Math.sqrt(p))/2*a)+"和"+((-b-Math.sqrt(p))/2*a));
			if(p==0)
			System.out.println("方程有唯一解"+(-b/2*a));
			if(p<0)
			System.out.println("方程无解");
		}
		else { 
		    if(!(b==0))  
			System.out.println("方程有唯一解"+(-c/b));
			else 
			System.out.println("方程无解");
		}
	}
}