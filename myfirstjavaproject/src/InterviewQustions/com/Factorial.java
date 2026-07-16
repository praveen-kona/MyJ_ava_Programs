package InterviewQustions.com;
import java.util.Scanner;
public class Factorial {
 static int factorial(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
int fact=factorial(num);
System.out.println("factorial of "+num+ " is :"+fact);

	}

}
