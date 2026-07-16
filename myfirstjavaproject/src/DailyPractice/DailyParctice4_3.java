package DailyPractice;
import java.util.Scanner;

public class DailyParctice4_3 {
	static double calculateInterest(double principal, double rate, int time)
	{
		double si=(principal*time*rate)/100;
		return si;
	}
	/*1000
	 Today Task
Java
1.Loan Interest
Scenario: A bank wants to calculate the simple interest for a customer.
2.Create a method calculateInterest(double principal, double rate, int time) that returns the simple interest.
3.Read the principal amount, rate of interest, and time using Scanner.
4.Call the method and display the simple interest.
5.Formula Used:
Simple Interest = (Principal × Rate × Time) / 100
	 */
	 
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter principal amount:");
	  double principal=sc.nextDouble();
	  System.out.println("enter time :");
	  int time=sc.nextInt();
	  System.out.println("enter rate:");
	  double rate=sc.nextDouble();
	  double si=calculateInterest(principal,rate,time);
	  System.out.println("simple interst is :"+si);
	  sc.close();
	  
  }
}
