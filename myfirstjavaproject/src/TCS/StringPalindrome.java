package TCS;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abca";
		int left=0;
		int right=s.length()-1;
		boolean isfound=true;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				isfound=false;
				break;
			}
			left++;
			right--;
		}

		if(isfound)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
