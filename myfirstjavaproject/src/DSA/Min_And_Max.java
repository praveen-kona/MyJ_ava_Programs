package DSA;

public class Min_And_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, -5, 30, 20, -5, 40};
		
		if(arr.length==0)
		{
			System.out.println("Empty array");
		}
		else
		{
			int max=arr[0];
			int min=arr[0];
			int index=0;
			int index_max=0;
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					index=i;
				}
				if(arr[i]>max)
				{
					max=arr[i];
					index_max=i;
				}
			}
			System.out.println(min+" is min element at index "+index);
			System.out.println(max + " is max element at index "+index_max);
		}
		

	}

}
