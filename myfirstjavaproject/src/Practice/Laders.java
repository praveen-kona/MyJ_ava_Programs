package Practice;

import java.util.Arrays;

public class Laders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {16,17,4,3,5,2};
		int maxRight=arr[arr.length-1];
		int[] leaders=new int[arr.length];
		int l=0;
		leaders[l]=maxRight;
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>maxRight)
			{
				leaders[l+1]=arr[i];
				l++;
				maxRight=arr[i];
			}
		}
		int left=0;
		int right=l;
		while(left<right)
		{
			int temp=leaders[left];
			leaders[left]=leaders[right];
			leaders[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(Arrays.copyOf(leaders, l+1)));

	}

}
