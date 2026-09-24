	package Practice;
	
	public class MostFrequentlysmallEven {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {0,0,0};
			int max=0;
			int mostfreq=-1;
			for(int i=0;i<arr.length;i++)
			{
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
				else
					if(count==max && arr[i]<mostfreq)
					{
						mostfreq=arr[i];
					}
			}
			if(mostfreq!=-1)
			{
				System.out.println(mostfreq);
			}
			else
			{
				System.out.println(mostfreq);
			}
			
	
		}
	
	}
