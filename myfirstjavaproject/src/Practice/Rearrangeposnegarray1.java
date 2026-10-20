 package Practice;

import java.util.Arrays;

public class Rearrangeposnegarray1 {

	public static void main(String[] args) {
		int[] arr= {1,-1,-1,1};
		int neg=1;
		int pos=0;
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				res[pos]=arr[i];
				pos+=2;
			}
			else
			{
				res[neg]=arr[i];
				neg+=2;
			}
		}
		System.out.println(Arrays.toString(res));

	}

}
