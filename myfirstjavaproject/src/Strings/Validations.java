package Strings;

public class Validations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone="5848520077";
		System.out.println(phone.matches("[0-9]{10}"));
		System.out.println(phone.matches("\\d{10}"));
		System.out.println(phone.matches("[6-9]{1}[0-9]{9}"));
		System.out.println("98700".matches("[0-9]{2,5}"));

	}

}
