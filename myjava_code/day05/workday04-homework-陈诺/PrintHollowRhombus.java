//import java.util.Scanner;
public class PrintHollowRhombus {
	public static void main(String[] args) {
		//System.out.println("请输入需要打印的菱形边长(空心菱形)");
		//Scanner input = new Scanner(System.in);
		//int p = input.nextInt() ;
		int p = 5;
		for(int i=0;i<p;i++) {
			int m1=p-i ;
			int m2=p+i ;
			for(int j=0;j<2*p;j++) {
				if(j!=m1&&j!=m2) System.out.print(" ");
				else System.out.print("*");
			}	
			System.out.println();
		}
		for(int i=0;i<p-1;i++) {
			int m1=2*p-(i+2) ;
			int m2=i+ 2;
			for(int j=0;j<2*p;j++) {
				if(j!=m1&&j!=m2) System.out.print(" ");
				else System.out.print("*");
			}	
			System.out.println();
		}
	}
	
}