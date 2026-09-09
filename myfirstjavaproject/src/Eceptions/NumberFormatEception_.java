package Eceptions;

public class NumberFormatEception_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ji";
		
		try
		{int i=Integer.parseInt(s); // java.lang.NumberFormatException: For input string: "ji"
		System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		finally
		{
			System.out.println("what ever amma what is this amma");
			
		}
		

	}

}
