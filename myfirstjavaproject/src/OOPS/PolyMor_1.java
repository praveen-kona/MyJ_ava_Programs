package OOPS;
 class Animal_1
 {
	 void sound()
	 {
		 System.out.println("sound");
	 }
 }
 class Dog_1 extends Animal_1
 {
	 @Override
	 public void sound()
	 {
		 System.out.println("bark");
	 }
	 void bark()
	 {
		 System.out.println("hello");
	 }
 }
 class Cat extends Animal_1
 {
	 @Override
	 public void sound()
	 {
		 System.out.println("mewo");
	 }
	 void meow()
	 {
		 System.out.println("ji");
	 }
 }
public class PolyMor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_1 a;
		a=new Dog_1();
		System.out.println(a instanceof Animal_1);
		System.out.println(a instanceof Dog_1);
		if(a instanceof Dog_1)
		{
			Dog_1 d=(Dog_1)a;
			d.bark();
			a.sound();
		}
		
		
		a=new Cat();
		if(a instanceof Dog_1)
		{
			Dog_1 d=(Dog_1)a;
			d.bark();
			a.sound();
		}
		
		
		

	}

}
