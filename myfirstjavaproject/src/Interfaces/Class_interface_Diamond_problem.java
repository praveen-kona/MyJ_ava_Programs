package Interfaces;
interface A_2
{
	default void show()
	{
		System.out.println("A");
	}
}
interface B_2 extends A_2
{
	
}
interface C_2 extends A_2
{
	
}

public class Class_interface_Diamond_problem  implements B_2,C_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_interface_Diamond_problem d =new Class_interface_Diamond_problem();
		d.show();

	}

}
