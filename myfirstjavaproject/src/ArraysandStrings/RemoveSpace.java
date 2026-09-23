package ArraysandStrings;

import java.util.Arrays;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java how are u";
		s=s.replace(" ","");
		System.out.println(s);
		
		//
		String s2="hello jav ahi ";
		for(int i=0;i<s2.length();i++ )
		{
			if(s2.charAt(i)!=' ')
			{
				System.out.print(s2.charAt(i));
			}
		}
		
	}

}
