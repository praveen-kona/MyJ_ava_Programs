package DSA;

public class MinElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,-5,-90,-4,30};
		int min=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				index=i;
			}
		}
		System.out.println(min+" is min element at index "+index);
	}

}
