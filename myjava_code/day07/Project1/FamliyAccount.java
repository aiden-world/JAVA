package Project1;
public class FamliyAccount {
	public static void main(String[] args) {
		int balance =  10000;
		boolean flag = true;
		String details = "收支    收支金额	  账户金额	         说  明 ";
		int money =0;
		String str ="";
		
		while(flag) {
		System.out.println("-------------家庭收支记账软件-------------");
		System.out.println("\t\t1 收支明细");
		System.out.println("\t\t2 登记收入");
		System.out.println("\t\t3 登记支出");
		System.out.println("\t\t4 退    出");
		System.out.print("\t\t请选择(1-4)：");
		char select = Utility.readMenuSelection();
		switch (select-'0') {
		case 1:
			System.out.println("-----------------当前收支明细记录----------------- ");
			System.out.println(details);
			break;
		case 2:
			 money = Utility.readNumber();
			balance += money;
			 str = Utility.readString();
			details = details+"\n"+"收入    "+money+"\t"+balance+"\t"+str ;
			break;
		case 3:
			 money = Utility.readNumber();
			balance -= money;
			 str = Utility.readString();
			details = details+"\n"+"支出    "+money+"\t"+balance+"\t"+str ;	
			break;
			
		case 4:
			System.out.print("确认是否退出(Y/N)");
			char  yn = Utility.readConfirmSelection();
			if(yn=='Y') flag = false ;
			break;
		}
		
		}
		

	}
}

