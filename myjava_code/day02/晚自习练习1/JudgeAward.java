import java.util.Scanner;
public class JudgeAward{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("请输入小明的期末成绩");
		int score = input.nextInt();
		if(score>=0&&score<=100){
		if (score==100) 
		System.out.println("奖励一台BMW");
		else if(score>80&&score<=99)
		System.out.println("奖励一台iphone7plus");
		else if(score>=60&&score<=80)
		System.out.println("奖励一个 iPad");
		else 
		System.out.println("没有奖励");
		}
		else 
		System.out.println("分数输入错误");
	}
}
