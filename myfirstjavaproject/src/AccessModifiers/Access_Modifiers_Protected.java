package AccessModifiers;

public class Access_Modifiers_Protected 
{
	protected int roll;
	protected Access_Modifiers_Protected(int roll)
	{
		this.roll=roll;
	}
	protected void printRoll()
	{
		System.out.println(this.roll);
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Modifiers_Protected p1=new Access_Modifiers_Protected(20);
		p1.printRoll();

	}

}
