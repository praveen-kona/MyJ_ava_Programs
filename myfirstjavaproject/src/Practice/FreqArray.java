package Practice;

public class FreqArray {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,3,3,3};
		int maj=0;
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
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
			
//			for majority element
			if(count>arr.length/2)
			{
				maj=arr[i];
			}
		}
		System.out.println(maj);

	}

}
