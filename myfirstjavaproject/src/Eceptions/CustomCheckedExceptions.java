package Eceptions;

public class CustomCheckedExceptions {

	static void chechAge(int age) throws InvalidAgeException_1
	{
		if(age<18)
		{
			throw new InvalidAgeException_1("invalid age boos ");
		}
		System.out.println("eligible");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			chechAge(1);
		} catch (InvalidAgeException_1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
