import java.util.Scanner;
public class GetCommonDivisor {
	public static void main(String[] args) {
		//long start = System.currentTimeMillis();
		Scanner input =new Scanner(System.in);
		System.out.println("����������������");
		long n1 = input.nextLong();
		long n2 = input.nextLong();
		long min = (n1>n2?n2:n1);
		long max = (n1>n2?n1:n2);
		long i = 0;
		long j = 0;
		long start = System.currentTimeMillis();
		for( i=min;i>=1;i--) {
			if(n1%i==0&&n2%i==0) {
				System.out.println("���Լ��Ϊ"+i);
				break;
			}
		}
		//long start = System.currentTimeMillis();
//		for( j=max;j<=n2*n1;j+=i) {
//			if(j%n1==0&&j%n2==0) {
//				System.out.println("��С������Ϊ"+j);
//				break;
//			}
//		}
		System.out.println("��С������Ϊ"+n1*n2/i);
		long end = System.currentTimeMillis();
		System.out.println("����ʱ�䣺"+(end - start));

	}
}
