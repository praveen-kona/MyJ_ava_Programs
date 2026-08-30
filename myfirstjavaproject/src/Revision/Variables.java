package Revision;
class Var
{
	boolean b;
	int age=10;
	int a;
	static String name="praveen";
	static String n;
	char ch;
	void display()
	{
		int age=30;
		System.out.println(b);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(a);
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(n);
		//int h; -> must initialize local variable before use 
		//System.out.println(h);
	}
	static void hello(Var v)
	{
		System.out.println(v.age);
		System.out.println(name);
		System.out.println(n);
	}
	
}
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v=new Var();
		v.display();
		System.out.println(v.age);
		System.out.println(v.a);
		System.out.println(Var.name);
		System.out.println(Var.n);
		Var.hello(v);
		
		

	}

}
