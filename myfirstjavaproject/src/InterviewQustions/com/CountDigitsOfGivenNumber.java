package InterviewQustions.com;
import java.util.Scanner;

public class CountDigitsOfGivenNumber {
	static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int count=count(n);
		System.out.println(count);

	}

}
