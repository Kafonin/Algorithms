class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int index = 1; index < nums.length; index++) {
            for (int j = index; j < nums.length; j++) {
                if (nums[j] + nums[j-index] == target) {
                    return new int[]{j, j-index};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}