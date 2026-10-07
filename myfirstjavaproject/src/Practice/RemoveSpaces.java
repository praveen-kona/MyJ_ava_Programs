package Practice;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String s = "Java is very easy";
		String sp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				sp+=s.charAt(i);
			}
		}
		System.out.println(sp.trim());
		
		//or
		System.out.println(s.replace(" ",""));

	}

}
