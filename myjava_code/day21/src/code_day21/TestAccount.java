package code_day21;

public class TestAccount {
	public static void main(String[] args) {
		try {
			Account a1 = new Account("1122",20000.0,4.5);
			//Account a2 = new Account("1122",20000.0,4.5);
			a1.withdraw(30000, "1122");
			System.out.println("余额为"+a1.getBalance());
			a1.withdraw(2500, "1122");
			System.out.println("余额为"+a1.getBalance());
		 	
			a1.deposit(3000, "1122");
			System.out.println("余额为"+a1.getBalance());
			System.out.println("余额为"+a1.getBalance()+"月利率为"+
			a1.getMonthlyInterestRate()+"年利息为"+a1.getAnnualInterestRate()/100*a1.getBalance());
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
