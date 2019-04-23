
public class Account {
	private String id ;
	private double balance ;
	private double annualInterestRate ;

	public Account(String id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return this.annualInterestRate/12;
	}

	public boolean deposit(double amount) {
		balance +=amt; return true;
		}
	public boolean withdraw(double amount) {
		if(balance>=amt) {
		balance -=amt;
		return true;
		}
		else {
			System.out.println("����!");
			return false;
		}
		}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
}