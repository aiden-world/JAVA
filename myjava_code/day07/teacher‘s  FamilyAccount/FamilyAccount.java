/*
family��Father and mother I love you.
*/
class FamilyAccount{
	public static void main(String[] args){
		boolean flag = true;//Ϊtrueѭ��
		int balance = 10000;
		String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
		
		while(flag){
			System.out.println("-----------------��ͥ��֧�������-----------------");

			System.out.println("\t\t1 ��֧��ϸ");
			System.out.println("\t\t2 �Ǽ�����");
			System.out.println("\t\t3 �Ǽ�֧��");
			System.out.println("\t\t4 ��    ��");

			System.out.print("\t\t��ѡ��(1-4)��");
			//select�����д�����û���ѡ��
			char select = Utility.readMenuSelection();
			
			switch(select){
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println(details);
					break;
				case '2':
					System.out.print("���������");
					int money = Utility.readNumber();
					
					System.out.print("��������˵����");
					String str = Utility.readString();
					
					//�޸�������ϸ��¼
					balance += money;
					details += "����\t" +money +"\t\t" + balance +"\t\t"+ str +"\n";//ƴ���������ϸ
					break;
				case '3':	
					System.out.print("����֧����");
					money = Utility.readNumber();
					
					System.out.print("����֧��˵����");
					str = Utility.readString();
					
					//�޸�������ϸ��¼
					balance -= money;
					details += "֧��\t" +money +"\t\t" + balance +"\t\t"+ str +"\n";//ƴ��֧������ϸ
					break;
				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y/N)��");
					char  c = Utility.readConfirmSelection();
					if(c == 'Y'){
						flag = false;
					}
					break;				
			}
		}
	}
}