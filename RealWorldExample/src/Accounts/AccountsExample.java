package Accounts;

//Creating a test class to deposit and withdraw amount  
public class AccountsExample {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.insert(39275482, "Dileepkumar", 1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
	}
}
