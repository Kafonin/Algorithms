class Solution {
    public int maxProduct(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        
        int mxm=nums[0], mnm=nums[0], result=nums[0];
        
        for (int i=1; i<nums.length; i++) {
            int temp = mxm;
            mxm = Math.max(Math.max(mxm*nums[i], mnm*nums[i]), nums[i]);
            mnm = Math.min(Math.min(temp*nums[i], mnm*nums[i]), nums[i]);
            if (mxm > result) result = mxm;
        }
        return result;
    }
}