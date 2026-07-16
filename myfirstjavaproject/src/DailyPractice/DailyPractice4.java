package DailyPractice;
import java.util.Scanner;
public class DailyPractice4 {

	static Scanner sc=new Scanner(System.in);
	static double getPrice()
	{
		double price=0;
		System.out.println("enter price:");
		return sc.nextDouble();
	}
	
	public static void main(String[] args) {


		System.out.println("Main method started");
		System.out.println("the price is:"+getPrice());

	}

}
