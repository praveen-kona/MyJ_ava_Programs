package Practice;

public class MinCOstRequiredToconvVowelVowel {

	public static void main(String[] args) {
		String s="abc";
		char[] vowels= {'a','e','i','o','u'};
		 int min=Integer.MAX_VALUE;
		for(int k=0;k<vowels.length;k++)
		{
			char target=vowels[k];
			 int cost=0;
		
		
			 for(int i=0;i<s.length();i++)
			 {
				 
				 char ch=s.charAt(i);
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 if(target>=ch)
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
					 cost=cost+10;
				 }
			 }
				 if(cost<min)
				 {
					 min=cost;
				 }
			
		}
		 
		 System.out.println(min);
		

	}

}
