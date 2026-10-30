package Practice;

import java.util.Arrays;

public class RemovedupElementsArray {

	public static void main(String[] args) {
	int[] arr= {1,2,3,3,1,3,1,2,4,4,5,5};
	int[] dup=new int[arr.length];
	int d=0;
	for(int i=0;i<arr.length;i++)

	{
		boolean isfound=false;
		for(int k=0;k<d;k++)
		{
			if(arr[i]==dup[k])
			{
				isfound=true;
				break;
			}
		}
		if(!isfound)
		{
			dup[d]=arr[i];
			d++;
		}
		
	}
	System.out.println(Arrays.toString(Arrays.copyOf(dup,d)));
	}

}
