package Strings;

public class ReplaceAllWithRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java123python456";
		System.out.println(s.replaceAll("[0-9]+"," "));
		System.out.println(s.replaceAll("\\d","#"));
		System.out.println(s.replaceAll("\\w","123"));

	}

}
