package Practice;

public class Mostfreqevensmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1};
		int mostfreq=-1;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isfound=true;
					break;
				}
			}
			if(isfound)
				continue;
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]%2==0)
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				mostfreq=arr[i];
			}
			else if(count==max && arr[i]<mostfreq)
			{
				mostfreq=arr[i];
			}
		}
		System.out.println(mostfreq);

	}

}
