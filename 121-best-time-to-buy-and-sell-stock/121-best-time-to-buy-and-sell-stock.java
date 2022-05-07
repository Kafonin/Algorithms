class Solution {
    public int maxProfit(int[] prices) {
        int mnm = prices[0], mxm = 0;
        
        for (int i = 0; i < prices.length; i++) {
            mnm = Math.min(mnm, prices[i]);
            mxm = Math.max(mxm, prices[i] - mnm);
        }
        return mxm;
    }
}