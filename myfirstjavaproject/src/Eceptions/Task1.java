package Eceptions;
import java.util.*;
public class Task1 {

	void main(String[] args)
	{
		int a=10,b=0;
		try
		{
			System.out.println(a/b);

		}
		catch(Exception e)
		{
			System.out.println(Arrays.toString(e.getStackTrace()));
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("finally always execued");
		}
	
}
	}
