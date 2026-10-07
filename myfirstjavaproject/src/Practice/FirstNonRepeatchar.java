package Practice;

public class FirstNonRepeatchar {

	public static void main(String[] args) {
		String s = "programming";
		int[] count=new int[256];
		boolean isfound=false;
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==1)
			{
				System.out.println(s.charAt(i));
				isfound=true;
				break;
			}
		}
		if(!isfound)
			System.out.println("no  non repeat");

	}

}
