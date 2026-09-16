package Practice;

public class MinCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="heelo";
		char[] vowels= {'a','e','i','o','u'};
		int min=Integer.MAX_VALUE;
		for(int k=0;k<vowels.length;k++)
		{
			int cost=0;
			char target=vowels[k];
			int constant=10;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					if(target>ch)
					{
						cost=cost+(target-ch);
					}
					else
					{
						cost=cost+(ch-target);
					}
				}
				else
				{
					cost+=constant;
				}
				
			}
			if(cost<min)
			{
				min=cost;
			}
			System.out.println(cost);
		}
		System.out.println("min cost is"+min);
		
		

	}

}
