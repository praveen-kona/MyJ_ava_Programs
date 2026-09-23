package ArraysandStrings;

import java.util.Arrays;
import java.util.HashMap;

public class TwosumPariGiven_sum {
	
 public static int[] twosum(int[] arr,int target)
{
	HashMap<Integer,Integer> map=new HashMap<>();
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
	return new int[] {-1, -1};
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,8,10};
		int target=11;
		int[] res=twosum(arr,target);
		System.out.println(Arrays.toString(res));
		

	}

}
