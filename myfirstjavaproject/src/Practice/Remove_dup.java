package Practice;

public class Remove_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,10};
		int[] rem=new int[arr.length];
		int r=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int j=0;j<r;j++)
			{
				if(arr[i]==rem[j])
				{
					isfound=true;
					break;
				}
			}
			if(!isfound)
			{
				rem[r]=arr[i];
				r++;
			}
		}
		for(int i=0;i<r;i++)
		{
			System.out.println(rem[i]);
		}

	}

}
