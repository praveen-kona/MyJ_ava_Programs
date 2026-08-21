package projects;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fisrt Number :");
		int num1=sc.nextInt();
		System.out.println("Enter second Number :");
		int num2=sc.nextInt();
		calculator(num1,num2,sc);
		sc.close();
		
	}

	static void calculator(int num1, int num2,Scanner sc)
	{
		System.out.println("Enter Operator :");
		String operator=sc.next();
		switch(operator)
		{
		case "+":
			System.out.println("Result : "+(num1+num2));
			break;
		case "-":
			System.out.println("Result :"+(num1-num2));
			break;
		case "*":
			System.out.println("Result :"+(num1*num2));
			break;
		case  "/":
		{
			if(num2==0)
				System.out.println("Cannot divide by zero");
			else
				System.out.println("Result :"+(num1/num2));
			break;		
		}
			
		case "%":
		{
			if(num2==0)
				System.out.println("Cannot divide by zero");
			else
				System.out.println("Result :"+(num1%num2));
			break;
		}
		default:System.out.println("Invalid Operator !");
		
		}
		
	}

}
