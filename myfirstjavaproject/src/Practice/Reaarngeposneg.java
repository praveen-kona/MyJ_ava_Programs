package Practice;

import java.util.Arrays;

public class Reaarngeposneg {

	public static void main(String[] args) {
		int[] arr= {1,1,-1,-1};
		int[] merge=new int[arr.length];
		int pos=0;
		int neg=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				merge[pos]=arr[i];
				pos+=2;
			}
			else
			{
				merge[neg]=arr[i];
				neg+=2;
			}
		}
		System.out.println(Arrays.toString(merge));

	}

}
