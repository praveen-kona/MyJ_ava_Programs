package AnonymousClasses;

abstract class Hi
{
	abstract void hello();
}
abstract class D extends Hi 
{
	
}
class Conn extends D
{
	public void hello()
	{
		System.out.println("hello");
	}
}
