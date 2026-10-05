package Strings;

public class Regex1 {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.matches("[a-z]+"));
		System.out.println("55".matches("[0-9]+"));
		System.out.println("5".matches("[0-9]+"));
		System.out.println("".matches("[A-Z]+"));

	}

}
