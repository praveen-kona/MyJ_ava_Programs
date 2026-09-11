package Eceptions;

public class Exception_Propagation {
	static void method1()
	{
		System.out.println(10/0);
	}
	static void method2()
	{try {
        method1();
    }
    catch (ArithmeticException e) {
        System.out.println("Handled in method2");
    }
	}
	static void method3()
	{
		method2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method3();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
