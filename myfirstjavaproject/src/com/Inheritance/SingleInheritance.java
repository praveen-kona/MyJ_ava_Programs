package com.Inheritance;
class Animal
{
	String name;
	private int x=10;
	public int retrieve()
	{
		
		return x;
	}
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println(retrieve());
		System.out.println("Barking...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.name="tommmy";
		System.out.println("Dog Name : "+d.name);
		d.eat();
		d.bark();

	}

}
