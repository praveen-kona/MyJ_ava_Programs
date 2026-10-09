package Practice;

import java.util.Arrays;

public class MoveAllZerostoEnd {

	public static void main(String[] args) {

		int[] arr = {0, 1, 0, 3, 12};
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
