class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int rob1 = 0, rob2 = 0;
        int rob3 = 0, rob4 = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i] + rob3, rob4);
            rob3 = rob4;
            rob4 = temp;
        }
        return Math.max(rob2, rob4);
    }
}