package InterviewQustions.com;

public class CountEvenNumbersInaDidgit {
	static int method()
	{
	int n=0123;
	
	int count=0;
	if(n==0)
	{
		return 1;
	}

	while(n!=0)
	{
		int n1=n%10;
		if(n1%2==0)
		{
			count++;
		}
		n=n/10;
	}
	return count;
	}
	public static void main(String[] args) {
		
		
System.out.println(method());
	}

}
