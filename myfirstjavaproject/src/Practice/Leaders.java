package Practice;

import java.util.Arrays;

public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {16,17,4,3,5,2};
		int maxright=arr[arr.length-1];
		int[] leaders=new int[arr.length];
		leaders[0]=maxright;
		int l=1;
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>maxright)
			{
				leaders[l]=arr[i];
				l++;
				maxright=arr[i];
			}
		}
		int left=0;
		int right=l-1;
		while(left<right)
		{
			int temp=leaders[left];
			leaders[left]=leaders[right];
			leaders[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(Arrays.copyOf(leaders, l)));

	}

}
