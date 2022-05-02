class Solution {
    public int maxSubArray(int[] nums) {
        
        int mx  = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {

            if (sum < 0) {
                sum = 0;
            }

            sum += nums[i];
            mx  = Math.max(mx, sum);       
        }
        
        return mx;
    }
}