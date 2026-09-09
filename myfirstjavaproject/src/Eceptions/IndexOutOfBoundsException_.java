package Eceptions;

public class IndexOutOfBoundsException_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
char[] ch= {'1','4','/','?'};
System.out.println(ch[3]);
try {
	System.out.println(ch[9]);
}
catch(Exception e)
{
	System.out.println(e.toString());
}

	}

}
