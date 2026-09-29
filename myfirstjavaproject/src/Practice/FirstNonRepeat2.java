package Practice;

public class FirstNonRepeat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="praveen";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
