package StringFormats;
import java.util.*;
public class Print15char3digist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int k=100;
			System.out.printf("%-15s%03d%n",s,k);
		}

	}

}
