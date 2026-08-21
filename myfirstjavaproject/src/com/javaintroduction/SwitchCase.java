package com.javaintroduction;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		
		String yn;
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your First number :");
			int a=sc.nextInt();
			System.out.println("Enter your Second number :");
			int b=sc.nextInt();
			System.out.println("Enter Operation to perform :");
			String symbol=sc.next();
			switch(symbol)
			{
				case "+" :
				{
					System.out.println("Addition of two numbers:");
					System.out.println(a+b);
					break;
				}
				case "-" :
				{
					System.out.println("Subtraction of two numbbers :");
					System.out.println(a-b);
					break;
				}
				case "*":
				{
					System.out.println("Multiplication of two numbers :");
					System.out.println(a*b);
					break;
				}
				case "/" :
				{
					System.out.println("Division is :");
					System.out.println(a/b);
					break;
				}
				case "%" :
				{
					System.out.println("Modulus is :");
					System.out.println("a%b");
					break;
				}
				default:
					System.out.println("Invalid Choice !");
			
			}
			System.out.println("Do u Want to continue.. click(y)/(n) :");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("exit !");

	}

}
