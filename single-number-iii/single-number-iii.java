class Solution {
    public int[] singleNumber(int[] nums) {
        int[] rets = {0, 0};
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        
        diff &= -diff;
        
        for (int num : nums) {
            if ((num&diff)==0) {
                rets[0] ^= num;
            } else {
                rets[1] ^= num;
            }
        }
        return rets;
    }
}