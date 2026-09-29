package Practice;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'a','a','b','b','c'};
		String s=new String(ch);
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
		
		for(int i=0;i<res.length();i++)
		{
			ch[i]=res.charAt(i);
		}
		System.out.println(res.length());

	}

}
