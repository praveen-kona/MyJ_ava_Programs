package Practice;

public class MissNumber_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 5, 6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int n=arr.length+1;
		long expect_sum=n*(n+1)/2;
		long mis=expect_sum-sum;
		System.out.println(mis);

	}

}
