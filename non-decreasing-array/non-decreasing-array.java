class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums==null) return false;
        if (nums.length<=2) return true;
        int low=0;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1]>nums[i]) {
                low+=1;
                if(i-2 >= 0 && i+1 < nums.length) {
                    if(nums[i-2] > nums[i] && nums[i-1] > nums[i+1]){
                        return false;   
                    }
                }
                
            }
        }
        if (low>1) return false;
        return true;
    }
}