package Practice;

public class RemoveDup {

	public static void main(String[] args) {
		int[] arr= {10,20,10,20,30,40};
		int[] uniq=new int[arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int j=0;j<u;j++)
			{
				if(arr[i]==arr[j])
				{
					isfound=true;
					break;
				}
			}
			if(!isfound)
			{
				uniq[u]=arr[i];
				u++;
			}
		}
		for(int i=0;i<u;i++)
		{
			System.out.println(uniq[i]);
		}

	}

}
