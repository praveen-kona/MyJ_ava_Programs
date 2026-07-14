package com.javaintroduction;

public class DailyPractice2_3 {

	public static void main(String[] args) {
		DailyPractice2_3 d1=new DailyPractice2_3();
		double recharge_amount=299;
		d1.recharge(recharge_amount);
		// TODO Auto-generated method stub
		/*2.No Return Type + With Arguments
Create a method void recharge(double amount) to accept the recharge amount and display the successful recharge message.
Output for argument
Recharge Successful!
Recharge Amount : ₹299.0 */

	}
	void recharge(double amount)
	{
		System.out.println("Reacharge Successfull");
		System.out.println("Recharge amount:"+amount);
	}

}
