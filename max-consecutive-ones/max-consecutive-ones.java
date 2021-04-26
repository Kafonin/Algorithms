class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, i = 0, max = 0;
        while (i<nums.length) {
            if (nums[i]==1) {
                count++;
                max = Math.max(max, count);
            }  
            else {
                count = 0;
            }
            i++;
        }
        return max;
    }
}