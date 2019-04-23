/*
family：Father and mother I love you.
*/
class FamilyAccount{
	public static void main(String[] args){
		boolean flag = true;//为true循环
		int balance = 10000;
		String details = "收支\t账户金额\t收支金额\t说    明\n";
		
		while(flag){
			System.out.println("-----------------家庭收支记账软件-----------------");

			System.out.println("\t\t1 收支明细");
			System.out.println("\t\t2 登记收入");
			System.out.println("\t\t3 登记支出");
			System.out.println("\t\t4 退    出");

			System.out.print("\t\t请选择(1-4)：");
			//select变量中存的是用户的选择
			char select = Utility.readMenuSelection();
			
			switch(select){
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println(details);
					break;
				case '2':
					System.out.print("本次收入金额：");
					int money = Utility.readNumber();
					
					System.out.print("本次收入说明：");
					String str = Utility.readString();
					
					//修改余额和明细记录
					balance += money;
					details += "收入\t" +money +"\t\t" + balance +"\t\t"+ str +"\n";//拼接收入的明细
					break;
				case '3':	
					System.out.print("本次支出金额：");
					money = Utility.readNumber();
					
					System.out.print("本次支出说明：");
					str = Utility.readString();
					
					//修改余额和明细记录
					balance -= money;
					details += "支出\t" +money +"\t\t" + balance +"\t\t"+ str +"\n";//拼接支出的明细
					break;
				case '4':
					System.out.print("确认是否退出(Y/N)：");
					char  c = Utility.readConfirmSelection();
					if(c == 'Y'){
						flag = false;
					}
					break;				
			}
		}
	}
}