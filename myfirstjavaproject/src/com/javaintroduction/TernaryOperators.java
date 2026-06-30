package com.javaintroduction;

public class TernaryOperators {

	public static void main(String[] args) {
		
		int a=1;
		int b=5;
		int c=3;
		 System.out.println((a>b)?(a>c)?a:c :(b>c)?b:c);
		
		// Ternary Operators
		
		int d=10;
		int e=40;
		int f=50;
		
		int max=(d>e)?(d>f)?(d):(f) :(e>f)?(e):(f);
		System.out.println(max);
		
		
		

	}

}
