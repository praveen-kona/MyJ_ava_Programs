package Strings;

import java.util.Arrays;

public class CountNoCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is super";
		String[] s4=s.split(" ");
		System.out.println(Arrays.toString(s4));
		System.out.println(s4.length);
		int k=0;
		for(int i=0;i<s4.length;i++)
		{
			System.out.println(s4[i]);
			k++;
		}
		System.out.println();
		System.out.println(k);
		System.out.println(Arrays.toString(s.split(" ")));
		int count=0;
		System.out.println(s.trim().length());
		for(int i=0;i<s.length();i++)
		{
			
		}
		System.out.println(count);
		
		String s1="  java is super  ";
		String s3="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s3+=s1.charAt(i);
		}
		System.out.println(s3);
		System.out.println(s1.trim());

	}

}
