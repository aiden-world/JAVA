import java.util.Scanner;
public class JudgeDay{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请依次输入年，月，日");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int[] fixMonth=new int[]{31 ,29 ,31 ,30, 31, 30, 31, 31, 30, 30, 30, 31};
		if((year%4==0&&year%100!=0)||year%400==0)
		fixMonth[1]=28;
		int allDay = 0;
		for(int i=0;i<=month-2;i++)  allDay +=fixMonth[i]; 
		allDay += day;
		System.out.println("这一年的第"+allDay+"天");
		}
}