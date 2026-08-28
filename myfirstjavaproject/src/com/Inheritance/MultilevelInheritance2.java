package com.Inheritance;
class GrandParent
{
	private int b=10;
	int x=10;
	GrandParent(int a)// constructor
	{
		this();
		System.out.println(a);
		System.out.println(b);
	}
	GrandParent()
	{
		System.out.println("hi");
	}
	void getx()
	{
		System.out.println(x);
	}
	
}
class Parent extends GrandParent
{
	Parent() //constructor
	{
		super(300);
		System.out.println("hi 3");//parent constructor
	}
	int y=20;
	void gety()
	{
		System.out.println(y);
	}
	void bark()
	{
		this.gety();
		System.out.println("Bark");
	}
}
class Child extends Parent
{
	Child(int a)// constructor
	{
		this();
		System.out.println("hi 2");
	}
	Child()
	{
		super();
		System.out.println("hello");
	}
	
	void add()
	{
		getx();
		int total=x+y;
		System.out.println(total);
		super.bark();
	}
	void bark()
	{
		System.out.println("Bark 2");
	}
}
public class MultilevelInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child(10);
		c.getx();
		c.gety();
		c.add();
		c.bark();

	}

}
