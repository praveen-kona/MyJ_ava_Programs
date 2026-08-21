package DayProgress;
import java.util.Scanner;
public class Day2Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		int even_sum=0;
		int rev=0;
		while(num>0)
		{
			rev=num%10;
			if(rev%2==0)
			{
				even_sum+=rev;
			}
			num/=10;
				
		}
		System.out.println("Sum of even digits:"+even_sum);
	}

}
