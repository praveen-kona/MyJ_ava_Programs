package Interfaces;

public class Class_Interface_varibales  implements Interface_3
{
	public void  display()
	{
		System.out.println("College code  : "+COLLEGE_CODE);
	}

	public static void main(String[] args) {
		Class_Interface_varibales c=new Class_Interface_varibales();
		c.display();
		System.out.println("College code  : "+Interface_3.COLLEGE_CODE);
		System.out.println(c.COLLEGE_CODE);

	}

}
