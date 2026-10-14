package Practice;

public class FirstRepatString {

	public static void main(String[] args) {
		String s="aabb";
		boolean isfound=false;
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==1)
			{
				isfound=true;
				System.out.println(s.charAt(i));
				break;
			}
		}
		if(!isfound)
			System.out.println("no there");

	}

}
