package DayProgress;
import java.util.Scanner;
public class Day2Task9 {
	static int lastDIgit(int num)
	{
		
		
		return num%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		System.out.println(lastDIgit(num));

	}

}
