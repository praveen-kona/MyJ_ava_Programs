	package Practice;
	
	public class MostFrequently {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {1,2,2,3,2,2,7,8};
			int max=0;
			int mostfreq=0;
			for(int i=0;i<arr.length;i++)
			{
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count>max)
				{
					max=count;
					mostfreq=arr[i];
				}
			}
			System.out.println(mostfreq);
			
	
		}
	
	}
