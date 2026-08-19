package InterviewQustions.com;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  number:");
		int n=sc.nextInt();
		boolean status=isArmStrong(n);
		System.out.println(status);

	}
	static boolean isArmStrong(int n)
	{
	    int n1=n;
	    String str=Integer.toString(n);
		int count=str.length();
		int sum=0;
		System.out.println(count);
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			sum=(int)(Math.pow(rem, count)+sum);
		}
		if(sum==n1)
		{
			return true;
		}
		return false;
	}

}
