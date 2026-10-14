package Practice;

public class RemveDupKepFirst {

	public static void main(String[] args) {
		int[] arr= {1,4,2,2,4,5};
		int[] dup=new int[arr.length];
		int d=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isfound=false;
			for(int k=0;k<d;k++)
			{
				if(arr[i]==dup[k])
				{
					isfound=true;
					break;
				}
			}
			if(!isfound)
				{
				dup[d]=arr[i];
				d++;
				}
				
				}
			
		for(int i=0;i<d;i++)
		{
			System.out.println(dup[i]);
		}
	}

}
