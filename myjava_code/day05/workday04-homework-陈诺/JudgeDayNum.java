import java.util.Scanner;
public class JudgeDayNum {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("�����������꣬�£���");
			int year = input.nextInt();
			int month = input.nextInt();
			int day = input.nextInt();
			JudgeDayNumOperator j = new JudgeDayNumOperator();
			if(j.JudgeDayNumOperate(year, month, day)!=0)
			System.out.println("��һ��ĵ�"+j.JudgeDayNumOperate(year, month, day)+"��");	
		}
	}

class  CorrectFormat  {  
	boolean isCorrectFormat(int year,int month,int day) {
	if(month<=0||month>12) {
		System.out.println("������·ݴ���");
		return  false;  }
	else if(day<=0||day>31||(day==31&&(month!=1&&month!=3&&month!=5
			&&month!=7&&month!=8&&month!=10&&month!=12))
			||(month==2&&day>29)||(!((year%4==0&&year%100!=0)||
					year%400==0)&&month==2&&day==29))  {
		System.out.println("��������Ӵ���");
		return  false; }
	else return true ;
}
}

class 	JudgeDayNumOperator{
	int JudgeDayNumOperate (int year,int month,int day) {
	int[] fixMonth=new int[]{31 ,28 ,31 ,30, 31, 30, 31, 31, 30, 31, 30, 31};
	CorrectFormat c = new CorrectFormat();
	if(c.isCorrectFormat(year,month,day)) {
	if((year%4==0&&year%100!=0)||year%400==0)
	fixMonth[1]=29;
	int allDay = 0;
	for(int i=0;i<=month-2;i++)  allDay +=fixMonth[i]; 
	allDay += day;
	return allDay ;
	}
	else { 
		System.out.println("�޷�����");
		return 0;
	}
}
}	