import java.util.Scanner;
public class GuessNumGame{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random()*5+1);
		int num2 = (int)(Math.random()*5+1);
		int num3 = (int)(Math.random()*5+1);
		//double i=Math.random()*90;System.out.println(i);
        int valueSum = num1+num2+num3;
		String valueStr = "";
		if(num1==num2&&num1==num3) 
			valueStr = "豹子";
		else if (valueSum>=9)
			valueStr = "大";
		else 
			valueStr = "小";
		//System.out.println(num1+" "+num2+" "+num3);
		//System.out.println(valueStr);
		System.out.println("请输入你的押宝（豹子，大，小）");
		String Guess = input.next();
		//System.out.println(Guess+valueStr);
		if(Guess.equals (valueStr))
			System.out.println("恭喜你猜对了");
        else	
			System.out.println("很遗憾，你猜错了");	
	}
}