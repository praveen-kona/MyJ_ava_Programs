package Practice;

import java.util.Arrays;

public class Character_Sorting {

	public static void main(String[] args) {

		String s = "dcab";
		char[] ch=s.toCharArray();


		Arrays.sort(ch);
		s=new String(ch);
		System.out.println(s);

	}

}
