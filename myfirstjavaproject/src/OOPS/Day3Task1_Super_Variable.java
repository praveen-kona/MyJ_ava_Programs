package OOPS;
class Parent3
{
	int x=10;
	
}
class Child3 extends Parent3
{
	int x=20;
	void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Day3Task1_Super_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child3 p=new Child3();
		p.display();
	}

}
