	package ArraysandStrings;
	
	public class MissNumber {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {0,1,3};
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
			}
			
			int n=arr.length;
			int expect_Sum=n*(n+1)/2;
			int miss=expect_Sum-sum;
			System.out.println(miss);
			;
			
	
		}
	
	}
