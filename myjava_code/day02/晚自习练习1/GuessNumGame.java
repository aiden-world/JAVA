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
			valueStr = "����";
		else if (valueSum>=9)
			valueStr = "��";
		else 
			valueStr = "С";
		//System.out.println(num1+" "+num2+" "+num3);
		//System.out.println(valueStr);
		System.out.println("���������Ѻ�������ӣ���С��");
		String Guess = input.next();
		//System.out.println(Guess+valueStr);
		if(Guess.equals (valueStr))
			System.out.println("��ϲ��¶���");
        else	
			System.out.println("���ź�����´���");	
	}
}