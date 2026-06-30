package com.jvm;

class Prime
{
    public static void main(String[] args)
    {
        int num=7;
        
        for(int i=num+1;i>=num;i++)
        {
        	int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                   count++;
                    
                }
            }
             if(count==2)
            {
                System.out.println(i);
            }
            
        }
    }
}
