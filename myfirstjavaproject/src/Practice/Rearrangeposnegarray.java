package Practice;

import java.util.Arrays;

public class Rearrangeposnegarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,-2,-2};
		int pos=0;
		int neg=1;

		int[] res=new int [arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
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
