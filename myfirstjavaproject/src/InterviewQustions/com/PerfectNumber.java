package InterviewQustions.com; 
public class PerfectNumber {

	public static void main(String[] args) {
		int n=1;
		int sum=0;
		if(n<=0)
		{
			System.out.println("invalid choice");
			return;
		}
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println();
		if(sum==n)
		{
			System.out.println("Yes the give number" + n + "is perfect number ");
		}
		else
		{
			System.out.println("No the given number " + n +" is not perfct  number ");
		}
	}

}
