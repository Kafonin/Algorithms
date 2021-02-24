class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (!(nums[i]<=nums[i+1])) {
                if (count>0) return false;
                if (i-1>=0&&i+2<nums.length && (nums[i]>nums[i+2]&&nums[i+1]<nums[i-1])) {
                    return false;
                }
                count++;
            }  
        }
        return true;
    }
}
