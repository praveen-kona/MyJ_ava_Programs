package Eceptions;

public class ThrowInvalidBalce {
	static void balalnce(double balance) throws InvalidBalanceException
	{
		if(balance<0)
			throw new InvalidBalanceException("in sufficeint balance plz check the balance once you withdraw!");
		System.out.println("Valid Balance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			balalnce(-10000.00);
		}
		catch(InvalidBalanceException e)
		{
			System.out.println(e.toString());
			System.out.println("hi this is catch block to catch and handlle exceptions");
		}
		finally
		{
			System.out.println("this blcok always exceute");
		}

	}

}
