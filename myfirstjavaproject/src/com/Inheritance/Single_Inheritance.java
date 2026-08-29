package com.Inheritance;
class Animal_3
{
	String name;

	void eat()
	{
		System.out.println("eating");
	}
	void sleep()
	{
		System.out.println("sleeping");
	}
}
class Dog_3 extends Animal_3
{
	void bark()
	{
		System.out.println("barking");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_3 d=new Dog_3();
		d.eat();
		d.bark();
		d.sleep();

	}

}
