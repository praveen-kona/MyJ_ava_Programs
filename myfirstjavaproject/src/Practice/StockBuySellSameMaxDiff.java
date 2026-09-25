package Practice;

public class StockBuySellSameMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2,3,4,5};
		int minPrice=prices[0];
		int maxProfit=0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]<=minPrice)
			{
				minPrice=prices[i];
			}
			else
			{
				int minProfit=prices[i]-minPrice;
				if(minProfit>maxProfit)
				{
					maxProfit=minProfit;
				}
			}
		}
		System.out.println(maxProfit);
		

	}

}
