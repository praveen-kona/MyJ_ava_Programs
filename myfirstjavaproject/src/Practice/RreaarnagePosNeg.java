package Practice;

import java.util.Arrays;

public class RreaarnagePosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,-1,-2};
		int pos=0;
		int neg=1;
		int[] merge=new int[arr.length];
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
