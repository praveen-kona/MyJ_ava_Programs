package Eceptions;
import java.util.*;
public class NullPinterException_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		int i=0;
		try {
			System.out.println(s.length());  //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println(i);

	}

}
