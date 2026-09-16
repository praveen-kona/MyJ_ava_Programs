package Practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int orig_num=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if(orig_num==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}

		int n1=1;
		System.out.println(n1/10);
	}

}
