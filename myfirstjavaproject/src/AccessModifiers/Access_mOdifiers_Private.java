package AccessModifiers;

public class Access_mOdifiers_Private 
{
	private int roll=120;
	private Access_mOdifiers_Private(int roll)
	{
		this.roll=roll;
	}
	private void printROll()
	{
		System.out.println(this.roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Access_mOdifiers_Private a1=new Access_mOdifiers_Private(120);
		a1.printROll();
	}

}
