package AccessModifiers;

public class Acces_modifers_Default_withinSubclass_withinPackage extends Access_modifiers_Default 
{
	int age;
	Acces_modifers_Default_withinSubclass_withinPackage(int roll,int age)
	{
		super(123);
		this.age=age;
		System.out.println(this.age);
		super.printROll();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acces_modifers_Default_withinSubclass_withinPackage a1=new Acces_modifers_Default_withinSubclass_withinPackage(123,128);
		a1.printROll();
		System.out.println(a1.h);

	}

}
