import java.util.Scanner;
public class SolveEquation{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("�ⷽ��ax^2+bx+c=0");
		System.out.println("�����뷽�̲���a");
		double a = input.nextDouble();
		System.out.println("�����뷽�̲���b");
		double b = input.nextDouble();
		System.out.println("�����뷽�̲���c");
	    double c = input.nextDouble();
		if(!(a==0)){
		    double  p = b*b-4*a*c;
		    if(p>0)
			System.out.println("������������"+((-b+Math.sqrt(p))/2*a)+"��"+((-b-Math.sqrt(p))/2*a));
			if(p==0)
			System.out.println("������Ψһ��"+(-b/2*a));
			if(p<0)
			System.out.println("�����޽�");
		}
		else { 
		    if(!(b==0))  
			System.out.println("������Ψһ��"+(-c/b));
			else 
			System.out.println("�����޽�");
		}
	}
}