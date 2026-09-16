package Practice;

public class FirstNonRepaetChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch);
				break;
			}
		}

	}

}
