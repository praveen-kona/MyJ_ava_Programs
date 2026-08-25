package DayProgress;
class Parent12
{
	 void show()
	{
		System.out.println("hello ");
	}
}
class Child1 extends Parent12
{
	 @Override
	void show()
	{
		System.out.println("Child");
	}
}
public class Day5Task4 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent12 c1=new Child1();
		c1.show();
	}

}
