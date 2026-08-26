package OOPS;
class Parent32
{
	int x;
	void display(int x)
	{
		this.x=x;
		System.out.println("hello");
		System.out.println(this.x+" this is parent class method ");
	}
}
class Child32 extends Parent32
{
	int y;
	void display(int y)
	{
		this.y=y;
		System.out.println(this.y);
		super.display(30);
	}
}
public class Day3Task2_SUper_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child32 c1=new Child32();
		c1.display(20);

	}

}
