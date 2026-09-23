package ArraysandStrings;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0";
		boolean isfound=true;
		int left=0;
		int right=s.length()-1;

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
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
