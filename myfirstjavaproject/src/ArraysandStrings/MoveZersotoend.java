package ArraysandStrings;

import java.util.Arrays;

public class MoveZersotoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,0,0,4};
		int nz=0;
		int z=0;
		while(nz<arr.length)
		{
			if(arr[nz]!=0)
			{
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
			}
			else
			{
				nz++;
			}
		}
		System.out.println(Arrays.toString(arr));
			

	}

}
