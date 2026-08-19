package InterviewQustions.com;
import java.util.Scanner;
public class PerfectNumberUsingMethods {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		boolean status=isPerfect(n);

		System.out.println(status);
	}
	static boolean isPerfect(int n)
	{
		boolean status=false;
		int sum=0;
		if(n<=0)
			return false;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			status=true;
		}
		return status;
	}

}
