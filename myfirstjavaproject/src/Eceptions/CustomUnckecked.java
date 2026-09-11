package Eceptions;

public class CustomUnckecked {

	static void balnceCheck(double balance)
	{
		if(balance<0)
		{
			throw new InvalidBalnceException("invalid balnce guru");
		}
		System.out.println("valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			balnceCheck(-1);
		} catch (InvalidBalnceException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
