package Eceptions;

public class Finallywithreturn {
	static int test()
	{
		try
		{
			return 10;
		}
		finally
		{
			return 20;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=test();
		System.out.println(x);

	}

}
