package DayProgress;

public class Day2Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=900;
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			num/=10;
			sum=sum+last;
		}
		System.out.println("Sum of its Digits :"+sum);

	}

}
