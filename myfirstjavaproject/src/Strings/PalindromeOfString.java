package Strings;

public class PalindromeOfString {

	String s1="121";
	String s2=s1.toLowerCase();
	StringBuilder sb=new StringBuilder();
	void method()
	{
		for(int i=s2.length()-1;i>=0;i--)
		{
			sb.append(s2.charAt(i));
		}
		String s3=sb.toString();
		if(s2.equals(s3))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		PalindromeOfString p1=new PalindromeOfString();
		p1.method();
	}

}
