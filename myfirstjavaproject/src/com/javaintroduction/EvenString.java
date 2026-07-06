package com.javaintroduction;

public class EvenString {

	public static void main(String[] args) {
		String s="Praveen";
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("Even string after deletion :"+s.charAt(i)+i);
			}
		}
	}

}
