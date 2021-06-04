class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        
        List<Integer> subset = new ArrayList<>();
        
        findSubset(nums, res, subset, 0);
        return res;
    }
    
    private void findSubset(int[] nums, List<List<Integer>> res, List<Integer> subset, int startIndex) {
        res.add(new ArrayList<>(subset));
        
        for (int i=startIndex; i<nums.length; i++) {
            if (i != startIndex && nums[i] == nums[i-1]) {
                continue;
            }
            subset.add(nums[i]);
            findSubset(nums, res, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }
}