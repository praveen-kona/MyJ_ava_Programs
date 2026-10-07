package Practice;

public class Anagram_2 {

	public static void main(String[] args) {
	
		String s1 = "listen";
		String s2 = "silent";
		int[] count=new int[256];
		if(s1.length()!=s2.length())
		{
			System.out.println("not an anagram");
			return;
		}
		for(int i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println("not anagram");
				return;
			}
		}
		System.out.println("anagram");
		

	}

}
