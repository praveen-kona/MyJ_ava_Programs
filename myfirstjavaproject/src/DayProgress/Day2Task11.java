package DayProgress;
import java.util.Scanner;
public class Day2Task11 {

	static int twoDigitnumRev(int n)
	{
		
		return (n%10)*10+(n/=10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		//last digit × 10 + first digit  for 2 digit number;
		System.out.println("Reversed Number is :"+twoDigitnumRev(n));
		
		
		
	}

}
