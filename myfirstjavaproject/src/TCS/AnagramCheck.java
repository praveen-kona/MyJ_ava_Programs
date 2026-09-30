package TCS;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		int[] count=new int[256];
		if(s1.length()!=s2.length())
		{
			System.out.println("not a nagaram leeght");
			return;
		}
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
				System.out.println("not a anagaram");
				return;
			}
		}
		
		System.out.println("anagaram");

	}

}
