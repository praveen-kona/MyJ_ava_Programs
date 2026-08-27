package Constructors;
class Parent_1
{
	Parent_1(String name) 
	{
	    System.out.println("Parent: " + name);
	}
}
class Child_1 extends Parent_1
{
	Child_1(String name) 
	{
		super(name);
	    System.out.println("Child Constructor");
	}
}
public class Constructor_Inher_Parame {
	public static void main(String[] args)
	{
		Child_1 c = new Child_1("praveen");
	}

}
