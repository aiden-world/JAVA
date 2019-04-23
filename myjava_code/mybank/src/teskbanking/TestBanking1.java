
package teskbanking;
import mybanking1.*;

public class TestBanking1 {

  public static void main(String[] args) {
    Account  account;

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating an account with a 500.00 balance.");
    account = new Account(500.00);
	//code
    account.withdraw(150.00);
    System.out.println("Withdraw 150.00");
   	//code
    account.deposit(22.50);
    System.out.println("Deposit 22.50");
   
	//code
    account.withdraw(47.62);
    System.out.println("Withdraw 47.62");
   	//code
    // Print out the final account balance
    System.out.println("The account has a balance of " + account.getBalance());
  }
}
