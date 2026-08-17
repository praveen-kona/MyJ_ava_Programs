package DailyPractice;
import java.util.Scanner;


public class DailyPractice_6 
{

	static void salarySlip(String employeeName, double basicSalary)
	{
		double hra =basicSalary*20/100;
		double da=basicSalary*10/100;
		double grosssalary=basicSalary+hra+da;
		
		System.out.println("Employee name : "+employeeName);
		System.out.println("Basic Salary : "+basicSalary);
		System.out.println("HRA (20%) : "+hra);
		System.out.println("DA (10%) : "+da);
		System.out.println("Gross Salary  : "+grosssalary);
	}
	public static void main(String[] args) {
		/*
		 *Java Assignment – Methods with Scanner
Task: Salary Slip Generator
Create a Java program that reads the employee name and basic salary using the Scanner class.
Create a method:
void salarySlip(String employeeName, double basicSalary)
Inside the method, calculate and display the following:
HRA = 20% of the Basic Salary
DA = 10% of the Basic Salary
Gross Salary = Basic Salary + HRA + DA

Sample Input:
Enter Employee Name: Krishna
Enter Basic Salary: 30000

Expected Output:
Employee Name : Krishna
Basic Salary  : 30000.0
HRA (20%)     : 6000.0
DA (10%)      : 3000.0
Gross Salary  : 39000.0

Formula
HRA = Basic Salary × 20 / 100
DA = Basic Salary × 10 / 100
Gross Salary = Basic Salary + HRA + DA
		 */
Scanner sc=new Scanner(System.in);
System.out.println("enter Employee name : ");
 String employeeName=sc.nextLine();
 System.out.println("enter Basic Salary : ");
 double basicSalary=sc.nextDouble();
 salarySlip( employeeName,  basicSalary);
 sc.close();
 
 }

}
