package Constructors;
class Parent
{
	Parent() {
	    System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{
	Child()
	{   // here implicitly called parent constructor using super();
		System.out.println("child constructor");
	}
}
public class Constructor_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();

	}

}
