package Interfaces;
interface A_1
{
	default void show()
	{
		System.out.println("A");
	}
}
interface B_1
{
	default void show()
	{
		System.out.println("B");
		
	}
}
public class Class_Multiple_interface_deafult implements A_1,B_1{
	
	public void show()
	{
		System.out.println("C");
		A_1.super.show();
		B_1.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class_Multiple_interface_deafult c=new Class_Multiple_interface_deafult();
		c.show();

	}

}
