package Eceptions;

public class Eception_Not_Occurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("hi ");
		}

	}

}
