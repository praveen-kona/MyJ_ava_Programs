package DailyPractice;

public class DailyPractice4_2 
{
	static int factorial(int num)
	{
		if(num==0)
			return 1;
		return num*factorial(num-1);
	}

public static void main(String[] args)
{
	int n=5;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	System.out.println(fact);
	System.out.println(factorial(5));
}
}
