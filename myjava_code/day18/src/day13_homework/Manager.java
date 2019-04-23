package day13_homework;

public class Manager {
	Person[] per;
	public Manager(){
		per = new Person[4];
		per[0] = new TableTennisCoach("刘国梁");
		per[1] = new BasketballCoach("米奇");
		per[2] = new TableTennisSportsman("马龙");
		per[3] = new BasketballSportsman("姚明");	
	}
	
	
	public Coach[] getAllCoach() {
		Coach[] coa = new Coach[2];
		for(int i=0,j=0;i<per.length;i++) {
			if(per[i] instanceof Coach) {
				coa[j] =  (Coach)per[i];
				j++;
		}		
	}
		return coa;
	}
	

	public Sportsman[] getAllSportsman() {
		Sportsman[] spt = new Sportsman[2];
		for(int i=0,j=0;i<per.length;i++) {
			if(per[i] instanceof Sportsman) {
				spt[j] =  (Sportsman)per[i];
				j++;
		}		
	}
		return spt;
	}

	public LearningEnglish[] getPersonEnglish() {
		LearningEnglish[] le = new LearningEnglish[2];
		for(int i=0,j=0;i<per.length;i++) {
			if(per[i] instanceof LearningEnglish) {
				le[j] =  (LearningEnglish)per[i];
				j++;
		}		
	}
		return le;
	}
	
	
	
}
