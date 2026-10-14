package Practice;

public class FrequncyString {

	public static void main(String[] args) {


		String s="hhello";
		int[] count =new int[256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]!=0)
			{
				System.out.println(count[s.charAt(i)]+" "+s.charAt(i));
			}
			count[s.charAt(i)]=0;
		}

	}

}
