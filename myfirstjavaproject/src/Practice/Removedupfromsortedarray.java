package Practice;

public class Removedupfromsortedarray {
	static int remove(int[] arr)
	{
		int rd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[rd])
			{
				rd++;
				arr[rd]=arr[i];
			}
		}
		return rd+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,3,3,4,4,5,5};
		int rd=remove(arr);
		for(int i=0;i<rd;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
