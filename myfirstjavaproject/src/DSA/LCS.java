package DSA;

public class LCS {
	static void lcs(String s1,String s2)
	{
		int n=s1.length();
		int m=s2.length();
		int[][] dp=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		System.out.println(dp[n][m]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lcs("abc","def");
		
		/*
		 "I used dynamic programming. I maintain a 2D table where dp[i][j] represents the length of the longest common subsequence of the first i characters of the first string and first j characters of the second string. If the current characters match, I add one to the diagonal value. Otherwise, I take the maximum of the top and left values. Finally, dp[n][m] gives the LCS length."
		 */
		

	}

}
