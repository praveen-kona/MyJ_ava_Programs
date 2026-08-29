package com.Inheritance;
class Animal_5
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog_5 extends Animal_5
{
	void bark()
	{
		System.out.println("barking ");
	}
}
class Cat_2 extends Animal_5
{
	void meow()
	{
		System.out.println("meow");
	}
}

public class HierarchicalInheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_5 d=new Dog_5();
		d.eat();
		d.bark();
		Cat_2 c=new Cat_2();
		c.eat();
		c.meow();
		
		

	}

}
