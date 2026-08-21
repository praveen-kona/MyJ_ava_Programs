package DayProgress;
import java.util.Scanner;
public class Day2Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for Subject 1 :");
		int sub1=sc.nextInt();
		System.out.println("Enter marks for Subject 2 :");
		int sub2=sc.nextInt();
		System.out.println("Enter marks for Subject 3 :");
		int sub3=sc.nextInt();
		System.out.println("Enter marks for Subject 4 :");
		int sub4=sc.nextInt();
		System.out.println("Enter marks for Subject 5 :");
		int sub5=sc.nextInt();
		int total_marks=sub1+sub2+sub3+sub4+sub5;
		
		// Note: Whenever we want to perform perform any decimal points calculations we should use double values or make values as double like 50.0
		
		double percentage=(total_marks/500.0)*100;
		System.out.println(percentage);
		

	}

}
