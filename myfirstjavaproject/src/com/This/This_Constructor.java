package com.This;
class This_Construc
{
	int age;
	This_Construc(int age)
	{
		this.age=age;
		System.out.println("hello this param constructor ");
	}
	This_Construc()
	{
		this(20);
		System.out.println(this.age);
	}
	This_Construc(String name)
	{
		this();
		System.out.println(name);
	}
	
	
	
}
public class This_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Construc t=new This_Construc("praveen");

	}

}
