import java.util.Scanner;
public class TestSwitch{
	public static void main(String[] args){
		int agenow =23;
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
	    switch (age){ 
		    case 17 :System.out.println("choose the worst major"); break;
			case 21 :System.out.println("waste the four year and enter the HAND"); break;
			case 22 :System.out.println("take postgraduate entrance exams ,then fail, nothing "); break;
			case 23 :System.out.println("spend money for IT training"); break;
			case 24 :System.out.println("I don't know ,but life alaway going,be optimistic"); break;
			default :System.out.println("The World is fascinating,enjoy your life");
		}
		
	}
	
}