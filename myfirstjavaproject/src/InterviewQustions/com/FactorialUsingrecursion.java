package InterviewQustions.com;
import java.util.Scanner;

public class FactorialUsingrecursion {
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
		
		
		/* n=4
		 4*factorila(4-1)->4*factorial(3) ->4*6
		 ->3*factorila(3-1)->3*factorila(2) ->3*2
		 ->2*factorila(2-1)-2*factorila(1) ->2*1=2
		*/
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number :");
	int num=sc.nextInt();
	int fact=factorial(num);
	System.out.println("factorila of the given number "+num+" is :5"+fact);
	

		
	}

}
