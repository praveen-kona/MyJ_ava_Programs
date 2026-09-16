package Practice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=152;
		int n1=n;
		int n2=n1;
		int sum=0;
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);
		while(n1>0)
		{
			int rem=n1%10;
			sum=(int)(Math.pow(rem, count)+sum);
			n1/=10;
		}
		if(n2==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("not");
		}

	}

}
