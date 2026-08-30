package Revision;

public class Datatypes

{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean bool;
	void display()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);

		System.out.println(bool);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datatypes d=new Datatypes();
		d.display();
		
		byte b1=10;
		byte b2=20;
		byte b3=(byte) (b1+b2);
		System.out.println(b3);
		char c='A';
		int i1=c+1;
		System.out.println(i1);
		long l1=i1+1000l;
		System.out.println(l1);
		float f1=l1+56.0f;
		System.out.println(f1);
		
		

	}

}
