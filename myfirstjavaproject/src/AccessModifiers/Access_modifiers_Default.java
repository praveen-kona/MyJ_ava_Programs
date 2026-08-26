package AccessModifiers;

class Access_modifiers_Default 
{
	int roll=20;
	int h=1234;
	Access_modifiers_Default(int roll)
	{
		this.roll=roll;
	}
	void printROll()
	{
		System.out.println(this.roll);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Access_modifiers_Default a1=new Access_modifiers_Default(22);
		a1.printROll();
	}

}
