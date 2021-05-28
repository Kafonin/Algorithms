class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int part = target - nums[i];
            if (map.containsKey(part)) {
                return new int[] {map.get(part), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("Not found!");
    }
}