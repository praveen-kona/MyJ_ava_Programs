package Abstraction;
abstract class Shape
{
	abstract void draw();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle shape");
	}
	void hello()
	{
		System.out.println("hello");
	}
}
class Reactangle extends Shape
{
	void draw()
	{
		System.out.println("reactangle shape");
	}
	void hi()
	{
		System.out.println("hi");
	}
}
public class Abstract_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Circle();
		s.draw();
		Circle c1=(Circle)s;
		c1.hello();
		s=new Reactangle();
		s.draw();
		((Reactangle)s).hi();
		
		
		

	}

}
