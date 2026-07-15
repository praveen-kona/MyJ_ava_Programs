package com.javaintroduction;
import java.util.Scanner;

public class DailyPractice3 {

	static void getName(String fname,String lname)
	{
		System.out.println("first name is :"+fname);
		System.out.println("Last name is: "+lname);
	}
	void getAge(int age)
	{
		System.out.println("your age is :"+age);
	}
	void getHeight(double height)
	{
		System.out.println("your height is :"+height);
	}
	void getGender(char gender)
	{
		System.out.println("ur weight is :"+gender);
	}
	public static void main(String[] args) {
	
		int a=10;
		System.out.println(((Object)a).getClass().getName());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur first name: ");
		String fname=sc.nextLine();
		System.out.println("enter ur second name: ");
		String lname=sc.next();
		getName(fname,lname);
		
		DailyPractice3 d1=new DailyPractice3();
		System.out.println("enter ur age:");
		int aa=sc.nextInt();
		d1.getAge(aa);
		
		System.out.println("enter ur height:");
		d1.getHeight(sc.nextDouble());
		
		System.out.println("enter ur gender:");
		char weight=sc.next().charAt(0);
		d1.getGender(weight);
	}

}
