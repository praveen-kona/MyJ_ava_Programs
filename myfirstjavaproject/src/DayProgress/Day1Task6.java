package DayProgress;
import java.util.Scanner;


public class Day1Task6 {
	static void Airthmetic(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition :"+c);
		int d=a-b;
		System.out.println("Subtraction :"+d);
		int e=a*b;
		System.out.println("Multiplication :"+e);
		if(b==0)
		{
			System.out.println("number cant divide by zero...");
		}
		else
		{
		int f=a/b;
		System.out.println("Division :"+f);
		int g=a%b;
		System.out.println("Modulus :"+g);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter Second number :");
		int b=sc.nextInt();
		Airthmetic(a,b);
		

	}

}
