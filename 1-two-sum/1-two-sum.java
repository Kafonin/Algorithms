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

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 1; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 if (nums[j] + nums[j-i] == target) {
//                     return new int[]{j, j-i};
//                 }
//             }
//         }
//         throw new IllegalArgumentException();
//     }
// }