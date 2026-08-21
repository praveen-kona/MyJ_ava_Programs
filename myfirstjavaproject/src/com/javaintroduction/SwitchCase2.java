package com.javaintroduction;
import java.util.Scanner;
public class SwitchCase2 {

	static String performance(double marks)
	{
		int m=(int)(marks)/10;
		
		String grade=switch(m)
				{
					case 9 -> "Garde : A";
					case 8 ->"Garde :B";  
					case 7->"Garde :C";
					case 6->"Garde :D";
					case 5,4->"Pass";
					
					default -> "Fail !";
				};
				return grade;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		double marks=sc.nextDouble();

		System.out.println(performance(marks));
	}

}
