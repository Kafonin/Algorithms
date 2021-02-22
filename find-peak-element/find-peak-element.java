class Solution {
    public int findPeakElement(int[] nums) {
        int maxm = Integer.MIN_VALUE, index = 0;
        for (int i=0; i<nums.length; i++) {
            if (maxm<nums[i]) {
                maxm = nums[i];
                index = i;
            } 
        }
        return index;
    }
}