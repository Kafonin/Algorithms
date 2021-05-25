class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length, i=0, count=0;
        while (i<len) {
            if (i<len && (nums[i]>9 && nums[i]<100) || 
                (nums[i]>999 && nums[i]<9999) || 
                (nums[i]==100000)) {
                count++;
            }
            i++;
        }
        return count;
    }
}