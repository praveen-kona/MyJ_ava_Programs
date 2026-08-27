package Interview_Prep;
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stirng");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
