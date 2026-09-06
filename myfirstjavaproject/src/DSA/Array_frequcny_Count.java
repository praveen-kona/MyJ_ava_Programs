package DSA;

public class Array_frequcny_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 10, 30, 20, 10};
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
					count++;
			}
			System.out.println(arr[i]+" -> "+count);
			
		}

	}

}
