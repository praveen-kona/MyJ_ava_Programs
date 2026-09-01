package Interfaces;
interface A_4
{
	default void show()
	{
		System.out.println("A");
	}
	
}
interface B_4 extends A_4
{
	default void show()
	{
		System.out.println("B");
	}
}
interface C_4 extends A_4
{
	default void show()
	{
		System.out.println("C");
	}
}
class D_5 implements B_4,C_4
{
	@Override
	public void show()
	{
		System.out.println("D");
	}
}
public class Class_interface_diamond_problme_2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_5 d=new D_5();
		d.show();

	}

}
