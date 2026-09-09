package Eceptions;

public class ThrowAndThrowsS  {


	public static void main(String[] args) throws LoginException {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			throw new LoginException("He studpid any number cant divde by zero !");
		}

	}

}
