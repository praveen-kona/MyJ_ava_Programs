package AccessModifiers;

public class Access_Specifier_Public 
{
	public int roll=20;
	public Access_Specifier_Public(int roll) 
	{
	
		this.roll=roll;
	}
	public void  printRoll()
	{
		System.out.println(roll);
	}
	 private void show() // public within class 
	{
		System.out.println(roll);
		printRoll();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Specifier_Public a1=new Access_Specifier_Public(120);
		System.out.println(a1.roll);
		a1.printRoll();
		a1.show();
		

	}

}
