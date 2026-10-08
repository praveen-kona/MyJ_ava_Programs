package Practice;

public class Mostfreqhcharacter {

	public static void main(String[] args) {
		String s = "programming";
		int[] count=new int[256];
		int max_count=0;
		char max = 0;
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

				if(count[ch]>max_count)
				{
					max_count=count[ch];
					max=ch;
				}
			
		}
		System.out.println(max);
		System.out.println(max_count);

	}

}
