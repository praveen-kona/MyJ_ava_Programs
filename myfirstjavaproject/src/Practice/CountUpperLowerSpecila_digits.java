package Practice;

public class CountUpperLowerSpecila_digits {

	public static void main(String[] args) {

		String s = "Java@123Java";
		int up_count=0;
		int l_count=0;
		int d_count=0;
		int s_count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				up_count++;
			}
			else if(Character.isLowerCase(s.charAt(i)))
			{
				l_count++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				d_count++;
			}
			else
			{
				s_count++;
			}
		}
		System.out.println(up_count);
		System.out.println(l_count);

		System.out.println(d_count);
		System.out.println(s_count);
		int[] count=new int[256];
		boolean isfound=false;
		int count1=0;;
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
			System.out.println("not found");
	}

}
