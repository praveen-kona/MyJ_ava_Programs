package Practice;

public class Find_Miss {

	void main(String[] args)
	{
		int[] arr= {1,2,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int n=arr.length+1;
		int expect=n*(n+1)/2;
		int miss=expect-sum;
		System.out.println(miss);
	}
}
