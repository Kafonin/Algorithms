class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longest = 0;
        
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr    = n;
                int record  = 1;
                
                while (set.contains(curr + 1)) {
                    curr    = curr      + 1;
                    record  = record    + 1;
                }
                
                longest = Math.max(longest, record);
            }
        }
        return longest;
    }
}