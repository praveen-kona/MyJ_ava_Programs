package com.This;
class Meththod
{
	int age;
	Meththod(int age)
	{
		this.age=age;
		System.out.println("Helo your age is:"+this.age);
	}
	void hello()
	{
		System.out.println("hi");
	}
	void show() {
		System.out.println("hello");
		this.hello();
		hello();
	}
}
public class This_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meththod m=new Meththod(20);
		m.show();

	}

}
