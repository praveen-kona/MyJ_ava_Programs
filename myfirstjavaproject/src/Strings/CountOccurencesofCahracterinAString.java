package Strings;

public class CountOccurencesofCahracterinAString {
	public static void main(String[] args)
	{
		String s="hi Hello this is java Progarmming";
		String s2=s.toLowerCase();
		int totlacount=s2.length();
		int updatedcount=s2.replace("p", "").length();
		int count=totlacount-updatedcount;
		System.out.println(count);
		
		
		/* 
		 * or this way
		 */
		String str="hello this";
		char ch='h';
		int count1=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count1++;
			}
		}
		System.out.println(count1);
	}

}
