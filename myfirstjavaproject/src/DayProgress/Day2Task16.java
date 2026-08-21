package DayProgress;
import java.util.Scanner;
public class Day2Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int first_digit=0;
		while(num>0)
		{
			first_digit=num%10;
			num/=10;
			
		}

		System.out.println("First Digit is :"+first_digit);
	}

}
