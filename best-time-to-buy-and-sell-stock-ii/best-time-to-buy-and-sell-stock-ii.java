class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i=0, j=1; j<prices.length; i++, j++) {
            if (prices[j]>prices[i]) {
                sum+=prices[j]-prices[i];
            }
        }
        return sum;
    }
}