package com.javaintroduction;
class Example
{
	Example(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Hello
{
	Hello()
	{
		System.out.println("hello this first construcor");
	}
	int x=100;
	
	void  Welcome()
	{
		System.out.println("heloo");
	}
}
public class Constructors 
{
	Constructors(int c,int d)
	{
		System.out.println(c+d);
	}

	public static void main(String[] args) 
	{
		
		Example e1 =new Example(10,20);
		Hello h1=new Hello();
		System.out.println(h1.x);
		h1.Welcome();
		Constructors c1=new Constructors(20,30);
		
	}
}
