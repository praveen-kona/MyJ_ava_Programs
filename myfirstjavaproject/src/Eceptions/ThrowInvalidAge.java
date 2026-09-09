package Eceptions;
import java.util.*;
public class ThrowInvalidAge {
	static String checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age is less than 18 so u cant do anything");
		}
		return "Eligible";
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String s;
		try {
			s = checkAge(10);
			System.out.println(s);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			
		}
		System.out.println("what ebe");
			

	}

}
