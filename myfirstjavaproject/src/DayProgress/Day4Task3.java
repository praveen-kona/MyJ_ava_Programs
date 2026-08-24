package DayProgress;
class Parent
{
	final void display()
	{
		System.out.println("Hi this is final mehtod in super class :");
	}
}
class Child extends Parent
{
	/*void display()
	{
		
	}  ->Cannot override the final method from Parent*/
}
public class Day4Task3 {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.display();

	}

}
