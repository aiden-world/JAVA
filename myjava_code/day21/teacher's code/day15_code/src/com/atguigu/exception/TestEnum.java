package com.atguigu.exception;

public class TestEnum {

}
enum Week{
	SUNDAY,MONDAY;
	
	public static Week getWeek(int number) throws Exception{
		Week[] all = Week.values();
		if(number<0 || number>6){
			throw new Exception("星期的数字范围是0-6");
		}
		return all[number];
	}
}