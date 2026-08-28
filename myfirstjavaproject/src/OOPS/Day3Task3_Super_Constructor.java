	package OOPS;
	class Parent_3
	{
		private int a; 
		private int y=10;//cant acces private vaibrl in child class
		Parent_3()
		{
			System.out.println("hello");
		}
		Parent_3(int a)
		{
			this.a=a;
			System.out.println(this.a);
		}
	}
	class Child_3 extends Parent_3
	{
		
		int b;
		Child_3()
		{
			super(30);
		}
		Child_3(int b)
		{
			
			this.b=b;
			System.out.println(this.b);
		}
		
	}
	public class Day3Task3_Super_Constructor {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Child_3 c1=new Child_3(20);
			Child_3 c2=new Child_3();
	
		}
	
	}
