import java.util.Scanner;
public class LotteryGame{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�н���Ʊ��λ���뿪ʼ�������");
		int randomSeed = (int)(Math.random()*90+10);
		System.out.println("�н���Ʊ��λ�����Ѿ����ɣ������������λ����Ʊ����");
		//System.out.println(randomSeed);
		int yourLottery = input.nextInt();
		if(yourLottery==randomSeed)
			 System.out.println("��ϲ�㣬��ý���10 000��Ԫ");
		else if(((yourLottery%10)*10+(yourLottery/10))==randomSeed)
			System.out.println("��ϲ�㣬��ý���3 000��Ԫ");
		else if(yourLottery%10==randomSeed%10||yourLottery/10==randomSeed/10)
			System.out.println("��ϲ�㣬��ý���1 000��Ԫ");
		else if(yourLottery%10==randomSeed/10||yourLottery/10==randomSeed%10)
			System.out.println("��ϲ�㣬��ý���500��Ԫ");
		else 
			System.out.println("���ź���δ�н�����Ʊ����");
	}
}