package Project1;
public class FamliyAccount {
	public static void main(String[] args) {
		int balance =  10000;
		boolean flag = true;
		String details = "��֧    ��֧���	  �˻����	         ˵  �� ";
		int money =0;
		String str ="";
		
		while(flag) {
		System.out.println("-------------��ͥ��֧�������-------------");
		System.out.println("\t\t1 ��֧��ϸ");
		System.out.println("\t\t2 �Ǽ�����");
		System.out.println("\t\t3 �Ǽ�֧��");
		System.out.println("\t\t4 ��    ��");
		System.out.print("\t\t��ѡ��(1-4)��");
		char select = Utility.readMenuSelection();
		switch (select-'0') {
		case 1:
			System.out.println("-----------------��ǰ��֧��ϸ��¼----------------- ");
			System.out.println(details);
			break;
		case 2:
			 money = Utility.readNumber();
			balance += money;
			 str = Utility.readString();
			details = details+"\n"+"����    "+money+"\t"+balance+"\t"+str ;
			break;
		case 3:
			 money = Utility.readNumber();
			balance -= money;
			 str = Utility.readString();
			details = details+"\n"+"֧��    "+money+"\t"+balance+"\t"+str ;	
			break;
			
		case 4:
			System.out.print("ȷ���Ƿ��˳�(Y/N)");
			char  yn = Utility.readConfirmSelection();
			if(yn=='Y') flag = false ;
			break;
		}
		
		}
		

	}
}

