package Constructors;



class Product
{

	Product() 
	{
		System.out.println("hello this is no arg ");
		
	}
	Product(String name)
	{
		
		System.out.println(name);
		System.out.println("parametrized constructor");
	}
	Product(String name,double price)
	{
		System.out.println(name);
		System.out.println(price);
	}
	
}
public class ConstructorOverlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		Product p2=new Product("Laptop");
		Product p3=new Product("Phone",25000.0);

	}

}
