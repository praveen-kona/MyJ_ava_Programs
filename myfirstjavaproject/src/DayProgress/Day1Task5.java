package DayProgress;

import java.util.Scanner;

public class Day1Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean isStudent=true;
		System.out.println("Enter first number :");
		int age=sc.nextInt();
		System.out.println("Age is between 18 and 60:"+(age>=18 && age <=60));
		System.out.println("Age is between 18 and 60"+(age <18 || age >60));
		System.out.println("Is student :"+isStudent);
		System.out.println("Is not  a student :"+!isStudent);

	}

}
