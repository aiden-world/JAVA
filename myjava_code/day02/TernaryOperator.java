import java.util.Scanner;
public class TernaryOperator {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������������");
		double a= s.nextDouble();
		double b= s.nextDouble();
		double c= s.nextDouble();
		System.out.println("���ֵΪ"+((a>=b&&a>=c)?a:(b>=a&&b>=c)?b:c));
		System.out.println(-8>>>3);
		int p=2;
		p *=p++;
		System.out.println(p);
	}
}