package DayProgress;
import java.util.Scanner;
public class Day2Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int count=0;
		if(num==0)
			System.out.println("Count : 1");
		else
		{
			while(num>0)
			{
				num/=10;
				count++;
			}
			System.out.println("Count :"+count);
		}
	}

}
