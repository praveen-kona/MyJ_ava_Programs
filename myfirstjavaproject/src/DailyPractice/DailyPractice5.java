package DailyPractice;
import java.util.Scanner;
public class DailyPractice5 
{
 static Scanner sc=new Scanner(System.in);
	static void add(int a,int b)
	{
		System.out.println("Addition ="+(a+b));
	}
	static void subtract(int a,int b)
	{
		System.out.println("Subtraction ="+(a-b));
	}
	static void multiply(int a,int b)
	{
		System.out.println("Multiplication ="+(a*b));
	}
	static void divide(int a,int b)
	{
		System.out.println("Division ="+(a/b));
	}
	
	public static void main(String[] args) {
		/*
		 * Java Task: Calculator Using Methods and Scanner
Problem:
1.Create a Java program that performs basic calculator operations using methods.
Requirements:
1.Read two numbers using Scanner.
2.Create the following methods:
add(a, b)
subtract(a, b)
multiply( a, b)
divide(a, b)
3.Call all four methods from the main() method.
Each method should print its results

Sample Input
Enter first number: 20
Enter second number: 10
Sample Output
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2
5.Note: Assume the second number is not 0, so no condition is required to handle division by zero.
		 */
		System.out.println("enter first number :");
		 int first_number=sc.nextInt();
		 System.out.println("enter second number :");
		 int Second_number=sc.nextInt();
		 add(first_number,Second_number);
		 subtract(first_number,Second_number);
		 multiply(first_number,Second_number);
		 divide(first_number,Second_number);

	}

}
