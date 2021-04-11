class Solution {
    public int maxProduct(int[] nums) {
        int i = Integer.MIN_VALUE, j = i;
        
        for (int num : nums) {
            if (num >= i) {
                j = i;
                i = num;
            } else if (num > j) {
                j = num;
            }
        }
        return (i-1)*(j-1);
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
//         Arrays.sort(nums);
//         return (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
//     }
// }
