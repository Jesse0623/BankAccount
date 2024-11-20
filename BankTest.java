import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


public class BankTest {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int i;
	
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add (new Checking(10000, 0.02, "AC785689", 5));
		accounts.add (new Checking(15000, 0.02, "AC123899", 5));
		accounts.add (new Savings(100000, 0.03, "AS785689"));
		accounts.add (new Savings(1250000, 0.04, "AS345678"));

		while (true){
			System.out.println("Enter the customer account number");
			String accountNumber = keyboard.nextLine();
			for (i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
					break;
			}	
		}
			if (i == accounts.size())
				System.out.println("Account number not found");
	
			 

			else {
				while (true){
					System.out.println("Enter 1, 2, or 3 for the option you want:");
					System.out.println("1: deposit money");
					System.out.println("2: withdraw money");
					System.out.println("3: print account details");
					String input = keyboard.nextLine();
					int option = Integer.parseInt(input);
		

					switch (option){
						case 1: 
						System.out.println("Enter deposit amount:");
						String amount1 = keyboard.nextLine();
						int dep_amount = Integer.parseInt(amount1);
						accounts.get(i).deposit(dep_amount);
						break;
		
						case 2:
						System.out.println("Enter withdraw amount:");
						String amount2 = keyboard.nextLine();
						int with_amount = Integer.parseInt(amount2);
						accounts.get(i).withdraw(with_amount);
						break;
						
						case 3:
						System.out.println(accounts.get(i).getInfo());
					}
	
					System.out.println("Enter Y to continue with this account:");
					String input1 = keyboard.nextLine();
					if(!input1.equals("Y")){
						break;
						}
					}
			}
			System.out.println("Enter Y to continue with another account:");
			String input2 = keyboard.nextLine();
			if(!input2.equals("Y")){
				System.out.println(LocalDate.now().toString());
				System.out.println("Thank you for visiting our bank today!!");
				break;
	
	
	}
	
			
			
		}
	

}

}
