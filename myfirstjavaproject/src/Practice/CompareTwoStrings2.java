package Practice;

public class CompareTwoStrings2 {

	public static void main(String[] args) {


		String s1="NewYork";
		String s2="NWYR";
		for(int j=0;j<s1.length();j++)
		{
			boolean isfound=false;
			for(int i=0;i<s2.length();i++)
			{
				if(Character.toLowerCase(s1.charAt(j))==Character.toLowerCase(s2.charAt(i)))
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
			{
				System.out.println(s1.charAt(j));
			}
			else
			{
				System.out.println('+');
			}
			
		}
		

	}

}
