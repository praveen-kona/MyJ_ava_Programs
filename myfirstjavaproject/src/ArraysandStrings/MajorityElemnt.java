package ArraysandStrings;

public class MajorityElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,1,1,1,2,2};
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
			if(count>arr.length/2)
			{
				max=arr[i];
			}
		}
		if(max!=-1)
		{
			System.out.println("and majority elemnt is : "+max);
		}
		else
		{
			System.out.println("not majority elkemnt");
		}

	}

}
