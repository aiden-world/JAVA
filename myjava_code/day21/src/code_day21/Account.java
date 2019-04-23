package code_day21;

public class Account {
	private String id;
	private double balance ;
	private double annualInterestRate;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Account(String id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() { return annualInterestRate/12/100 ;}
	public double getMonthlyInterest() {return annualInterestRate/12/100 *balance;}
	public double withdraw(double money,String id) throws RuntimeException {
		if(!id.equals(this.id)) throw new AccountException(id) ;
		balance -= money;
		return money;
	} 
	public double deposit(double money,String id) throws AccountException{
		if(!id.equals(this.id)) throw new AccountException(id) ;
		balance += money;
		return money;
	}

}



class AccountException extends RuntimeException
{

	public AccountException() {
	super();
	System.out.println("账户id输入错误");
}

	public AccountException(String message) {
		super(message);
		System.out.println(message+"账户id输入错误");
	}

}