package Practice;

public class ReplaceDupChar {

	public static void main(String[] args) {


		String s = "programming";
		int[] count=new int[256];
		
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==0)
			{
				res+=s.charAt(i);
			}
			else
			{
				res+="#";
			}
			count[s.charAt(i)]++;
		}
		System.out.println(res);

	}

}
