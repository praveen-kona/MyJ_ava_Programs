package Practice;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int min_index=0;
		int max_index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_index=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
				min_index=i;
			}
		}
		System.out.println(min+" "+min_index);
		System.out.println(max+" "+max_index);

	}

}
