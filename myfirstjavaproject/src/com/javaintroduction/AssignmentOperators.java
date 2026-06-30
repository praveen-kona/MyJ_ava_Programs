package com.javaintroduction;


class Assign
{
	Assign(double a)
	{
		double b=10;
		double c=10;
		double d=10;
		double e=10;
		double f=10;
		b+=a;
		c-=a;
		d*=a;
		e/=a;
		f%=a;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(b);
		
	}
}
public class AssignmentOperators {

	public static void main(String[] args) 
	{
		Assign a1=new Assign(2);

	}

}
