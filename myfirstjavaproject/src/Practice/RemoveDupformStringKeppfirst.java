package Practice;

public class RemoveDupformStringKeppfirst {

	public static void main(String[] args) {
		String s="hhello";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==0)
			{
				System.out.println(s.charAt(i));
			}
			count[s.charAt(i)]++;
		}

	}

}
