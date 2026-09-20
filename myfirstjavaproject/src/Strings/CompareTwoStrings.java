package Strings;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="NeW York";
		String s2="NWYR";
		for(int i=0;i<s1.length();i++ )
		{
			boolean isfound=false;
			for(int j=0;j<s2.length();j++)
			{
				if(Character.toLowerCase(s1.charAt(i))==Character.toLowerCase(s2.charAt(j)))
				{
					isfound=true;
					break;
				}
				
			}
			if(isfound)
			{
				System.out.print(s1.charAt(i));
			}
			else
			{
				System.out.print("+");
			}
			
		}

	}

}
