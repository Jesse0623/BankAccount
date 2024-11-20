import java.util.Calendar;

public class Savings extends BankAccount {

	public Savings(int balance, double interestRate, String accountNumber) {
		super(balance, interestRate, accountNumber);
	}
	
	public int deposit(int amount) {
		setBalance(getBalance() + amount);
		applyInterest();
		return getBalance();	
		}

	public int withdraw(int amount) {
		setBalance(getBalance() - amount);
		applyInterest();
		return getBalance();	
	}
	
	public void applyInterest() {
		int balance = getBalance();
		balance += (balance * 2 * getInterestRate());
		setBalance(balance);
	}
	
	public String getInfo() {
		String info = "Checking account number: " + getAccountNumber() + "\n";
		info = info + "Balance is: " + getBalance();
		return info; 	
	}

}
