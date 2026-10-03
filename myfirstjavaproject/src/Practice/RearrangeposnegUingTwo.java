package Practice;

import java.util.Arrays;

public class RearrangeposnegUingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,-1,1,1,1,1};
		int pos=0;
		int neg=0;
		int index=0;
		int[] merge=new int[arr.length];
		int[] positive=new int[arr.length];
		int[] negative=new int[arr.length];
		int p=0;
		int n=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				positive[p++]=arr[i];
			}
			else
			{
				negative[n++]=arr[i];
			}
		}
		while(pos<p && neg <n)
		{
			merge[index++]=positive[pos++];
			merge[index++]=negative[neg++];
		}
		while(pos<p)
		{
			merge[index++]=positive[pos++];
		}
		while(neg<n)
		{
			merge[index++]=negative[neg++];
		}

		System.out.println(Arrays.toString(merge));
	}

}
