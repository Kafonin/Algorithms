class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int index = 0; index < nums.length; index++) {
            for (int j = 0; j < nums.length; j++) {
                if ((index != j) && (nums[index] + nums[j] == target)) {

                    return new int[]{index, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }
}