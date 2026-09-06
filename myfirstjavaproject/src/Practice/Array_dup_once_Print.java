package Practice;

public class Array_dup_once_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,10,20,40};
		
		int[] rem=new int[arr.length];
		int u=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isalredaystored=false;
			for(int k=0;k<u;k++)
			{
				if(arr[i]==rem[k])
				{
					isalredaystored=true;
					break;
				}
			}
			if(isalredaystored)
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					rem[u]=arr[i];
					u++;
					break;
				}
			}
			
		}
		for(int i=0;i<u;i++)
		{
			System.out.println(rem[i]);
		}

	}

}
