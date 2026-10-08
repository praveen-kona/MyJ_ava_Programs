package Practice;

public class CheckIfAplhabets {

	public static void main(String[] args) {

//		String s = "Java";
//		if(s.matches("[A-Za-z]+"))
//		{
//			System.out.println("only alphabets");
//		}
//		else
//		{
//			System.out.println("not only alphabets");
//		}
		
		
		String s = "Java";
		boolean isfound=true;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				isfound=false;
				break;
			}
		}
		if(isfound)
			System.out.println("only alpha");
		else
			System.out.println("not only alpha");

	}

}
