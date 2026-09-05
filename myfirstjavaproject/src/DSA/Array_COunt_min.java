package DSA;

public class Array_COunt_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20,30,10,20,10};
		int count=1;
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			if(arr[i]<min)
			{
				min=arr[i];
				count=1;
			}
			else if(arr[i]==min)
			{
				count++;
			}
		}
		System.out.println(min+" count is "+count);
		System.out.println(max);

	}

}
