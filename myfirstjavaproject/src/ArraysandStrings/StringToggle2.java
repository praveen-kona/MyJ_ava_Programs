package ArraysandStrings;

public class StringToggle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HeLLo JaVa!";
		String tog="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				
				tog+=Character.toLowerCase(ch);
			}
			else
				if(Character.isLowerCase(ch))
				{
					tog+=Character.toUpperCase(ch);
				}
				else
				{
					tog+=ch;
				}
					
		}
		System.out.println(tog);

	}

}
