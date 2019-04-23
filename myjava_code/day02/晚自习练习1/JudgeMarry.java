import java.util.Scanner;
public class JudgeMarry{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入身高(厘米)");
		double high = input.nextDouble();
		System.out.println("请输入财富(万)");
		double wealth = input.nextDouble();
		System.out.println("帅吗(true or false");
		Boolean isHandsome = input.nextBoolean();
		int i=0;
		if (high>=180) i++;
		if (wealth>=1000) i++;
		if (isHandsome==true) i++;
		switch (i){
		case 3 : System.out.println("我一定要嫁给他!!!"); break;
		case 2 : System.out.println("嫁吧，比上不足，比下有余。"); break;
		case 1 : System.out.println("嫁吧，比上不足，比下有余。"); break;
		case 0 : System.out.println("不嫁!"); break;
		}
	}
}
		
		