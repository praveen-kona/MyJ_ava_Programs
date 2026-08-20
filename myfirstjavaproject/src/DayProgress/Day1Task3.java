package DayProgress;
import java.util.Scanner;
public class Day1Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("enter your age :");
		int age=sc.nextInt();
		System.out.println("Enter your Percentage :");
		double percentage=sc.nextDouble();
		System.out.println("Enter Garde :");
		char grade=sc.next().charAt(0);
		System.out.println();
		System.out.println("---Student details--- :");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Percentage :"+percentage);
		System.out.println("Grade :"+grade);
		
		// extra task
		System.out.println("enter first number :");
		int num1=sc.nextInt();
		System.out.println("Enter second number :");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		System.out.println("Sum :"+sum);
		

	}

}
