package ArraysandStrings;

public class OneRotationAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="cdab";
		if(s1.length()==s2.length())
		{
			if((s1+s1).contains(s2))
			{
				System.out.println("rotation");
			}
			else
			{
				System.out.println("Not rotation");
			}
		}else
		{
			System.out.println("Not rotation");
		}

	}

}
