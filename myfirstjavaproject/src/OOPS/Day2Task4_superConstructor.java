package OOPS;

class Person
{
	int mine=100;
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println();
	}
	void hell()
	{
		System.out.println("hell :");
		
	}
}
class Studnt extends Person
{
	int mine=100;
	int rollNo;
	Studnt(String name,int age,int r)
	{
		super(name,age);
		rollNo=r;
	}
	void helll()
	{
		
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNo);
		super.display(); // call parent class method
		System.out.println(mine); 
		System.out.println(super.mine);  // access parent class varaible 
		hell();
		helll();
	}
	
}
public class Day2Task4_superConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studnt s1=new Studnt("Praveen",22,20);
		s1.display();
		
	}

}
