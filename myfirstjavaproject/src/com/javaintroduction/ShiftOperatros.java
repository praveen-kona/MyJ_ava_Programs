package com.javaintroduction;

public class ShiftOperatros {

	public static void main(String[] args) {
		int a=5;
		int b=-5;
		
		System.out.println(a<<1);
		System.out.println(a>>1);//this right shift and unsigned right shift gives same values
		System.out.println(a>>>1);// but difference values gives interms of negative values
		System.out.println(b>>>1);// like this

	}

}
