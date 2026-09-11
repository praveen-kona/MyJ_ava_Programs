package Eceptions;

public class CustomMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			
			throw new ArithmeticException("hello boss cant divide by zero");
			
			
		}

	}

}
