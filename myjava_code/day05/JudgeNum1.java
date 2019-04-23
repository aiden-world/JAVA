import java.util.Scanner;
public class JudgeNum1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字");
		int num = input.nextInt();
		int ran = (int)	(Math.random()*100);
		int count =  1;
		//System.out.println(ran);
		while(num!=ran) {
			if(num>ran) {
				System.out.println("大了");
				num = input.nextInt();
				count++;
			}
			
			if(num<ran) {
				System.out.println("小了");
				num = input.nextInt();
				count++;
			}
		}
		System.out.println("猜对了，随机数为"+ran+",一共猜了"+count+"次");
		
	}
}
