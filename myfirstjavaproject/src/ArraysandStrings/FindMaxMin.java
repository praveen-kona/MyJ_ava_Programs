package ArraysandStrings;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 45, 7, 89, 23};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{	
				min=arr[i];
			}
		}
		System.out.println("Min is :"+min);

		System.out.println("Max is :"+max);
	}

}
