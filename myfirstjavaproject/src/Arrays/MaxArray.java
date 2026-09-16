package Arrays;

public class MaxArray
{
    void mein()
    {
        int[] arr={1,2,5,6,7};
        int max=arr[0];
        int day=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                day=i;
            }
        }
        System.out.println("Highest Sales ="+max);
        System.out.println("Day "+day);
    }
    public static void main(String[] args)
    {
        MaxArray a1=new MaxArray();
        a1.mein();
    }
}
