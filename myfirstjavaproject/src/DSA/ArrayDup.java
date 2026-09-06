package DSA;

public class ArrayDup {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 20};

        int[] same = new int[arr.length];
        int s = 0;

        for (int i = 0; i < arr.length; i++) 
        {
        	boolean isfound=false;
        	for(int k=0;k<s;k++)
        	{
        		if(arr[i]==same[k])
        		{
        			isfound=true;
        			break;
        		}
     
        	}
        	if(isfound)
        	{
        		continue;
        	}
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			same[s]=arr[i];
        			s++;
        			break;
        		}
        	}
        	

            
        }

        // Print only the actual stored duplicates
        for (int i = 0; i < s; i++) {
            System.out.println(same[i]);
        }
    }
}