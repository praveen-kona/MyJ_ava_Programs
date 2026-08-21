package DayProgress;
import java.util.Scanner;
public class Day2Task10 {

	static String divisible(int num)
	{
		if(num % 5 == 0 && num % 11 == 0)
			return num+ " is divisible by both 5 and 11";
		else
			return num+ " is not divisible by both 5 and 11";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		System.out.println(divisible(num));

	}

}
