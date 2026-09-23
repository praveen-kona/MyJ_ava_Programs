package ArraysandStrings;

public class TwoSum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,10,11};
		int target=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}

	}

}
