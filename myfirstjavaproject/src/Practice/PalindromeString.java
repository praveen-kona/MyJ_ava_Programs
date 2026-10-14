package Practice;

public class PalindromeString {

	public static void main(String[] args) {
	String s="praveen";
	int left=0;
	int right=s.length()-1;
	boolean isfound=true;
	while(left<right)
	{
		if(s.charAt(left)!=s.charAt(right))
		{
			isfound=false;
			break;
		}
		left++;
		right--;
	}
	if(isfound)
		System.out.println("yes");
	else
		System.out.println("not");

	}

}
