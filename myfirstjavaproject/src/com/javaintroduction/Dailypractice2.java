package com.javaintroduction;

public class Dailypractice2 {

	double balance=10000;
	 void main(String[] args) {
		
show();
//call by value
show("praveen");
display();
deposit(5000);	
hello();
withdraw(2000);
		
	}
	 void show()
	 {
		 System.out.println("heloo");
	 }
	void show(String name)
	{
		System.out.println("hello your na e is :"+name);
	}
	void display()
	{
		System.out.println("the balcne is :"+balance);
	}
	void deposit(double amount)
	{
		balance=balance+amount;
		display();
	}
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance=balance-amount;
		}
		else
		{
			System.err.println("transaction failed");
		}
		display();
	}
	void hello()
	{
		double d=10.9878;
		System.out.println(String.format("%.2f",d));
	}
	

}
