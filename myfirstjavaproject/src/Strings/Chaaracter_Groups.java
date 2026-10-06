package Strings;

public class Chaaracter_Groups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("b".matches("[a-c]"));
		System.out.println("abc".matches("[abc]"));
		System.out.println("abc".matches("[abc]+"));
		System.out.println("abccb".matches("[a-c]{5}"));

	}

}
