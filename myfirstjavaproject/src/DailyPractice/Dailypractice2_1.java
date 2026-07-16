package DailyPractice;

public class Dailypractice2_1 {
	/*Mobile Recharge
1.Write a Java program to demonstrate the following types of methods:
1.No Return Type + No Arguments
Create a method void showPlanDetails() to display the current recharge plan.
	Output for no arguments
	Current Recharge Plan
	Plan Name : Unlimited 299
	Validity  : 28 Days
	Data      : 1.5 GB/Day
	Calls     : Unlimited */
	public static void main(String[] args)
	{
		Dailypractice2_1 d1=new Dailypractice2_1();
		d1.showPlanDetails();
	}
	void showPlanDetails()

	{
		String planName="Unlimited 299";
		int validity=28;
		double data=1.5;
		String calls="unlimited";
		 
		
		System.out.println("Current Recharge Plan :");
		System.out.println("Plan Name : "+planName);
		System.out.println("Validity  : "+validity);
		System.out.println("Data      :"+data);
		System.out.println("Calls     :"+calls);
		
	}
}
