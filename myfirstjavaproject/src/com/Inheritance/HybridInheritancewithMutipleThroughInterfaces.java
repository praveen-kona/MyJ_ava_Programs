package com.Inheritance;
class A_1
{
	void showA()
	{
		System.out.println("hello");
	}
}
class B_1 extends A_1
{
	void showB()
	{
		System.out.println("show b");
	}
}
interface C_1
{
	default void showC()
	{
		System.out.println(" heloo c");
	}
}
interface C_2
{
	default void showC()
	{
		System.out.println(" heloo c_2");
	}
	default void hh()
	{
		System.out.println("j");
	}
}
class D_1 extends B_1 implements C_1,C_2
{
	void showD()
	{
		System.out.println("Show d");
	}
	@Override
	public void showC()
	{
		System.out.println("own implemtntation");
		C_1.super.showC();
		C_2.super.showC();
		
	}
}
public class HybridInheritancewithMutipleThroughInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_1 d=new D_1();
		d.showA();
		d.showB();
		d.showC();
		d.hh();
	}

}
