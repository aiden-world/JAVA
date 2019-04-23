
public class Account {
	private double  balance ;
	private String cid ;
	private Customer customer ;
	public Account() {}
	public Account(double init_balance,String c,Customer cu) {
		balance = init_balance ;
		cid = c;
		customer = cu;
		}
	public double getBalance() {return balance ;}
	public boolean save(double amt) {
		balance +=amt; return true;
		}
	public boolean withdraw(double amt) {
		if(balance>=amt) {
		balance -=amt;
		return true;
		}
		else {
			System.out.println("Óà¶î²»×ã!");
			return false;
		}
		}
	public String getInfo() {
		return "¿¨ºÅ="+cid+"  Óà¶î="+balance+"  ËùÊôÓÃ»§="+customer.getName();
	}

}

