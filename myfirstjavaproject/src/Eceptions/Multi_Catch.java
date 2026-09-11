package Eceptions;
import java.util.*;

public class Multi_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(Arrays.toString(e.getStackTrace()));
			System.out.println(e.toString());
		}
	}

}
