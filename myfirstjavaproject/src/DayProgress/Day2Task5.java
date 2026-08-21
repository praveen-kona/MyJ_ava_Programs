package DayProgress;
import java.util.Scanner;
public class Day2Task5 {

	static String evenOrOdd(int num)
	{
		if(num%2==0)
			return num+" is Even";
		else
			return num+" is Odd";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number :");
		int num=sc.nextInt();
		String res=evenOrOdd(num);
		System.out.println(res);

	}

}
