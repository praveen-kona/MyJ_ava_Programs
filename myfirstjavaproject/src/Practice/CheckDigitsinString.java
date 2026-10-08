package Practice;

public class CheckDigitsinString {

	public static void main(String[] args) {
		String s = "123456";
		
		if(s.matches("[0-9]+"))
		{
			System.out.println("only digists");
		}
		else
		{
			System.out.println("not only digists");
		}
		
//		String s = "12345fs";
//		boolean isDigit = true;
//
//		for(int i = 0; i < s.length(); i++)
//		{
//		    if(!Character.isDigit(s.charAt(i)))
//		    {
//		        isDigit = false;
//		        break;
//		    }
//		}
//
//		if(isDigit)
//		    System.out.println("Only Digits");
//		else
//		    System.out.println("Not Only Digits");
		
	}

}
