import java.util.Scanner;
public class JudgeDoWhat {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("请依次输入年，月，日");
			int year = input.nextInt();
			int month = input.nextInt();
			int day = input.nextInt();
			CorrectFormat1 c = new CorrectFormat1();
			if(c.isCorrectFormat1(year,month,day)) {
				JudgeDayNumOperator j = new JudgeDayNumOperator();
				int day0=j.JudgeDayNumOperate(year, month, day);
				//System.out.println(day0);	
				int leapyearsum = 0;
				for (int iy = 2000;iy<year;iy++) {
					if((iy%4==0&&iy%100!=0)||iy%400==0)
						leapyearsum++;
				}
			int allDay = day0+(year-2000)*365+leapyearsum ;
			//System.out.println(allDay);	
			if(allDay%5<=3&&allDay%5!=0) System.out.println("今天打鱼");
			else System.out.println("今天晒网");	
			}		
			}
}

class  CorrectFormat1  {  
	boolean isCorrectFormat1(int year,int month,int day) {
	if(year <2000)  {
		System.out.println("输入的年份错误");
		return  false;  }
	else if(month<=0||month>12) {
		System.out.println("输入的月份错误");
		return  false;  }
	else if(day<=0||day>31||(day==31&&(month!=1&&month!=3&&month!=5
			&&month!=7&&month!=8&&month!=10&&month!=12))
			||(month==2&&day>29)||(!((year%4==0&&year%100!=0)||
					year%400==0)&&month==2&&day==29))  {
		System.out.println("输入的日子错误");
		return  false; }
	else return true ;
}
}