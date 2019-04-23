package com.atguigu.exam;

/*
 * 
 */
public class TestExam4 {
	public static void main(String[] args) {
		Week today = Week.getWeek(1);
		System.out.println(today);
		
		Week w = Week.getWeek(0);
		System.out.println(w);
	}
}
enum Week{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	/*
	public static Week getWeek(int number){
		switch(number){
		case 0:
			return SUNDAY;
		....
		default:
			return null;
		}
	}
	*/
	public static Week getWeek(int number){
		Week[] all = Week.values();
		if(number>=0 && number<=6){
			return all[number];
		}
		return null;
	}
}