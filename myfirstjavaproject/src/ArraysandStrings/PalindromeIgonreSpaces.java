package ArraysandStrings;

public class PalindromeIgonreSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man a plan a canal Panama";
		s=s.toLowerCase().replace(" ", "");
		System.out.println(s);
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
			System.out.println("not");
		}

	}

}
