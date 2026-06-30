package com.javaintroduction;

public class BitwiseOperators {

	public static void main(String[] args) {
		// Bitwise operators
		
		int a=20;
		int b=30;
		
		System.out.println(true & true);
		System.out.println(1 & 0);
		System.out.println(1 & 1);
		System.out.println(true | true);
		System.out.println(1 | 0);
		System.out.println(1 | 1);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(false ^ true);
		System.out.println(1 ^ 1);
		System.out.println(0 ^ 1);
		System.out.println(1 ^ 0);
		System.out.println(0 ^ 0);
		System.out.println(~a);
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);

	}

}
