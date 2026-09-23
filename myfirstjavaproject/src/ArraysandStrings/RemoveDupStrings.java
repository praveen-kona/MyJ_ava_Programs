package ArraysandStrings;

public class RemoveDupStrings {
	public static void main(String[] args)
	{
		String s="programming";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==0)
			{
				System.out.print(s.charAt(i));
			}
			count[s.charAt(i)]++;
		}
		
	}

}
