package day13_homework;

public class TestManage {
	public static void main(String[] args) {
		Manager mag = new Manager();
		for(int i=0;i<mag.getAllCoach().length;i++) {
			System.out.print(mag.getAllCoach()[i].name+"\t"+mag.getAllCoach()[i].getClass()+"\t");
			mag.getAllCoach()[i].teach();
		}
		for(int i=0;i<mag.getAllSportsman().length;i++) {
			System.out.print(mag.getAllSportsman()[i].name+"\t"+mag.getAllSportsman()[i].getClass()+"\t");
			mag.getAllSportsman()[i].play();
		}
		for(int i=0;i<mag.getPersonEnglish().length;i++) {
			System.out.print(((Person)mag.getPersonEnglish()[i]).name+"\t"+mag.getPersonEnglish()[i].getClass()+"\t");
			mag.getPersonEnglish()[i].learn();
		}
		
	}
}
