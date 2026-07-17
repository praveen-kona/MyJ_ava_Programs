package Strings;
import java.util.Scanner;

public class PrintAsciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any charcter:");
		char ch=sc.next().charAt(0);
		int ascii=(int)ch;
		System.out.println("Ascii value is :"+ascii);
		
		

	}

}
