package com.javaintroduction;
import java.util.Scanner;
public class Sumarraywithoutmethod 
{
	static void sum()
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
		     arr[i]=sc.nextInt();
			 System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		Sumarraywithoutmethod.sum();

	}

}
