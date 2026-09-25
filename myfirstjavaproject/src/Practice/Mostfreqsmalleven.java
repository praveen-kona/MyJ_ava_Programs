package Practice;

public class Mostfreqsmalleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,4,2,2,1};
		int max=0;
		int most_freq=-1;
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
				most_freq=arr[i];
			}
			else if(count==max && arr[i]<most_freq)
				{
					most_freq=arr[i];
				}
		}
		if(most_freq!=-1)
		{
			System.out.println(most_freq);
		}
		else
		{
			System.out.println(most_freq);
		}
	}

}
