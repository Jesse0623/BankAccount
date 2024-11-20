import java.time.LocalDate;

public class Checking extends BankAccount {
	private int overdraftFee;

	public Checking(int balance, double interestRate, String accountNumber, int overdraftFee) {
		super(balance, interestRate, accountNumber);
		this.overdraftFee = overdraftFee;
	}
	
	public int getFee() {
		return this.overdraftFee;
	}
	
	public void setFee(int overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	public int deposit(int amount) {
		setBalance(getBalance() + amount);
		int day = LocalDate.now().getDayOfMonth();
		if (day > 27) {
			applyInterest();
		}
		return getBalance();
	}
	
	public int withdraw(int amount) {
		int balance = getBalance();
		if (balance < 0) {
			balance -= (amount + overdraftFee);
		}
		else {
			balance -= amount;
		setBalance(balance);
		}
		return balance;
		
	}
	
	public void applyInterest() {
		int balance = getBalance();
		balance += (balance * interestRate);
		setBalance(balance);	
	}
	
	
	public String getInfo() {
		String info = "Checking account number: " + getAccountNumber() + "\n";
		info = info + "Balance is: " + getBalance();
		return info; 
		
	}
	

}
