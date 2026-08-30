package Revision;
import java.util.*;
public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your full name : ");
		String name=sc.nextLine();
		System.out.println("Enter your salary : ");
		double sal=sc.nextDouble();
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+sal);

	}

}
