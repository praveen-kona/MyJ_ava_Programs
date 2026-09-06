	package DSA;
	
	public class Array_Second_Largest {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {1,2,1};
			int max=Integer.MIN_VALUE;
			int second_max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					second_max=max;
					max=arr[i];
				}
				else
					if(arr[i]>second_max && arr[i]!=max)
					{
						second_max=arr[i];
					}
			}
			if(second_max==Integer.MIN_VALUE)
			{
				System.out.println("not found ");
			}
			else
			{
				System.out.println("found "+second_max);
			}
	
		}
	
	}
