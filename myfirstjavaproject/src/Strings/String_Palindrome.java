package Strings;
import java.util.Scanner;
public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s string");
		String s=sc.nextLine();
		int start=0;
		boolean ispalindrome=true;
		int end=s.length()-1;
		while(end>start)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				ispalindrome=false;
				break;
			}
			end--;
			start++;
		}
		if(ispalindrome)
			System.out.println("Palindromme");
		else
			System.out.println("not palindrome");
		
		
		
	}

}
