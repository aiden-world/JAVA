//import java.util.Scanner;
public class PrintSoildRhombus {
	public static void main(String[] args) {
		//System.out.println("请输入需要打印的菱形边长(实心菱形)");
		//Scanner input = new Scanner(System.in);
		//int p = input.nextInt() ;
		int p = 5;
		for(int i=0;i<p;i++) {
			int m1=p-i ;
			int m2=1+2*i ;
			for(int j=0;j<m1;j++)
				System.out.print(" ");
			for(int k=0;k<m2;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<p-1;i++) {
			int m1=i+1 ;
			int m2=2*(p-i-1)-1 ;
			for(int j=0;j<=m1;j++)
				System.out.print(" ");
			for(int k=0;k<m2;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
}