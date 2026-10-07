package Practice;

public class FindDupchar {

	public static void main(String[] args) {
		String s = "programming";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
			if(count[s.charAt(i)]>1)
			{
				System.out.println(s.charAt(i));
			}
		}

	}

}
