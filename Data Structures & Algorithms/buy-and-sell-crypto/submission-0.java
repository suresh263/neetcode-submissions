class Solution {
    public int maxProfit(int[] prices) {
        int max_profits = 0;

        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                max_profits = Math.max(max_profits,prices[j]-prices[i]);
            }
        }
    return max_profits;
    }
}
