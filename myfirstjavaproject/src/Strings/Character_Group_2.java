package Strings;

public class Character_Group_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123".matches("[0-9]+"));
		System.out.println("1".matches("[123]"));
		System.out.println("Abc".matches("[A-Za-z]"));
		
		System.out.println("Java123".matches("[A-Za-z0-9]+"));

	}

}
