package ArraysandStrings;

public class MAxFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="success";
		int max=0;
		char ch=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					
				}
					
			}
			if(count>max)
			{
				max=count;
				ch=s.charAt(i);
			}
		}
		System.out.println(ch);
		System.out.println(max);

	}

}
