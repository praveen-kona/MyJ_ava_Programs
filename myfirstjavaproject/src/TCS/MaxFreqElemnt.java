package TCS;

public class MaxFreqElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 3, 2, 4, 3, 2, 5};
		int max=0;
		int elemnt=0;

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
			System.out.println(arr[i]+" -> "+count);
			if(count>max)
			{
				max=count;
				elemnt=arr[i];
			}
		}
		System.out.println(elemnt+" is max freq elemnt is an array :"+max);
	}

}
