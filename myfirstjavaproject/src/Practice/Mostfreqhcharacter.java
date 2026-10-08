package Practice;

public class Mostfreqhcharacter {

	public static void main(String[] args) {
		String s = "programming";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int x=ch;
			count[x]++;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(count[ch]!=0)
			{
				System.out.println(ch+" "+count[ch]);
				count[ch]=0;
			}
		}

	}

}
