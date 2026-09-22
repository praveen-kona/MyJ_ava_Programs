package TCS;

public class StringFirstNonCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabb";
		boolean isfound=false;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char ch=s.charAt(i);
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
				isfound=true;
				break;
			}
		}
		if(!isfound)
		{
			System.out.println("not");
			
		}
			
	}

}
