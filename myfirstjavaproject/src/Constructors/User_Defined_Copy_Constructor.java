package Constructors;


class Copy
{
	String name;
	int age;
	Copy(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	Copy(Copy c)
	{
		this.name=c.name;
		this.age=c.age;
	}
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(name);
		System.out.println(age);
	}
}
public class User_Defined_Copy_Constructor 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copy c=new Copy("praveen",20);
		Copy c1=new Copy(c);
		c.display();
		c1.display();
	}

}
