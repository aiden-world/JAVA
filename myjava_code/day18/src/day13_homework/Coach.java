package day13_homework;

public abstract class Coach extends Person{
	public abstract void teach() ;
}


class TableTennisCoach extends Coach implements LearningEnglish{
	public  void teach() {System.out.println("教授如何打乒乓球");} 
	public  void learn() {System.out.println("学习关于用英语交流教学问题");}
	public TableTennisCoach(String n) {
		name = n;	
	} 
	
}

class BasketballCoach extends Coach {
	public  void teach() {System.out.println("教授如何打篮球");} ;
	public BasketballCoach(String n) {
		name = n;	
	} 
}