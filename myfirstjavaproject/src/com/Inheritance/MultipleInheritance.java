package com.Inheritance;
interface Sup
{
	public static final int x=10;
	public  abstract void getx();
}
interface Sup2
{
	public static final int y=20;
	public abstract void gety();
}
class Sub implements Sup,Sup2
{
	public void getx()
	{
		System.out.println(x);
	}
	public void gety()
	{
		System.out.println(y);
	}
	void add()
	{
		System.out.println(x+y);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Sub();
		s.getx();
		s.gety();
		s.add();

	}

}
