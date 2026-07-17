package InterviewQustions.com;

public class PalindromeofNumber {

	public static void main(String[] args) {
		int num=101;
		int orig_num=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		if(orig_num==rev)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
