package com.jvm;

public class Jvm {

	public static void main(String[] args) throws  ClassNotFoundException{
		var arr=new int[5];
		System.out.println(((Object)arr).getClass().getSimpleName());
		Class.forName("hello");

	}

}
