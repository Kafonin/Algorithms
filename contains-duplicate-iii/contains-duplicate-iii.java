class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums==null || nums.length<=1) return false;
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0; i<nums.length; i++) {
            Integer low = treeSet.floor(nums[i]);
            Integer hi = treeSet.ceiling(nums[i]);

            if ((low!=null && (long)nums[i]-low<=t)||(hi!=null && (long)hi-nums[i]<=t)) {
                return true;
            }
            treeSet.add(nums[i]);

            if (i>=k) {
                treeSet.remove(nums[i-k]);
            }
        }
        return false;
    }
}