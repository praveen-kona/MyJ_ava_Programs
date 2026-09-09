package Eceptions;

public class ThrowAndThrows {

	static void checkAge(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Ages is less thaan 18 so cnat do");
		}
		System.out.println("eligible");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(10);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
