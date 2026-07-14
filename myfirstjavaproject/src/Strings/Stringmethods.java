package Strings;

public class Stringmethods {

	public static void main(String[] args) {
		String s="praveen";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.substring(1,6));
		System.out.println(s.equalsIgnoreCase("Praveen"));
		System.out.println(s.equals("Praveen"));
		System.out.println(s.contains("ra"));
		System.out.println(s.concat(" hello"));
		System.out.println(s.startsWith("P"));
		System.out.println(s.endsWith("n"));
		System.out.println(s.indexOf("n"));
		System.out.println(s.lastIndexOf("n"));
		System.out.println(s.trim());
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		System.out.println(s.concat(" hi"));
		String[] k=s.split(",");
		System.out.println(k);

	}

}
