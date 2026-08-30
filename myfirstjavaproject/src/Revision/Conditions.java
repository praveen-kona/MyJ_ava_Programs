package Revision;
import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks=sc.nextInt();
		if(marks<0 || marks >100)
			System.out.println("invlaid Marks");
		else if(marks>=90)
			System.out.println("A");
		else if (marks>=75)
			System.out.println("B");
		else if(marks>=60)
			System.out.println("C");
		else if(marks>=40)
			System.out.println("D");
		else 
			System.out.println("Fail");

	}

}
