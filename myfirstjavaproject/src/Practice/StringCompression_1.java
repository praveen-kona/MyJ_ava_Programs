package Practice;

public class StringCompression_1 {

	public static void main(String[] args) {
		
		
		String s = "aaabbccccd";
		
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
				res=res+s.charAt(i)+count;
				count=1;
			}
		}
		res=res+s.charAt(s.length()-1)+count;
		System.out.println(res);
	}

}
