class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, j=i+1;
        
        while (j<nums.length) {
            if (nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            } else {
                j++;
            }
        }
        return i+1;
    }
}