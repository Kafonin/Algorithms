class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = nums[0], sum2 = nums[0], j = 1;
        for (int i=0; i<nums.length; i++) {
            sum1+=nums[i];
            sum2+=j++;
        }
        return sum2-sum1;
    }
}