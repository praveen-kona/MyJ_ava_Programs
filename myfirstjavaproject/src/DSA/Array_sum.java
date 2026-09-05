package DSA;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, -5, 20, -10, 30};
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0 && arr[i]%2==0)
			{
				sum+=arr[i];
				count++;
			}
		}
		System.out.println(sum);
		
		System.out.println(count);

		

	}

}
