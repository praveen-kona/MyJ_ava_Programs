package OOPS;
class BankAccount
{
	private double balance;
	
	
	void deposit(int amount)
	{
		balance=amount+(int)balance;
		
	}
	void withdraw(int amount) {
		if(balance>amount)
		 balance -= amount;
		
	}
	int getBalance() {
		return (int)balance;

	}
	
}
public class Day1Task4_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();

		account.deposit(7000);
		account.withdraw(10000);

		System.out.println(account.getBalance());

	}

}
