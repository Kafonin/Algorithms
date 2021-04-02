class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0, sum2 = 0, j=1;
        for (int i=0; i<nums.length; i++) {
            sum1 += nums[i];
            sum2 += j;
            j++;
        }
        System.out.println("sum1: " + (sum1));
        System.out.println("sum2: " + sum2);
        return sum2-sum1;
    }
}