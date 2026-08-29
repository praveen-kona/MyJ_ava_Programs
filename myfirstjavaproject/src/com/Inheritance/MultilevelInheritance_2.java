package com.Inheritance;
class Animal_4
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog_4 extends Animal_4
{
	void bark()
	{
		System.out.println("barking");
	}
}
class Puppy_3 extends Dog_4
{
	void play()
	{
		System.out.println("playing");
	}
}
public class MultilevelInheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_4 d=new Dog_4();
		d.eat();
		d.bark();
		Puppy_3 p=new Puppy_3();
		p.eat();
		p.bark();
		p.play();
		

	}

}
