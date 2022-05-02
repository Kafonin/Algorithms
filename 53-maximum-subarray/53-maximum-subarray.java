class Solution {
    public int maxSubArray(int[] nums) {
        
        int mx  = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // placing this if statement on top makes code faster by 1 ms
            if (sum < 0) {
                sum = 0;
            }
            // code below is faster by 1 ms than sum = sum + nums[i];
            sum += nums[i];
            mx  = Math.max(mx, sum);       
        }
        
        return mx;
    }
}