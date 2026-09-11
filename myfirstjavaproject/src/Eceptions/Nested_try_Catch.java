package Eceptions;

public class Nested_try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("first rtyr");
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("hanlde inside catch block");
				throw new NullPointerException("hello");
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("ok");

	}

}
