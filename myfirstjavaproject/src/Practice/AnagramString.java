package Practice;

public class AnagramString {

	public static void main(String[] args) {
		String s="listenn";
		String s2="listne";
		int[] count=new int[256];
		if(s.length()!=s2.length())
		{
			System.out.println("not an aanagram");
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println("not an anagram");
				return;
			}
		}
		System.out.println("anagram");

	}

}
