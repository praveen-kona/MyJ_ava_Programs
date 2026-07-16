package DailyPractice;

public class DailyPractice1 {
	void displayAccount()
	{
		System.out.println("Account number : 1234567889");
		System.out.println("Account holder : Praveen");
		System.out.println("Account type: savings account");
		System.out.println("Balance : 300000");
	}

	public static void main(String[] args) 
	{
		/*1.Problem Statement:
			Write a Java program to create a method that displays the details of a bank account.
			Requirements:
			1.Create a class named BankAccount.
			2.Create a method displayAccount() with no arguments and no return type.
			3.Inside the method, display Account Number, Account Holder Name, Account 
			4.Type, and Balance.
			Call the method from the main() method.*/
		DailyPractice1 d1=new DailyPractice1();
		d1.displayAccount();
	}

}
