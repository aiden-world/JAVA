import java.util.Scanner;
public class JudgeNum1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		int num = input.nextInt();
		int ran = (int)	(Math.random()*100);
		int count =  1;
		//System.out.println(ran);
		while(num!=ran) {
			if(num>ran) {
				System.out.println("����");
				num = input.nextInt();
				count++;
			}
			
			if(num<ran) {
				System.out.println("С��");
				num = input.nextInt();
				count++;
			}
		}
		System.out.println("�¶��ˣ������Ϊ"+ran+",һ������"+count+"��");
		
	}
}
