class Solution {
    public int maxProfit(int[] prices) {
        int least_selling_price     = Integer.MAX_VALUE;
        int overall_profit          = 0;
        int profit_if_sold_that_day = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < least_selling_price) {
                least_selling_price = prices[i];
            }
            
            profit_if_sold_that_day = prices[i] - least_selling_price;
            
            if (overall_profit < profit_if_sold_that_day) {
                overall_profit = profit_if_sold_that_day;
            }
        }
        return overall_profit;
    }
}