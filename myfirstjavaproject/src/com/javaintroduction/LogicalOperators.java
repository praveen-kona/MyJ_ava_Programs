package com.javaintroduction;

public class LogicalOperators {

	public static void main(String[] args) {
		
		// Logical Operators
		
		int a=9;
		int b=11;
		System.out.println(a>b && a<b);
		System.out.println(b>a || a>b);
		System.out.println(!(a>b));
		System.out.println(!(b>a));
		
		System.out.println(++a>b || b>a);
		System.out.println(a);
	}

}
