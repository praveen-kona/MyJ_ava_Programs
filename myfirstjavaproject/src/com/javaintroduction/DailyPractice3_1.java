package com.javaintroduction;
import java.util.Scanner;

public class DailyPractice3_1 {
	void displayStudent(String name)
	{
		System.out.println("Student name is :"+name);
	}
	void calculateTotal(int m1, int m2, int m3)
	{
		System.out.println("marks1 details are :"+m1);
		System.out.println("marks2 details are :"+m2);
		System.out.println("marks3 details are :"+m3);
		
		System.out.println("total marks:"+(m1+m2+m3));
		
	}
	void calculateAverage(int m1, int m2, int m3)
	{
		System.out.println("average marks are :");
		System.out.println((m1+m2+m3)/3.0);
	}

	public static void main(String[] args) {
		/* 1.Student Result Calculator
Create a Java program to calculate and display a student's result using methods that accept arguments but do not return any value.
Requirements:
1.Create a class named StudentResult.
2.Create the following methods:
displayStudent(String name)
calculateTotal(int m1, int m2, int m3)
calculateAverage(int m1, int m2, int m3)
3.Take input from scanner class And display details*/
		
		DailyPractice3_1 d1=new DailyPractice3_1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name:");
		String name=sc.next();
		d1.displayStudent(name);
		System.out.println("enter ur marks1:");
		int m1=sc.nextInt();
		System.out.println("enter ur marks2:");
		int m2=sc.nextInt();
		System.out.println("enter ur marks3:");
		int m3=sc.nextInt();
		d1.calculateTotal(m1,m2,m3);
		d1.calculateAverage(m1,m2,m3);

	}

}
