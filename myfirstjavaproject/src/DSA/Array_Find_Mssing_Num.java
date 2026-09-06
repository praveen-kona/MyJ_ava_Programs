package DSA;

public class Array_Find_Mssing_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 0, 5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int n=arr.length-1;
		int expected_sum=n*(n+1)/2;
		int miss=expected_sum-sum;
		System.out.println(miss);

	}
}
