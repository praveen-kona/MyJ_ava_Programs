package com.javaintroduction;
public class Twoarraysum 
{
	public void sum()
	{
		int[] arr1= {1,2,3,4,5};
		int[] arr2={1,2,3,4,5};
		int[] arr3=new int[5];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" "+arr2[i]);
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
		
	}

	public static void main(String[] args) {
		Twoarraysum t1=new Twoarraysum();
		t1.sum();
		


	}

}
