class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        
        while (j<nums.length) {
            if (nums[j]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (i<nums.length && nums[i]!=0) {
                i++;
            } else if (j<nums.length && nums[j]==0) {
                j++;
            }
            
        }
    }
}