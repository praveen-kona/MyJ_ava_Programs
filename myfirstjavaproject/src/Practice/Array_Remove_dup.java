package Practice;

public class Array_Remove_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,10,20,40};
		
		int[] rem=new int[arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isalredaystored=false;
			for(int j=0;j<u;j++)
			{
				if(arr[i]==rem[j])
				{
					isalredaystored=true;
					break;
				}
			}
			if(!isalredaystored)
			{
				rem[u]=arr[i];
				u++;
			}
		}
		for(int i=0;i<u;i++)
		{
			System.out.println(rem[i]);
		}

	}

}
