package DSA;

public class MaxElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,3,4,3};
		int max=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println(max + " is max element at index "+index);
		

	}

}
