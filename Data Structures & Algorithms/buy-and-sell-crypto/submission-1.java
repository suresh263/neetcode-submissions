class Solution {
    public int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;
        int max_price = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min_value = Math.min(min_value,prices[i]);
            max_price = Math.max(max_price,prices[i]-min_value);
        
        }
        return max_price;
    }
}
