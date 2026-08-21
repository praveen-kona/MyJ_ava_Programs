package DayProgress;
import java.util.Scanner;
public class Day2Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number :");
		int num=sc.nextInt();
		int origin_num=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10 +num%10;
			num/=10;
		}
		if(rev==origin_num)
			System.out.println("It's a is Palindrome :"+origin_num);
		else
			System.out.println("It's not a Palindrome :"+origin_num);

	}

}
