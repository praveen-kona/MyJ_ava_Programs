package Practice;

public class FirstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		boolean isfound=false;
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int j=0;j<s.length();j++)
		{
			if(count[s.charAt(j)]==1)
			{
				System.out.println(s.charAt(j));
				isfound=true;
				break;
			}
		}
		if(!isfound)
			System.out.println("not found");

	}

}
