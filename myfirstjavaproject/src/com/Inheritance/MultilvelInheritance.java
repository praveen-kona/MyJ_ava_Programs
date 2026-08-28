package com.Inheritance;
class Animal_1
{
	void eat()
	{
		System.out.println("Eating ..");
	}
}
class Dog_1 extends Animal_1
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class Puppy extends Dog_1{
	void play()
	{
		System.out.println("playing ");
	}
}
public class MultilvelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p=new Puppy();
		p.bark();
		p.eat();
		p.play();

	}

}
