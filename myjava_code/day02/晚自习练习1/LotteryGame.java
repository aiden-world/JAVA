import java.util.Scanner;
public class LotteryGame{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("中奖彩票两位号码开始随机生成");
		int randomSeed = (int)(Math.random()*90+10);
		System.out.println("中奖彩票两位号码已经生成，请输入你的两位数彩票号码");
		//System.out.println(randomSeed);
		int yourLottery = input.nextInt();
		if(yourLottery==randomSeed)
			 System.out.println("恭喜你，获得奖金10 000美元");
		else if(((yourLottery%10)*10+(yourLottery/10))==randomSeed)
			System.out.println("恭喜你，获得奖金3 000美元");
		else if(yourLottery%10==randomSeed%10||yourLottery/10==randomSeed/10)
			System.out.println("恭喜你，获得奖金1 000美元");
		else if(yourLottery%10==randomSeed/10||yourLottery/10==randomSeed%10)
			System.out.println("恭喜你，获得奖金500美元");
		else 
			System.out.println("很遗憾，未中奖，彩票作废");
	}
}