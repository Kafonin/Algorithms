class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        
        for (int i=0; i<nums.length; i++) {
            for (int j=0, size=list.size(); j<size; j++) {
                List<Integer> subset = new ArrayList<>(list.get(j));
                subset.add(nums[i]);
                list.add(subset);
            }
        }
        return list;
    }
}