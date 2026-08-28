package com.Inheritance;
class Animal_2
{
	void eat()
	{
		System.out.println("Eat");
		
	}
}
class Dog_2 extends Animal_2
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal_2
{
	void meow()
	{
		System.out.println("meow");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_2 d=new Dog_2();
		Cat c=new Cat();
		d.eat();
		d.bark();
		c.meow();
		c.eat();
		
		
		

	}

}
