package DayProgress;
import java.util.Scanner;
public class Day2Task3 {

	static void grade(int marks)
	{
		String[] grades= {"A","B","C","D","Fail"};
		if(marks<0 || marks >100)
			System.out.println("Invalid  marks:");
		
		else if(marks>=90)
		
			System.out.println("Grade:"+grades[0]);
		else if(marks >=75)
			System.out.println("Grade:"+grades[1]);
		else if(marks>=60)
			System.out.println("Grade:"+grades[2]);
		else if(marks>=40)
			System.out.println("Grade:"+grades[3]);
		else
			System.out.println(grades[4]);
		}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks :");
		int marks=sc.nextInt();
		Day2Task3.grade(marks);
	}
		
}
