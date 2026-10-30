package Practice;

public class FIndMissNUmber {

	public static void main(String[] args) {
		int[] arr= {0,2,3};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int n=arr.length;
		int expect_sum=n*(n+1)/2;
		System.out.println(expect_sum-sum);

	}

}
