package Practice;

public class COuntSubArraysWithgivenSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -1, 2, 3, -2};
        int target = 3;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        		int sum=0;
        		for(int j=i;j<arr.length;j++)
        		{
        			sum+=arr[j];
        			if(sum==target)
        			{
        				count++;
        				for(int k=i;k<=j;k++)
        				{
        					System.out.print(arr[k]+" ");
        				}
        				System.out.println();
        			}
        		}
        }
        System.out.println(count);
	}

}
