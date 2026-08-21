package DayProgress;

import java.util.Scanner;

public class Day2Task2 {
	static void eligible(int age)
	{
		if(age >= 18)
			System.out.println("Yes Your'e Eligible to vote");
		else
			System.out.println("Your'e not Eligible to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Your Age: ");
				int age=sc.nextInt();
				eligible(age);

	}

}
