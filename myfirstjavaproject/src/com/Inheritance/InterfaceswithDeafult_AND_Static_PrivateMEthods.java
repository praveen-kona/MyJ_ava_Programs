package com.Inheritance;
interface A
{
	public final int x=10;
	public final Object b1 = null;
	public abstract void getx();
	default void hello()
	{
		commonCode();
		show();
		System.out.println("hello this i sjava 8 default mehtod for implmenting interfaces ");
	}
	 default void landInfo() {
	        System.out.println("This is a LandVehicle");
	    }
	static void show()
	{
		System.out.println("this is static mehtod for implemnting interfaces since jav 8");
	}
	@SuppressWarnings("unused")
	private void commonCode()
	{
		show();
		System.out.println("private method is used to avoid duplication");
	}
}
interface C
{
	default void hello()
	{
		System.out.println("Default mehtod");
	}
}
class B implements A,C
{
	void hi()
	{
		A.super.landInfo();
	}
	public void getx()
	{
		System.out.println(x);
	}
	@Override
	public void landInfo()
	{
		System.out.println("hello hi vehicle");
		A.super.landInfo();
	}
	@Override
	public void hello()
	{
		A.super.hello();
	    C.super.hello();
		System.out.println("Overrding defauult method ");
	}
	
}
public class InterfaceswithDeafult_AND_Static_PrivateMEthods {

	public static void main(String[] args) {
		B b1=new B();
		b1.getx();
		b1.hello();
		b1.landInfo();
		
	
	
		// TODO Auto-generated method stub

	}

}
