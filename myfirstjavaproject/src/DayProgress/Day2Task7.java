package DayProgress;
import java.util.Scanner;

public class Day2Task7 {

	static String eligible(int age,boolean isCitizen)
	{
		if(age>=18 && isCitizen)
			return "Eligible to Vote";
		else
			return "Not Eligible to Vote";
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		System.out.println("Are you a citizen? (true/false):");
		boolean isCitizen=sc.nextBoolean();
		System.out.println(eligible(age,isCitizen));
	}

}
