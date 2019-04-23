//练习5：假设今天是周4，100天以后是周几？
public class CalTime{
	public static void main(String[] args){
		int today =4;
		int after100 = (today+100)%7;
		System.out.println("100天后是周"+after100);
	}
}