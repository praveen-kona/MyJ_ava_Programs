package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSumTwo {
	public static int[] Arr(int target,int[] arr)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		
			int need=target-arr[i];
			if(map.containsKey(need))
			{
				
				return new int[] {map.get(need), i};
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		return new int[] {-1,-1};
			
		
	}

	public static void main(String[] args) {
		int[] arr= {2,7,11,8};
		int target=9;
		int[] arr1=Arr(target,arr);
		System.out.println(Arrays.toString(arr1));
		
		
	}

	

}
