package ArraysandStrings;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,-1,-1,2,2,2};
		int pos=0;
		int neg=1;
		int[] uniq=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				uniq[pos]=arr[i];
				pos+=2;
			}
			else {
				uniq[neg]=arr[i];
				neg+=2;
			}
		}
		System.out.println(Arrays.toString(uniq));

	}

}
