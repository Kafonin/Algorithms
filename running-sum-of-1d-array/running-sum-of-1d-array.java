class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length, total = 0, left = 0;
        int[] arr = new int[len];
        
        
        while (left<len) {
            total+=nums[left];
            arr[left]=total;
            left++;
        }
        return arr;
    }
}