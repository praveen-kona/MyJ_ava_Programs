package TCS;

public class Stringcharfrequcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		boolean isfound=false;
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
		{
			
			int x=s.charAt(i);
			count[x]++;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(count[ch]!=0)
			{
				System.out.println(ch+" "+count[ch]);
				count[ch]=0;
			
				
			
		}

	}

	}
}
