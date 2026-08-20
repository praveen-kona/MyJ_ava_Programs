package DayProgress;

import java.util.Scanner;

public class Day1Task7 {
	static void Relational(int a,int b)
	{
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter Second number :");
		int b=sc.nextInt();
		Relational(a,b);
		

	}

}
