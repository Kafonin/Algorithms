class Solution {
    public void rotate(int[] nums, int k) {
        int t = k%nums.length;
        rotator(nums, 0, nums.length);
        rotator(nums, 0, t);
        rotator(nums, t, nums.length);
        
    }
    public void rotator(int[] nums, int n, int len) {
        int left = n;
        int right = len - 1;
        while (left <= right) {
            int temp    = nums[left];
            nums[left]     = nums[right];
            nums[right]   = temp;
            left++;
            right--;
        }
    }
}