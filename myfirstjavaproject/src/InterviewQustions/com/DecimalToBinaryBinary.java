package InterviewQustions.com;
import java.util.Scanner;
public class DecimalToBinaryBinary {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a decimal number :");
        int n=sc.nextInt();
        String binval=dectobin(n);
        System.out.println(binval);
        sc.close();
	
	}
	static String dectobin(int n)
	{
		String binval="";
		if(n==0)
			return "0";
		
		//shorter way
		
		String n1=Integer.toBinaryString(n);
		System.out.println(n1);
		//
		
		while(n>0)
		{
			binval=(n%2)+binval;
			n=n/2;
		}
		return binval;
	}

}
