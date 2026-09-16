package Practice;

public class Anagram {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="heoll";
		if(s1.length()!=s2.length())
		{
			System.out.println("not");
			return;
		}
		int[] count=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)]++;
		}
		for(int j=0;j<s2.length();j++)
		{
			count[s2.charAt(j)]--;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println("not");
				return;
			}
		}
		System.out.println("anagram");
	}
}
