import java.util.Scanner;
public class CountNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		int i = input.nextInt();
		int countPositiveNum = 0;
		int countNegativeNum = 0;
		while(!(i==0)) {
			if (i>0) countPositiveNum++;
			if(i<0)  countNegativeNum++;
			 i = input.nextInt();
		}
		System.out.println("��������Ϊ"+countPositiveNum+"����������Ϊ"+countNegativeNum);
	}
}
