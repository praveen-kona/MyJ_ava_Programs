package Strings;

public class FirstLastNAme {

	public static void main(String[] args) {
		String first="Steve";
		String last="Jobs";
		String name="";
		for(int i=0;i<first.length();i++)
		{
			char ch=first.charAt(i);
			if(Character.isLetter(ch))
			{
				name+=last+","+ch;
				break;
			}
			
		}
		System.out.println(name.trim());
	}

}
