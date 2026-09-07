package Eceptions;

public class ErrorVsEception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(s);
		}
		finally
		{
			System.out.println("whatever happens happens i dont care");
		}
		
		hell();
		

	}
	static void hell()
	{
		System.out.println("hello");
         //  hell();  ->error ->java.lanag.error;
	}
	
	

}
