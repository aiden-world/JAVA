package day13_homework;

public abstract class Sportsman extends Person{
	public abstract void play() ;
	}


	class TableTennisSportsman extends Sportsman implements LearningEnglish{
		public  void play() {System.out.println("打乒乓球");} 
		public  void learn() {System.out.println("学习关于用英语交流比赛问题");} 
		public TableTennisSportsman(String n) {
			name = n;	
		} 
	}

	class BasketballSportsman extends Sportsman {
		public  void play() {System.out.println("打篮球");} ;
		public BasketballSportsman(String n) {
			name = n;	
		} 
	}