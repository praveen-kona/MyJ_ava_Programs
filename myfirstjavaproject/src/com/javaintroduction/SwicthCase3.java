package com.javaintroduction;

import java.util.Scanner;
public class SwicthCase3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		double marks=sc.nextDouble();
		System.out.println("Grade is :"+gradewithyield(marks));

	}

	static String gradewithyield( double marks)
	{
		int m=(int)(marks/10);
		String grade=switch(m)
				{
		        		case 9->
		        		{
		        			yield "A";
		        		}
		        		case 8 ->
		        		{
		        			yield "B";
		        		}
		        		case 7 ->
		        		{
		        			yield "C";
		        		}
		        		case 6 ->
		        		{
		        			yield "D";
		        		}
		        		case 5,4 ->
		        		{
		        			yield "Pass";
		        		}
		        		default->"Fail";
				};
		return grade;
		
		
	}

}
