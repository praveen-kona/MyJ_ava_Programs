package ArraysandStrings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		int left=0;
		int right=s.length()-1;
		boolean ispalindrome=true;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				ispalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(ispalindrome)
			System.out.println("yes");

		else
			System.out.println("not");
	}

}
