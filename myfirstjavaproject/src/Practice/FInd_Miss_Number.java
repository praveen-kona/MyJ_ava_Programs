package Practice;

public class FInd_Miss_Number {

	public static void main(String[] args) {
		int[] arr = {0,1};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int n=arr.length+1;
		long expec_sum=n*(n+1)/2;
		long mis=expec_sum-(long)sum;
		System.out.println(mis);
		System.out.println(mis-sum);

	}

}
