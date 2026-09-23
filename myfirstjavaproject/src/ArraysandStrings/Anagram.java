package ArraysandStrings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="litsen";
		if(s1.length()!=s2.length())
		{
			System.out.println("not ");
			return;
		}
		int[] count=new int[256];
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
				System.out.println("not b");
				return;
			}
		}
		System.out.println("anagram");
	}

}
