package Practice;

public class StringCompression2 {

	public static void main(String[] args) {
		String s="aabbaa";
		int count=1;
		String res="";
		for(int i=0;i<s.length()-1;i++)
		{
			
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count==1)
				{
					res=res+s.charAt(i);
				}
				else
				{
					res=res+s.charAt(i)+count;
				
				}
				count=1;
			}
			
		}
		if(count==1)
		{
			res=res+s.charAt(s.length()-1);
		}
		else
		{
			res=res+s.charAt(s.length()-1)+count;
		}
		System.out.println(res);

	}

}
