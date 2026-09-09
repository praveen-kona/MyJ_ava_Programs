package Eceptions;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		if(age<18)
		{
			throw new ArithmeticException("age is less than 18 so cant do anything");
		}
		System.out.println("Eligible ");
		
		

	}

}
