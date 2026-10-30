package Practice;

public class LCS {
	public static int Longest(String text1,String text2)
	{
		int n=text1.length();
		int m=text2.length();
		int[][] dp=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
				{
					dp[i][j]=0;
				}
				else if(text1.charAt(i-1)==text2.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
			
		}
		return dp[n][m];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Longest("abc","aac"));
		

	}

}
