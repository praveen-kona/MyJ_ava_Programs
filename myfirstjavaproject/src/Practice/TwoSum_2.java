package Practice;
import java.util.*;
public class TwoSum_2 {
	static int[] array()
	{
		int[] arr= {2,7,11,13};
		int target=9;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)

				{
			int need=target-arr[i];
			if(map.containsKey(need))
			{
				return new int[] {map.get(need), i};
				
			}
			map.put(arr[i], i);
				}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(array()));
	}

}
