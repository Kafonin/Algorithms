class Solution {
    public int maxProfit(int[] prices) {
        int mnm = prices[0], mxm = 0;
        
        for (int stock : prices) {
            mnm = Math.min(mnm, stock);
            mxm = Math.max(mxm, stock-mnm);
        }
        return mxm;
    }
}