	package DSA;
	
	public class Array_Second_Smallest {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {5, 2, 8, 2, 10};
			int min=Integer.MAX_VALUE;
			int second_min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					second_min=min;
					min=arr[i];
				}
				else
					if(arr[i]<second_min && arr[i]!=min)
					{
						second_min=arr[i];
					}
			}
			if(second_min==Integer.MAX_VALUE)
			{
				System.out.println("not found ");
			}
			else
			{
				System.out.println("found "+second_min);
			}
	
		}
	
	}
