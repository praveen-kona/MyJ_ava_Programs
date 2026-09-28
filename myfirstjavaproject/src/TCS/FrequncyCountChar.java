package TCS;

public class FrequncyCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int x=ch;
			count[x]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+" -> "+count[i]);
			}
		}

	}

}
