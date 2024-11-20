import java.util.Calendar;

public abstract class BankAccount {
	protected int balance; 
	protected double interestRate; 
	protected String accountNumber;

	
	public BankAccount(int balance, double interestRate, String accountNumber) {
		this.balance = balance; 
		this.interestRate = interestRate; 
		this.accountNumber = accountNumber; 
	}
	
	public String getAccountNumber() {
		return accountNumber; 
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public abstract int deposit(int amount);
	public abstract int withdraw(int amount);
	public abstract void applyInterest();
	public abstract String getInfo();
}
