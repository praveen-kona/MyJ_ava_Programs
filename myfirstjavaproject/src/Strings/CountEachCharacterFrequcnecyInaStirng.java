package Strings;

public class CountEachCharacterFrequcnecyInaStirng {
	public static void main(String[] args)
	{
		String s="aabbbccccc";
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int x=(int)ch;
			arr[x]++;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print((char)i+""+arr[i]);
			}
		}
	}

}
