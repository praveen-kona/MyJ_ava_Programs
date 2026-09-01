package Interfaces;

public interface Interafce_7
{
	private static void commonCode()
	{
		System.out.println("Checking payment details");
	}
	default void pay()
	{
		commonCode();
		System.out.println("Payment completed");
	}

}
