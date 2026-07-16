package Arrays;

public class RemoveDuplicatesFromSortedArray
{
    static int removedup(int[] arr)
    {
        int rd=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[rd])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }
        
        return rd+1;
    }
    public static void main(String[] args)
    {
        int[] arr={2,3,2,4,3,6};
         System.out.println("array elemnts before removing duplicate elments: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       int rd= removedup(arr);
       System.out.println();
       System.out.println("After removing duplicates :");
       for(int i=0;i<rd;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}
