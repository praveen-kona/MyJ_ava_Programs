package Strings;

public class Palindrome_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="121";
		int last=s.length()-1;
		int first=0;
		boolean palind=true;
		while(first<last)
		{
			if(s.charAt(first)!=s.charAt(last))
			{
				palind=false;
				break;
			}
			last--;
			first++;
		}
		
		if(palind)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}

	}

}
