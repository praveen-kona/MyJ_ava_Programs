package Practice;

import java.util.Arrays;

public class LeadersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {16,17,4,3,5,2};
		int maxRight=arr[arr.length-1];
		int[] leader=new int[arr.length];
		int l=0;
		leader[l]=maxRight;

		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>maxRight)
			{
				leader[l+1]=arr[i];
				l++;
				maxRight=arr[i];
			}
		}
		int left=0;
		int right=l;
		while(left<right)
		{
			int temp=leader[left];
			leader[left]=leader[right];
			leader[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(Arrays.copyOf(leader, l+1)));
	}

}
