	package Practice;
	
	public class Find_dup {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {10, 20, 30, 20, 40, 10, 20};
			 int[] once=new int[arr.length];
			 int s=0;
			for(int i=0;i<arr.length;i++)
			{
				boolean isfound=false;
				for(int k=0;k<s;k++)
				{
					if(arr[i]==once[k])
					{
						isfound=true;
						break;
					}
				}
				if(isfound)
					continue;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						once[s]=arr[i];
						s++;
						break;
					}
				}
			}
			for(int i=0;i<s;i++)
			{
				System.out.println(once[i]);
			}
	
		}
	
	}
